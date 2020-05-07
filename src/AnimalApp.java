import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
/* The AnimalApp class is an implementation of an assignment from Java Web Bootcamp
*  This application accepts builds an inventory for a fictitious pet store
*     and the pet listing is created by user input
*/
public class AnimalApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Animal animal = null;
        String name = "";
        String type = "";
        String desc = "";
        double price = 0.0;
        boolean inStock = true;
        Integer counter = 1;
        HashMap<Integer,Animal> pets = new HashMap<Integer,Animal>();
        boolean done = false;

        String ans = "";
        do {
            System.out.print("Enter animal name: ");
            name = keyboard.nextLine();
            System.out.print("Enter type of animal: ");
            type = keyboard.nextLine();
            System.out.print("Enter description of animal: ");
            desc = keyboard.nextLine();
            System.out.print("Enter price of animal: ");
            price = keyboard.nextDouble();
            keyboard.nextLine();
            System.out.print("Do you have this animal in stock? ");
            System.out.print("Y/N: ");
            ans = keyboard.nextLine();
            if (ans.toUpperCase().equals("Y")) {
                inStock = true;
            }
            animal = new Animal(name, type, desc, price, inStock);
            pets.put(counter,animal);
            counter++;
            System.out.print("Would you like to enter another animal? ");
            System.out.print("Y/N: ");
            ans = keyboard.nextLine();
            if (ans.toUpperCase().equals("N")) {
                done = true;
            }
        } while (!done);
 
        int recCount = 1;
        for (Map.Entry<Integer,Animal> pet: pets.entrySet() ) {
            System.out.println("Key: " + pet.getKey() +  " Record: " + recCount + "\n" + pet.getValue().getPet());
            recCount++;
        }
    }
}
