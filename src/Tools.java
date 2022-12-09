import java.util.Arrays;

public final class Tools {

    public static String splitWord(String word) {

        String part1 = "";
        String part2 = "";

        try {
            for (int i = 0; i < word.length(); i++) {
                if (word.length() % 2 == 0) {
                    part1 = word.substring(0, word.length() / 2);
                    part2 = word.substring(word.length() / 2);


                } else {
                    part1 = word.substring(0, word.length() / 2 + 1);
                    part2 = word.substring(word.length() / 2 + 1);

                }
            }
            return part1 + "-" + part2;


        } catch (NullPointerException ex) {

        } catch (StringIndexOutOfBoundsException ex) {

        }
        return word;
    }
}