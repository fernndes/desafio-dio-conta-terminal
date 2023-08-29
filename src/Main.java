import com.dio.conta.ContaTerminal;

import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("Programa: Por favor, digite o número da Agência!");
        int numero = scanner.nextInt();
        System.out.println("Usuário: " + numero);

        System.out.println("Programa: Por favor, digite o nome da Agência!");
        String agencia = scanner.nextLine();
        System.out.println("Usuário: " + agencia);

        System.out.println("Programa: Por favor, digite o seu nome!");
        String nome_cliente = scanner.nextLine();
        System.out.println("Usuário: " + nome_cliente);

        System.out.println("Programa: Por favor, digite o seu saldo!");
        BigDecimal saldo = scanner.nextBigDecimal();
        System.out.println("Usuário: " + saldo);

        ContaTerminal nova_conta = new ContaTerminal(numero, agencia, nome_cliente, saldo);
        System.out.println(nova_conta.printInitialMessage());
    }
}