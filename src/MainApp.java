

public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.


        try {
            Tools tool=new Tools();
            System.out.println(tool.splitWord("özge"));

        }catch (NullPointerException ex){
            System.out.println("hata : "+ex.getMessage());

        }

    }
}
