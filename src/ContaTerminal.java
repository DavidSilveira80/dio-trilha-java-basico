import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args){
        int numeroConta = informarNumeroConta();
        String agenciaBancaria = informarAgenciaBancaria();
        String nomeCliente = informarNomeCliente();
        Double saldo = informarSaldoInicial();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco" +
                ", sua agência é %s, conta %d e seu " +
                "saldo %.2f R$ já está disponível.",nomeCliente, agenciaBancaria, numeroConta, saldo);
    }

    public static int informarNumeroConta(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o número da conta bancária: ");
        return entrada.nextInt();
    }

    public static String informarAgenciaBancaria(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a agência Bancaria: ");
        return entrada.nextLine();
    }

    public static String informarNomeCliente(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o nome do cliente: ");
        return entrada.nextLine();
    }

    public static Double informarSaldoInicial(){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o Saldo inicial: ");
       return entrada.nextDouble();
    }
}
