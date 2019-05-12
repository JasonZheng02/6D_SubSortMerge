import java.util.ArrayList;
import java.util.Arrays;

public class SubSortThenMerge extends Sorter{
    
    public SubSortThenMerge( ArrayList<String> usersData) {
        super(usersData);
        this.mySort();
    }   
        
    public void mySort() {
        subSortMerge(elements);
    }
    
    public void subSortMerge(ArrayList<String> unsorted) {
        if (unsorted.size() == 1){
            System.out.println(unsorted);
        }
        else {
            ArrayList<String> firstHalf = new ArrayList<String>();
            ArrayList<String> secondHalf = new ArrayList<String>();
            for (int index = 0; index < unsorted.size() / 2; index++) {
                firstHalf.add(unsorted.get(index));
            }
            for (int index = unsorted.size() / 2; index < unsorted.size(); index++) {
                secondHalf.add(unsorted.get(index));
            }
            subSortMerge(firstHalf);
            subSortMerge(secondHalf);
        }
    }



}