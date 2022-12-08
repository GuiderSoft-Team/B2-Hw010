public  class Tools {


    private String part1;
    private String part2;

    public Tools() {
    }

    public Tools(String part1, String part2) {
        this.part1 = part1;
        this.part2 = part2;
    }

    public String getPart1(String s) {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public String getPart2(String s) {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }


        public static String splitWord () {
        String part1 = "Fatma";
        System.out.print(part1.substring(0, 3));
        System.out.print("-");
        String part2 = "Fatma";
        System.out.println(part2.substring(3, 5));

        try {

            System.out.println();


                   String kelime="Fatma";
              if (kelime.length() % 2 == 1) {

                          System.out.println("kelime Uzunlugu tek sayi=" +kelime.substring(0,3));

           } else if (kelime.length() % 2 == 1){
                          System.out.println(kelime.substring(4,5));
                      }



        } catch (StringIndexOutOfBoundsException ex) {
            System.err.println(ex.getMessage());
        } catch (NullPointerException ex) {
            System.err.println("Hata"+ex.getMessage());
        }
        return part1 + "-" + part2;
    }

    }
