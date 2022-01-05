package com.bridgelabz.genricprogram;

import java.util.Arrays;

public class GenericProgram <E extends Comparable<E>>{
    E[] element;
    E result;
    /*
     * constructor point to the a, b ,c
     * constructor take paramter any type of data
     */

    public GenericProgram(E[] element) {
        this.element = element;
    }

    public static void main(String[] args) {
        System.out.println("welcome to generic program");
        Integer[] a = {1, 2, 3};
        compare(a);
    }
    //calling integerMax static method and passing the parameter

    /*
     * generic type method to compare any type of data
     * @param a, b ,c and compareTo method to find the max number
     */
    public static <E extends Comparable<E>> E compare(E[] element){
        Arrays.sort(element);
        int length = element.length;
        E max = element[length -1];
        System.out.println("max"+max);                  //std to give the max value
        return max;

    }

}