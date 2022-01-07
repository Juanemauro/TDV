import java.util.ArrayList;
import java.util.Date;

public class Usuario {

	static int nextID;
	private int id;
	private String nombreYApellido;
	private int tipoUsuario;
	private float saldoCuenta;
	private Date ultimaRecarga;
	private String email;
	private static ArrayList<Usuario> users = new ArrayList<>();

	public Usuario() {}

	public Usuario( String nombreYApellido, int tipoUsuario, float saldoCuenta, String email) {
		super();
		this.nombreYApellido = nombreYApellido;
		this.tipoUsuario = tipoUsuario;
		this.saldoCuenta = saldoCuenta;
		this.verifyEmail ( email );
	}

	private void verifyEmail( String email ) {
		if ( ! email.contains("@") )
			email = "randomEmail"+Math.random()*10+"@gmail.com";
		this.email = email;
	}

	public void setUsers ( ArrayList<Usuario> users ) {
		users.clear();
		users.addAll( users );
	}

	public ArrayList<Usuario> getUsers() {
		return (ArrayList<Usuario>) users.clone();
	}

	public static boolean addUser ( Usuario u ) {
		if ( !users.contains( u ) )
			return users.add( u );
		return false;
	}

	public int amountOfUsers() {
		return users.size();
	}

	public void cargarCredito(float cuanto) {
		saldoCuenta+=cuanto;

	}
	float descontarSaldo(float cuanto) throws SinSaldoException {
		if((saldoCuenta-cuanto)<0) throw new SinSaldoException();
		else
			saldoCuenta-= cuanto;
		return saldoCuenta;

	}
	public float getSaldo() {
		return saldoCuenta;
	}

	public String getNombre(){
		return this.nombreYApellido;
	}

	public String getMail(){
		return this.email;
	}

	@Override
	public boolean equals(Object o) {
		try {
			Usuario u = (Usuario) o;
			return this.nombreYApellido.equals( u.getNombreYApellido() );
		}catch ( Exception e ) {
			return false;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreYApellido() {
		return nombreYApellido;
	}

	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public float getSaldoCuenta() {
		return saldoCuenta;
	}

	public void setSaldoCuenta(float saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}

	public Date getUltimaRecarga() {
		return ultimaRecarga;
	}

	public void setUltimaRecarga(Date ultimaRecarga) {
		this.ultimaRecarga = ultimaRecarga;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
