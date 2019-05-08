/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }


    /**
      precondition: elements has been initialized
      postcondition: elements is sorted
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        for( int index = 1
           ; index < elements.size()
           ; insert1( index)
           , index++);
    }

    /**
      precondition: elements is sorted up to index i - 1
      postcondition: elements is sorted up to index 1
      inserts element i in the appropriate space in the sorted region
     */
    private void insert1( int i) {
        String valueToInsert = elements.get(i);
        int checkingIndex = i - 1;
        for(
           ; checkingIndex > -1 && valueToInsert.compareTo(elements.get(checkingIndex)) < 0
           ; elements.set(checkingIndex + 1, elements.get(checkingIndex))
           , checkingIndex--);
        elements.set( checkingIndex + 1, valueToInsert);
    }
}
