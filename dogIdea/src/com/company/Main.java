package com.company;


public class Main {

    public static void main(String []args){
        String costForPrint = "5$";
        char t = costForPrint.charAt(0);
        System.out.println(t);
        System.out.println("Цена только для вас " +
                + costForPrint.charAt(0) + getCurrencyName(costForPrint.charAt(1)));
    }

    public static String getCurrencyName(char symbol) {
        double pi = Math.PI;
        if (symbol == '$') {
            return " долларов";
        } else {
            throw new UnsupportedOperationException("Not implemented yet");
        }
    }

}
