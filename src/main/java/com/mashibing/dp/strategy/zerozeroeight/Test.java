package com.mashibing.dp.strategy.zerozeroeight;

public class Test {
    public static void main(String[] args) {
        Comparator008 com = new SmallCatComparator();
        SmallCat cat1 = new SmallCat();
        cat1.height = 100;
        SmallCat cat2 = new SmallCat();
        cat2.height = 200;
        int compare = com.compare(cat1, cat2);
        if (compare > 0) {
            System.out.println(cat1);
        } else {
            System.out.println(cat2);
        }
    }
}
