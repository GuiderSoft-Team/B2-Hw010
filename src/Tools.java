final class Tools {
    String splitWord (String word)throws NullPointerException{
        String part1="";
        String part2="";
        if ((word==null) || (word.isBlank())){
            throw new NullPointerException("Kelime bos birakilamaz veya Null olamaz");
        }
        try {

            if (word.length() % 2 == 0) {
                part1 = word.substring(0, word.length() / 2);
                part2 = word.substring(word.length() / 2);
            } else {
                part1 = word.substring(0, word.length() / 2 + 1);
                part2 = word.substring(word.length() / 2 + 1);
            }

        }catch (StringIndexOutOfBoundsException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }return part1 + "-" + part2;
    }

}
