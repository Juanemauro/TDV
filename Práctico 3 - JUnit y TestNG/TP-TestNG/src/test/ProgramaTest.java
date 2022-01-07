package test;

import org.testng.annotations.*;
import restaurant.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ProgramaTest {


    // Before y after
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod()");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod()");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass()");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest()");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest()");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite()");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite()");
    }

    // Ejercicio 1
    @DataProvider (name="ingrediente-random")
    public Iterator<Object[]> get10Ing(){ // 10 íngredientes
        ArrayList<Object[]> listaIngredientes = new ArrayList<Object[]>();
        for(int i=0;i<10;i++){
            listaIngredientes.add(new Object[] {new Ingrediente("nombre x", "unidad", 10, 100*i )});
        }

            // esto se podría hacer mejor con números alaeatorios
        return listaIngredientes.iterator();
    }

    @Test(dataProvider = "ingrediente-random")
    public void testDiezIngredientes(Ingrediente ing) {
        System.out.println("f(" +ing.getNombre()+" )");
    }



    // Ejercicio 2 -  mplemente un generador de Recetas con los ingredientes del item anterior,
    // pero con cantidades aleatorias -> voy a generar recetas con cantidad de ingredientes = entre 0 y 10
    @DataProvider (name="ingredientes-random")
    public Iterator<Object[]> getCantRandom(){ // 10 íngredientes

        ArrayList<Object[]> listaIngredientesCantRandom = new ArrayList<Object[]>();
        int cantIngredientes = (int) (Math.random()*10+1);
        System.out.println("cantidad ingredientes" + cantIngredientes);
        for(int i=0;i<cantIngredientes;i++)
            listaIngredientesCantRandom.add(new Object[] {new Ingrediente("nombre x", "unidad", 10, 100*i )});
        // esto se podría hacer mejor con números alaeatorios

        return listaIngredientesCantRandom.iterator();
    }

    @Test(dataProvider = "ingredientes-random")
    public void testRecetaCantIngRandom(Ingrediente ing) {
        System.out.println("f(" +ing.getNombre() + " precio compra "+ ing.getPrecioCompra() +" )");
    }



}
