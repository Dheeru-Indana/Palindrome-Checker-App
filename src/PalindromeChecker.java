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

//        //UC8
//        boolean isPalindrome = true;
//        LinkedList<Character> charlist = new LinkedList<>();
//        for (char c : str.toCharArray()) {
//            charlist.add(c);
//        }
//        while (charlist.size() > 1) {
//            char first = charlist.removeFirst();
//            char last  = charlist.removeLast();
//            if (first != last) {
//                isPalindrome = false;
//                break;
//            }
//        }
//
//        if (isPalindrome) {
//            System.out.println("Is it a palindrome?: True");
//        } else {
//            System.out.println("Is it a palindrome?: False");
//        }
        //UC9
//        if(Palindromecheckfn(str, 0, str.length() - 1)){
//            System.out.println("Is it a palindrome?: True");
//        } else {
//            System.out.println("Is it a palindrome?: False");
//
//        }
        //UC10
//        String processed = str.toLowerCase().replaceAll("[^a-zA-z0-9]","");
//        String rev = new StringBuilder(processed).reverse().toString();
//
//        if(processed.equals(rev)){
//            System.out.println("Is it a palindrome?: True");
//        }
//        else {
//            System.out.println("Is it a palindrome?: False");
//
//        }

//
//        String processed = preprocess(str);
//        boolean result = isPalindrome(processed);
//
//        printResult(result);

        //UC 12
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String inputString = scanner.nextLine();

        if(inputString == null || inputString.trim().isEmpty()){
            System.out.println("Empty String, Please enter a String");
            return;
        }

        System.out.println("Choose Palindrome Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = scanner.nextInt();

        PalindromeStrategy strategy;

        if(choice == 1){
            strategy = new StackStrategy();
        }
        else{
            strategy = new DequeStrategy();
        }

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.execute(inputString);

        System.out.println("Is it a palindrome: " + result);

    }
    //UC9 UDF
//    public static boolean Palindromecheckfn(String str, int start, int end) {
//        if (start >= end) {
//            return true;
//        }
//        if (str.charAt(start) != str.charAt(end)) {
//            return false;
//        }
//
//        return Palindromecheckfn(str, start + 1, end - 1);
//
//    }
    //UC11 Functions

//    private static String preprocess(String str) {
//        return str.toLowerCase().replaceAll("[^a-z0-9]", "");
//    }
//    private static boolean isPalindrome(String str) {
//        int start = 0;
//        int end = str.length() - 1;
//
//        while (start < end) {
//            if (str.charAt(start) != str.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
//    private static void printResult(boolean result) {
//        System.out.println(result ? "Palindrome" : "Not a Palindrome");
//    }

    //UC 12 Functions

    interface PalindromeStrategy{
        boolean isPalindrome(String inputString);
    }

    static class StackStrategy implements PalindromeStrategy {

        @Override
        public boolean isPalindrome(String inputString) {

            String normalizedString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            Stack<Character> stack = new Stack<>();

            for(char c : normalizedString.toCharArray()){
                stack.push(c);
            }

            for(char c : normalizedString.toCharArray()){
                if(c != stack.pop()){
                    return false;
                }
            }

            return true;
        }
    }

    static class DequeStrategy implements PalindromeStrategy {

        @Override
        public boolean isPalindrome(String inputString) {

            String normalizedString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            Deque<Character> deque = new ArrayDeque<>();

            for(char c : normalizedString.toCharArray()){
                deque.addLast(c);
            }

            while(deque.size() > 1){
                char front = deque.removeFirst();
                char back = deque.removeLast();

                if(front != back){
                    return false;
                }
            }

            return true;
        }
    }

    static class PalindromeContext{
        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy){
            this.strategy = strategy;
        }

        public boolean execute(String input){
            return strategy.isPalindrome(input);
        }

    }

    public static boolean isPalindromeCheck(LinkedList<Character> ll ){

        if(ll.size() <=1){
            return true;

        }
        char front = ll.removeFirst();
        char back = ll.removeLast();
        if(front==back){
            return isPalindromeCheck(ll);

        }
        return false;



    }

}
