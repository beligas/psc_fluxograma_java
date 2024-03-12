// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Faça um programa para o seguinte problema: Compraram-se N canetas iguais, que foram pagas com uma nota de Z reais, obtendo-se Y reais como troco. Quanto custou cada caneta?

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  Scanner enterScanner = new Scanner(System.in);

    int canetas;
    double notas;
    double troco;
    double preco;
    
    System.out.println("Quantas canetas deseja comprar?");
    canetas = enterScanner.nextInt();

    System.out.println("Com qual nota deseja pagar as canetas?");
    notas = enterScanner.nextDouble();

    System.out.println("Voce recebeu quantos reais de troco?");
    troco = enterScanner.nextDouble();

    preco = (notas - troco)/canetas;

    System.out.println("O preço de cada uma das canetas é de: " + preco);
      
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}