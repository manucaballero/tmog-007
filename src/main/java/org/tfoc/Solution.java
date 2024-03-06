package org.tfoc;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public static boolean isAnagram(
            String s,
            String t) {

        if(s.length() != t.length()){

            return false;
        }

        int[] firstWordData = fillLetterOcurrences(s);
        int[] secondWordData = fillLetterOcurrences(t);

        boolean areEquals = true;
        int counter = 0;
        while (counter < firstWordData.length && areEquals){

            if(firstWordData[counter] != secondWordData[counter]){
                areEquals = false;
            }

            counter++;
        }

        return areEquals;
    }

    private static int[] fillLetterOcurrences(String word){

        int[] wordData = new int[26];//26 -> Number of english lowercase characters

        for(int i = 0; i < word.length(); i++){

            char currentCharacter = word.charAt(i);
            int letterPos = currentCharacter - 'a';
            wordData[letterPos]++;
        }
        return wordData;
    }

}
