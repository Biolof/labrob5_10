package com.company;

public class Task2
{
    public static void main(String[] args)
    {
        int a = 2;
        int num = 1;
        while(a<5000)
        {
            System.out.println("Число "+ num +" - " + a);
            a = 2*a-1;
            num+=1;
        }
    }
}

