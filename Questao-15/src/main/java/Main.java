import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner enterScanner = new Scanner(System.in);

        double A;
        double B;
        double C;
        double delta;
        double raiz1;
        double raiz2;

        System.out.println("Informe o valor de A: ");
        A = enterScanner.nextDouble();

        System.out.println("Informe o valor de B: ");
        B = enterScanner.nextDouble();

        System.out.println("Informe o valor de C: ");
        C = enterScanner.nextDouble();

        delta = (B * B) - 4 * A * C;

        if (delta < 0) {
            System.out.println("Não existem raízes reais");
        } else if (delta == 0) {
            raiz1 = -B / (2 * A);
            System.out.println("Raiz única: " + raiz1);
        } else {
            raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
            raiz2 = (-B - Math.sqrt(delta)) / (2 * A);
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }
    }
}
