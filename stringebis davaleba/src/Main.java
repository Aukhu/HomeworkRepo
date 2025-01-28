import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the text");
//        System.out.println();
//        String str = scanner.nextLine();
//        int count = 0 ;
//        for(int i = 0 ; i<str.length() ; i++){
//            char c = str.charAt(i);
//            if(Character.isDigit(c)) count++ ;
//        }
//        if (count == 0 ){
//            System.out.println("there is no number in your text :)");
//        }
//        else if (count == 1) {
//            System.out.println("There is " + count + " numbers in your text");
//        }
//        else{
//            System.out.println("There are " + count + " numbers in your text");
//        }
        //2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the text: ");
//        String str = scanner.nextLine();
//        int count = 0;
//
//        for (int i = 0; i < str.length() - 1; i++) {
//            if (str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '!') {
//                if (str.charAt(i + 1) == '.' || str.charAt(i + 1) == '?' || str.charAt(i + 1) == '!') continue;
//                else count++;
//            }
//        }
//
//        if (str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '?' || str.charAt(str.length() - 1) == '!')
//            count++;
//
//        System.out.println("Number of sentences are: " + count);

        //3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the text: ");
//        String str = scanner.nextLine();
//        boolean isPalindrome = true;
//        String lowStr = "" ;
//
//        for (char c : str.toCharArray()) {
//            if (Character.isLetterOrDigit(c)) {
//                lowStr += Character.toLowerCase(c);
//            }
//        }
//
//        for (int i = 0; i < str.length() / 2; i++) {
//            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//        System.out.println(isPalindrome);


        //4
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the text: ");
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//
//        System.out.println(s1.contains(s2));

        //5
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the text: ");
//        String str = scanner.nextLine();
//
//        boolean isVowel = false ;
//        char lastChar =str.charAt(str.length()-1) ;
//        switch(Character.toLowerCase(lastChar)){
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                isVowel = true;
//                break;
//            default:
//                break;
//        }
//
//        System.out.println("String ends with " + (isVowel ?  "vowel" : "constant "));

        //6
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String modified = scanner.nextLine();
//        String original = "";
//
//        for (int i = 0; i < modified.length(); i++) {
//            if (i == 0 || modified.charAt(i) != modified.charAt(i - 1)) {
//                original += modified.charAt(i);
//            }
//        }
//
//        System.out.println(original);

        //7
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Enter a word: ");
        String longStr = scanner.nextLine();

        if(longStr.length()<=10){
            System.out.println("The word is not large");
        }
        else{
            System.out.println("Abbreviation: " + longStr.charAt(0) + (longStr.length() - 2) + longStr.charAt(longStr.length() - 1));
        }

    }
}
