// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Escreva um programa que calcule os quadrados e cubos dos números de 0 a 10 e imprima os valores resultantes em formato de tabela como a seguir:

public class Main {

  public static int calcularQuadrado(int numero) {
    return numero * numero;
  }

  public static int calcularCubo(int numero) {
    return numero * numero * numero;
  }

  public static void main(String[] args) {
    int inicio = 0;
    int fim = 10;

    System.out.println("Número    Quadrado    Cubo");

    for (int i = inicio; i <= fim; i++) {

      int quadrado = calcularQuadrado(i);
      int cubo = calcularCubo(i);
      System.out.printf("%-9d%-12d%d%n", i, quadrado, cubo);
    }
  }
}
