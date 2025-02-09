import java.util.Scanner;

public class ContaTerminal 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da conta");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o nome da agencia");
        String nomeAgencia = scanner.next();
        
        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta");
        double saldoConta = scanner.nextDouble();

        System.err.println("Olá, " + nomeCliente + "\n" + "Seu saldo atual é de: " + saldoConta + "\n" + "O numero da sua conta é: " + numeroConta + "\n" + "O nome da sua agencia é: " + nomeAgencia);
    }
}
