package com.generic;

public class Maximum {
    public static void  main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 2, b = 4, c =6;
        Float x = 2.3f, y =7.8f , z = 6.7f;
        String l = "Apple" , m = "Banana" , n = "Orange";

        Maximum.getMaximum(a,b,c);
        Maximum.getMaximum(x,y,z);
        Maximum.getMaximum(l,m,n);
    }

    private static <T extends Comparable> void getMaximum(T a, T b, T c) {

        T max = a;
        if(b.compareTo(a)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }

        System.out.println("Maximum ::"+max);


    }



    

}
