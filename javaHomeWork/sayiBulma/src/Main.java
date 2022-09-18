public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 10;
        boolean varMi = false;

        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranacak) {
                varMi = true;
            }

        }
        if (varMi) {
            System.out.println("Aradığınız sayi var");
        } else {
            System.out.println("Aradığınız sayi yok");
        }


        /* engin hocanın yolunda for kısmı şöyle;

             for(int sayi : sayilar){
                 if(sayi == aranacak){
                    varMi = true;
                    break;
             }
        */
    }
}
