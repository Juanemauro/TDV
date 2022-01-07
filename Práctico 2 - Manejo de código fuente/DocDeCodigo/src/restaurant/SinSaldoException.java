package restaurant;
/**
 * @file SinSaldoException.java
 * @brief la clase SinSaldoException crea una Excepción para cuando el usuario no tenga saldo
 * @details extiende de Exception (clase predeterminada de Java)
 * @see Java-Exceptions https://www.tutorialspoint.com/java/java_exceptions.htm
 */
public class SinSaldoException extends Exception {
    /**
     * @brief redefine el método toString
     * @return retorna un String con un mensaje indicado que el usuario no tiene saldo
     * */
    public String toString() { return "No tiene suficiente saldo";}
}
