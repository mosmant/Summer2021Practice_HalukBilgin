package day13_Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class map2 {
    public static void main(String[] args) {
        
        HashMap<Integer,String> ogrenciBilgileri=new HashMap<>();
        ogrenciBilgileri.put(937, "Ali Can-7/B");
        ogrenciBilgileri.put(531,"Ayþe Çetin-8/A");
        ogrenciBilgileri.put(856, "Ahmet Demir-5/B");
        ogrenciBilgileri.put(214,"Melek Durmaz-6/C");
        ogrenciBilgileri.put(632,"Can Mert -6/C");
        
        //yeni bir öðrenci giriþi yapýsýn .var olan numara ile kayýt yapýlmaya çalýþýldýðýnda 
        //o numaralý kaydýn olduðunu ve o numaraya ait kiþinin bilgisini getirsin
        // eger belirtilen numara kayýtlý deðilse kaydýnýz eklenmiþtir desin.
        Scanner scan=new Scanner(System.in);
        
        /* System.out.println("numara giriniz");
        int numara=scan.nextInt();
        scan.nextLine();
        
        System.out.println("ogrenci bilgisi giriniz");
        String bilgi=scan.nextLine();
        
        if( ogrenciBilgileri.putIfAbsent(numara,bilgi)== null ) {
            
            System.out.println("kaydýnýz eklenmiþtir: "+ ogrenciBilgileri.get(numara));
                        
        }else {
            System.out.println("Böyle bir kayýt mevcuttur : Kayýt "+
        ogrenciBilgileri.putIfAbsent(numara,bilgi)+" kiþisine aittir.");
        }*/ //==> burada diðer souryu çömek comment e aldýk
        
        // Bir numara girildiðinde o kiþiye ait sýnýf bilgisini bize göstersin.
        //eðer kayýt yok ise böyle bir kayýt yok mesajý versin
        
        
        
        System.out.println("numara giriniz");
        int numara=scan.nextInt();
        
        ogrenciBilgileri.get(numara);     				// input :632 output:"Can Mert -6/C" (syso icine alinsaydi.)
        
        System.out.println(ogrenciBilgileri.get(numara).substring(ogrenciBilgileri.get(numara).indexOf("-")+1));
        System.out.println(ogrenciBilgileri.get(numara).substring(ogrenciBilgileri.get(numara).lastIndexOf("-")+1));
        
        
        
        
        
        
        
        
        
        
        
    }
}