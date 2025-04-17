public interface Servicos {

    public interface Imusic {
        void tocar();

        void pausar();

        void selecionaMusica();

        void next();

        void previous();
                
    } 
    
    public interface Telefone {
        void ligar();

        void atender ();

        void iniciarCorreioDeVoz();


        
    }
    public interface Internet {
    
        void exibirPagina();
        
        void adicionarNovaAba();

        void atualizarPagina();
    }
          
    
}
