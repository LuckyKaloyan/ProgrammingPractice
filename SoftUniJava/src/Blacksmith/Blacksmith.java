package Blacksmith;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
public class Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[]steel = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       int[]carbon = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> steelqueue = new ArrayDeque<>();
        ArrayDeque<Integer>carbonstack = new ArrayDeque<>();

        for(int i=0; i<steel.length; i++){
            steelqueue.add(steel[i]);
        }
        for(int i=0; i<carbon.length; i++){
            carbonstack.push(carbon[i]);
        }
        int gladius = 0;
        int shamshir = 0;
        int katana = 0;
        int sabre = 0;


        while(!steelqueue.isEmpty() && !carbonstack.isEmpty()){

            int steelvalue = steelqueue.peek();
            int carbonvalue = carbonstack.peek();

            if(steelvalue+carbonvalue==70){
                   gladius++;
                   steelqueue.poll();
                   carbonstack.pop();
            }else if(steelvalue+carbonvalue==80){
                shamshir++;
                steelqueue.poll();
                carbonstack.pop();
            } else if(steelvalue+carbonvalue==90){
                katana++;
                steelqueue.poll();
                carbonstack.pop();
            } else if(steelvalue+carbonvalue==110){
                sabre++;
                steelqueue.poll();
                carbonstack.pop();
            }else{
                steelqueue.poll();
                int newcarbon = carbonstack.pop()+5;
                carbonstack.push(newcarbon);
            }
        }
        int total = gladius+shamshir+katana+sabre;
        if(total>0){
            System.out.println("You have forged "+total+" swords.");
        }else{
            System.out.println("You did not have enough resources to forge a sword.");
        }
        if(steelqueue.isEmpty()){
            System.out.println("Steel left: none");
        }else{
            System.out.print("Steel left: ");
            for(int i=0; i<steelqueue.size(); i++){

                    System.out.print(steelqueue.poll() + ", ");
            }
            System.out.print(steelqueue.peek());
        }

        if(carbonstack.isEmpty()){
            System.out.println("Carbon left: none");
        }else{
            System.out.print("Carbon left: ");
            for(int i=0; i<=carbonstack.size(); i++){
                    System.out.print(carbonstack.poll()+", ");
            }
            System.out.print(carbonstack.peek());
            System.out.println();
        }

        if(gladius!=0){
            System.out.println("Gladius: "+gladius);
        }
        if(katana!=0){
            System.out.println("Katana: "+katana);
        }
        if(sabre!=0){
            System.out.println("Sabre: "+sabre);
        }
        if(shamshir!=0){
            System.out.println("Shamshir: "+shamshir);
        }




    }
}
