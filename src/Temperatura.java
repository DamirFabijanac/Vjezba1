import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesi temperaturu u stupnjevima Celzijusa: ");
        double celsius = unos.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Temperatura u Fahrenheitima: " + fahrenheit);
        System.out.println("Temperatura u Kelvinima: " + kelvin);
    }
}

