import java.util.Scanner;

public class project
{
    public static int e_id ;
    public static int m_id;  
    public int l_id;
    public static String l_status;
    public static int duration;
    public static String l_r_amanager;
    public static String l_r_dmanager;
    public static int l_balance;
 

    
    /*public project(int e_id, int l_id, String l_status, int duration, String l_r_manager, int l_balance)
    {
        e_id = 1000;
        m_id = 1000;
        l_id = 1;
        l_status = null;
        duration = 5;
        l_r_manager = null;
        l_balance = 7;
    
    }
*/
Scanner sc = new Scanner(System.in);

    

    public void Applicable(int e_id, int m_id)
    {
       if(e_id == m_id)
       {
           System.out.println( " Applicable for approving or denying leave. " );
         
           this.ApproveDeny(12, 5, "null", "null", "APPROVED");
       }
       else
       {
           System.out.println( " Not applicable. " );

       }
    }
       public void ApproveDeny(int l_balance, int duration, String l_r_amanager, String l_r_dmanager, String l_status)
    {
        if(l_status == "APPROVED")
        {
           
            System.out.println( " Enter reason for approving the leave: " );
            l_r_amanager = sc.nextLine();
            System.out.println( " The reason for approving the leave is: " + l_r_amanager);
            
            System.out.println( " No change in leave balance. " );
            System.out.println(l_balance);
        }
        else if(l_status == "DENIED")
        {
            
           
            
            System.out.println( " Enter reason for denying the leave: " );
            l_r_dmanager = sc.nextLine();
            System.out.println( " The reason for denying the leave is: " + l_r_dmanager);
            l_balance = l_balance + duration;
            System.out.println(" Leave balance is: " + l_balance);
            
    
        }
       }
       public static void main(String[] args)
       {
           e_id = 1000;
           m_id = 1000;
           project a1 = new project();
           a1.Applicable(1000,1000);

           
           l_balance = 12;
           duration = 5;
           l_r_amanager = "null";
           l_r_dmanager = "null";
           l_status = "APPROVED";

           
           

       }

    }
