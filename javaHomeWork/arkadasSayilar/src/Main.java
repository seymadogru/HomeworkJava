public class Main {
    public static void main(String[] args){


        //220 ve 284 arkadaş sayılardır. yani ikisinin bölenleri birbirine eşit.
        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 =0;
        int toplam2 =0;

        for(int i = 1; i<sayi1 ; i++){
            int kalan1 = sayi1 % i;
            if(kalan1 == 0){
                toplam1+=i;
            }
        }

        for(int j = 1; j<sayi2 ; j++){
            int kalan2 = sayi2 % j;
            if(kalan2 == 0){
                toplam2+=j;
            }
        }

        if(toplam1==sayi2 & toplam2 == sayi1){
            System.out.println("Sayılarınız arkadaştır.");
        }
        else{
            System.out.println("Sayılarınız arkadaş değildir.");
        }
    }
}
