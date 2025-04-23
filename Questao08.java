import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite um número entre 1 e 3:");
            numero = Integer.valueOf(scanner.nextLine());
        } while (numero < 1 || numero > 3);

        System.out.println("Fim do programa");
    }
}
