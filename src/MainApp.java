public class MainApp {
    public static void main(String[] args) {

        try {
            String word1 = "Ahmet";
            String word2 = "Dursun";
            String word3 = null;
            String word4 = "     ";
            System.out.println("Split Word1: " + Tools.splitWord(word1));
            System.out.println("Split Word2: " + Tools.splitWord(word2));
            System.out.println("Split Word3: " + Tools.splitWord(word3));
            System.out.println("Split Word4: " + Tools.splitWord(word4));

        } catch (NullPointerException ex) {
            System.out.println("Hata: Null veya boşluk girilmez!!" + ex.getMessage());
        }

    }
}
