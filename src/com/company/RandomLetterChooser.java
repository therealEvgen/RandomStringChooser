package com.company;

public class RandomLetterChooser extends RandomStringChooser{
    public RandomLetterChooser(String str){
        super(getSingleLetters(str));
    }

    public static String[] getSingleLetters(String str){
        String[] newArray = new String[str.length()];
        for(int k = 0; k < str.length(); k++){
            newArray[k] = str.substring(k,k+1);
        }
        return newArray;
    }
}