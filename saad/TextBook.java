import java.lang.*;

public class TextBook

{
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availableQuantity;
	private int standard;
	private static double discountRate;

	public TextBook() {
		System.out.println("Empty TextBook");
	}

	public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
			int standard) {
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.price = price;
		this.availableQuantity = availableQuantity;
		this.standard = standard;
	}

	public void setDiscountRate(double rate) {
		this.discountRate = rate;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAvaiableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public double getPrice() {
		return price;
	}

	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public int getStandard() {
		return standard;
	}

	public void addQuantity(int amount) {
		this.availableQuantity = amount;
	}

	public void sellQuantity(int amount) {
		this.availableQuantity = amount;
	}

	public void showDetails() {
		System.out.println("Isbn number" + isbn);
		System.out.println("Book Title :" + bookTitle);
		System.out.println("Aurthor Name :" + authorName);
		System.out.println("Book Price" + price);
		System.out.println("Available Quantity :" + availableQuantity);
		System.out.println("Books Standard" + standard);
		System.out.println("Book discountRate :" + discountRate);
	}

}