public class TestAnimal{

        public static void main(String[] args){
            Giraffe g1 = new Giraffe(" wildAnimalType " , " abcd ");
            System.out.println(g1);
            g1.GiraffesSpecial();
            g1.sleep();
            g1.run();
            g1.eat("Sugarcane");

            System.out.println(" Displaying animal details: ");
            inheritance a1 = new inheritance(" xyz ");
            a1.sleep();
            a1.run();
            a1.eat(" Mango ");

            
            System.out.println(" Dynamic polymorphism ");
            inheritance ad = new Giraffe(" DynaGif ", " Pet ");
            System.out.println(ad);
            ad.eat(" Sugarcane ");
            ad.run();

            Giraffe gd = (Giraffe) ad;
            gd.GiraffesSpecial();0 
           /* Giraffe gd = new Giraffe(" DynaGif ", " pet ");
            System.out.println(gd);
            gd.GiraffesSpecial();
            gd.eat(" Sugarcane ");
*/
            //Giraffe g2 = new Giraffe();
            //System.out.println(g2);
        }
}