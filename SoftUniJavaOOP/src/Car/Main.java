package Car;

import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < numbers; ++i) {
            String[] splitted = scanner.nextLine().split(" ");
            Car car = new Car();
            car.setBrand(splitted[0]);
            car.setModel(splitted[1]);
            car.setHorsepower(Integer.parseInt(splitted[2]));
            System.out.printf("The car is: %s %s - %d HP.%n", car.getBrand(), car.getModel(), car.getHorsepower());
        }

    }
}
