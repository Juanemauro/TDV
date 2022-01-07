import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceteTest {
    private static Receta r;
    private static ItemReceta item;

    @BeforeAll
    public static void createReceta () {
        item = new ItemReceta( null, 2 );
        r = new Receta( "r", 20, 10, item );
    }

    @Test
    @DisplayName( "Cada reseta debe tener al menos 1 ingrediente")
    public void checkIngredientes () {
        assertEquals(true, r.getIngredientes().size() > 0, "Debe tener al menos 1 ingrediente");
    }
}
