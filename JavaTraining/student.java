import java.util.Objects;

public class student{
    static int totStudents = 0;
    private String name;
    private int reg_no;
    private String coursename;
    
    void inctotStudents(){
        totStudents++;
    }
    public static int getTotalStudents(){
        return totStudents;
    }
    student(){
        name = "ABC";
        reg_no = 100;
        coursename = "XYZ";
        inctotStudents();
    }
    student(String argname, int argreg_no, String argcoursename){
        this.name = argname;
        this.reg_no = argreg_no;
        this.coursename = argcoursename;
        inctotStudents();
    }
    public void setname(String argname){
        name = argname;
    }
    public String getname(){
        return name;
    }
    public void setroll_no(int argreg_no){
        reg_no = argreg_no;
    }
    public int getreg_no()
    {
        return reg_no;
    }
    public void setcoursename(String argcoursename){
        coursename = argcoursename;
    }
    public String getcoursename(){
        return coursename;
    }

    public boolean equals(Object o){
        if( o == null) return false;
        if( !(o instanceof student) ) return false;
        if(this.getClass() != o.getClass()) return false;

        student s = (student) o;
        System.out.println(this.hashCode());
        if ( this.reg_no != s.reg_no ) return false;
        if ( ! this.name.equals(s.name) ) return false;
        if ( ! this.coursename.equals(s.coursename) ) return false;
        return true;
    }
    
    public int hashCode(){
        int hc = Objects.hash(reg_no,name,coursename);
        return hc;

    }
    //static polymorphism

    
    void display(int argreg_no){
     System.out.println("printing the arguement: " + getreg_no());   
    }

    void display(String name){
        System.out.println("printing the arguement: " + getname());   
       }

       void display(String name, String coursename){
        System.out.println(" printing the arguement 1: " + getname() + " and argument 2 is: " + getcoursename());   
       }

       public static void main(String[] args){
           student s1, s2, s3;
         
           
           s1 = new student("Mayuresh",101,"Java");
           System.out.println(" Name: " + s1.getname() + " Reg_No: " + s1.getreg_no() + " Course_Name: " + s1.getcoursename());
           
           s2 = new student("Rohit",102,"PHP");
           System.out.println(" Name: " + s2.getname() + " Reg_No: " + s2.getreg_no() + " Course_Name: " + s2.getcoursename());
           
           s3 = new student("Mayuresh",101,"Java");
           System.out.println(" Name: " + s3.getname() + " Reg_No: " + s3.getreg_no() + " Course_Name: " + s3.getcoursename());           

                  
           student assignS1 = s1;
           if(s1.equals(s3)){
                System.out.println(" Both are same ");
           }
        else{
                System.out.println(" Both are not same ");
        }
        s1.setname("Sidhesh");
        System.out.println(" " + s1.getname());
        System.out.println(s1);
        System.out.println(assignS1);
       
        System.out.println(" learning static ");
        System.out.println(" Total students are: " + student.getTotalStudents());
        
        s1.display(s1.getreg_no());
        s1.display(s1.getname());
        s1.display(s1.getname(), s1.getcoursename());
    }
    
    
}
