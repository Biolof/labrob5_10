package com.company;

public class Task1
{
    public static void main(String[] args)
    {
        for (int i = 500; i <= 650; i +=10) {
            System.out.print(i + " ");
        }
        System.out.print(" - For");
        System.out.println();

        int j=500;
        while (j<=650) {
            System.out.print(j + " ");
            j+=10;
        }
        System.out.print(" - While");
        System.out.println();

        int k = 500;
        do {
            System.out.print(k + " ");
            k+=10;
        }while (k<=650);
        System.out.print(" - Do While");

    }
}
