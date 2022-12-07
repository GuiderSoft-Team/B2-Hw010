public final class Tools {





    public String splitWord(String word){

        int uzunluk=word.length();
        String part1 ="";
        String part2="";

        try {
            if (word!=null&&!word.isBlank()){
            }else {
                System.out.println("İsim null ve/veya boşluk olamaz.");
            }
            if (uzunluk%2==0){
                part1=word.substring(0,uzunluk/2);
                part2=word.substring(uzunluk/2,uzunluk);
            }else {
                part1=word.substring(0,uzunluk/2+1);
                part2=word.substring(uzunluk/2+1,uzunluk);
            }
        }catch (NullPointerException ex){
            System.out.println("Bir hata oluştu. Hata: " +ex.getMessage());
        }catch (StringIndexOutOfBoundsException ex){
            System.out.println("Bir hata oluştu. Hata : " +ex.getMessage());

        }

        return part1+"-"+part2;
    }

    }

