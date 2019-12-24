package twenty;

public class Paixu {
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int currentempt = list[i];
            int k;
            for (k = i - 1; k >= 0&&list[k] > currentempt; k--){
                list[k + 1] = list[k];
            }
            list[k + 1] = currentempt;
        }
//        插入排序 算法复杂度O（n2）；

    }

    public static void bubbleSort(int[] list){
        boolean haspass = true;
        for (int i = 1; i < list.length && haspass;i++){
            haspass = false;
            for (int k = 0; k < list.length - i ;k++){
                if (list[k] > list[k + 1]){
                    int temp = list[k + 1];
                    list[k + 1] = list[k];
                    list[k] = temp;

                    haspass = true;
                }
            }
        }
//        冒泡排序
    }

    public static void mergeSort(int[] list){
        if(list.length > 1){
//            firsthalf
            int[] firsthalf = new int[list.length / 2];
            System.arraycopy(list, 0, firsthalf, 0, list.length / 2);
            mergeSort(firsthalf);
//            the second half
            int secondHalflength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalflength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalflength);
            mergeSort(secondHalf);

//            paixu
            merge(firsthalf, secondHalf, list);
        }
    }

    public static void merge(int[] list1, int[] list2, int[] temp){
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        while(index1 < list1.length && index2 < list2.length){
            if(list1[index1] < list2[index2])
                temp[index3++] = list1[index1++];
            else
                temp[index3++] = list2[index2++];
        }
        while(index1 < list1.length)
            temp[index3++] = list1[index1++];
        while (index2 < list2.length)
            temp[index3++] = list2[index2++];
        //    归并排序 算法复杂读O(nlogn);
    }

    public static void quickSort(int[] list){
        quickSort(list, 0, list.length -1);
    }

    public static void quickSort(int[] list, int first, int last){
        if (last > first){
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }

    }

    public static int partition(int[] list, int first, int last){
        int pivot = list[first];
        int low = first;
        int high = last;
        while (high > low){
            while (low <= high && list[low] <= pivot)
                low++;
            while (high >= low && list[high] >= pivot)
                high--;

            if(high > low){
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        /*while(high > first && list[high] >= pivot)
            high--;*/
        if(pivot >= list[high]){
            list[first] = list[high];
            list[high] = pivot;
            return high;

        }
        else
            return first;//所有元素比主元大
//        快速排序 算法复杂度(nlogn);
    }

    public static <E extends Comparable<E>> void heapSort(E[] list){
        Heap<E> heap = new Heap<>();

        for (int i = 0; i < list.length; i++)
            heap.add(list[i]);

        for (int i = list.length - 1; i > -1; i--)
            list[i] = heap.remove();
//         堆排序
    }

//    测试
    public static void main(String[] args) {
        System.out.println("插入排序");
        int[] t1 = {2,7,3,9,1};
        for (int element:t1)
            System.out.print(element + " ");
        System.out.println();

        Paixu.insertionSort(t1);

        System.out.print("排序后：");
        for (int element:t1)
            System.out.print(element + " ");

//        测试冒泡
        System.out.println();
        System.out.println("冒泡");
        int[] t2 = {45, 11, 50, 59, 60, 2, 4, 7,10};
        for (int elements: t2) {
            System.out.print(elements + " ");
        }
        System.out.println();
        System.out.print("排序后：");

        Paixu.bubbleSort(t2);

        for (int element: t2) {
            System.out.print(element + " ");
        }

//       测试归并
        System.out.println();
        System.out.println("归并排序");
        int[] t3 = {45, 11, 50, 60, 2, 4, 7, 10};
        for (int elements : t3)
            System.out.print(elements + " ");
        System.out.println();
        System.out.print("排序后: ");

        Paixu.mergeSort(t3);

        for (int elements:t3) {
            System.out.print(elements + " ");
        }

//      测试快速排序
        System.out.println();
        System.out.println("快速排序");
//        int[] t4 = {45, 11, 50, 59, 60, 45, 4, 7, 10};
        int[] t4 = {45, 49, 48};
        for (int elements : t4)
            System.out.print(elements + " ");
        System.out.println();
        System.out.print("排序后: ");

        Paixu.quickSort(t4);

        for (int elements : t4)
            System.out.print(elements + " ");

//        测试堆排序
        System.out.println();
        System.out.println("");
        int[] t5 = {45, 11, 50, 59, 60, 2, 4, 7, 10};
        for (int elements : t5)
            System.out.print(elements + " ");
        System.out.println();
        System.out.print("排序后: ");

        Paixu.quickSort(t5);

        for (int elements : t5)
            System.out.print(elements + " ");

    }
}

class Heap<E extends Comparable<E>>{
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public Heap(){
    }

    public Heap(E[] objects){
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    public void add(E newObject){
        list.add(newObject);
        int currenIndex = list.size() - 1;

        while (currenIndex > 0){
            int parentIndex = (currenIndex - 1) / 2;
            if (list.get(currenIndex).compareTo(list.get(parentIndex)) > 0){
                E temp = list.get(currenIndex);
                list.set(currenIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
            }
            else
                break;

            currenIndex = parentIndex;

        }
    }

    public E remove() {
        if (list.size() == 0)
            return null;

        E removeable = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int currentIndex = 0;
        while(currentIndex < list.size()){
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;
            if (leftChildIndex >= list.size())
                break;
            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size()){
                if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0){
                    maxIndex =rightChildIndex;
                }
            }

            if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0){
                E temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = maxIndex;
            }
            else
                break;

        }

        return removeable;
    }

    public int getSize(){
        return list.size();
    }

}


















