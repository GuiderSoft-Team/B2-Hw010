public final class Tools {


     String splitWord(String word)  {

      try {
           if (word.length()%2==0) {
               int cift = word.length() / 2;
               System.out.println(word.substring(0, cift) + "-" + word.substring(cift, word.length()));
           } else if (word.length()%2==1) {
               double tek = word.length() / 2;
               int ceil = (int) Math.ceil(tek);
               System.out.println (word.substring(0,ceil+1)+"-"+word.substring(ceil+1, word.length()));

           }
           }catch (NullPointerException | StringIndexOutOfBoundsException ex){
                System.err.println(ex.getMessage());
       }

        return word;
    }
}
