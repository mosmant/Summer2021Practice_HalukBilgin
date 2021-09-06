package proje8_Shop_GulcanK;

public enum Urunler {

    ASUS_17("Asus  17", 723.00, "2021 model Asus T2, 4 GB"),
    SAMSUNG_05("Samsung 05", 211.50, "2019 model Samsung A20"),
    MAC_20("MAC-Pro 20", 1456.99, "2022, Iphone 10, 64 GB "),
    IPHONE_00("Iphone 00", 789.99, "2020, Iphone 11, 8 GB"),
    TOSHIBA_4("Toshiba Laptop 4", 565.50, "Toshina 4x1.8 Ghz, 16 GB"),
    ACER_1("Acer Laptop 1", 370.50, "Acer 1.6 4xGhz, 8 GB");


    private String isim;
    private double ucret;
    private String detayUrun;


    Urunler(String isim, double ucret, String detayUrun) {
        this.isim = isim;
        this.ucret = ucret;
        this.detayUrun = detayUrun;
    }


    public String getIsim() {
        return isim;
    }

    public double getUcret() {
        return ucret;
    }

    public String getDetayUrun() {
        return detayUrun;
    }

    public String toString() {
        String str = this.isim;
        for (int i = 0; i < 20 - this.isim.length(); i++)
            str += " ";
        str += this.getDetayUrun();

        for (int i = 0; i < 30 - this.detayUrun.length(); i++)
            str += " ";

        str += getUcret();
        return str;
    }

}