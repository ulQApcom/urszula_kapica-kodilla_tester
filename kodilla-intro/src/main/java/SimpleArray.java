public class SimpleArray {
    public static void main(String[] args) {
        String[]dishes= new String[5];
        dishes[0]="pizza";
        dishes[1]="pasta";
        dishes[2]="seafood";
        dishes[3]="sushi";
        dishes[4]="salad";

        String dish=dishes[3];
        System.out.println(dish);

        int numberOfElements = dishes.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
        }

    }
