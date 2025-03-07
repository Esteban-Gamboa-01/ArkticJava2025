package com.ironhack.w2.d2;

public class MathLibrary {
    public static int multiply(int a, int b) throws IllegalArgumentException{
        int product = a * b;

        if(product / a  != b){
            throw new IllegalArgumentException("Product of input is too great for int");
        }

        return product;
    }
}
