import java.util.Scanner;

public class MinAndMaxNumbers {
    public static void main(String[] args) {
        getMinAndMaxNumbers();
    }
    private static void getMinAndMaxNumbers() {
        System.out.println("Enter a number, or any character to quit: ");  // Imprimo el texto solicitado.
        Scanner input = new Scanner((System.in));  // Instancio un nuevo objeto de la clase Scanner.
        // Si el primer dato ingresado no es un double:
        if(!input.hasNextDouble()) {
            System.out.println("No valid numbers were entered");  // Imprimo el mensaje correspondiente.
            input.close();  // Cierro el scanner.
            return;  // Finalizo el proceso.
        }
        double max = Double.MIN_VALUE;  // Creo variable max, cuyo valor es el valor mínimo de un double.
        double min = Double.MAX_VALUE;  // Creo variable min, cuyo valor es el valor máximo de un double.
        // Mientras el input sea un double:
        while(input.hasNextDouble()) {
            System.out.println("Enter the next number, or any character to quit: ");  // Imprimo el mensaje solicitado.
            double number = input.nextDouble();  // Creo (o reasigno) la variable number, con el valor actual del input.
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        input.close();  // Cierro el scanner.
        // Imprimo los mensajes finales.
        System.out.println("Process finished!");
        System.out.println("Minimum number = " + min);
        System.out.println("Maximum number = " + max);
    }

    public static void getMinAndMaxNumbersEnhanced() {
        Scanner input = new Scanner(System.in);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        boolean first = true;  // Creo variable booleana para determinar si el dato ingresado es el primero o no.

        while (true) {
            System.out.println("Enter a number, or any character to quit: ");
            if (input.hasNextDouble()) {
                double number = input.nextDouble();
                min = Math.min(min, number);
                max = Math.max(max, number);
                if (first) {
                    first = false;
                }
            } else {
                break; // Rompe el ciclo si la entrada no es un número.
            }
            input.nextLine(); // Maneja el final de línea después del número ingresado.
        }

        if (first) {
            System.out.println("No valid numbers were entered.");
        } else {
            System.out.println("Minimum number = " + min);
            System.out.println("Maximum number = " + max);
        }
    }
}