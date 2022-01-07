import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    private static Usuario user;

    @BeforeAll
    public static void addingUsers () {
        user = new Usuario();
        Usuario u = new Usuario( "juan", 1, 685, "jaja@gmail.com");
        Usuario u1 = new Usuario( "PEDRO", 1, 230, "jaja@gmail.com");
        Usuario u2 = new Usuario( "TOMAS", 1, 510, "jajagmail.com");
        Usuario u3 = new Usuario( "ROBER", 1, 135, "jaja@gmail.com");
        Usuario u4 = new Usuario( "FEDE", 1, 6580, "jajagmail.com");
        user.addUser( u );
        user.addUser( u1 );
        user.addUser( u2 );
        user.addUser( u3 );
        user.addUser( u4 );
    }

    @Test
    @DisplayName("No existen usuarios repetidos")
    public void testUsuariosRepetidos () {
        int entrySize = user.amountOfUsers();
        user.addUser( new Usuario("juan",1,234,"jaja"));
        assertTrue( entrySize == user.amountOfUsers() );
    }

    @Test
    @DisplayName("Todos los emails son validos")
    public void testValidatingEmails () {
        user.getUsers().forEach( u -> assertTrue( u.getEmail().contains("@") ) );
    }
}
