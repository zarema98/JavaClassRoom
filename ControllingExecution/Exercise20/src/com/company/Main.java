package com.company;

public class Main {
    private static int ifElse2 (int begin, int end, int testVal) {
        if(end < begin)
            return 0;
        else if(testVal >= begin && testVal <= end)
            return 1;
        else return -1;
    }

    public static void main(String[] args) {
        System.out.println(ifElse2(2,10, 11));
        System.out.println(ifElse2(1,20, 14));
        System.out.println(ifElse2(22,15, 12));
        System.out.println(ifElse2(22,15, 41));
    }
}
