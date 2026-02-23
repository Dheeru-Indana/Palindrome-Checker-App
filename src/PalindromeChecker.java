import java.util.*;
import java.lang.String;
public class PalindromeChecker {
    public static void main(String[] args) {
        //UC1
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version ; 1.0");
        System.out.println("System initialized successfully!");

        String str = new String("madam");
        String isPalindrome = new String("True");
        int j = str.length();
        // UC2
//        for (int i = 0; i < str.length() / 2; i++) {
//            j = j - 1;
//            if (str.charAt(i) != str.charAt(j)) {
//                isPalindrome = "False";
//            }
//        }
//        if (isPalindrome.equals("True")) {
//            System.out.println("Is it a palindrome?: True");
//        }else{
//            System.out.println("Is it a palindrome?: False");
//        }
        String rev=new String("");
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Is it a palindrome?: True");
        }else{
            System.out.println("Is it a palindrome?: False");
        }
    }

}
