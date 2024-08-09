package desafioBancoDigital;



public class Main {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente();
        cliente1.setNome("David");

        ContaCorrente contaCorrente1 = new ContaCorrente(cliente1);


        ContaPoupanca contaPoupanca1 = new ContaPoupanca(cliente1);

        System.out.println(contaCorrente1.toString());
        System.out.println();
        System.out.println(contaPoupanca1.toString());
        System.out.println();
        Banco banco = new Banco();
        banco.setNome("Banco Mundial");
        System.out.println(banco.toString());

    }
}
