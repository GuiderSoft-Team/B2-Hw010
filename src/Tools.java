public class  Tools {


    public static String splitWord(String word) {

            String part1="";
            String part2="";
            if ((word==null) && (word.isEmpty())){
                throw new NullPointerException("word, null-boş-boşluk(lar)'dan oluşamaz.");
            }
            try {

                if (word.length() % 2 == 1) {
                  part1=  word.substring(0, word.length() / 2+1);
                  part2 =     word.substring(word.length() / 2+1);
                } else {
                    part1 = word.substring(0, word.length() / 2 );
                    part2 = word.substring(word.length() / 2 );
                }

            }catch (StringIndexOutOfBoundsException ex){
                System.err.println(ex.getMessage());
            }return part1 + "-" + part2;
        }
    }

















