package Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for(int i = 0; i < numbers; ++i) {
            String[] splitted = scanner.nextLine().split(" ");
            Car car = new Car();
            car.setBrand(splitted[0]);
            car.setModel(splitted[1]);
            car.setHorsepower(Integer.parseInt(splitted[2]));
            cars.add(car);
        }

        for(Car car:cars){
            System.out.println(car.toString());
        }
    }
}
