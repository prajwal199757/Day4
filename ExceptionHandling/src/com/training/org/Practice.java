package com.training.org;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the  number");
        int no1=scan.nextInt();
        //int k=1;
        for(int x=1;x<=no1;x++)
        {
            for(int i=1;i<=no1;i++)
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }



    }
}
