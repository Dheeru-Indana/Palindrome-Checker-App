import java.util.*;
import java.lang.String;
public class PalindromeChecker {
    public static void main(String[] args) {
        //UC1
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version ; 1.0");
        System.out.println("System initialized successfully!");

        String str = new String("civic");
        //String isPalindrome = new String("True");
        //int j = str.length();
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
        //UC3
//        String rev=new String("");
//        for(int i=str.length()-1;i>=0;i--){
//            rev+=str.charAt(i);
//        }
//
//        if(str.equals(rev)){
//            System.out.println("Is it a palindrome?: True");
//        }else{
//            System.out.println("Is it a palindrome?: False");
//        }

        //UC4
//        char[] chars= str.toCharArray();
//        int start=0;
//        int end= chars.length -1;
//        boolean isPalindrome= true;
//        while(start<end){
//            if(chars[start]!=chars[end]){
//                isPalindrome=false;
//                break;
//            }
//            start++; end--;
//        }
//
//        if(isPalindrome){
//            System.out.println("Is it a palindrome?: True");
//        }else{
//            System.out.println("Is it a palindrome?: False");
//        }

        //UC5
//        Stack<Character> charstack= new Stack<>();
//        for(char c:str.toCharArray()){
//            charstack.push(c);
//        }
//        String rev=new String("");
//        while (!charstack.isEmpty()) {
//            rev += charstack.pop();
//        }
//        if(str.equals(rev)){
//            System.out.println("Is it a palindrome?: True");
//        }else{
//            System.out.println("Is it a palindrome?: False");
//        }

        //UC6
//        boolean isPalindrome= true;
//        Queue<Character> charqueue = new LinkedList<>();
//        Stack<Character> charstack= new Stack<>();
//        for(char c:str.toCharArray()){
//            charstack.push(c);
//        }
//        for(char c:str.toCharArray()){
//            charqueue.offer(c);
//        }
//        while(!charstack.isEmpty() && !charqueue.isEmpty()){
//            char stackelement=charstack.pop();
//            char queueelement=charqueue.poll();
//            if(stackelement !=(queueelement)){
//                isPalindrome=false;
//                break;
//            }
//        }
//
//        if(isPalindrome){
//            System.out.println("Is it a palindrome?: True");
//        }else{
//            System.out.println("Is it a palindrome?: False");
//        }

        //UC7
//        Deque<Character> chardeque = new ArrayDeque<>();
//        boolean isPalindrome= true;
//        for(char c:str.toCharArray()){
//            chardeque.offerFirst(c);
//        }
//        while(chardeque.size()>1){
//            char first=chardeque.removeFirst();
//            char last=chardeque.removeLast();
//            if(first!=last){
//                isPalindrome=false;
//            }
//        }
//
//        if(isPalindrome){
//            System.out.println("Is it a palindrome?: True");
//        }else{
//            System.out.println("Is it a palindrome?: False");
//        }

        //UC8
        boolean isPalindrome = true;
        LinkedList<Character> charlist = new LinkedList<>();
        for (char c : str.toCharArray()) {
            charlist.add(c);
        }
        while (charlist.size() > 1) {
            char first = charlist.removeFirst();
            char last  = charlist.removeLast();
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Is it a palindrome?: True");
        } else {
            System.out.println("Is it a palindrome?: False");
        }

    }

}
