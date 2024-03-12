// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Desenvolva um programa que calcula a área de um círculo, onde o raio é fornecido pelo usuário


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner enterScanner = new Scanner(System.in);

    double Raio;
    double Area;
    double Pi = 3.14;
    
    System.out.println("Digite o raio de um circulo (em centimetros) para calcularmos a área");
    Raio = enterScanner.nextDouble();

    Area = Pi * (Raio * Raio);

    System.out.println("A área do circulo é " + Area + " centimetros");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}