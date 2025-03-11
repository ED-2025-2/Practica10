import java.util.Scanner;

/**
 * Clase principal que contiene el punto de entrada del programa
 */
public class Main {
    
    public static void main(String[] args) {
        // Implementación del programa principal
        mostrarMenuPrincipal();
    }
    
    /**
     * Muestra el menú principal de la aplicación
     */
    public static void mostrarMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("\n=== EVALUADOR DE EXPRESIONES MATEMÁTICAS ===");
            System.out.println("1. Evaluar expresión en notación postfija");
            System.out.println("2. Evaluar expresión en notación prefija");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                procesarOpcion(opcion, scanner);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        } while (opcion != 3);
        
        scanner.close();
    }
    
    /**
     * Procesa la opción seleccionada por el usuario
     * @param opcion Opción seleccionada
     * @param scanner Objeto Scanner para leer la entrada
     */
    public static void procesarOpcion(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                procesarExpresionPostfija(scanner);
                break;
            case 2:
                procesarExpresionPrefija(scanner);
                break;
            case 3:
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }
    
    /**
     * Solicita y procesa una expresión en notación postfija
     * @param scanner Objeto Scanner para leer la entrada
     */
    public static void procesarExpresionPostfija(Scanner scanner) {
        System.out.print("Ingrese la expresión postfija (con espacios entre operandos y operadores): ");
        String expresion = scanner.nextLine();
        
        try {
            Postfijo evaluador = new Postfijo();
            double resultado = evaluador.evaluar(expresion);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error al evaluar la expresión: " + e.getMessage());
        }
    }
    
    /**
     * Solicita y procesa una expresión en notación prefija
     * @param scanner Objeto Scanner para leer la entrada
     */
    public static void procesarExpresionPrefija(Scanner scanner) {
        System.out.print("Ingrese la expresión prefija (con espacios entre operandos y operadores): ");
        String expresion = scanner.nextLine();
        
        try {
            Prefijo evaluador = new Prefijo();
            double resultado = evaluador.evaluar(expresion);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Error al evaluar la expresión: " + e.getMessage());
        }
    }
}