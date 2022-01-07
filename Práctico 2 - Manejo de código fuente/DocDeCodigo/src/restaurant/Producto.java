package restaurant;

/**
 * @file Producto.java
 * @brief la clase Producto contiene los datos de un determinado Producto.
 * @todo completar datos faltantes
 */
public class Producto {
	/**
	 * @brief valor del siguiente iD (del siguiente producto????)
	 */
	static int nextID;
	/**
	 * @brief determina el valor de un identificador (id) para el producto
	 */
	int id;
	/**
	 * @brief determina la cantidad de stock que tiene ese producto
	 */
	int stock;
	/**
	 * @brief determina el nombre de dicho producto
	 */
	String nombre;
	/**
	 * @brief determina el precio de compra para el producto
	 */
	float precioCompra;
	/** CONSTRUCTORES */
	public Producto(String nombre, int stock) {
		this.stock=stock;
		this.nombre=nombre;
	}

	/** GETTERS & SETTERS */
	public int getStock() {
		assert stock < 0 : 'El stock no puede ser menor a cero';
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(float precioCompra) {
		this.precioCompra = precioCompra;
	}
}
