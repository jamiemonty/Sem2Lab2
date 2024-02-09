package ie.atu;

class Salad implements MenuItem {
    private double price;
    private String name;
    private String ingredients;


    public Salad(String name, double price, String ingredients){
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;

    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public String getDescription(){
        return ingredients;
    }
    @Override
    public double getPrice(){
        return price;
    }

}