package restaurant;
import java.util.List;
/**
 * @file Producto.java
 * @brief la clase Producto contiene los datos de un determinado Producto.
 *
 */

public class Receta {
	/**
	 * @brief determina los ingredientes necesarios para la receta
	 * @details se implementa una Lista en lugar de un arreglo para que sea más fácil su actualización
	 */
	List<ItemReceta> ingredientes;
	/**
	 * @brief determina el nombre de una receta
	 */
	String nombre;
	/**
	 * @brief determina el tiempo de cocción de dicha receta
	 */
	String tiempoDeCoccion;
	/**
	 * @brief determina el precio de venta para la receta
	 */
	float precioVenta;

	/**
	 * @brief agrega un ingrediente a la lista de ingredientes de la receta
	 * @param i es un objeto ItemReceta
	 */
	public void addIngrediente(ItemReceta i) {
		ingredientes.add(i);
	}

	/**
	 * @brief agrega un producto a la lista de ingredientes de la receta
	 * @param cantidad indica la cantidad de dicho producto, y Producto el objeto Producto
	 */
	public void addIngrediente(Producto producto, int cantidad ) {
		ItemReceta item=new ItemReceta(producto, cantidad);
		ingredientes.add(item);
	}
	/** GETTERS & SETTERS */
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTiempoDeCoccion() {
		return tiempoDeCoccion;
	}
	public void setTiempoDeCoccion(String tiempoDeCoccion) {
		this.tiempoDeCoccion = tiempoDeCoccion;
	}

}
