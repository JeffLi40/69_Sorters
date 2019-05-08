import java.util.ArrayList;

public class SelectionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList< String> usersData) {
        super(usersData);
    }


    /**
      precondition: elements has been initialized
      postcondition: elements is sorted
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        for( int index = 0
           ; index < elements.size() - 1
           ; index++) {
             int champIndex = champIndex(index);
             elements.set( champIndex, elements.set( index, elements.get(champIndex)));
           }
    }

    /**
      Precondition: elements has been initialized
      postcondition: none
      @return the index of the smallest element whose index is greater than or equal to the argument
     */
    private int champIndex( int i) {
        int minIndex = i;
        for( int checkingIndex = i + 1
           ; checkingIndex < elements.size()
           ; checkingIndex++) {
             if( elements.get(minIndex).compareTo(elements.get(checkingIndex)) > 0)
                 minIndex = checkingIndex;
           }
        return minIndex;
    }
}
