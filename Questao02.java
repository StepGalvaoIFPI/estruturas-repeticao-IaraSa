import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário:");
        double salario = Double.valueOf(scanner.nextLine());

        double aumento;
        if (salario > 1250) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }

        double novoSalario = salario + aumento;

        System.out.printf("Aumento = R$ %.2f\n", aumento);
        System.out.printf("Novo salário = R$ %.2f\n", novoSalario);
    }
}
