package desafioBancoDigital;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected  int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    @Override
    public String toString(){
        return
                "Titular: " + cliente.getNome() + "\n" +
                "Agência: " + this.agencia + "\n" +
                "Número: " + this.numero + "\n" +
                "Saldo: " + this.saldo;
    }
}
