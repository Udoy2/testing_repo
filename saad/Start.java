public class Start {

	public static void main(String[] args) {

		
		StoryBook sb1 = new StoryBook();  
		StoryBook sb2 = new StoryBook("1234567890", "The Hobbit", "J.R.R. Tolkien", 25.99, 50, "Fantasy"); 


		
		TextBook tb1 = new TextBook(); 
		TextBook tb2 = new TextBook("0987654321", "Java Programming", "John Smith", 59.99, 100, 10); 


		
		sb1.setIsbn("1111111111");
		sb1.setBookTitle("The Cat in the Hat");
		sb1.setAuthorName("Dr. Seuss");
		sb1.setPrice(10.99);
		sb1.setAvaiableQuantity(20);
		sb1.setCategory("Children's");
		sb1.setDiscountRate(0.1);
		sb1.showDetails();
		sb1.addQuantity(5);
		sb1.sellQuantity(10);
		sb1.showDetails();

		sb2.showDetails();
		sb2.addQuantity(10);
		sb2.sellQuantity(15);
		sb2.showDetails();

		tb1.setIsbn("2222222222");
		tb1.setBookTitle("Calculus");
		tb1.setAuthorName("James Stewart");
		tb1.setPrice(99.99);
		tb1.setAvaiableQuantity(50);
		tb1.setStandard(12);
		tb1.setDiscountRate(0.2);
		tb1.showDetails();
		tb1.addQuantity(20);
		tb1.sellQuantity(30);
		tb1.showDetails();

		tb2.showDetails();
		tb2.addQuantity(30);
		tb2.sellQuantity(40);
		tb2.showDetails();

	}

}