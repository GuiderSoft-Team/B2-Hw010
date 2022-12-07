public final class Tools {
    static String splitWord(String word)throws NullPointerException{
        String p1=" ";
        String p2=" ";
        if ((word==null) || (word.isBlank())){
            throw new NullPointerException("Kelime boş / null olamaz!");
        }try {
            if (word.length() %2==0){
                p1=word.substring(0,word.length()/2);
                p2=word.substring(word.length()/2);
            }else {
                p1=word.substring(0,word.length()/2+1);
                p2=word.substring(word.length()/2+1);
            }
        }catch (StringIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }return p1+" / "+p2;
    }
}
