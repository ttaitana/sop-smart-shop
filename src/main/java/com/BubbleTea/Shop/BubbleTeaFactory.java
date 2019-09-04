package com.BubbleTea.Shop;

public class BubbleTeaFactory {

    public static BubbleTeaMenu[] viewMenu(){
        return new BubbleTeaMenu[]{
                new BubbleTeaMenu("Milk Tea", new BubbleTea[]{
                        new BubbleTea(1, 0),
                        new BubbleTea(1, 1),
                        new BubbleTea(1, 2),
                        new BubbleTea(1, 3),
                }, 55),
                new BubbleTeaMenu("Green Tea", new BubbleTea[]{
                        new BubbleTea(2, 0),
                        new BubbleTea(2, 1),
                        new BubbleTea(2, 2),
                        new BubbleTea(2, 3),
                }, 55),
                new BubbleTeaMenu("Coffee Tea", new BubbleTea[]{
                        new BubbleTea(3, 0),
                        new BubbleTea(3, 1),
                        new BubbleTea(3, 2),
                        new BubbleTea(3, 3),
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
}
