package com.company;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class Calculator {
    private static Object Result;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strokaVvoda = in.nextLine();
        int length;
        String operand1 = new String();
        String operand2 = new String();
        length = strokaVvoda.length();
        boolean x = StringUtils.containsAny(strokaVvoda, "123456789");
        if (strokaVvoda.indexOf('-') > 0 & x == false & operand2.length()<=10 & operand1.length()<=10) {
            operand1 = StringUtils.substring(strokaVvoda, 0, strokaVvoda.indexOf('-'));
            operand2 = StringUtils.substring(strokaVvoda, strokaVvoda.indexOf('-') + 1, length);
            System.out.println("\"" + operand1 + "\"" + "-" + "\"" + operand2 + "\"");
            Result = StringUtils.remove(operand1, operand2);
            System.out.println("\"" + Result + "\"");
        } else if (strokaVvoda.indexOf('+') > 0 & x == true & operand2.length()<=10 & operand1.length()<=10) {
            operand1 = StringUtils.substring(strokaVvoda, 0, strokaVvoda.indexOf('+'));
            operand2 = StringUtils.substring(strokaVvoda, strokaVvoda.indexOf('+') + 1, length);
            System.out.println("\"" + operand1 + "\"" + "+" + "\"" + operand2 + "\"");
            Result = operand1 + operand2;
            System.out.println("\"" + Result + "\"");
        } else if (strokaVvoda.indexOf('/') > 0 & x == true &  operand1.length()<=10){
            operand1 = StringUtils.substring(strokaVvoda, 0, strokaVvoda.indexOf('/'));
            operand2 = StringUtils.substring(strokaVvoda, strokaVvoda.indexOf('/') + 1, length);
            System.out.println("\"" + operand1 + "\"" + "/" + operand2);
            int value = Integer.parseInt(operand2.replaceAll("[^0-9]", ""));
            int y = operand1.length() / value;
            Result =StringUtils.substring(operand1,0,y);
            System.out.println("\"" + Result + "\"");
        }else if (strokaVvoda.indexOf('*') > 0 & x == true &   operand1.length()<=10) {
            operand1 = StringUtils.substring(strokaVvoda, 0, strokaVvoda.indexOf('*'));
            operand2 = StringUtils.substring(strokaVvoda, strokaVvoda.indexOf('*') + 1, length);
            System.out.println("\"" + operand1 + "\"" + "*" + operand2);
            int value = Integer.parseInt(operand2.replaceAll("[^0-9]", ""));
            Result = StringUtils.repeat(operand1, value);
            System.out.println("\"" + StringUtils.substring((String) Result,0,41) + "...\"" );
        }else{
            System.out.println("неверные данные");
        }
    }
}

































