public class Iphone {
    public static void main(String[] args) throws Exception {
    
        String appEscolhido = "Imusic";
        Iphone iphone = new Iphone();

        if (appEscolhido.equals("Imusic"))
            iphone = new Imusic();
        else if (appEscolhido.equals("Internet"))
            iphone = new Internet();
        else if (appEscolhido.equals("Telefone")) 
                iphone = new Telefone();
        
        System.out.println(appEscolhido + " Aberto");
    }

    
}
