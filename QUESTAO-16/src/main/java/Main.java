// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Faça um programa que receba de entrada a distância total (em km) percorrida por um automóvel e a quantidade de combustível (em litros) consumida para percorrê-la, calcule e imprima o consumo médio de combustível. Fórmula: distância/litro.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    double viagem;
    double litros;
    double gasto;
    
    System.out.println("Digite a distancia total da viagem percorrida em Km: ");
    viagem = enterScanner.nextDouble();

    System.out.println("Digite a quantidade de combustivel gasto em litros: ");
    litros = enterScanner.nextDouble();

    gasto = viagem / litros;

    System.out.println("O consumo médio do automóvel é de: " + gasto);    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}