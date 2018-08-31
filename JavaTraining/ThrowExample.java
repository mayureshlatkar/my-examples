import java.util.Scanner;

public class ThrowExample{
    int age;
    void getAge(){
       Scanner sc = new Scanner(System.in);
       try{

        System.out.println( " Enter age: " );
        age = sc.nextInt();
        if(age < 18)
        {
            Exception ex = new Exception( " Age is less than 18." );
            throw(ex);
        }
        System.out.println(age + " is a valid age. ");
    }catch( Exception e){
        System.out.println( e.getMessage());
        e.printStackTrace();
    }
    finally{
        sc.close();
    }
    }
    public static void main(String[] args)
    {
        ThrowExample te = new ThrowExample();
        te.getAge();    
    }
}