import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char resposta;

        do {
            System.out.print("Digite um número inteiro positivo menor que 16 para calcular o fatorial: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero < 16) {
                long resultado = calcularFatorial(numero);
                System.out.println("O fatorial de " + numero + " é " + resultado);
            } else {
                System.out.println("Número inválido! Digite um número inteiro positivo menor que 16.");
            }

            System.out.print("Deseja calcular outro fatorial? (S/N): ");
            resposta = scanner.next().charAt(0);
        } while (resposta == 'S' || resposta == 's');

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
