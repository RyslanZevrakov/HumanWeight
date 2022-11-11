import java.util.Scanner;
public class Human {
   public String name;
   public String surname;
   private double weight;
   private double height;


    Human(){
        double  weight;
        double  height;
    }
    public void goodShapeMen(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите имя");
        name = sc.next();
        System.out.println("Введите фамилию");
        surname = sc.next();
        System.out.println("Введите рост");
        height = sc.nextInt();
        weight=height-110;
        if (weight>75){
            System.out.println(surname);
            System.out.println(name);
            System.out.println("Ты переидает ");
            System.out.println("Рост" + height);
            System.out.println("Вес" + weight);
            System.out.println("Ешь меньше");
        }
        else if (weight==75){
            System.out.println(surname);
            System.out.println(name);
            System.out.println("Ты в хорошей форме");
            System.out.println("Рост" + height);
            System.out.println("Вес" + weight);
            System.out.println("не изменяй диету");
        }
        else  {
            System.out.println(surname);
            System.out.println(name);
            System.out.println("Ты недаедает");
            System.out.println("Рост" + height);
            System.out.println("Вес" + weight);
            System.out.println("Ешь больше");
        }

    }
    public void goodShapeWomen() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите имя");
        name = sc.next();
        System.out.println("Введите фамилию");
        surname = sc.next();
        System.out.println("Введите рост");
        height = sc.nextInt();
        weight=height-100;
        if (weight>65){
            System.out.println(surname);
            System.out.println(name);
            System.out.println("Ты переидает ");
            System.out.println("Рост" + height);
            System.out.println("Вес" + weight);
            System.out.println("Ешь меньше");
        }
        else if (weight==65){
            System.out.println(surname);
            System.out.println(name);
            System.out.println("Ты в хорошей форме");
            System.out.println("Рост" + height);
            System.out.println("Вес" + weight);
            System.out.println("не изменяй диету");
        }
        else  {
            System.out.println(surname);
            System.out.println(name);
            System.out.println("Ты недаедает");
            System.out.println("Рост" + height);
            System.out.println("Вес" + weight);
            System.out.println("Ешь больше");
        }
    }

}
