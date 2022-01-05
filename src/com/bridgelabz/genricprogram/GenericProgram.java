package com.bridgelabz.genricprogram;

public class GenericProgram <E extends Comparable<E>>{
    E a,b,c;
    /*
     * constructor point to the a, b ,c
     * constructor take paramter any type of data
     */
    public GenericProgram(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        System.out.println("welcome to generic program");
        compare(4,2,6);
        System.out.println("float max number" + compare(1.2f,4.2f,6.8f));
        System.out.println("string max"+compare("interger","float","string"));
    }
    //calling integerMax static method and passing the parameter

    /*
     * generic type method to compare any type of data
     * @param a, b ,c and compareTo method to find the max number
     */
    public static <E extends Comparable<E>> E compare(E a, E b, E c){
        E max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        return max;

    }

}