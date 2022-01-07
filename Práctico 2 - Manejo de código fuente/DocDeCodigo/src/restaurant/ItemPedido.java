package restaurant;
/**
 * @file ItemPedido.java
 * @brief la clase ItemPedido contiene los datos de un determinado ídem de un pedido.
 * @details extiende de ... (no figura en el ejercicio)
 * @todo completar datos faltantes
 */
public class ItemPedido {

	/**
	 * @brief determina la cantidad de ese ítem
	 */
	int cantidad;
	/**
	 * @brief determina la receta de dicho item
	 */
	Receta receta;

	/** CONSTRUCTORES */
	public ItemPedido(int cantidad, Receta receta) {
		super();
		this.cantidad = cantidad;
		this.receta = receta;
	}

	/**
	 * @brief encarga un pedido ???
	 * @see excepción THROWN http://dis.um.es/~bmoros/Tutorial/parte9/cap9-3.html
	 * */
	public void encargar() throws SinSuficientesIngredientesException {

	}

	/** GETTERS & SETTERS */
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Receta getReceta() {
		return receta;
	}
	public void setReceta(Receta receta) {
		this.receta = receta;
	}
}
