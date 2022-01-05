package com.bridgelabz.genricprogram;

public class GenericProgram {
    public static void main(String[] args) {
        System.out.println("welcome to generic program");
        intergerMax(4,2,6);
        floatMax(1.2f,4.5f,6.8f);
        stringMax("interger","float","string");
    }
    //calling integerMax static method and passing the parameter

    /*
     * method used to find maximum of three inetergr number
     * @param a, b ,c and compareTo method to find the max number
     */
    public static void intergerMax(Integer a,Integer b,Integer c){
        int max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.print("integer max"+max);
    }
    /*
     * floatMax method compraeTo maximum float number
     * floatMax is given as parametrise method
     */
    public static void floatMax(Float a, Float b, Float c){
        Float max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.println("flot max"+max);
    }
    /*
     * StringMax method to compute max string
     * compareto method use to compare the three string
     */
    public static void stringMax(String a, String b, String c){
        String max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.println("string max"+max);
    }
}