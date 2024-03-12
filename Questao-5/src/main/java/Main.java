// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$ 1 = R$ 4,95.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   
    Scanner enterScanner = new Scanner (System.in);
    double Num1;
    double Real = 4.95;
    
    System.out.println("Informe o valor desejado em dolar");
    Num1= enterScanner.nextDouble(); 

    System.out.println("O valor em real será de "+ Num1/Real);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}