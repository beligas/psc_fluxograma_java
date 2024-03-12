// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado.

  import java.util.Scanner;


public class Main {
  public static void main(String[] args) {

  Scanner enterScanner= new Scanner (System.in);
    
  double Salario;
  double SalarioNovo;
    
    System.out.println("Digite seu salario");
    Salario = enterScanner.nextDouble();

    SalarioNovo = Salario + (Salario * 0.07);
    
    System.out.println("Seu novo salário com um ajuste de 7% é de : " + SalarioNovo);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}