import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String brand=scan.nextLine();
        String model=scan.nextLine();
        int horsePower=scan.nextInt();

       Car firstCar = new Car();
       firstCar.setBrand(brand);
       firstCar.setModel(model);
       firstCar.setHorsePower(horsePower);

        System.out.println(firstCar.getBrand());
        System.out.println(firstCar.getModel());
        System.out.println(firstCar.getHorsePower());

    }
}