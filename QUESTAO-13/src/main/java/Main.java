// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escreva um programa que calcula o salário líquido de um funcionário. O programa deve solicitar o valor da hora de trabalho, o número de horas trabalhadas no mês e o percentual de desconto do INSS

  import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner enterScanner = new Scanner(System.in);
    double valorHora;
    int horas;
    int horasMes;
    double salario;
    double salarioLiquido;
    
    System.out.println("Qual valor da sua hora de trabalho?");
    valorHora = enterScanner.nextDouble();

    System.out.println("Quantas horas você trabalha em um dia?");
    horas = enterScanner.nextInt();

    horasMes = horas * 20;

    salario = horasMes * valorHora;
    salarioLiquido = salario - (salario * 0.11);

    System.out.println("Seu salario liquido é de " + salarioLiquido);
  
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}