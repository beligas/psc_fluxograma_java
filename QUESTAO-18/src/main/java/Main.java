// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Cada degrau de uma escada tem X de altura. Faça um programa que receba essa altura e a altura que o usuário deseja alcançar subindo a escada, calcule e mostre quantos degraus ele deverá subir para atingir seu objetivo, sem se preocupar com a altura do usuário. Todas as medidas fornecidas devem estar em metros.  

  import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  Scanner enterScanner = new Scanner (System.in);

    double degrais;
    double altura;
    double finais;
    
    System.out.println("Quantos metros tem de altura os degrais dessa escada?");
    degrais = enterScanner.nextDouble();

    System.out.println("Quantos metros deseja subir?");
    altura = enterScanner.nextDouble();

    finais = altura / degrais;

    System.out.println("Você precisa subir " + finais + " degrais");
      
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}