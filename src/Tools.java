import org.jetbrains.annotations.NotNull;

public final class Tools {

    public static @NotNull String splitWord(String word) {
        if (word!=null&&word.isBlank()) return "Hata : Kelime boş ya da boşluklardan ibaret olamaz.";

        String part1 = "";
        String part2 = "";

        try {
            if (word.length() % 2 == 0) {

                for (int i = 0; i < word.length() / 2; i++) {
                    part1 += word.charAt(i);
                }
                for (int i = word.length() / 2; i < word.length(); i++) {
                    part2 += word.charAt(i);
                }

            } else {
                for (int i = 0; i < (word.length() + 1) / 2; i++) {
                    part1 += word.charAt(i);
                }
                for (int i = (word.length() + 1) / 2; i < word.length(); i++) {
                    part2 += word.charAt(i);
                }
            }

            return part1 + "-" + part2;

        } catch (NullPointerException e) {
            System.out.println("Hata : Kelime null olamaz.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Hata : Kelimeyi index sınırları dışında yazdıramazsınız.");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


}
