public class Pizza extends Food {
	int sizeInInches;

    Pizza(String param_name, String[] param_ingredients, double param_price, float param_calories,int param_size) {
		super(param_name, param_ingredients, param_price, param_calories);
		this.sizeInInches = param_size;
    }
	

	public void setSize(int param_size){
		this.sizeInInches = param_size;
	}

	public int getSize(){
		return this.sizeInInches;
	}
	

	public void getDetails() {
    System.out.println("size in inches: " + this.sizeInInches);

}


}
