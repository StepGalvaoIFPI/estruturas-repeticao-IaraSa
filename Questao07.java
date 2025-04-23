import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Digite o número 1:");
            numero = Integer.valueOf(scanner.nextLine());
        } while (numero != 1);

        System.out.println("Fim do programa");
    }
}
