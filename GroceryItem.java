public class GroceryItem implements  Comparable<GroceryItem> 
{
         private String name;   //grocery item name
         private int count;     // number needed; make sure count is always >= 0

        //set count = 1; set name  = s in following constructor
          public GroceryItem ( String s) {
            this.count = 1;
            this.name = s;
        
           } 

         // set name = s  and set count = initCount  in following constructor
         public GroceryItem ( String s , int initCount) { 
          this.name = s;
          setCount(initCount);
         }  

         public int getCount() { 
         return count;
         }

         public void setCount(int m) {
          if (m<1)
            this.count = 1;
            else
          m = count;
          }
         public String getName() {
          return name;
           }
  
         public int compareTo( GroceryItem  g)  //method done
        {  
              if( name.compareTo(g.getName() ) < 0)
                      return -1;
               else if (name.compareTo(g.getName()) > 0)
                      return 1;
                else
                      return( count -g.count);
           }

          public String toString() {
            return "["+name+", "+count+"]";
          }  // format like [bananas, 3]
        }
