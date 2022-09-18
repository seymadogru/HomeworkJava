public class Main {
    public static void main(String[] args){
        double[] myList = {1.2, 3.7, 6.9, 7.2};
        double total = 0;
        double max = myList[0];

        for(double number : myList){
            if (max < number){
                max = number;
            }
            total += number;
            System.out.println(number);
        }

        System.out.println("Sayıların Toplamı : " + total);
        System.out.println("Sayıların En Büyüğü : " + max);
    }
}
