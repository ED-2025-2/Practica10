/**
 * Clase que proporciona operaciones matemáticas básicas
 */
public class Operaciones {
    
    /**
     * Verifica si un token es un operador matemático
     * @param token Token a verificar
     * @return true si es un operador, false en caso contrario
     */
    public static boolean esOperador(String token) {
        return token.equals("+") || token.equals("-") || 
               token.equals("*") || token.equals("/") ||
               token.equals("^");
    }
    
    /**
     * Convierte un token a un valor numérico
     * @param token Token a convertir
     * @return Valor numérico del token
     * @throws NumberFormatException Si el token no representa un número válido
     */
    public static double convertirANumero(String token) throws NumberFormatException {
        return Double.parseDouble(token);
    }
    
    /**
     * Realiza la operación matemática correspondiente
     * @param operador Operador matemático (+, -, *, /, ^)
     * @param operando1 Primer operando
     * @param operando2 Segundo operando
     * @return Resultado de la operación
     * @throws ArithmeticException Si ocurre un error matemático (ej. división por cero)
     * @throws IllegalArgumentException Si el operador no es válido
     */
    public static double realizarOperacion(String operador, double operando1, double operando2) {
        switch (operador) {
            case "+": return sumar(operando1, operando2);
            case "-": return restar(operando1, operando2);
            case "*": return multiplicar(operando1, operando2);
            case "/": return dividir(operando1, operando2);
            case "^": return potencia(operando1, operando2);
            default: throw new IllegalArgumentException("Operador no soportado: " + operador);
        }
    }
    
    /**
     * Suma dos números
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de la suma
     */
    public static double sumar(double a, double b) {
        return a + b;
    }
    
    /**
     * Resta dos números
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de la resta
     */
    public static double restar(double a, double b) {
        return a - b;
    }
    
    /**
     * Multiplica dos números
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de la multiplicación
     */
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    /**
     * Divide dos números
     * @param a Primer número (dividendo)
     * @param b Segundo número (divisor)
     * @return Resultado de la división
     * @throws ArithmeticException Si el divisor es cero
     */
    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
    
    /**
     * Calcula la potencia de un número elevado a otro
     * @param base Base
     * @param exponente Exponente
     * @return Resultado de la potencia
     */
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    
    /**
     * Separa la expresión en tokens (operandos y operadores)
     * @param expresion Expresión matemática a tokenizar
     * @return Arreglo de tokens
     */
    public static String[] tokenizarExpresion(String expresion) {
        return expresion.trim().split("\\s+");
    }
}