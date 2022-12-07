public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.
        try {

            Tools tools = new Tools();
            String word1 = tools.splitWord("Engin Hereser");
            System.out.println(word1);
            String word2 = tools.splitWord("Gülsüm");
            System.out.println(word2);
            String word3 = tools.splitWord(" ");
            System.out.println(word3);
        }catch (NullPointerException ex1){
            System.out.println("Hata : "+ex1.getMessage());
        }

    }
}
