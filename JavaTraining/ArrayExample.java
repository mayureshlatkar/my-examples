import java.util.Scanner;
public class ArrayExample{
    public static void main(String args[]){
        int[] iArr;
        iArr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<iArr.length;i++){
            System.out.println("Enter data for array position " + i + " : ");
            iArr[i] = sc.nextInt();
        }
        for(int k : iArr ){
            System.out.println("Value is : " + k);
        }
    }
} 