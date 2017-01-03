package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] ilist = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < ilist.length; i++) {
            ilist[i] = Integer.parseInt(reader.readLine());
        }

        int[] miniListOne = new int [10];
                System.arraycopy(ilist, 0,miniListOne,0, 10);

        int[] miniListTwo = new int[10];
                System.arraycopy(ilist, 10,miniListTwo,0,10);

        for (int m = 0; m < miniListTwo.length; m++) {
            System.out.println(miniListTwo[m]);
        }
    }
}
