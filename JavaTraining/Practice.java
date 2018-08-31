import java.util.Scanner;
public class Practice{
    public static void main(String[] args){
        int r, temp;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter an number: "+ n );
        
        temp = n;
        while(n > 0){
            r = n%10;
            sum = (sum*10) + r;
            n = n/10;
        }
        if(temp==sum){
            System.out.println("Palindrom is there. ");
        }
        else{
            System.out.println("Palindrome doesn't exist.");
        }

    }
}