import java.util.Stack;

/**
 * Clase que implementa la evaluación de expresiones en notación postfija
 */
public class Postfijo {
    
    /**
     * Evalúa una expresión en notación postfija (polaca inversa)
     * @param expresion Expresión en notación postfija
     * @return Resultado de la evaluación
     * @throws IllegalArgumentException Si la expresión es inválida
     * @throws ArithmeticException Si ocurre un error matemático
     */
    public double evaluar(String expresion) {
        Stack<Double> pila = new Stack<>();
        String[] tokens = Operaciones.tokenizarExpresion(expresion);

        // Aqui va su codigo
    }
    
    /**
     * Verifica si la pila tiene suficientes operandos para una operación
     * @param pila Pila de operandos
     * @param cantidadNecesaria Cantidad de operandos necesarios
     * @throws IllegalArgumentException Si no hay suficientes operandos
     */
    private void verificarSuficientesOperandos(Stack<?> pila, int cantidadNecesaria) {
        if (pila.size() < cantidadNecesaria) {
            throw new IllegalArgumentException("Expresión postfija inválida: faltan operandos");
        }
    }
    
    /**
     * Verifica si la expresión es válida después de evaluarla
     * @param pila Pila resultante
     * @throws IllegalArgumentException Si la expresión no es válida
     */
    private void verificarExpresionValida(Stack<?> pila) {
        if (pila.size() != 1) {
            throw new IllegalArgumentException("Expresión postfija inválida: sobran operandos");
        }
    }
}