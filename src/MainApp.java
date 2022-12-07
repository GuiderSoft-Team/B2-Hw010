public class MainApp {
    public static void main(String[] args) {
        try {
            System.out.println(Tools.splitWord("Kaan"));
            System.out.println(Tools.splitWord("Hasan"));
            System.out.println(Tools.splitWord(" "));
        }catch (NullPointerException ex1){
            System.err.println("Hata : "+ex1.getMessage());
        }
    }
}
