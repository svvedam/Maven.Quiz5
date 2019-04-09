package rocks.zipcode.io.quiz4.fundamentals;

import rocks.zipcode.io.quiz4.objectorientation.StringEvaluatorObject;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> list = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String sub = string.substring(i, j);
                list.add(sub);
            }
        }

        String[] all = new String[list.size()];
        return list.toArray(all);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {

        String [] firstStr = getAllSubstrings(string1);
        List<String> firstList = Arrays.asList(firstStr);
        String [] secondStr = new StringEvaluatorObject(string2).getAllSubstrings();
        List<String> secondList = Arrays.asList(secondStr);
        List<String> returnList = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            String compareValue = firstList.get(i);
            if(secondList.contains(compareValue))
                returnList.add(compareValue);

        }
        String[] returnArray = new String[returnList.size()];
        return returnList.toArray(returnArray);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        String [] commonStr = getCommonSubstrings(string1, string2);
        TreeMap<Integer,String> stringSizeMap = new TreeMap<>();
        for (int i = 0; i < commonStr.length; i++) {
            String s = commonStr[i];
            Integer sizeOfStr=s.length();
            stringSizeMap.put(sizeOfStr,s);
        }
        Integer highest= stringSizeMap.lastKey();
        String returnString = stringSizeMap.get(highest);
        return returnString;
    }
}
