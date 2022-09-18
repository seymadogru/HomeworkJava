import java.util.Locale;

public class Main {
    public static void main(String[] args){
         String mesaj = "Bugün hava çok güzel.";
         System.out.println(mesaj);

         System.out.println("Eleman sayısı:"+mesaj.length());
         System.out.println("5.karakter = "+ mesaj.charAt(4));
         System.out.println(mesaj.concat("Yaşasın!"));
         System.out.println(mesaj.startsWith("B"));
         System.out.println(mesaj.endsWith("."));

         char[] karakterler = new char[5];
         mesaj.getChars(0,5, karakterler,0);
         System.out.println(karakterler);

         System.out.println(mesaj.indexOf("a"));
         System.out.println(mesaj.lastIndexOf("a"));

         String yeniMesaj = mesaj.replace(" ", "-");
         System.out.println(yeniMesaj);

         System.out.println(mesaj.substring(2));
         System.out.println(mesaj.substring(2,6));   //6 dahil değil

        for(String kelime : mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        String ikinciMesaj = "    Bugün hava çok güzei.        ";
        System.out.println(ikinciMesaj.trim());
    }
}
