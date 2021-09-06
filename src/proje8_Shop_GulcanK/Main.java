package proje8_Shop_GulcanK;

public class Main {

    public static void main(String[] args) {

//  musterinin alacagi bir urun icin taksitlendirme yapilacaktir.
//  kullanicidan  alinacak olan malin ucret ve kac taksit olacagi bilgisini aliniz.
//  Taksit rakamlari kuruslu cikiyorsa kuruslar toplanip, son taksite eklensin.
//  Gününn tarihine göre 1 ay atlatarak olusan taksit tarihi ve odencek taksit miktarinin listesini yazdiriniz.

        Shop gs = new Shop();
        gs.secilenUrunler = gs.urunSec(gs);
        for (Urunler urunler : gs.secilenUrunler) {
            System.out.println(urunler.toString());
        }
        gs.hesaplaToplamAlisVerisTutari();
        gs.taksit = gs.taksitBelirle();
        gs.taksitlendir();
        gs.taksitleriYazdir();
    }
}
