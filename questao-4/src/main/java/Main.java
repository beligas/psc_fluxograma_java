// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e depois mostre os dados digitados

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);
    String Nome;
    String Endereco;
    int Telefone;
    

    System.out.println("Digite seu Nome");
    Nome = input.nextLine();
    
    System.out.println("Digite seu Endereço");
    Endereco = input.nextLine();
    
    System.out.println("Digite seu Telefone");
    Telefone = input.nextInt();
   
      
    System.out.println("O Nome é: " + Nome);
    System.out.println("O Telefone é: " + Telefone);
    System.out.println("O Endereço é : " + Endereco);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}