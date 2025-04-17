import Servicos.Imusic;
import Servicos.Telefone;

public class Iphone implements Servicos.Imusic, Servicos.Internet, Servicos.Telefone {
    
        public void tocar(){
            System.out.println("Tocando Musica...");
        }

        public void pausar() {
            System.out.println("Música pausada.");
        }
    
        public void selecionarMusica(String musica) {
            System.out.println("Selecionando música: " + musica);
        }

        public void next(){
            System.out.println("Avançando para a Próxima Música");
        }

        public void previous(){
            System.out.println("Retornando para música anterior");
        }

        public void ligar(String numero) {
            System.out.println("Ligando para " + numero);
        }
    
        public void atender() {
            System.out.println("Atendendo chamada...");
        }
    
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz...");
        }
        public void exibirPagina(String url) {
                System.out.println("Exibindo página: " + url);
            }
        
        public void adicionarNovaAba() {
                System.out.println("Nova aba adicionada.");
            }
        
         public void atualizarPagina() {
                System.out.println("Página atualizada.");
            }

}   
    public static void main(String[] args) {
    Iphone iphone = new Iphone();
    iphone.selecionarMusica("Imagine - John Lennon");
    iphone.tocar();
    iphone.ligar("123456789");
    iphone.exibirPagina("https://apple.com");
}