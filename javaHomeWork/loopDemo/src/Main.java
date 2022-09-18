public class Main {
    public static void main(String[] args) {
        //for
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü sonlandı.");

        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Döngü sonlandı.");

        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("Döngü sonlandı.");
        System.out.println("For Döngüleri sonlandı.");

        int i = 1;
        //while
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Döngü sonlandı.");

        i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While Döngüsü sonlandı.");

        System.out.println("Do while döngüsü");
        //do while döngüsü   --> şart uymasa bile 1 kere çalışır.
        int j = 1;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);

        System.out.println("2. Do while döngüsü");
        int k = 18;
        do {
            System.out.println(k);
            k+= 2;
        } while (k < 10);
    }
}
