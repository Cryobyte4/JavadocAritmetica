
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones aritméticas básicas.
 */
public class aritmetica {

    /**
     * Suma dos números enteros.
     * 
     * @param a el primer número
     * @param b el segundo número
     * @return la suma de a y b
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     * 
     * @param a el primer número
     * @param b el segundo número
     * @return la resta de a menos b
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     * 
     * @param a el primer número
     * @param b el segundo número
     * @return el producto de a por b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Divide dos números enteros.
     * 
     * @param a el dividendo
     * @param b el divisor
     * @return el resultado de la división de a entre b
     * @throws IllegalArgumentException si b es cero
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}

