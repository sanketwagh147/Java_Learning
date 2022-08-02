package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        GroceryList list = new GroceryList();

        boolean quit = false;
        
        
    }

    // private ArrayList<int> groceryList = new ArrayList<int>();
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGrocery(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + "items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + "element is " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("grocery item is modified at " + ( position + 1 )); 

    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem){
        boolean exists = groceryList.contains(searchItem);
        // search by index 
        int position = groceryList.indexOf(searchItem);

        if (position >= 0 ) groceryList.get(position);
        return null;
    }
}

