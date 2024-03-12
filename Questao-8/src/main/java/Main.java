// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escreva um programa que converte uma quantidade de metros para centímetros.

  import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);
    double Metro;
    double Centimetros;
    
    System.out.println("Informe uma metragem em metros: ");
    Metro = enterScanner.nextDouble();

    Centimetros = Metro * 100;

    System.out.println("A metragem em centimetros é: " + Centimetros);
      
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}