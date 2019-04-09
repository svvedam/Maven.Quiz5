package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    String myString;
    public PalindromeObject(String input) {
        this.myString=input;
    }
    public String[] getAllPalindromes(){
        List<String> palindromeList = new ArrayList<>();

        for (int i = 0; i < myString.length(); i++) {
            for (int j = i+1; j <= myString.length(); j++) {
                if(reverseStringParam(myString.substring(i,j)).equals(myString.substring(i,j))) {
                    palindromeList.add(myString.substring(i,j));
                }
            }
        }
        String[] returnArray = new String[palindromeList.size()];
        returnArray = palindromeList.toArray(returnArray);
        return returnArray;
    }

    public Boolean isPalindrome(){
        String stringReverse = reverseString();
        if(myString.equalsIgnoreCase(stringReverse))
            return true;
        else
            return false;
    }

    public String reverseString(){

        StringBuilder sbr = new StringBuilder(myString);
        sbr.reverse();
        return sbr.toString();
    }
    public String reverseStringParam(String input){

        StringBuilder sbr = new StringBuilder(input);
        sbr.reverse();
        return sbr.toString();
    }
}
