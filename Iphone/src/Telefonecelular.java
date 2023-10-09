class TelefoneCelular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet.Navegador {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web...");
    }
}
