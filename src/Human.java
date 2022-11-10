public class Human {
   public String name;
   public String surname;
   private double weight;
   private double height=randomHeight();
   public static double randomHeight() {
   double randomHeight =(int)(Math.random()*(190-100))+100;

   return randomHeight; }
    public double getWeight(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
    Human(){
        weight=75;
        height= randomHeight();
    }
    public void goodShapeMen(){

        weight=185-height;
        if (weight>75){
            System.out.println("Человек переидает ");
        }
        else if (weight==75){
            System.out.println("Человек в хорошей форме");
        }
        else  {
            System.out.println("Человек недаедает");
        }

    }
    public void goodShapeWomen() {
        weight=165-height;
        if (weight>75){
            System.out.println("Человек переидает ");
        }
        else if (weight==75){
            System.out.println("Человек в хорошей форме");
        }
        else  {
            System.out.println("Человек недаедает");
        }
    }

}
