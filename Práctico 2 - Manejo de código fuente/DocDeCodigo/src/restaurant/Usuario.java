package restaurant;
import java.util.Date;

/**
 * @file Pedido.java
 * @brief la clase Pedido contiene los datos de un determinado pedido.
 * @details extiende de ... (no figura en el ejercicio)
 * @todo completar datos faltantes
 */

public class Usuario {
	/**
	 * @brief valor del siguiente ID (del siguiente usuario???)
	 */
	static int nextID;
	/**
	 * @brief valor del ID de dicho usuario
	 */
	int id;
	/**
	 * @brief determina el nombre y apellido del usuario
	 */
	String nombreYApellido;
	/**
	 * @brief determina el tipo de usuario
	 */
	int tipoUsuario;
	/**
	 * @brief valor del saldo de su cuenta
	 */
	float saldoCuenta;
	/**
	 * @brief fecha de la última recarga de saldo
	 */
	Date ultimaRecarga;
	/**
	 * @brief mail del usuario
	 */
	String email;

	/** CONSTRUCTORES*/

	public Usuario(String nombreYApellido, int tipoUsuario, float saldoCuenta,String email) {
		super();
		this.nombreYApellido = nombreYApellido;
		this.tipoUsuario = tipoUsuario;
		this.saldoCuenta = saldoCuenta;
		assert mail: "el mail debe ser @gmail.com";
		this.email=email;
	}
	/**
	 * @brief aumenta el saldo de la cuenta de un usuario
	 * @param cuanto: indica la cantidad de dinero a agregar
	 * */
	public void cargarCredito(float cuanto) {
		saldoCuenta+=cuanto;
	}

	/**
	 * @brief descuenta el saldo de la cuenta de un usuario
	 * @details se descontará saldo si es que tiene saldo
	 * Si no tiene saldo, se lanza una excepcion (SilSaldoException)
	 * @param cuanto: indica la cantidad de dinero a agregar
	 * @return retorna el saldo de la cuenta
	 * */
	float descontarSaldo(float cuanto) throws SinSaldoException {
		if((saldoCuenta-cuanto)<0) throw new SinSaldoException();
		else
			saldoCuenta-= cuanto;
		return saldoCuenta;

	}
}
