
package javadoca;

/**
 *
 * @author claramolinosaraiz
 * Esta clase representa operaciones matemáticas avanzadas.
 */
public class operaciones {

    /**
     * Calcula el módulo de dos números enteros.
     * 
     * @param a el dividendo
     * @param b el divisor
     * @return el resto de la división de a entre b
     * @throws IllegalArgumentException si el divisor es cero
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero");
        }
        return a % b;
    }

     /**
     * Calcula el cuadrado de un número entero.
     * 
     * @param a el número a elevar al cuadrado
     * @return el cuadrado de a
     */
    public int calcularCuadrado(int a) {
        return a * a;
    }
    
    /**
     * Calcula la raíz cuadrada de un número.
     * 
     * @param a el número del cual se calculará la raíz cuadrada
     * @return la raíz cuadrada de a
     * @throws IllegalArgumentException si a es un número negativo
     */
    public double calcularRaizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }   
}

