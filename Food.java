public class Food {
    private String name;
    private double price;
    private float calories;
    private String[] ingredients;

    Food(String param_name, String[] param_ingredients , double param_price , float param_calories){
        this.name = param_name;
        this.price = param_price;
        this.calories = param_calories;
        this.ingredients = param_ingredients;
    }

    public void setName(String param_name){
        this.name = param_name;
    }

    public void setIngredients(String[] param_ingredients){
        this.ingredients = param_ingredients;
    }

    public void setPrice(double param_price){
        this.price = param_price;
    }

    public void setCalories(float param_calories){
        this.calories = param_calories;
    }

    public String getName(){
        return this.name;
    }
    public String[] getIngredients(){
        return this.ingredients;
    }
    public double getPrice(){
        return this.price;
    }
    public float getCalories(){
        return this.calories;
    }
    public void removeIngredient(String ingredient) {
        for (int i = 0; i < this.ingredients.length; i++) {
            if (this.ingredients[i] == ingredient) {
                this.ingredients[i] = null;
                break;
            }
        }
    }

    public void addIngredient(String ingredient) {

        for (String existingIngredient : this.ingredients) {
            if (existingIngredient != null && existingIngredient == ingredient) {
                return;
            }
        }

        for (int i = 0; i < ingredients.length; i++) {
            if (ingredients[i] == null) {
                ingredients[i] = ingredient;
                break;
            }
        }
    }

    public void showDetails(){
        System.out.println(this.name);
        System.out.println(this.calories);
        System.out.println(this.price);
        for(String ing : this.ingredients){
            System.out.println("Ingredient is : " + ing);
        }
    }

}