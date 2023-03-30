public class Burger extends Food{
	private int numberOfPatties;

	Burger(String param_name, String[] param_ingredients , double param_price , float param_calories , int numPatties) {
		super(param_name, param_ingredients, param_price , param_calories  );
		this.numberOfPatties = numPatties;
	}

	public void setNumberOfPatty(int param_numParry){
		this.numberOfPatties = param_numParry;
	}

	public int getNumberOfPatty(){
		return this.numberOfPatties;
	}
	public void getDetails() {
		super.showDetails();
		System.out.println("Number of Patties: " + this.numberOfPatties);
		
	}

}
