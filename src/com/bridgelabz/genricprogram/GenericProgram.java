package com.bridgelabz.genricprogram;

public class GenericProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program");
        intergerMax(4,2,6);
        floatMax(1.2f,4.5f,6.8f);
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
        System.out.print("Integer Max: "+max);
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
        System.out.print("flot max"+max);
    }
}
