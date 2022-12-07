public final class Tools {

    public static String splitWord(String word) throws NullPointerException {
        if ((word == null || word.isBlank())) {
            throw new NullPointerException("Kelime null olamaz veya boş-boşluk(lar)'dan oluşamaz!!!");
        }
        String firstPart = "";
        String secondPart = "";
        try {
            if (word.length() % 2 == 0) {
                firstPart = word.substring(0, (word.length() / 2));
                secondPart = word.substring(word.length() / 2);
            } else {
                firstPart = word.substring(0, (word.length() / 2 + 1));
                secondPart = word.substring(word.length() / 2 + 1);
            }
        }catch (StringIndexOutOfBoundsException ex){
            System.err.println("Uzunluk hatasi olustu. " + ex.getMessage());
        }

        return firstPart + "-" + secondPart;
    }
}
