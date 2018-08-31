import java.util.Scanner;
public class ControlFlow{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.println("Enter an integer: ");
        i = sc.nextInt();
        sc.nextLine();
        if(i > 50)
        {
            System.out.println("Value entered is:" + i + "and greater than 50.");
        }
        else if (i > 25)
        {
            System.out.println("Value entered is: "+ i + "and greater than 25. ");
        }
        else
        {
            System.out.println("Value entered is: " + i + "and less than 25. ");
        }
        switch(i){
            case 50:
                    System.out.println("value is 50.");
                    break;
            case 25:    
                    System.out.println("value is 25.");
                    break;
                    default:
                    System.out.println("Other values.");

        }

        j = 0;
        while(j < i){
            if(j==5){
                j++;
                continue;
            }
            System.out.println("value is: " + j);
            j++;
            if(j > 10)
                break;
            
        }
        j = 0;
        do{
            System.out.println("using do while " + j);
            j++;
        }while(j < i);

        for(j = 0;j < i; j++){
            System.out.println("Using for loop " + j);
        }

        //switch using string
        System.out.println("Enter a string: ");
        String str = sc.next();
        System.out.println("String is: " + str);
        switch( str ){
            case "mon":
            System.out.println("monday");
            break;

            case "sun":
            System.out.println("sunday");
            break;

        default:
            System.out.println("NO day");

        }
        

        
    }
}