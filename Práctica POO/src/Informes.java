import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 *
 */
public class Informes{

	public Informes() {
	}

	public void informeVentasTotales(List<Pedido> listaPedidos, List<Producto> listaProductos){

		Menu menu = new Menu();
		Date fechaDesde = menu.pedirFechaInforme("Desde ");
		Date fechaHasta = menu.pedirFechaInforme("Hasta ");

		List<Pedido> listaPedidoFiltrada = listaPedidos.stream().filter(p-> p.getFechaPedido().after(fechaDesde) && p.getFechaPedido().before(fechaHasta)).collect(Collectors.toList());

		for(Producto producto: listaProductos ) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Producto | " + producto.getNombre() + "("+producto.getId()+ ")");
			System.out.println("----------------------------------------------------------------------");
			List<Pedido> listaPedidoProducto = listaPedidoFiltrada.stream().filter(p->p.getIdProducto()==producto.getId()).collect(Collectors.toList());
			System.out.println("Total ventas: " + listaPedidoProducto.size());
			System.out.println("Total Kg vendidos: " + listaPedidoProducto.stream().mapToInt(p->p.getKgProducto()).sum());
			System.out.println("Total importe: " + Math.round(listaPedidoProducto.stream().mapToDouble(p->p.getPrecio()).sum() * 100.0) / 100.0 + " Euros");

		}

	}
	public void informeImportesLogistica(List<Pedido> listaPedidos, List<Logistica> listaLogisticas){

		for(Logistica logistica: listaLogisticas) {
			List<Pedido> listaPedidoLogistica = listaPedidos.stream().filter(p->p.getIdEmpresaLogistica()==logistica.getIdLogistica()).collect(Collectors.toList());
			double totalFacturado = 0;
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Empresa Logistica | " + logistica.getNombreEmpresa() + "(" + logistica.getIdLogistica() + ")");
			System.out.println("----------------------------------------------------------------------");
			for(Pedido pedido: listaPedidoLogistica) {
				double comision = pedido.isEsCliente() ? 0.15 : 0.05;
				double precioProducto = pedido.getKgProducto() * pedido.getValorRefKilogramo() * comision;
				//Precio logística es precio total - el precio del producto
			    double precioLogistica = Math.round((pedido.getPrecio() - precioProducto) * 100.0) / 100.0;
				String tipoCliente = pedido.isEsCliente() ? "Cliente Final" : "Distribuidor";
				System.out.println("Pedido numero: " + pedido.getIdPedido() +
						" | Kg Transportados: " + pedido.getKgProducto() +
						" | Tipo de Cliente: " + tipoCliente +
						" | Importe: " + precioLogistica+" EUROS");

				totalFacturado+=precioLogistica;

			}
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Total Envíos: " + listaPedidoLogistica.size());
			System.out.println("Total Facturado: " + totalFacturado);
			System.out.println("----------------------------------------------------------------------");
		}

	}

	public void informeBeneficiosCooperativa(List<Pedido> listaPedidos, List<Producto> listaProductos){
		for(Producto producto: listaProductos) {
			List<Pedido> listaPedidosProducto = listaPedidos.stream().filter(p->p.getIdProducto() == producto.getId()).collect(Collectors.toList());
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Producto| " + producto.getNombre() + "("+producto.getId()+ ")");
			System.out.println("----------------------------------------------------------------------");
			int totalKgVendidos = listaPedidosProducto.stream().mapToInt(p->p.getKgProducto()).sum();
			double totalBeneficio = 0;
			for(Pedido pedido: listaPedidosProducto ) {
				double comision = pedido.isEsCliente() ? 0.15 : 0.05;
				double beneficio = Math.round((pedido.getKgProducto() * pedido.getValorRefKilogramo() * comision) * 100.0)/100.0;
				String tipoCliente = pedido.isEsCliente() ? "Cliente" : "Distribuidor";
				System.out.println("Pedido número: " + pedido.getIdPedido() +
						" | Kg Vendidos: " + pedido.getKgProducto() +
						" | Valor Ref Kg (Venta): " + pedido.getValorRefKilogramo() +
						" | Valor Ref Kg (Actual): " + Math.round(producto.getValorRefKilogramo() * 100.0)/100.0 +
						" | Tipo de Cliente: " + tipoCliente +
						" | Beneficio: " + beneficio);

				totalBeneficio+=beneficio;
			}
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Total Kg vendidos de este producto: " + totalKgVendidos);
			System.out.println("Total beneficio para este producto: " + totalBeneficio);
			System.out.println("----------------------------------------------------------------------");
		}
	}

	public void informeEvolucionPrecios(List<Producto> listaProductos, List<HistoricoPreciosProducto> historicoPreciosProducto){

		for(Producto producto: listaProductos) {
			List<HistoricoPreciosProducto> listaHistoricoProducto = historicoPreciosProducto.stream().filter(p->p.getIdProducto() == producto.getId()).collect(Collectors.toList());
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Producto| " + producto.getNombre() + "("+producto.getId()+ ")");
			System.out.println("----------------------------------------------------------------------");
			for(int i=0; i< listaHistoricoProducto.size(); i++){
				System.out.println("Valor Referencia " + (i+1) + " | " + listaHistoricoProducto.get(i).getValorRefKilogramo());
			}
			System.out.println("----------------------------------------------------------------------");
		}

	}


}