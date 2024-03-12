// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles.

import java.util.Scanner;

public class Main {
  public static void main(String[] args){ 

    Scanner enterScanner = new Scanner (System.in);
    int Num1;
    int Num2;

    System.out.println("Informe um numero: ");
    Num1 =enterScanner .nextInt();

    System.out.println("Informe outro numero: ");
    Num2 = enterScanner .nextInt();

    System.out.println("O resto da divisao dos numeros é: " + (Num1 % Num2));

}
}