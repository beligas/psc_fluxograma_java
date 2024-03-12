// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um programa que calcula a média simples de três notas fornecidas pelo usuário.


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner enterScanner = new Scanner(System.in);

    double Nota1, Nota2, Nota3;
    double Media;
     

    
    System.out.println("Digite a primeira nota do aluno");
    Nota1 = enterScanner.nextDouble();

    System.out.println("Digite a segunda nota do aluno");
    Nota2 = enterScanner.nextDouble();

    System.out.println("Digite a terceira nota do aluno");
    Nota3 = enterScanner.nextDouble();

    Media = (Nota1 + Nota2 + Nota3) / 3;

    System.out.println("A média do aluno é " + Media);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}