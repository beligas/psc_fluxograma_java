// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Faça um programa que converta a temperatura dada em Fahrenheit para Celsius.  Para testar se a sua resposta está correta saiba que 100ºC = 212F. Considere C/5 = (F-32)/9


  import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);

    int FAR;
    int converter;
    
    
    System.out.println("Digite a temperatura em Fahrenheit: ");
    FAR = enterScanner.nextInt();

    converter = (FAR - 32) * 5 / 9;

    System.out.println("A temperatura em Celsius é: " + converter);
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}