public final class Tools {


     String splitWord(String word)  {

      try {
           if (word.length()%2==0) {
               int cift = word.length() / 2;
               System.out.println(word.substring(0, cift) + "-" + word.substring(cift, word.length()));
           } else if (word.length()%2==1) {
              int tek =Math.round( word.length() / 2);
               System.out.println (word.substring(0,tek+1)+"-"+word.substring(tek+1, word.length()));

           }
           }catch (NullPointerException | StringIndexOutOfBoundsException ex){
                System.err.println(ex.getMessage());
       }

        return word;
    }
}
