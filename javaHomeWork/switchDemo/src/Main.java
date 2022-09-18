public class Main {
    public static void main(String[] args) {
        //switch bloklarıyla dallandırma yapılır.
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel, geçtiniz. Notunuz: " + grade);
                break;
            case 'B':   //İki case için aynı çıktıyı kullanabiliriz.
            case 'C':
                System.out.println("güzel, geçtiniz. Notunuz: " + grade);
                break;
            case 'F':
                System.out.println("Kaldınız. Notunuz: " + grade);
                break;
            default:
                System.out.println("Geçersiz not girdiniz. Lütfen geçerli bir harf notu giriniz.");
        }
    }
}
