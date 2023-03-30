import java.lang.*;

public class StoryBook {
	private String isbn;
	private String bookTitle;
	private String authorName;
	private double price;
	private int availbleQuantity;
	private String category;
	private static double discountRate;

	public StoryBook() {
		System.out.println("Empty StoryBook");
	}

	public StoryBook(String isbn, String bookTitle, String aurthorName, double price, int availableQuantity,
			String category) {
		System.out.println("Paramitarized constructor");
		this.isbn = isbn;
		this.bookTitle = bookTitle;
		this.authorName = aurthorName;
		this.price = price;
		this.availbleQuantity = availableQuantity;
		this.category = category;
	}

	public void setDiscountRate(double rate) {
		this.discountRate = rate;
	}

	public double getDiscountRate() {
		return this.discountRate;
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
		this.availbleQuantity = availableQuantity;
	}

	public void setCategory(String category) {
		this.category = category;
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
		return availbleQuantity;
	}

	public String getCategory() {
		return category;
	}

	public void addQuantity(int amount) {
		this.availbleQuantity = amount;
	}

	public void sellQuantity(int amount) {
		this.availbleQuantity = amount;
	}

	public void showDetails() {
		System.out.println("Isbn Number :" + isbn);
		System.out.println("Book Title Is :" + bookTitle);
		System.out.println("Author Name is :" + authorName);
		System.out.println("Price is :" + price);
		System.out.println("Available Quantity  :" + availbleQuantity);
		System.out.println("Book Category :" + category);
		System.out.println("Discount Rate  % :" + discountRate);

	}
}
