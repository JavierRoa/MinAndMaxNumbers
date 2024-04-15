import java.util.Scanner;

public class MinAndMaxNumbers {
    public static void main(String[] args) {
        getMinAndMaxNumbers();
    }
    private static void getMinAndMaxNumbers() {
        double max = Double.MIN_VALUE;  // Creo variable max, cuyo valor es el valor mínimo de un double
        double min = Double.MAX_VALUE;  // Creo variable min, cuyo valor es el valor máximo de un double
        System.out.println("Enter a number, or any character to quit: ");  // Imprimo el texto solicitado.
        Scanner input = new Scanner((System.in));  // Instancio un nuevo objeto de la clase Scanner.
        // Si el primer dato ingresado no es un double:
        if(!input.hasNextDouble()) {
            System.out.println("No valid numbers were entered");  // Imprimo el mensaje correspondiente.
            return;  // Finalizo el proceso.
        }
        // Mientras el input sea un double:
        while(input.hasNextDouble()) {
            System.out.println("Enter a number, or any character to quit: ");  // Imprimo el mensaje solicitado.
            double number = input.nextDouble();  // Creo (o reasigno) la variable number, con el valor actual del input.
            // Si number es mayor a max:
            if(number > max) {
                max = number;  // max pasa a tener el valor de number.
            }
            // Si number es menor a min:
            if(number < min) {
                min = number;  // min pasa a tener el valor de number.
            }
        }
        input.close();
        // Imprimo los mensajes finales.
        System.out.println("Process finished!");
        System.out.println("Minimum number = " + min);
        System.out.println("Maximum number = " + max);
    }
}
