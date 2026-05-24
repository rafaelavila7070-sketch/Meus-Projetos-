import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, esse é o meu conversor de temperatura!");
        System.out.print("Digite a temperatura em Celsius: ");

        double temperaturaEmCelsius = scanner.nextDouble();
        double temperaturaEmFarenheit = (temperaturaEmCelsius * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + temperaturaEmFarenheit);

        scanner.close();
    }
}