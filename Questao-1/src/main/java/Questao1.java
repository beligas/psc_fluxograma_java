// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um programa que solicita ao usuário dois números e, em seguida, mostra a soma desses números.

import java.util.Scanner;

public class Questao1 {
  public static void main(String[] args) {
  
    Scanner enterScanner = new Scanner(System.in);
    int Num1;
    int Num2;
    
    System.out.println("Digite um numero: ");
    Num1 = enterScanner.nextInt(); 
    
    System.out.println("Digite outro numero: ");
    Num2 = enterScanner.nextInt();

    System.out.println("A soma dos numeros é: " + (Num1 + Num2));
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}