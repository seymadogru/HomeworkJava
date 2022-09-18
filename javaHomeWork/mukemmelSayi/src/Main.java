public class Main {
    public static void main(String[] args){
        //sayının tam bölenlerini bul
        //bölenlerini topla
        //toplamla sayı eşit mi kontol et

        int number =28;
        int toplam = 0;
        for(int i=1; i<number ; i++){
            int kalan = number%i;
            if(kalan == 0){
                toplam+=i;
            }
        }
        if(number==toplam){
            System.out.println("Sayınız mükemmel sayıdır.");
        }
        else {
            System.out.println("Sayınız mükemmel değil.");
        }
    }
}
