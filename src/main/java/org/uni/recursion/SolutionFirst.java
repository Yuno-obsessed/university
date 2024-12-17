package org.uni.recursion;


public class SolutionFirst {

    public String reverseStringRecursively(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        char firstChar = str.charAt(0);
        String restOfString = str.substring(1);
        String reversedRest = reverseStringRecursively(restOfString);

        return reversedRest + firstChar;
    }

}
