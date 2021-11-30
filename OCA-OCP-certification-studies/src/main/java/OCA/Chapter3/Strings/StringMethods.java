package OCA.Chapter3.Strings;

import java.util.Locale;

public class StringMethods {
/*
* String s = ""
* s.length() --> num of chars inside of string, return integer
* s.charAt() --> return char of given index as parameter.
* s.indexOf() --> finds the first index that matches the desired string
* s.subString() --> subString with start index and sometimes with end index as well.
* s.toLowerCase() and s.toUpperCase()
* s.equals() and s.equalsIgnoreCase() return booleans
* s.startsWith() --> returns true if stats with given string as param. Same for s.endsWith()
* s.contains() --> the matching string can be anywhere.
* s.replace() --> search and replace
* s.trim() --> removes whitespaces from beginning and ending of the string.
* */
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.length()); // 7

        System.out.println(string.charAt(0)); // a
        System.out.println(string.charAt(6)); // s

        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1 means not found

        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals
        System.out.println(string.substring(3, 3)); // "" empty string
//        System.out.println(string.substring(3, 2)); // throws exception
//        System.out.println(string.substring(3, 8)); // // throws exception


        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("ABC123".toLowerCase()); // abc123

        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".startsWith("c")); // false

        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("ab", "AB")); // ABcABc

        System.out.println("abc".trim()); // abc
        System.out.println("\t   a b c\n".trim()); // a b c


    }
}
