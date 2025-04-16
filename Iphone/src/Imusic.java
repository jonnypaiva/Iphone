public class Imusic extends Iphone{

    public void tocar(){
        System.out.println("Tocando Música agora");
    }

    public void pausar(){
        System.out.println("Música pausada");
    }


    public void selecionaMusica(){
        System.out.println("Música Selecionada");
    }

    public void next(){
        System.out.println("Tocando próxima música");
    }

    public void previous(){
        System.out.println("Tocando música anterior");
    }

    @Override
    public String toString() {
        return "Imusic []";
    }

    
}
