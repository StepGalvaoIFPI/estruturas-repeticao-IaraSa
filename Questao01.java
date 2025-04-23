import java.util.Scanner;
public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade:");
        double velocidade = Double.valueOf(scanner.nextLine());
        
        if(velocidade>=80 ){
            System.out.println("Vermelha");
        }else{
            System.out.println("Verde");
        }
    }
}