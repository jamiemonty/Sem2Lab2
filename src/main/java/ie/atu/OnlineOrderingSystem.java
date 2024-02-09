package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
        MenuItem[] menuItems = new MenuItem[] {

                new Burger("Classic Burger", 4.99, "Beef, lettuce, tomato, cheese, burger sauce"),
                new Pizza("Hawiaan Pizza", 9.99, "Tomato, pineapple, ham, cheese"),
                new Salad("Caesar Salad", 2.99, "Lettuce, croutons, lemon juice, egg, olive oil, cheese, pepper, garlic"),
                new Dessert("Sticky Toffee Pudding", 5.99, "Sponge cake, toffee sauce, ice-cream")
        };

        System.out.println("Welcome!\n*****Menu****\n*");
        for (MenuItem menuItem:menuItems){
            System.out.println("Name: " + menuItem.getName() + "\nDescription: "+ menuItem.getDescription()+ "\nPrice: " + menuItem.getPrice() + "\n");
        }

        double totalCost = 0;
        for(MenuItem menuItem : menuItems){
            totalCost = menuItem.getPrice() + totalCost;
        }

        System.out.println("Total cost: €" + totalCost);
    }
}
