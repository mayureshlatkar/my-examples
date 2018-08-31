import java.util.Scanner;

public class ThrowsExample{
    int age;
    void getAge() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter age: " );
        age = sc.nextInt();
        if( age < 18){
            Exception ex = new Exception(" Age is less than 18.");
            throw(ex);
        }
        System.out.println(age + " is a valid age. ");
    }
    public static void main(String[] args){
        ThrowsExample te = new ThrowsExample();
        try{
            te.getAge();
        }catch(Exception e){
            System.out.println( " Catching age exception- " + e.getMessage());
        }
    }
}