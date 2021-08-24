package day11_Encapsulated;

public class BookClass {

	/*
     * Write program as a Book class that will have 2 Constructors. While creating
     * an object make sure: Instance variables are being initialized Both
     * Constructors are being executed
     */
    String title, author;
    int publish;
    static int pages;
	public BookClass(String title, String author, int publish) {
		
		this.title = title;
		this.author = author;
		this.publish = publish;
	}
    
    public static void main(String[] args) {
		BookClass book1 = new BookClass("Suc ve ceza", "Dostoyevski", 687);
		BookClass book2 = new BookClass("Sol Ayagim","Christy Brown" , 192);
		book1.disPlay();
		book2.disPlay();

	}
    
    public void disPlay() {
		System.out.println("Kitap ismi -->"+title+"\nKitap yazari --> "+ author+"\nSayfa sayisi -->"+publish);
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	}
    
    

}
