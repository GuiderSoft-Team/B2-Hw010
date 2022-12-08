public final class Tools {

    static String splitWord(String word) {

        int d = word.length() / 2;

        String part1 = " ";
        String part2 = " ";
        if(word != null &&!word.isEmpty()){

        }else
            System.out.println(" Word cannot be null or/and empty");
    try {
        if (word.length() % 2 == 0) {
            part1 = word.substring(0, d);
            part2 = word.substring(d);
        } else {
            part1 = word.substring(0, d + 1);
            part2 = word.substring(d + 1);
        }
    }catch (NullPointerException | StringIndexOutOfBoundsException ex){
        System.out.println("Hata bulundu. Hata : "+ex.getMessage());
    }
        return String.format("%s  %s ",part1,part2);
    }
}
