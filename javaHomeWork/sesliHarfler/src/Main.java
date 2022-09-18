public class Main {
    public static void main(String[] args){
        char harf ='i';
        boolean ince = false;
        boolean kalın = false;
        char[] inceSesliler = {'e', 'i', 'ö', 'ü', 'E', 'İ','Ö', 'Ü'};
        char[] kalinSesliler = {'a','ı','o','u','A','I','O','U'};


        for (char letter : inceSesliler){
            if(letter == harf){
                ince = true;
            }
        }
        for(char letter : kalinSesliler){
            if(letter == harf){
                kalın = true;
            }
        }

        if(ince){
            System.out.println("harfiniz ince sesli");

        }
        else if(kalın){
            System.out.println("Harfiniz kalın sesli");
        }
        else {
            System.out.println("Sesli harf girmediniz.");
        }


    }
}
