// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das peças - o código da peça 1, valor unitário da peça 1, quantidade de peças 1 - o código da peça 2, valor unitário da peça 2, quantidade de peças 2. O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner (System.in);

    float ipi1;
    int cod1, cod2;
    int qtd1, qtd2;
    float valor1, valor2;
    float total;
    
    System.out.println("Qual a porcentagem do IPI a ser acrescido no valor das peças?");
    ipi1 = enterScanner.nextFloat();

    System.out.println("Qual o código da peça 1?");
    cod1 = enterScanner.nextInt();

    System.out.println("Qual o valor do produto 1?");
    valor1 = enterScanner.nextFloat();

    System.out.println("Qual a quantidade de peças 1?");
    qtd1 = enterScanner.nextInt();


    System.out.println("Qual o código da peça 2?");
    cod2 = enterScanner.nextInt();

    System.out.println("Qual o valor do produto 2?");
    valor2 = enterScanner.nextFloat();

    System.out.println("Qual a quantidade de peças 2?");
    qtd2 = enterScanner.nextInt();

    total = (valor1 * qtd1 + valor2 * qtd2) * (1 + ipi1/100);

    System.out.println("O valor total a ser pago é: " + total);
       
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}