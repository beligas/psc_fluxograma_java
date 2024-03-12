// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escreva um algoritmo para ler um valor e escrever o seu antecessor e o seu sucessor

import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    int Num1, Num2, Num3;
           
    System.out.println("Digite um numero ");
    Num1 = enterScanner.nextInt();

    Num2 = Num1 + 1;

    Num3 = Num1 - 1;
    
    System.out.println("O numero antecessor é: " + Num3);
    
    System.out.println("O numero sucessor é: " + Num2);
    
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}