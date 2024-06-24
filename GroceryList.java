import java.util.*;
public class GroceryList
{
 	private LinkedList<GroceryItem>   glist;  //holds GroceryItems

  	public  GroceryList()  {
        glist = new LinkedList<>();
     }   //constructor that instantiates glist to  an empty GroceryList

  	public int getSize() { 
        return glist.size();
     }  // return number of GroceryItems in glist

 	 public GroceryItem getItem(int k) {
        return glist.get(k);
     } //return GroceryItem at index k on glist

  	public void addItem(GroceryItem  x)  {  
        glist.add(x);
    }   //add GroceryItem  x to end of glist

  	public GroceryItem  removeItem(int k )  { 
       return  glist.remove(k);
        
     }   //Remove item at index k from glist

  	public void changeItemCount(int k, int m) 
    {
    glist.get(k).setCount(m);;
 	  //change item count for kth item in glist to m
	 }											

  	public void  printGroceryList(String label)  
  	{
  	     /* Print all the items in the GroceryList, three items per line. The last line with items 
        	       may have 3 or fewer items. Use a ListIterator for glist to solve this problem*/
                   ListIterator<GroceryItem> itr1 = glist.listIterator();
                   int countnum = 0;
                   System.out.println(label);
                   while(itr1.hasNext()){
                     System.out.println(itr1.next() + " ");
                     countnum++;
                     if(countnum==3){
                        System.out.println();
                        countnum = 0;
                     }
                   }

  	}

   	public void sortList( ) { 
         glist.sort(null);
         }  //Should work as is

 }
