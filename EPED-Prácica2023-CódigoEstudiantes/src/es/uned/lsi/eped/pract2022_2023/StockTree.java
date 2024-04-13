package es.uned.lsi.eped.pract2022_2023;

import es.uned.lsi.eped.DataStructures.*;

public class StockTree implements StockIF {

	/* El stock es un árbol general de nodos */
	protected GTreeIF<Node> stock;

	/* Constructor de la clase */
	public StockTree() {
		this.stock = new GTree();
		this.stock.setRoot(new NodeRoot());
	}

	public int retrieveStock(String p){
		//Comprobamos si el árbol está vacío
		if(this.stock.isEmpty())
			//Si está vacío devolvemos -1
			return -1;

		ListIF<StockPair> productsFound = (ListIF<StockPair>) this.listStock(p);

		for(int i=1; i <= productsFound.size(); i++){
			if(productsFound.get(i).getProducto().equals(p))
				return productsFound.get(i).getUnidades();
		}
		//Si termina y no encontramos el producto devolvemos -1
		return -1;
	}

	/**
	 * Actualiza el stock del producto p con las unidades u
	 * @param p
	 * @param u
	 */
	public void updateStock(String p, int u){
		this.updateStock(p, u, this.stock);
	}

	/**
	 * Lista el stock actual ajustándose al prefijo (prefix) recibido
	 * @param prefix
	 * @return
	 */
	public SequenceIF<StockPair> listStock(String prefix){
		GTreeIF<Node> prefixSubtree = getPrefixSubtree(prefix, this.stock);
		return sort(fillStockList(prefix, prefixSubtree, "", new List<>()));
	}

	///////////////////////
	// Métodos privados
	//////////////////////

	/**
	 * Ordena los productos del stock alfabéticamente
	 * @param stockList
	 * @return
	 */
	private ListIF<StockPair> sort(ListIF<StockPair> stockList) {
		return quickSort(stockList, 1, stockList.size());
	}

	private ListIF<StockPair> quickSort(ListIF<StockPair> stock, int left, int right) {
		if(stock.size() > 0){
			StockPair pivot = stock.get(left);
			int i = left;
			int j = right;
			StockPair aux;
			while (i < j) {
				while (compareTo(stock.get(i), pivot) >= 0 && i < j) {
					i++;
				}
				while (compareTo(stock.get(j), pivot) < 0) {
					j--;
				}
				if (i < j) {
					aux = stock.get(i);
					stock.set(i, stock.get(j));
					stock.set(j, aux);
				}
			}
			stock.set(left, stock.get(j));
			stock.set(j, pivot);
			if (left < j - 1) {
				quickSort(stock, left, j - 1);
			}
			if (j + 1 < right) {
				quickSort(stock, j + 1, right);
			}
		}

		return stock;
	}

	public int compareTo(StockPair sp1, StockPair sp2) {
		if(sp1.getProducto().compareTo(sp2.getProducto()) > 0){
			return -1;
		}else if(sp1.getProducto().compareTo(sp2.getProducto()) < 0){
			return 1;
		}
		return 0;
	}

	/**
	 * Recupera recursivamente el subarbol que contiene el prefijo especificado
	 * @param prefix prefijo
	 * @param tree árbol en el que buscar el prefijo
	 * @return subarbol de sugerencias para el prefijo
	 */
	private GTreeIF<Node> getPrefixSubtree(String prefix, GTreeIF<Node> tree) {
		if (tree == null || prefix.isEmpty()) {
			return tree;
		}
		return getPrefixSubtree(prefix.substring(1), getCharNode(tree.getChildren(), prefix.charAt(0)));
	}

