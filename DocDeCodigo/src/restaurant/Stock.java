package restaurant;

import java.util.ArrayList;
import java.util.List;
/**
 * @file Stock.java
 * @brief la clase Stock contiene los productos en stock
 */

public class Stock {
	/**
	 * @brief lista con los productos en stock
	 * */
	List<Producto> stock;

	/** CONSTRUCTORES */
	public Stock() {
		stock=new ArrayList<Producto>();
	}
	/**
	 * @brief agrega un Producto (con su respectivo stock -> cantidad) a la lista de productos en stock
	 * @details primero verifica que el producto ya esté dentro de la lista de productos en stock; en caso de estar suma la cantidad nueva a la previa.
	 * Caso contrario, agrega el producto desde cero con la cantidad que viene en el param
	 * @param Producto indica el Producto a agregar; cantidad indica la cantidad a agregar para ese producto
	 * */
	public void agregar(Producto p, int cantidad) {
		if(stock.indexOf(p)>=0)
			p.setStock(p.getStock()+cantidad);
		else {
			p.setStock(cantidad);
			stock.add(p);
		}

	}
}
