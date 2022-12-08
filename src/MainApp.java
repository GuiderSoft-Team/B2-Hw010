public class MainApp {
    public static void main(String[] args) {
        try {
            System.out.println(Tools.splitWord("Zeynep"));
            System.out.println(Tools.splitWord("Bozdag"));
            System.out.println(Tools.splitWord("  "));
        } catch (NullPointerException ex) {
            System.err.println("Hata olustu. " + ex.getMessage());
        }
    }
}


