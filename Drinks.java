public class Drinks extends Food {
    private String Type;
    private int sizeInLitter;

    Drinks(String param_name, String[] param_ingredients, double param_price, float param_calories, String param_type,
            int param_sizeInLitter) {
        super(param_name, param_ingredients, param_price, param_calories);

        this.Type = param_type;
        this.sizeInLitter = param_sizeInLitter;
    }

    public void setType(String param_type) {
        this.Type = param_type;
    }

    public void setSize(int param_sieInLetter) {
        this.sizeInLitter = param_sieInLetter;
    }

    public String getType() {
        return this.Type;
    }

    public int getSize() {
        return this.sizeInLitter;
    }

    public void getDetails() {
        System.out.println("Type: " + this.Type);
        System.out.println("Size (in liters): " + this.sizeInLitter);

    }

}
