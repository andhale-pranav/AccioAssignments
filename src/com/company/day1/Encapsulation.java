package com.company.day1;

public class Encapsulation {

    static class Product{
        public int product(int x, int y){
            return x * y;
        }

        public int product(int x, int y, int z){
            return x * y * z;
        }

        public double product(double x, double y){
            return x * y;
        }
    }

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        Product p = new Product();

        System.out.println("Class 1 : " + p.product(2,3));
        System.out.println("Class 2 : " + p.product(2.0,3.1));
        System.out.println("Class 3 : " + p.product(2,3,5));
    }
}