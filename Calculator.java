package com.company;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class Calculator {
    private static Object Result;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strokaVvoda = in.nextLine();
        int length;
        String operand1, operand2;
        length = strokaVvoda.length();
        boolean x = StringUtils.containsAny(strokaVvoda, "123456789");
        if (strokaVvoda.indexOf('-') > 0 & x == false) {
            operand1 = StringUtils.substring(strokaVvoda, 0, strokaVvoda.indexOf('-'));
            operand2 = StringUtils.substring(strokaVvoda, strokaVvoda.indexOf('-') + 1, length);
            Result = StringUtils.remove(operand1, operand2);
            System.out.println(Result);
        } else if (strokaVvoda.indexOf('+') > 0 & x == false) {
            operand1 = StringUtils.substring(strokaVvoda, 0, strokaVvoda.indexOf('+'));
            operand2 = StringUtils.substring(strokaVvoda, strokaVvoda.indexOf('+') + 1, length);
            Result = operand1 + operand2;
            System.out.println(Result);
        } else if (strokaVvoda.indexOf('/') > 0 & x == true) {
            operand1 = StringUtils.substring(strokaVvoda, 0, strokaVvoda.indexOf('/'));
            operand2 = StringUtils.substring(strokaVvoda, strokaVvoda.indexOf('/') + 1, length);
            int value = Integer.parseInt(operand2.replaceAll("[^0-9]", ""));
            int y = operand1.length() / value;
            Result =StringUtils.substring(operand1,0,y);
            System.out.println(Result);
        }else if (strokaVvoda.indexOf('*') > 0 & x == true) {
            operand1 = StringUtils.substring(strokaVvoda, 0, strokaVvoda.indexOf('*'));
            operand2 = StringUtils.substring(strokaVvoda, strokaVvoda.indexOf('*') + 1, length);
            int value = Integer.parseInt(operand2.replaceAll("[^0-9]", ""));
            Result = StringUtils.repeat(operand1, value);
            System.out.println(Result);
        }else{
            System.out.println("неверные данные");

        }
    }
}

























