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
}


