public class Main {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;

        Human human = new Human();

        do {
            System.out.println("Информация");
            System.out.println(" 1. Мусшины");
            System.out.println(" 2. Женшины");
            choice = (char) System.in.read();
        }
        while (choice < '1' || choice > '2');
        System.out.println("\n");
        switch (choice) {
            case '1':
                human.goodShapeMen();
                break;
            case '2':
                human.goodShapeWomen();
                break;
        }
    }
}