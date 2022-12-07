 # Homework 10

###### Lütfen aşağıda belirtilen görevleri yerine getiriniz.

+ Tools isimli final bir sınıf tasarlayınız.
+ Bu sınıfta aşağıda belirtilen static metot(lar) bulunacaktır.
  + String splitWord(String word) metodu
    + word, ortadan ikiye bölünüp part1-part2 şeklinde döndürülecektir.
    + Kelime uzunluğu tek sayı ise büyük olan part1'de kalacaktır.
    + word, null-boş-boşluk(lar)'dan oluşamaz.
    + NullPointerException ve StringIndexOutOfBoundsException ile muhtemel hatalar yönetilecektir.
  + splitWord metodu, main metodu içerisinde iki kez kullanılıp, ekran çıktısı alıncaktır.
  + Örnek kullanım;
    + INPUT : splitWord("Dursun")
    + OUTPUT: Dur-sun
