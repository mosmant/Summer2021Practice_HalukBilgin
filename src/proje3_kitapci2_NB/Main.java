package proje3_kitapci2_NB;
import java.util.Scanner;
public class Main extends VarMeth01{
    
    /* Bir kitapci icin program yapalim
     *
     * Kitap no 1000'den baslayarak sirali no olsun
     * Her kitap icin kitapAdi, yazarAdi,fiyati bilgilerini girelim
     *
     * Programin baslayinca menu isminde bir method calissin ve kullaniciya istegini sorsun
     * 1- kitap ekle
     * 2- numara ile kitap goruntule
     * 3- bilgi ile kitap goruntule
     * 4- numara ile kitap sil
     * 5- Tum kitaplari listele
     * 6- çýkýþ
     */
    
    static int secim=0;;
    public static void main(String[] args) {
        
    	VarMeth01 kitapbilgileri=new VarMeth01();
        
                
        do {
        menu();
        switch(secim) {
        case 1: 
            kitapbilgileri.kitapEkle();
            break;
        case 2: 
            kitapbilgileri.noIleKitapGoruntule();
            break;
        case 3:     
            kitapbilgileri.bilgiIleGoruntule();
            break;
            
        case 4:
            kitapbilgileri.kitapListele();
            kitapbilgileri.kitapSilme();
            
            break;
            
        case 5:
            kitapbilgileri.kitapListele();
            break;
        
        }
        }while(secim!=6);
        
        System.out.println("HAYIRLI GÜNLER");
                
    }
    public static void menu() {
        System.out.println("------ANA MENU------\n");
        System.out.println("1: KÝTAP EKLE\n2: NUMARA ÝLE KÝTAP GORUNTULE\n3: BILGI ILE KITAP GORUNTULE\n4: NUMARA ÝLE KÝTAP SÝL"
                + "\n5: TUM KITAPLARI LÝSTELE\n6:CIKIS\n----------------------------\nLUTFEN SECIMINIZI GIRINIZ\n");
        
        Scanner scan=new Scanner(System.in);
        secim=scan.nextInt();
        
    }
}