package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    StringBuilder sbr;
    Character delimeter;

    public StringAssembler(StringBuilder sbr, Character delimeter) {
        this.sbr = sbr;
        this.delimeter = delimeter;
    }

    public StringAssembler(Character delimeter) {
        this.sbr = new StringBuilder();
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        sbr.append(str);
        sbr.append(delimeter);
       return new StringAssembler(sbr, delimeter);
    }

    public String assemble() {
        String returnString = sbr.toString();
        returnString = returnString.substring(0,returnString.length()-1);
        return returnString;
    }
}
