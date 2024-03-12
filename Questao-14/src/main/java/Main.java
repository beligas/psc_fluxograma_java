// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Desenvolva um programa que, dados dois valores A e B, troque os valores de forma que A passe a ter o valor de B e vice-versa. Exiba os valores após a troca.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  Scanner enterScanner = new Scanner(System.in);
    int num1, num2, num3;
    
    System.out.println("Digite um valor para variavel A");
    num1 = enterScanner.nextInt();

    System.out.println("Digite um valor para variavel B");
    num2 = enterScanner.nextInt();

    num3 = num1;
    num1 = num2;
    num2 = num3;

    System.out.println("O valor de A é: " + num1 + " e o valor de B é: " + num2);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}