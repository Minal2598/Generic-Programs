package com.generic;

public class Maximum {
    public static void  main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 2, b = 4, c =6;
        Float x = 2.3f, y =7.8f , z = 6.7f;
        String l = "Apple" , m = "Banana" , n = "Orange";
        testMaximum (a,b,c);

        testMaximum (x,y,z);
        testMaximum (l,m,n);
    }

    private static void testMaximum(String a, String b, String c) {
        String max = a;
        if(b.compareTo(a)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }

        System.out.println("Maximum Number of String is::"+max);




    }

    private static void testMaximum(Float a, Float b, Float c) {
        Float max = a;
        if(b.compareTo(a)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }

         System.out.println("Maximum Number of FloatValue is::"+max);

    }

    private static void  testMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if(b.compareTo(a)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }

        System.out.println("Maximum Number of Integer is::"+max);

    }


}
