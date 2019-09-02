package Store;

public class BubbleTea {
    public static final String[] TEA_FLAVORS = new String[]{
            "(any)",
            "Milk Tea",
            "Green Tea",
            "Coffee Tea",
            "Hazelnut Milk Tea",
            "Purple Taro Milk Tea",
            "Lychee Tea",
            "Strawberry Tea"
    };
    public static final String[] BUBBLE_TYPE = new String[]{
            "No Bubble",
            "Black Bubble",
            "Gold Bubble",
            "Green Bubble"
    };
    private int flavor;
    private int bubble;

    public BubbleTea(int flavor, int bubble){
        this.flavor = flavor;
        this.bubble = bubble;
    }

    public void setTeaFlavor(int flavor){
        if (flavor >= TEA_FLAVORS.length){
            this.flavor = 0;
        }else{
            this.flavor = flavor;
        }
    }
    public void setBubbleType(int bubble){
        if(bubble >= BUBBLE_TYPE.length){
            this.bubble = 0;
        }else{
            this.bubble = bubble;
        }
    }

    public String getTeaFlavor(){
        return TEA_FLAVORS[flavor];
    }
    public String getBubbleType(){
        return BUBBLE_TYPE[bubble];
    }
}
