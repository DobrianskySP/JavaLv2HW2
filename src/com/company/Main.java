package com.company;

public class Main {


    public static void main(String[] args) {

        String normal ="10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0";
        String manynumbers ="10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 1 0";
        String havechars ="10 3 1 2\n2 3 r 2\n5 6 a 1\n300 3 1 0";
        String fewnumbers ="10 3 1 2\n2 3 2 2\n5 6 7 1";

        StringToInteger string = new StringToInteger();

        string.printarrstring(string.linetoarray(normal)); //вывод стрингового массива из данной строки

        System.out.println("------------------------------------");
        string.printarrint(string.strIntoInt(string.linetoarray(normal))); // вывод массива преобразованного из стринга в инт

        System.out.println("------------------------------------");
        System.out.println("Сумма всех чисел массива поделенная на 2 ровна = " + string.sumofindexarray(string.strIntoInt(string.linetoarray(normal)))); //вывод суммы всех элементов массива поделенные на 2

        System.out.println("------------------------------------");
       // System.out.println(string.linetoarray(manynumbers)); //пример исключения на колличество символов

        System.out.println("------------------------------------");
        System.out.println(string.strIntoInt(string.linetoarray(havechars))); //пример исключения на наличие чар символов

        System.out.println("------------------------------------");
      //  System.out.println(string.linetoarray(fewnumbers)); //пример исключения на маленькое количество номеров
    }
}
