package restaurant;
import java.util.List;

/**
 * @file Pedido.java
 * @brief la clase Pedido contiene los datos de un determinado pedido.
 * @details extiende de ... (no figura en el ejercicio)
 * @todo completar datos faltantes
 */

public class Pedido {
	/**
	 * @brief valor del siguiente iD
	 */
	static int nextID=0;
	/**
	 * @brief lista de los ítems de un pedido
	 */
	List<ItemPedido> items;
	/**
	 * @brief declara una variable usuario de tipo Usuario
	 */
	Usuario usuario;
	/**
	 * @brief determina el estado de un pedido con un String
	 */
	String estado;
	/**
	 * @brief determina el valor de un identificador (id)
	 */
	int id;

	public Pedido() {
		super();
		this.items = items;
		this.usuario = usuario;
	}

	public static int getNextID() {
		return nextID;
	}

	public static void setNextID(int nextID) {
		Pedido.nextID = nextID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pedido(List<ItemPedido> items, Usuario usuario) {
		super();
		this.items = items;
		this.usuario = usuario;
		estado=null;
	}
	/**
	 * @brief Agrega un item al pedido.
	 * @details Si el estado del pedido nuevo es null, cada pedido nuevo se agrega con el estado "ABIERTO".
	 * @param ItemPedido item referencia al nuevo item a agregar.
	 * @todo evaluar posibles errores en el estado del pedido.
	 */
	void agregarItem(ItemPedido item) {
	if(estado==null)
		estado="ABIERTO";
		items.add(item);
	}
	/**
	 * @brief Elimina un item del pedido.
	 * @details Si el estado del pedido nuevo es null, cada pedido nuevo se agrega con el estado "ABIERTO".
	 * @param ItemPedido item referencia al nuevo item a agregar.
	 * @todo evaluar posibles errores en el estado del pedido.
	 */
	void eliminarItem(ItemPedido item) {
		items.remove(item);
	}


	float totalPedido() {
		float  acum=0.0f;
		for(int i = 0;i<items.size();i++) {
			acum+=items.get(i).cantidad*items.get(i).getReceta().getPrecioVenta();
		}
		return acum;
	}

	void completarPedido() {
		float total=totalPedido();
		try {
			this.getUsuario().descontarSaldo(total);
			this.setEstado("ENVIADO");
		} catch (SinSaldoException e) {
			System.out.println(e);
		} finally {

		}

	}

	public List<ItemPedido> getItems() {
		return items;
	}

	public void setItems(List<ItemPedido> items) {
		this.items = items;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
