

public class ModernCar{
    private String name;
    private int model;
    ModernCar(){
        this("Maruti", 2000);
    }
    ModernCar(String argName)
    {
        name = argName;
    }
    ModernCar(String argName, int argModel){
        this.name = argName;
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
    public String toString(){
        String str;
        str = " Name :" + name + " Model : " + model;
        return str;
    }
    public static void main(String[] args){
        ModernCar c1, c2, defModernCar;
        defModernCar = new ModernCar();
        System.out.println("default ModernCar name is: " + defModernCar.getName() + " and model number is: " + defModernCar.getModel());
        defModernCar.setName("Lamborghini");
        defModernCar.setModel(2025);
        System.out.println("default Moderncar name is changed to :" + defModernCar.getName() + " and model is changed to: " + defModernCar.getModel());


        c1 = new ModernCar(" Honda " , 2016 );
        System.out.println(c1);
        c2 = new ModernCar(" AUDI " , 2018);
        System.out.println(c2);

        ModernCar[] mcArray = new ModernCar[3];
        mcArray[0] = new ModernCar(" Swift ",2014);
        mcArray[1] = new ModernCar();
        mcArray[2] = new ModernCar(" SUV ",2017);

        for( ModernCar ic : mcArray){
            System.out.println(" Car is: " + ic);
        }
    }
}