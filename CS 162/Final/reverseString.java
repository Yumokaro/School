//package PFinal;

public class reverseString {

    public String reverseString(String r) {
        if (r.length() == 0) {
            return r;
        }
        else {
            return reverseString(r.substring(1)) + r.charAt(0);
        }
    }
}
