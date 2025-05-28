import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nResultados de las operaciones:");
        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));
        System.out.println("División: " + calc.dividir(num1, num2));

        scanner.close();
    }
}
