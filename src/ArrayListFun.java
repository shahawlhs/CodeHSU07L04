import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(3);
        testList.add(6);
        testList.add(9);
        testList.add(12);
        System.out.println("Before: " + testList);
        addElement(testList);
        System.out.println("After: " + testList);
    }

    /**
     * If an element is odd, you will add that number + 2 after it
     * [3,6,9,12] -> [3,5,6,9,11,12]
     * @param list
     */
    public static void addElement(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            int elem = list.get(i);
            if (elem %2 != 0){
                list.add(i+1, elem+2);
                i+=2;
            }
        }
    }
}