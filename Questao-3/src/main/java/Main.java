// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
  String Nome;
    
    System.out.println("Informe seu nome: ");
    Nome = sc.nextLine();

    System.out.println("Seja bem vindo "  + Nome);
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}