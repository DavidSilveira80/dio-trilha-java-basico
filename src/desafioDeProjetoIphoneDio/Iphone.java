package desafioDeProjetoIphoneDio;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    @Override
    public void acionarCorreioDeVoz() {
        System.out.println("Conferindo seu correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando sua música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a página Web");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página Web");
    }

    @Override
    public void novaAba() {
        System.out.println("Nova Aba");
    }
}
