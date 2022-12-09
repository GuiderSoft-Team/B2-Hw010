public class Tool {
    public static String splitWord(String word) {
        String str = "";
        int harf = 0;
        String part1 = "";
        String part2 = "";

        try {
            harf = Math.round(word.length() / 2);
            if (word!=null&!word.isEmpty()) if (word.length() % 2 != 0) {
                part1 = word.substring(0, harf + 1);
                part2 = word.substring(harf + 1, word.length());
                str = part1 + "-" + part2;
            } else {
                part1 = word.substring(0, harf);
                part2 = word.substring(harf, word.length());
                str = part1 + "-" + part2;
            }
        }catch(NullPointerException | StringIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        return str;
    }
}
