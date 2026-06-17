import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n= sc.nextInt();
        int original=n;
        int rev=0;
        while(n>0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n=n/10;
        }
        if (rev==original) {
            System.out.println("given number is a number");
        }else{
            System.out.println("given number is not a palindrome");
        }
        }
    }


