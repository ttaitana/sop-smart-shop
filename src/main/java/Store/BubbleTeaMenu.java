package Store;

public class BubbleTeaMenu {
    private static final double DEFAULT_PRICE = 50.00;
    private String name;
    private BubbleTea[] tea;
    private double price;

    public BubbleTeaMenu(String name, BubbleTea[] tea, double price){
        this.name = name;
        this.price = price;
        this.tea = tea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BubbleTea[] getTea() {
        return tea;
    }

    public void setTea(BubbleTea[] tea) {
        if (tea.length == 0){
            this.tea = new BubbleTea[]{new BubbleTea(0, 0)};
        }else{
            this.tea = tea;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price == 0){
            this.price = DEFAULT_PRICE;
        }else{
            this.price = price;
        }
    }


}
