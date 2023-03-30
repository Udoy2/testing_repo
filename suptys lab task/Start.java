class StoryBook {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private String category;
    private static double discountRate;

    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
            String category) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.category = category;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static double getDiscountRate() {
        return discountRate;
    }

    public static void setDiscountRate(double discountRate) {
        StoryBook.discountRate = discountRate;
    }

    public void addQuantity(int amount) {
        this.availableQuantity += amount;
    }

    public void sellQuantity(int amount) {
        this.availableQuantity -= amount;
    }
}

class TextBook {
    private String isbn;
    private String bookTitle;
    private String authorName;
    private double price;
    private int availableQuantity;
    private int standard;
    private static double discountRate;

    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
            int standard) {
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
        this.standard = standard;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public static double getDiscountRate() {
        return discountRate;
    }

    public static void setDiscountRate(double discountRate) {
        TextBook.discountRate = discountRate;
    }

    public void addQuantity(int amount) {
        this.availableQuantity += amount;
    }

    public void sellQuantity(int amount) {
        this.availableQuantity -= amount;
    }
}

public class Start {
    public static void main(String[] args) {
        StoryBook storyBook1 = new StoryBook("12345", "The Lord of the Rings", "J.R.R. Tolkien", 25.99, 10, "Fantasy");
        StoryBook storyBook2 = new StoryBook("67890", "Harry Potter and the Philosopher's Stone", "J.K. Rowling", 19.99,
                15, "Fantasy");

        storyBook1.setIsbn("54321");
        System.out.println("ISBN of storyBook1: " + storyBook1.getIsbn());

        storyBook2.sellQuantity(5);
        System.out.println("Available quantity of storyBook2: " + storyBook2.getAvailableQuantity());
        storyBook2.addQuantity(20);
        System.out.println("Available quantity of storyBook2: " + storyBook2.getAvailableQuantity());

        TextBook textBook1 = new TextBook("11111", "Intro to Computer Science", "John Doe", 45.99, 20, 1);
        TextBook textBook2 = new TextBook("22222", "Calculus for Scientists and Engineers", "Jane Smith", 55.99, 15, 2);

        textBook1.setIsbn("33333");
        System.out.println("ISBN of textBook1: " + textBook1.getIsbn());

        textBook2.sellQuantity(5);
        System.out.println("Available quantity of textBook2: " + textBook2.getAvailableQuantity());
        textBook2.addQuantity(20);
        System.out.println("Available quantity of textBook2: " + textBook2.getAvailableQuantity());
    }
}

