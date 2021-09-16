package restaurant;
import java.util.List;
/**
 * @file ItemMenu.java
 * @brief la clase ItemMenu contiene los datos de un determinado ítem.
 * @details extiende de ... (no figura en el ejercicio)
 * @todo completar datos faltantes.
 */
public class ItemMenu {
	/**
	 * @brief valor del siguiente iD
	 */
	static int nextID;
	/**
	 * @brief determina el valor de un identificador (id) para ese item del Menú
	 */
	int id;
	/**
	 * @brief determina el nombre de dicho menú
	 */
	String nombre;
	/**
	 * @brief determina el precio de dicho item
	 */
	float precio;
	/**
	 * @brief determina la receta de dicho item
	 */
	Receta receta;
	/**
	 * @brief determina el tipo de ítem
	 */
	String tipo;

	/** CONSTRUCTORES */
	public ItemMenu(String nombre, float precio, Receta receta, String tipo) {
		super();
		this.id=nextID;
		nextID++;
		this.nombre = nombre;
		this.precio = precio;
		this.receta = receta;
		this.tipo = tipo;
	}
	/** GETTERS & SETTERS */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Receta getReceta() {
		return receta;
	}
	public void setReceta(Receta receta) {
		this.receta = receta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



}
