public class Tool {
    public static String splitWord(String word) {
        String str = "";
        int half = 0;
        String partOne = "";
        String partTwo = "";

        try {
            half = Math.round(word.length() / 2);
            if (word!=null&!word.isEmpty()) if (word.length() % 2 != 0) {
                partOne = word.substring(0, half + 1);
                partTwo = word.substring(half + 1, word.length());
                str = partOne + "-" + partTwo;
            } else {
                partOne = word.substring(0, half);
                partTwo = word.substring(half, word.length());
                str = partOne + "-" + partTwo;
            }
            }catch(NullPointerException | StringIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        return str;
    }
}
