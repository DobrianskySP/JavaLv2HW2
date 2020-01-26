package com.company;


import org.omg.CORBA.StringHolder;

import java.util.Arrays;

public class StringToInteger {
    String[][] array = new String[4][];
    int[][] intarray;
    private final int MAX_COUNT = 4;

    private static final class ManyNumbersExeption extends RuntimeException{
        ManyNumbersExeption(int error){ super("Слишком много символов: " + error);
        }
    }

    private static final class HaveCharExeption extends RuntimeException{
        HaveCharExeption(String error){ super("Есть символы типа char: " + error);
        }
    }

    private static final class FewNumbersExeption extends RuntimeException{
        FewNumbersExeption(int error){ super("Слишком мало символов: " + error);
        }
    }

    public String[][] linetoarray(String str){
       String[] first = str.split("\n");
       if(first.length > MAX_COUNT){
           throw new ManyNumbersExeption(first.length);
       } else if(first.length < MAX_COUNT){
           throw new FewNumbersExeption(first.length);
       }else {
           for (int i = 0; i < MAX_COUNT; i++) {
               array[i] = first[i].split(" ");
               if (array[i].length > MAX_COUNT){
                   throw new ManyNumbersExeption(array[i].length);
               } else if(array[i].length < MAX_COUNT){
                   throw new FewNumbersExeption(array[i].length);
               }
           }
       }
        return array;
        }

    public void printarrstring (String arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printarrint (int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] strIntoInt(String[][] arr){
        intarray = new int[MAX_COUNT][MAX_COUNT];
        for (int i = 0; i < MAX_COUNT ; i++) {
            for (int j = 0; j < MAX_COUNT; j++) {
               try {
                   intarray[i][j] = Integer.parseInt(arr[i][j]);
               } catch (NumberFormatException e){
                   throw new HaveCharExeption(String.valueOf(arr[i][j]));
               }
            }
        }
        return intarray;
    }

    public int sumofindexarray(int[][] arr){
        int sum = 0;
        for (int i = 0; i < MAX_COUNT; i++) {
            for (int j = 0; j < MAX_COUNT; j++) {
             sum += arr[i][j];
            }
        } return sum/2;
    }

}
