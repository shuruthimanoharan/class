package com.company;

class Add{
    public static void m1(){
        int n1=10;
        int n2=20;
        System.out.println(n1+n2);
    }
}

public class Main{

    public static void main(String[] args) {
        // write your code here
        Add a=new Add();
        a.m1();
        int x=45;
        if(x%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }

    }
}
