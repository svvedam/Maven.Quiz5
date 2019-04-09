package rocks.zipcode.io.quiz4.objectorientation;

import java.util.*;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    String myString;
    public StringEvaluatorObject(String str) {
        this.myString=str;

    }

    public String[] getAllSubstrings() {
        Set<String> list = new HashSet<>();

        for (int i = 0; i < myString.length(); i++) {
            for (int j = i + 1; j <= myString.length(); j++) {
                String sub = myString.substring(i, j);
                list.add(sub);
            }
        }

        String[] all = new String[list.size()];
        return list.toArray(all);
    }

    public String[] getCommonSubstrings(String secondInput) {
        String [] firstStr = getAllSubstrings();
        List<String> firstList = Arrays.asList(firstStr);
        String [] secondStr = new StringEvaluatorObject(secondInput).getAllSubstrings();
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

    public String getLargestCommonSubstring(String secondInput) {
        String [] commonStr = getCommonSubstrings(secondInput);
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
