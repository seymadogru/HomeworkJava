public class Main {
    public static void main(String[] args){

        //sayı 1'den küçük mü
        //Sayı 1 mi
        //sayının 2'den büyüklüğü durumu

        int sayi = -3;
        boolean asalMı = true;

        if(sayi<1){
            System.out.println("Asallığı sorgulanamayan sayı girdiniz.");
            return;
        }
        if(sayi == 1){
            System.out.println("Sayı asal değildir.");
        }

        for (int i=2 ; i<sayi; i++){
            if(sayi%i==0){
                asalMı = false;
            }
        }

        if (asalMı){
            System.out.println("sayınız asal");
        }else {
            System.out.println("Sayınız asal değildir.");
        }




















    }
}
