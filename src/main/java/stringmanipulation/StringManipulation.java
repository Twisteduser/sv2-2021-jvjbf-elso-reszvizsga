package stringmanipulation;

public class StringManipulation {
    public String everyEvenCharacter(String s){
        String output = "";
        for (int i = 0; i<s.length();i=i+2) {
            output=output+s.charAt(i);
        }return output;
    }
}
