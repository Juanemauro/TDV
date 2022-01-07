import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.*;


public class AlmacenTestDinamico {
    Ingrediente defaultIngrediente;
    static List<Ingrediente> ingATestear;

    @BeforeAll
    public static void initClass(){
        ingATestear = new ArrayList<Ingrediente>();
        ingATestear.add(new Ingrediente("harina", "kg", 10));
        ingATestear.add(new Ingrediente("aceite", "litro", 15));
        ingATestear.add(new Ingrediente("papa", "kg", 170));
        ingATestear.add(new Ingrediente("huevo", "kg", 150));
        ingATestear.add(new Ingrediente("fideos", "kg", 10));
    }

    @BeforeEach
    public void setUp() throws Exception {
        /*
        int cualTomemos = (int) (Math.random()*5);
        System.out.println(cualTomemos);
        defaultIngrediente = AlmacenTestDinamico.ingATestear.get(cualTomemos); //para tomar un índice rándom del arreglo
         */
    }

    @AfterEach
    public void tearDown() throws Exception{
    }

    @TestFactory
    Stream<DynamicTest> dynamicTestIngrediente(){
        return AlmacenTestDinamico.ingATestear.stream().map(dom->DynamicTest.dynamicTest("Testing " + dom, ()->{

            int cantidadInicial = dom.getStock();
            int cantidadAgregada = (int) (Math.random()*100);
            Almacen.IngresarConsumibles(dom, cantidadAgregada);
            assertEquals(cantidadInicial + cantidadAgregada, dom.getStock());

        }));
    }


}