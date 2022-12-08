public class MainApp {
    public static void main(String[] args) {
        //Lütfen readme.md dosyasını okuyunuz.
        try {
            Tools tool=new Tools();
            System.out.println(tool.splitWord("Murat"));
            System.out.println(tool.splitWord("Yasin Murat"));
            System.out.println(tool.splitWord(" "));

        }catch (NullPointerException ex){
            System.out.println("hata : "+ex.getMessage());

        }

    }

    }

