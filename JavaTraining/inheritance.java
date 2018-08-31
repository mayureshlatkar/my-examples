public class inheritance{
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String name){this.name = name;}
    inheritance(String name ){ this.name = name;} 
    inheritance(){name = " default animal: "; }

    public final void sleep(){
        System.out.println(" Animals sleep ");
    }
    public void run(){
        System.out.println(" Animals run in medium speed ");

    }

    public void eat(String foodName){
        System.out.println(name + " eats " + foodName );

    }
}