import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número maior que 1:");
        int n = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
