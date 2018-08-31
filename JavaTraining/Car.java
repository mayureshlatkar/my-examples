

public class Car{
    private String name;
    private int model;
    Car(){
        this("Maruti", 2000);
    }
    Car(String argName)
    {
        name = argName;
    }
    Car(String argName, int argModel){
        this(argName);
        this.model = argModel;
    }
    public void setName(String argName){
        name = argName;
    }
    public String getName(){
        return name;
    }
    public void setModel(int argModel){
        model = argModel;
    }
    public int getModel(){
        return model;
    }
    public static void main(String[] args){
        Car c1, c2, defcar;
        defcar = new Car();
        System.out.println("default car name is: " + defcar.getName() + " and model number is: " + defcar.getModel());
        c1 = new Car(" Honda " , 2016 );
        System.out.println("c1 name is: " + c1.getName() + " and model is: " + c1.getModel());
        c2 = new Car(" AUDI " , 2018);
        System.out.println("c2 name is: " + c2.getName() + " and model is: " + c2.getModel());
    }
}