public class GenericSort {
    public static void main(String[] args) {
        Integer[] intarray = {new Integer(4), new Integer(3), new Integer(2)};
        Double[] doublearray = {new Double(3.0),new Double(4)};
        Character[] caracterarray = {new Character('a'),new Character('b'),new Character('v')};
        String[] stringaray = {"abc", "bcd", "efg"};
        sort(intarray);
        sort(doublearray);
        sort(caracterarray);
        sort(stringaray);
        printList(intarray);
        printList(doublearray);
        printList(caracterarray);
        printList(stringaray);
    }
    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currenMindex;
        for(int i = 0; i < list.length - 1; i++){
            currentMin = list[i];
            currenMindex = i;
            for (int j =i + 1; j < list.length; j++){
                if (currentMin.compareTo(list[j]) > 0){
                    currentMin = list[j];
                    currenMindex = j;
                }

            }
            if (currenMindex  != i){
                list[currenMindex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    public static void printList(Object[] llist){
        for (int i = 0; i<llist.length; i++){
            System.out.print(llist[i] + " ");
        }
        System.out.println();
    }
}