	/**
	 *
	 * @param prefix Prefijo con el cual debe coincidir el producto
	 * @param tree árbol a recorrer
	 * @param s cadena de texto
	 * @param listProducts Listado de productos
	 * @return
	 */
	private ListIF<StockPair> fillStockList(String prefix, GTreeIF<Node> tree, String s, ListIF<StockPair> listProducts) {
		if(tree != null){
			ListIF<GTreeIF<Node>> children = tree.getChildren();
			GTreeIF<Node> leaf = getLeaf(children);
			if (leaf != null) {
				NodeInfo nodeInfo = (NodeInfo) leaf.getRoot();
				StockPair sp = new StockPair(prefix + s, nodeInfo.getUnidades());
				listProducts.insert(listProducts.size() + 1, sp);
			}
			if (children.isEmpty()) {
				return listProducts;
			}

			IteratorIF<GTreeIF<Node>> it = children.iterator();
			while (it.hasNext()) {
				GTreeIF<Node> node = it.getNext();
				Node rootNode = node.getRoot();
				//Si el nodo raíz del subárbol no es una hoja, seguimos
				if (!rootNode.getNodeType().equals(Node.NodeType.INFO)) {
					NodeInner nodeInner = (NodeInner) rootNode;
					listProducts = fillStockList(prefix, node, s + nodeInner.getLetter(), listProducts);
				}
			}
		}

		return listProducts;
	}

	/**
	 * Si el producto no existe, lo crea con sus unidades.
	 * Si el produtco ya existe actualiza el stock modificando las unidades
	 * @param p
	 * @param u
	 * @param currentTree
	 */
	private void updateStock(String p, int u, GTreeIF<Node> currentTree){
		if (p.isEmpty()) {
			GTreeIF<Node> nodeLeaf = getLeaf(currentTree.getChildren());
			if (nodeLeaf == null) {
				nodeLeaf = new GTree();
				nodeLeaf.setRoot(new NodeInfo(u));
				//Insertamos nodo hoja (NodeInfo) al arbol principal (stock)
				currentTree.addChild(currentTree.getNumChildren() + 1, nodeLeaf);
			} else {
				// Producto en stock, actualizamos unidades.
				nodeLeaf.setRoot(new NodeInfo(u));
			}
		} else {
			// Queda palabra por añadir
			ListIF<GTreeIF<Node>> children = currentTree.getChildren();
			GTreeIF<Node> charNode = getCharNode(children, p.charAt(0));
			if (charNode == null) {
				currentTree.addChild(children.size() + 1, createSubTree(p, u));
			} else {
				updateStock(p.substring(1), u, charNode);
			}
		}
	}

	/**
	 * Crea un subarbol para un producto, usado cuando todo son letras nuevas
	 * en una parte ya existente del arbol padre
	 * @param p producto a introducir
	 * @param u unidades el producto
	 * @return
	 */
	private GTreeIF<Node> createSubTree(String p, int u) {
		if (p.isEmpty()) {
			GTreeIF<Node> leaf = new GTree();
			leaf.setRoot(new NodeInfo(u));
			return leaf;
		} else {
			GTreeIF<Node> charNode = new GTree();
			charNode.setRoot(new NodeInner(p.charAt(0)));
			charNode.addChild(1, createSubTree(p.substring(1), u));
			return charNode;
		}
	}


	/**
	 * Obtiene nodo hoja del subarbol recibido
	 * @param children
	 * @return
	 */
	private GTreeIF<Node> getLeaf(ListIF<GTreeIF<Node>> children) {
		if (children.isEmpty() || children == null) {
			return null;
		} else {
			IteratorIF<GTreeIF<Node>> it = children.iterator();
			while (it.hasNext()) {
				GTreeIF<Node> child = it.getNext();
				if (child.isLeaf()) {
					return child;
				}
			}
		}
		return null;
	}

	/**
	 * Recupera un nodo de tipo INNER para obtener su letra
	 * @param children
	 * @param c
	 * @return
	 */
	private GTreeIF<Node> getCharNode(ListIF<GTreeIF<Node>> children, char c) {
		if (children.isEmpty() || children == null) {
			return null;
		} else {
			IteratorIF<GTreeIF<Node>> it = children.iterator();
			while (it.hasNext()) {
				GTreeIF<Node> child = it.getNext();
				//Si el no es nodo hoja y nodo raíz del subárbol es un nodo inner (contiene carácter)
				if (!child.isLeaf() && child.getRoot().getNodeType().equals(Node.NodeType.INNER)) {
					NodeInner nodeInner = (NodeInner) child.getRoot();
					if(nodeInner.getLetter() == c){
						return child;
					}
				}
			}
		}
		return null;
	}
	
}
