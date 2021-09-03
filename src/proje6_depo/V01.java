package proje6_depo;

public class V01 {
	public V01() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	private int id=1000;
	private String urunAdi;
	private String uretici;
	private int miktar;
	private String birim;
	private String raf;
	
	// Getter ve Setter 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrunAdi() {
		return urunAdi;
	}
	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}
	public String getUretici() {
		return uretici;
	}
	public void setUretici(String uretici) {
		this.uretici = uretici;
	}
	public int getMiktar() {
		return miktar;
	}
	public void setMiktar(int miktar) {
		this.miktar = miktar;
	}
	public String getBirim() {
		return birim;
	}
	public void setBirim(String birim) {
		this.birim = birim;
	}
	public String getRaf() {
		return raf;
	}
	public void setRaf(String raf) {
		this.raf = raf;
	}
	// Getter ve Setter 
	
	// Parametreli Constructor
	
	public V01(int id, String urunAdi, String uretici, int miktar, String birim, String raf) {
		super();
		this.id = id;
		this.urunAdi = urunAdi;
		this.uretici = uretici;
		this.miktar = miktar;
		this.birim = birim;
		this.raf = raf;
		
	// Parametreli Constructor
	}
	
	

}
