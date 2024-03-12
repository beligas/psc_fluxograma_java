// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um algoritmo que leia a idade de uma pessoa e calcule quantos dias essa pessoa já viveu.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
  Scanner enterScanner = new Scanner(System.in);
  int Num1;
    
    System.out.println("Digite sua idade ");
    Num1 = enterScanner.nextInt();

    System.out.println("Sua idade em dias é de: " + Num1 * 365);
    
    
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}