import java.util.Scanner;
public class DesafioMultiplos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Descubra os múltiplus!");
        System.out.print("Digite o numero: 1000, e saiba quais são os múltipulos desse número.");

        int limite = scanner.nextInt();
        int soma = 0;

        for (int i = 1; i < limite; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
            }
        }
        
        System.out.println("A soma dos múltiplos de 3 ou 5 abaixo de " + limite + " é: " + soma);
        scanner.close();
    }
}