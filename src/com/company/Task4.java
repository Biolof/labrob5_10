package com.company;

public class Task4
{
    public static void main(String[] args)
    {
        int a = 1;
        int i = 10;
        for(int j=1; j<=i; j++)
        {
            a = a * j;
        }
        System.out.println(a + " - For" );

        int f = 1;
        int o = 10;
        int l = 1;
        while (l<=o)
        {
            f = f * l;
            l++;
        }
        System.out.println(f + " - While" );
    }
}