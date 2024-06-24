
public class GroceryListDriver {

    public static void main(String[] args) {
        GroceryItem g1 = new GroceryItem("bananas",5);
        GroceryItem g2 = new GroceryItem("apples",5);
        GroceryItem g3 = new GroceryItem("pea soup",2);
        GroceryItem g4 = new GroceryItem("apples",3);
        GroceryItem g5 = new GroceryItem("wheat bread",2);
        GroceryItem g6 = new GroceryItem("tuna fish",5);
        GroceryItem g7 = new GroceryItem("potatoes",4);
        GroceryItem g8 = new GroceryItem("sourdough bread",1);
        GroceryItem g9 = new GroceryItem("chedder cheese",1);
        GroceryItem g10 = new GroceryItem("green tea",1);
        GroceryList groceryList = new GroceryList();
        groceryList.addItem(g1);
        groceryList.addItem(g2);
        groceryList.addItem(g3);
        groceryList.addItem(g4);
        groceryList.addItem(g5);
        groceryList.addItem(g6);
        groceryList.addItem(g7);
        groceryList.addItem(g8);
        groceryList.addItem(g9);
        groceryList.addItem(g10);
        
        groceryList.printGroceryList("Original List");
        System.out.println();
        groceryList.sortList();
        groceryList.printGroceryList("Sorted Grocery List");
        System.out.println();
        groceryList.changeItemCount(5,2);
        groceryList.printGroceryList("Sorted Grocery List after Modification 1");
        groceryList.removeItem(3);
        groceryList.removeItem(7);
        groceryList.printGroceryList("Sorted Grocery List after Modification 1-3");
        System.out.println();
        System.out.println(groceryList.getSize());


        

    }
}