import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.print("Unesi duljinu pravokutnika: ");
        double duljina = unos.nextDouble();

        System.out.print("Unesi širinu pravokutnika: ");
        double sirina = unos.nextDouble();

        double povrsina = duljina * sirina;

        System.out.println("Površina pravokutnika je: " + povrsina);
    }
}

