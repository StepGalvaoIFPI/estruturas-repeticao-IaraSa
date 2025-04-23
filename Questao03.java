import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário:");
        double salario = Double.valueOf(scanner.nextLine());

        double imposto = 0;
        double inss = 0;

        if (salario > 2000) {
            imposto = salario * 0.15;
            inss = salario * 0.10;
        }

        System.out.printf("Salário: R$ %.2f\n", salario);
        System.out.printf("Imposto de renda: R$ %.2f\n", imposto);
        System.out.printf("INSS: R$ %.2f\n", inss);
    }
}
