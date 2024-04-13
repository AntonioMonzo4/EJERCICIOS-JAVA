package es.uned.lsi.eped.pract2022_2023;

import es.uned.lsi.eped.DataStructures.*;

public class StockSequence implements StockIF {

	protected SequenceIF<StockPair> stock;
	
	/* Constructor de la clase */
	public StockSequence() {
		this.stock = new List<>();
	}

	/**
	 * Si existe en el stock el producto, recupera sus unidades, si no, devuelve -1.
	 * @param p
	 * @return
	 */
	@Override
	public int retrieveStock(String p) {

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
	 * @param p producto a consultar
	 * @param u unidades del producto
	 */
	@Override
	public void updateStock(String p, int u) {
		this.updateStock(p, u, (ListIF<StockPair>) this.stock);
	}

	/**
	 * Lista el stock actual ajustándose al prefijo (prefix) recibido
	 * @param prefix
	 * @return
	 */
	@Override
	public SequenceIF<StockPair> listStock(String prefix) {
		ListIF<StockPair> productTemp = new List();
		StockPair stockPair;
		IteratorIF<StockPair> i = this.stock.iterator();
		boolean stop = false;
		while (i.hasNext() && !stop) {
			stockPair = i.getNext();
			if (stockPair.getProducto().startsWith(prefix)) {
				productTemp.insert(productTemp.size() + 1, stockPair);
			}
			if (!stockPair.getProducto().isEmpty() && !prefix.isEmpty()) {
				if (stockPair.getProducto().substring(0, 1).compareTo(prefix.substring(0, 1)) > 0) {
					stop = true;
				}
			}
		}
		productTemp = sort(productTemp);
		return productTemp;
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
		return quicksort(stockList, 1, stockList.size());
	}

	private ListIF<StockPair> quicksort(ListIF<StockPair> stock, int left, int right) {
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
				quicksort(stock, left, j - 1);
			}
			if (j + 1 < right) {
				quicksort(stock, j + 1, right);
			}
		}

		return stock;
	}

	public int compareTo(StockPair q1, StockPair q2) {
		if(q1.getProducto().compareTo(q2.getProducto()) > 0){
			return -1;
		}else if(q1.getProducto().compareTo(q2.getProducto()) < 0){
			return 1;
		}
		return 0;
	}


	/**
	 * Si el producto no existe, lo crea con sus unidades.
	 * Si el produtco ya existe actualiza el stock modificando las unidades
	 * @param p
	 * @param u
	 * @param currentTree
	 */
	private void updateStock(String p, int u, ListIF<StockPair> currentTree){
		boolean found = false;
		int c = 1;
		StockPair stockPair;
		IteratorIF<StockPair> i = currentTree.iterator();
		while (i.hasNext() && !found) {
			stockPair = i.getNext();
			if (p.compareTo(stockPair.getProducto()) == 0) {
				// Producto encontrado, actualizamos stock
				stockPair.setUnidades(u);
				found = true;
			} else if (p.compareTo(stockPair.getProducto()) < 0) { // Es inferior
				currentTree.insert(c, new StockPair(p, u));
				found = true;
			} else { // Es superior
				c++;
			}
		}
		if (!found) {
			currentTree.insert(currentTree.size() + 1, new StockPair(p, u));
		}
	}

}
