import java.util.Scanner;

class Programa {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Digite sua placa:");
      String placa = scanner.nextLine();
      placa = placa.toUpperCase();
      System.out.println(placa);
    }
}
