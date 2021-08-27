package com.training.org;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int arr[]=new int[5];
            arr[5]=30/10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception 2 "+e);
        }
        catch (ArithmeticException e){
            System.out.println("Exception 1 "+e);
        }

        catch (Exception e){
            System.out.println("Exception 3");
        }
}
}
