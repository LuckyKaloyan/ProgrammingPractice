package SoftUniJava.EntryModule.FirstStepsInCoding.FirstStepsInCodingExcercise;

        import java.util.Scanner;
public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int result = (pages/pagesPerHour)/days;


        System.out.println(result);


    }
}