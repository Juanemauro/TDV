import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.nio.file.attribute.UserPrincipal;
import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTestDynamic {

    private static Usuario user;

    @BeforeAll
    public static void addingUsers () {
        user = new Usuario();
        Usuario u = new Usuario("juan", 1, 685, "jaja@gmail.com");
        Usuario u1 = new Usuario("PEDRO", 1, 230, "jaja@gmail.com");
        Usuario u2 = new Usuario("TOMAS", 1, 510, "jajagmail.com");
        Usuario u3 = new Usuario("ROBER", 1, 135, "jaja@gmail.com");
        Usuario u4 = new Usuario("FEDE", 1, 6580, "jajagmail.com");
        user.addUser(u);
        user.addUser(u1);
        user.addUser(u2);
        user.addUser(u3);
        user.addUser(u4);
    }

    // B con Test Dinámico
    @TestFactory
    Stream<DynamicTest> dynamicTestMails() {
        return UserTestDynamic.user.getUsers().stream().map( u ->
                DynamicTest.dynamicTest("Testing " + u.getNombre() + u.getMail(), ()-> {

            assertTrue( u.getEmail().contains("@"));
        /*
            String mail = u.getMail();
            boolean resultado = mail.contains("@");
            System.out.println("Su mail es correcto? ");
            assertEquals(true, resultado );
            System.out.println("Su mail es " + u.getMail());
        */
        }));
    }

}
