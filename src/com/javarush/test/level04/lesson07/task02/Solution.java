package com.javarush.test.level04.lesson07.task02;

/* Строка - описание
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
«четное однозначное число» - если число четное и имеет одну цифру,
«нечетное однозначное число» - если число нечетное и имеет одну цифру,
«четное двузначное число» - если число четное и имеет две цифры,
«нечетное двузначное число» - если число нечетное и имеет две цифры,
«четное трехзначное число» - если число четное и имеет три цифры,
«нечетное трехзначное число» - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
Пример для числа 100:
четное трехзначное число
Пример для числа 51:
нечетное двузначное число
*/

import sun.security.util.Length;

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer val = Integer.parseInt(reader.readLine());

        //stroke
        String stro = "";
        String chet = "четное";
        String nech = "нечетное";

        String odno = "однозначное";
        String dvuh = "двухзначное";
        String treh = "трехзначное";

        String suff = " число";

        if ((val % 2) == 0)
        {
            stro = stro + chet;
        }

        if ((val % 2) != 0)
        {
            stro = stro + nech;
        }

//        if (Length.val = 1)
//        { //???
//        }

        System.out.println(stro);
    }
}
