public class Main {
    public static void main(String[] args){
        String[][] sehirler = new String[3][3];
        String[] bolgeler = {"Marmara", "Karadeniz", "İç Anadolu"};

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Edirne";
        sehirler[1][0] = "Trabzon";
        sehirler[1][1] = "Ordu";
        sehirler[1][2] = "Karabük";
        sehirler[2][0] = "Ankara";
        sehirler[2][1] = "Konya";
        sehirler[2][2] = "Eskişehir";

        for(int i = 0; i<=2 ; i++){
            System.out.println("-------------------------------");
            System.out.println(bolgeler[i] + " Şehirleri ;");
            System.out.println("\t");

            for(int j = 0 ; j<=2 ; j++){
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
