public class Giraffe extends inheritance {
    
    String animalType;

    Giraffe (String animalType, String argAnimalName){
       
        super(argAnimalName);
        this.animalType = animalType;
        System.out.println(" GIRAFEE - assigning only animal type ");
    }


    Giraffe(){
        super("defAnimal");
        System.out.println(" GIRAFEE - no arguements called ");
    }

    public void GiraffesSpecial()
    {
        System.out.println(" Girafee special function ");
    }

    public String toString(){
        String str = " girafee: type is : " + animalType + "\n name is : " + this.getName();
        return str;
    }

    public void eat(String foodName){
        System.out.println(" Giraffe class is over-ridden- " + getName() + " eats veg only: " + foodName );
    }

    
}