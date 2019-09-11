package com.BubbleTea.Shop;

public class BubbleTeaFactory {

    public static BubbleTeaMenu[] viewMenu(){
        return new BubbleTeaMenu[]{
                new BubbleTeaMenu("Milk Tea", new BubbleTea[]{
                        BubbleTea.getInstance(1, 0),
                        BubbleTea.getInstance(1, 1),
                        BubbleTea.getInstance(1, 2),
                        BubbleTea.getInstance(1, 3),
                }, 55),
                new BubbleTeaMenu("Green Tea", new BubbleTea[]{
                        BubbleTea.getInstance(2, 0),
                        BubbleTea.getInstance(2, 1),
                        BubbleTea.getInstance(2, 2),
                        BubbleTea.getInstance(2, 3),
                }, 55),
                new BubbleTeaMenu("Coffee Tea", new BubbleTea[]{
                        BubbleTea.getInstance(3, 0),
                        BubbleTea.getInstance(3, 1),
                        BubbleTea.getInstance(3, 2),
                        BubbleTea.getInstance(3, 3),
                }, 55),
                new BubbleTeaMenu("Hazelnut Milk Tea", new BubbleTea[]{
                        new BubbleTea(4, 0),
                        new BubbleTea(4, 1),
                        new BubbleTea(4, 2),
                        new BubbleTea(4, 3),
                }, 55),
                new BubbleTeaMenu("Purple Taro Milk Tea", new BubbleTea[]{
                        new BubbleTea(5, 0),
                        new BubbleTea(5, 1),
                        new BubbleTea(5, 2),
                        new BubbleTea(5, 3),
                }, 55)
        };
    }

    public static BubbleTea addOrder(int flavor, int bubble){
        return new BubbleTea(flavor, bubble);
    }
    public static BubbleTea addOrder(String flavor, String bubble){
        return new BubbleTea(flavor, bubble);
    }
}
