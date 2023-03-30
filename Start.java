/**
 * Start
 */
public class Start {

    public static void main(String[] args) {
        Burger brg1 = new Burger("Naga chicken burger", new String[] { "extra naga", "extra tomato", "extra bun" }, 340,
                900, 3);
        brg1.getDetails();
        Burger brg2 = new Burger("Naga beef burger", new String[] { "extra naga", "extra tomato", "extra bun" }, 340,
                900, 3);
        // setters
        brg2.setCalories(800);
        brg2.setName("normal beef");
        brg2.setPrice(700);
        brg2.setNumberOfPatty(4);
        // getters
        System.out.println(brg2.getName());
        System.out.println(String.join(",", brg2.getIngredients()));
        System.out.println(brg2.getNumberOfPatty());
        System.out.println(brg2.getPrice());

        Pizza piz1 = new Pizza("delux pizza", new String[] { "extra naga", "extra tomato", "extra bun" }, 0, 700, 12);
        piz1.showDetails();
        Pizza piz2 = new Pizza("delux pizza", new String[] { "extra naga", "extra tomato", "extra bun" }, 0, 700, 12);
        // setters
        piz2.setCalories(800);
        piz2.setName("normal beef pizza");
        piz2.setPrice(700);
        piz2.setSize(6);
        // getters
        System.out.println(piz2.getName());
        System.out.println(String.join(",", piz2.getIngredients()));
        System.out.println(piz2.getSize());

        Drinks drnk1 = new Drinks("coka cola", new String[] { "3 straw" }, 20, 200, "cold", 1);
        drnk1.showDetails();
        Drinks drnk2 = new Drinks("pepsi", new String[] { "3 straw" }, 20, 200, "cold", 1);
        // setters
        drnk2.setCalories(800);
        drnk2.setName("mojo");
        drnk2.setPrice(700);
        drnk2.setSize(4);
        // getters
        System.out.println(drnk2.getName());
        System.out.println(String.join(",", drnk2.getIngredients()));
        System.out.println(drnk2.getSize());
        System.out.println(drnk2.getPrice());
    }
}