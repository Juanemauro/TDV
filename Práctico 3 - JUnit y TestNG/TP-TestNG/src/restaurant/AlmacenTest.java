package restaurant;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AlmacenTest {
    Ingrediente defaultIngrediente;
    static Ingrediente ingATestear[];

    @BeforeAll
    public static void initClass(){
        ingATestear = new Ingrediente[5];
        ingATestear[0] = new Ingrediente("harina", "kg", 10);
        ingATestear[1] = new Ingrediente("aceite", "litro", 15);
        ingATestear[2] = new Ingrediente("papa", "kg", 170);
        ingATestear[3] = new Ingrediente("huevo", "kg", 150);
        ingATestear[4] = new Ingrediente("fideos", "kg", 10);
    }

    @BeforeEach
    public void setUp() throws Exception{
        int cualTomemos = (int) (Math.random()*5);
        System.out.println(cualTomemos);
        defaultIngrediente = AlmacenTest.ingATestear[cualTomemos]; //para tomar un índice rándom del arreglo
    }

    @AfterEach
    public void tearDown() throws Exception{
    }

    @RepeatedTest(5)
    public void testIngresarConsumible(){
        System.out.println(defaultIngrediente.toString());
        int cantidadInicial = defaultIngrediente.getStock();
        int cantidadAgregada = (int) (Math.random()*100);/*agregamos una cantidad aleatoria*/
        System.out.println("cantidad agregada: " + cantidadAgregada);
        Almacen.IngresarConsumibles(defaultIngrediente, cantidadAgregada);
        System.out.println("cantidad inicial + agregada "  + (cantidadInicial + cantidadAgregada));
        System.out.println("default ingrediente get Stock "  + defaultIngrediente.getStock());
        assertEquals(cantidadInicial + cantidadAgregada, defaultIngrediente.getStock());
    }

    @Test
    public void testExtraerConsumibles(){
        fail("Not yet implemented");
    }


}

