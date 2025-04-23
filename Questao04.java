import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário:");
        double salario = Double.valueOf(scanner.nextLine());

        double imposto = 0;
        double inss = 0;

        if (salario < 1000) {
            imposto = 0;
            inss = 0;
        } else if (salario < 2000) {
            imposto = salario * 0.10;
            inss = salario * 0.11;
        } else if (salario < 3000) {
            imposto = salario * 0.20;
            inss = salario * 0.15;
        } else {
            imposto = salario * 0.27;
            inss = salario * 0.20;
        }

        System.out.printf("Salário: R$ %.2f\n", salario);
        System.out.printf("Imposto de renda: R$ %.2f\n", imposto);
        System.out.printf("INSS: R$ %.2f\n", inss);
    }
}
