public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.
        try {
            System.out.println(Tools.splitWord("Ahmet"));
            System.out.println(Tools.splitWord("Dursun"));
            //System.out.println(Tools.splitWord(null));
            System.out.println(Tools.splitWord("  "));
        } catch (NullPointerException ex) {
            System.err.println("Hata olustu. " + ex.getMessage());;
        }
    }
}
