public final class Tools {
    public static String splitWord (String word) {
        String part1= "";
        String part2="";
        if ((word!=null)&&(word.isBlank())){
            System.err.println("word,null-boş-boşluk(lar)dan oluşamaz");
        }
        try{
            if (word.length()%2==0){
                part1=word.substring(0,word.length()/2);
                part2=word.substring(word.length()/2);
            }else {
                part1=word.substring(0,word.length()/2+1);
                part2=word.substring(word.length()/2+1);
            }
        }catch (StringIndexOutOfBoundsException | NullPointerException e){
            System.err.println(" Hata bulundu : "+ e.getMessage());
        }
        return part1+"-"+part2;
    }
}
