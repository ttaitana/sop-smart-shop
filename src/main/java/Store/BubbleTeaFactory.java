package Store;

public class BubbleTeaFactory {
    public static final BubbleTeaMenu[] BUBBLE_TEA_MENUS = new BubbleTeaMenu[]{
            new BubbleTeaMenu("Xuan", new BubbleTea[]{
                    new BubbleTea(1, 1),
                    new BubbleTea(2, 2)
            }, 100),
            new BubbleTeaMenu("Eric", new BubbleTea[]{
                    new BubbleTea(3, 0),
                    new BubbleTea(1, 2)
            }, 100),
            new BubbleTeaMenu("Quan", new BubbleTea[]{
                    new BubbleTea(2, 1),
                    new BubbleTea(1, 0)
            }, 100)
    };

    public static BubbleTeaMenu viewMenu(int menu){
        return (BubbleTeaMenu) BUBBLE_TEA_MENUS[menu];
    }
    public static BubbleTeaMenu[] viewMenuList(){
        return BUBBLE_TEA_MENUS;
    }
}
