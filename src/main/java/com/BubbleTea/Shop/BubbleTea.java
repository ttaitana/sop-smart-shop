package com.BubbleTea.Shop;

public class BubbleTea {
    public static final String[] TEA_FLAVORS = new String[]{
            "(any)",
            "Milk Tea",
            "Green Tea",
            "Coffee Tea",
            "Hazelnut Milk Tea",
            "Purple Taro Milk Tea",
    };
    public static final String[] BUBBLE_TYPE = new String[]{
            "No Bubble",
            "Black Bubble",
            "Gold Bubble",
            "Green Bubble"
    };
    private String flavor;
    private String bubble;

    public BubbleTea(int flavor, int bubble){
        if (flavor >= TEA_FLAVORS.length){
            flavor = 0;
        }
        if(bubble >= BUBBLE_TYPE.length){
            bubble = 0;
        }
        this.flavor = TEA_FLAVORS[flavor];
        this.bubble = BUBBLE_TYPE[bubble];
    }

//    public String[] getTeaAllFlavors(){
//        return TEA_FLAVORS;
//    }
//    public String[] getBubbleAllType(){
//        return BUBBLE_TYPE;
//    }

    public void setTeaFlavor(int flavor){
        if (flavor >= TEA_FLAVORS.length){
            this.flavor = TEA_FLAVORS[flavor];
        }else{
            this.flavor = TEA_FLAVORS[flavor];
        }
    }
    public void setBubbleType(int bubble){
        if(bubble >= BUBBLE_TYPE.length){
            this.bubble = BUBBLE_TYPE[0];
        }else{
            this.bubble = BUBBLE_TYPE[bubble];
        }
    }

    public String getTeaFlavor(){
        return flavor;
    }
    public String getBubbleType(){
        return bubble;
    }
}
