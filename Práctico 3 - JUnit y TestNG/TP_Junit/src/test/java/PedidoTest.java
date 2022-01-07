import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PedidoTest {

    private static Usuario u;
    private static Pedido p;

    @BeforeAll
    public static void initClass () {
        u = new Usuario( "juan", 1, 685, "jaja@gmail.com");
        p = new Pedido( );
        p.agregarItem( new ItemPedido( 23,
                new ProductoBasico("x",20,60)));
    }

    @Test
    @DisplayName("Pedido descuenta saldo de usuario")
    public void checkSaldo () {
        float entryCash = u.getSaldo();
        p.setUsuario( u );
        try {
            p.solicitarPedido();
        } catch ( SinSaldoException e ) {
            System.out.println( e );
            assertTrue( p.totalPedido() > u.getSaldo() );
            return;
        }
        assertTrue( entryCash > u.getSaldo() );
    }
}
