package com.BubbleTea.Shop;

public class BubbleTeaFactory {
    public static final BubbleTeaMenu[] BUBBLE_TEA_MENUS = new BubbleTeaMenu[]{
            new BubbleTeaMenu("Menu1", new BubbleTea[]{
                    new BubbleTea(1, 1),
                    new BubbleTea(1, 2),
                    new BubbleTea(1, 3),
                    new BubbleTea(1, 4),
            }, 55),
            new BubbleTeaMenu("Menu2", new BubbleTea[]{
                    new BubbleTea(2, 1),
                    new BubbleTea(2, 2),
                    new BubbleTea(2, 3),
                    new BubbleTea(2, 4),
            }, 55),
            new BubbleTeaMenu("Menu3", new BubbleTea[]{
                    new BubbleTea(3, 1),
                    new BubbleTea(3, 2),
                    new BubbleTea(3, 3),
                    new BubbleTea(3, 4),
            }, 55),
            new BubbleTeaMenu("Menu4", new BubbleTea[]{
                    new BubbleTea(4, 1),
                    new BubbleTea(4, 2),
                    new BubbleTea(4, 3),
                    new BubbleTea(4, 4),
            }, 55),
            new BubbleTeaMenu("Menu5", new BubbleTea[]{
                    new BubbleTea(5, 1),
                    new BubbleTea(5, 2),
                    new BubbleTea(5, 3),
                    new BubbleTea(5, 4),
            }, 55)
    };

    public static BubbleTeaMenu viewMenu(int menu){
        return (BubbleTeaMenu) BUBBLE_TEA_MENUS[menu];
    }
    public static BubbleTeaMenu[] viewMenuList(){
        return BUBBLE_TEA_MENUS;
    }
}
