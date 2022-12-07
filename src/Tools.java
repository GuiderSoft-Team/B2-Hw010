public final class Tools {
    public static String splitWord(String word) {
        if (word == null || word.trim().length() == 0) {
            throw new NullPointerException();
        }
        int middle = word.length() / 2;
        String part1 = "";
        String part2 = "";
        try {
            if (word.length() % 2 == 0) {
                part1 = word.substring(0, middle);
                part2 = word.substring(middle);
            } else {
                part1 = word.substring(0, middle + 1);
                part2 = word.substring(middle + 1);
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Hata: Bir hata ile karşılaşıldı!");

        }
        return part1 + "-" + part2;
    }

    public static void main(String[] args) {

        try {
            String word1 = "Ahmet";
            String word2 = "Dursun";
            String word3 = null;
            String word4 = "     ";
            System.out.println("Split Word1: " + splitWord(word1));
            System.out.println("Split Word2: " + splitWord(word2));
            System.out.println("Split Word3: " + splitWord(word3));
            System.out.println("Split Word4: " + splitWord(word4));

        } catch (NullPointerException ex) {
            System.out.println("Hata: Null veya boşluk girilmez!!" + ex.getMessage());
        }
    }
}

