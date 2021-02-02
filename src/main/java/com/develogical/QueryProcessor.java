package com.develogical;

import java.util.Arrays;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        else if (query.toLowerCase().contains("imperial")) {
            return "Imperial College London (legally Imperial College of Science, Technology and Medicine) " +
                    "is a public research university in London. Imperial grew out of Prince Albert's vision of an " +
                    "area for culture, including the Royal Albert Hall, Imperial Institute, numerous museums, " +
                    "and the Royal Colleges that would go on to form the college.[8][9] In 1907, Imperial College " +
                    "was established by Royal Charter, merging the Royal College of Science, Royal School of Mines, " +
                    "and City and Guilds College. In 1988, the Imperial College School of Medicine was formed by " +
                    "combining with St Mary's Hospital Medical School. In 2004, Queen Elizabeth II opened the Imperial " +
                    "College Business School. ";
        } else if (query.toLowerCase().contains("what is your name")) {
            return "Which github project do we use";
        } else if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            String[] querySplitByColon = query.split(":");
            String[] numbers = querySplitByColon[querySplitByColon.length - 1].trim().split(", ");
            int largestNumber = Integer.MIN_VALUE;
            for (int i = 0; i < numbers.length; i++) {
                if (Integer.parseInt(numbers[i]) > largestNumber) {
                    largestNumber = Integer.parseInt(numbers[i]);
                }
            }

            return String.valueOf(largestNumber);
        } else if (query.toLowerCase().contains("plus")){
            String[] splitedQuery = query.split(" ");
            return String.valueOf(Integer.parseInt(splitedQuery[splitedQuery.length - 3]) + Integer.parseInt(splitedQuery[splitedQuery.length-1]));
        } else if (query.toLowerCase().contains("which of the following numbers is the largest")) {
            String[] numbers = query.split(":")[1].trim().split(", ");
            int number1 = Integer.parseInt(numbers[0]);
            int number2 = Integer.parseInt(numbers[1]);
            return String.valueOf(Math.max(number1, number2));
        } else if (query.toLowerCase().contains("square and a cube")) {
        String[] querySplitByColon = query.split(":");
        String[] numbers = querySplitByColon[querySplitByColon.length - 1].trim().split(", ");


        for(int i=0; i<numbers.length;i++) {
            double sr = Math.sqrt(Integer.parseInt(numbers[i]));
            double qr = Math.cbrt(Integer.parseInt(numbers[i]));
            if (sr * sr == Integer.parseInt(numbers[i]) && ((qr * qr * qr) == Integer.parseInt(numbers[i]))) {
                return String.valueOf(Integer.parseInt(numbers[i]));

            }
        }
           }else if (query.toLowerCase().contains("multiplied")){
            String[] splitedQuery = query.split(" ");
            return String.valueOf(Integer.parseInt(splitedQuery[3])*Integer.parseInt(splitedQuery[splitedQuery.length-1]));
        }else if (query.toLowerCase().contains("colour is a banana")){
            return "yellow";
        } else if (query.toLowerCase().contains("which year was theresa may first elected as the prime minister of great britain")) {
            return "2016";
        } else if (query.toLowerCase().contains("eiffel tower")) {
            return "Paris";
        }

        return "";
    }
}
