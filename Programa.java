import java.util.Scanner;
//*
// Para proxima aula vamos estudar
// - list
// - set
// - map */
class Programa {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite o primeiro número:");
      int a = scanner.nextInt();
      System.out.println("Digite a operação (+ - * /):");
      String operacao = scanner.next();
      System.out.println("Digite o segundo número:");
      int b = scanner.nextInt(); 
      System.out.println("Resultado: " + calcular(a, b, operacao));
      scanner.close();
    }
    private static int calcular(int a, int b, String operacao) {
      if (operacao.equals("+")) return a + b;
      if (operacao.equals("-")) return a - b;
      if (operacao.equals("*")) return a * b;
      if (operacao.equals("/")) return b != 0 ? a / b : 0;
      return 0;
    }
}
