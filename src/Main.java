import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.next();
        String rev="";
        str=str.toLowerCase();
        int n =str.length();
        for(int i=n-1; i>=0; i--)
        {
            rev+=str.charAt(i);
        }
        if(str.equals(rev)) {
            System.out.println("String is palindrome!");
        }
        else {
            System.out.println("String is not palimdrome");
        }
    }
}