package restaurant;
/**
 * @file ItemReceta.java
 * @brief la clase Pedido contiene los datos de un determinado pedido.
 * @details extiende de ... (no figura en el ejercicio)
 * @todo completar datos faltantes
 */

public class ItemReceta {
	/**
	 * @brief determina la producto para este ítem de una receta
	 */
	Producto p;
	/**
	 * @brief determina la cantidad de ese ítem para una receta
	 */
	int cantidad;

	/** CONSTRUCTORES */
	public ItemReceta(Producto p, int cantidad) {
		super();
		this.p = p;
		this.cantidad = cantidad;
	}

}
