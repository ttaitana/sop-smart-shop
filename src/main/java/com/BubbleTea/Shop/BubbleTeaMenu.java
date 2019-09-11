package com.BubbleTea.Shop;

public class BubbleTeaMenu {
    private static final double DEFAULT_PRICE = 50.00;
    private String MenuName;
    private BubbleTea[] tea;
    private double price;

    public BubbleTeaMenu(String MenuName, BubbleTea[] tea, double price){
        this.MenuName = MenuName;
        this.price = price;
        this.tea = tea;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String menuName) {
        this.MenuName = menuName;
    }

    public BubbleTea[] getTea() {
        return tea;
    }

    public void setTea(BubbleTea[] tea) {
        if (tea.length == 0){
            this.tea = new BubbleTea[]{BubbleTea.getInstance()};
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
