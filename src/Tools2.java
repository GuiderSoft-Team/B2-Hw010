public final class Tools2 {
    public static String splitWord (String word){
        boolean flag = true;
        String hata = "";
        if (word!=null&&!word.isBlank()){
            String wordPart1;
            String wordPart2;
            try {
                if (word.length() % 2 == 0) {
                    wordPart1 = word.substring(0, word.length() / 2);
                    wordPart2 = word.substring((word.length() / 2));

                } else {
                    wordPart1 = word.substring(0, (word.length() / 2) + 1);
                    wordPart2 = word.substring((word.length() / 2 + 1));

                }
                word = wordPart1 + "-" + wordPart2;
            }catch (StringIndexOutOfBoundsException ex){
                flag = false;
                hata = "Hata: "+ex.getMessage();

            }
        }else {
            flag = false;
            hata = "Kelime null, bos veya bosluk(lar)dan olusamaz.";
        }
        return flag?word:hata;
    }

}
