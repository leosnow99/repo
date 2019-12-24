import java.io.*;
import java.util.Scanner;
public class T1 {
    int test1 =1;
    public static void main(String[] args) throws Exception {
        File file = new File("F:\\test\\12.txt");
        if(file.exists())
            System.out.println("存在");
        else
            System.out.println("不存在");
        nprintln("666",5);
        //test isPalindrome
        System.out.println("moon is a palindrome?" + isPalindrome("moon"));
        System.out.println("test is a palindrome?" + isPalindrome("test"));
        System.out.println("foof is a palindrome?" + isPalindrome("foof"));
        double[] test1 = {1,2,7,3,1,3,9,2};
        //test sort
        sort(test1);
        for(int i = 0; i<(test1.length); i++){
            System.out.println(test1[i]);
        }
        System.out.println();
        System.out.println("You look for the location of the number is:" + (recursiveBinarySearch(test1,3) + 1));
        System.out.println();
        for (double e:test1){
            System.out.println(e);
        }
        File files = new File("G:\\bizhi\\wallpaper_engine\\locale");
        System.out.println("The file has:" + getSiza(files) + "bytes");
        T1 test12 = new T1();
        test12.test2();
        System.out.println(test12.test1);
    }
//    方法体
//    输出递归
    public static void nprintln(String message, int times){
        if (times >= 1){
            System.out.println(message);
            nprintln(message,times - 1);
        }// The base case is times == 0;i
    }
//    回文串递归
    /*public static boolean isPalindrome(String s){
        if (s.length() <= 1)
            return true;
        else if(s.charAt(0) != s.charAt(s.length() - 1))
        return false;
        else
        return isPalindrome(s.substring(1,s.length() - 1));*/

    public static boolean isPalindrome(String s){
        return isPalindrome(s,0,s.length()-1);
    }

    public static boolean isPalindrome(String s, int low, int high){
        if (high <= low)
            return true;
        else if (s.charAt(low) != s.charAt(high))
            return false;
        else
            return isPalindrome(s, low+1, high-1);
    }
//排序递归
    public static void sort(double[] list){
        sort(list, 0, list.length - 1);
    }

    public static void sort(double[] list, int begain, int end){
        if(begain < end){
            int indexOfMin = begain;
            double min = list[begain];
            for (int i = begain + 1; i < end; i++){
                if(list[i] < min){
                    min = list[i];
                    indexOfMin = i;
                }
            }
//            swap the smallest in list[begin .. end] with [low]
            list[indexOfMin] = list[begain];
            list[begain] = min;
            sort(list, begain + 1, end);
        }
    }
//    二分查找递归
    public static int recursiveBinarySearch(double[] list, double key){
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, low, high, key);
    }

    public static int recursiveBinarySearch(double[] list, int low, int high, double key){
        if(low > high)
            return -low - 1;
        int mid = (low + high) / 2;
        if(key < list[mid])
            return recursiveBinarySearch(list,low,mid-1, key);
        else if(key > list[mid])
            return  recursiveBinarySearch(list,mid+1,high,key);
        else
            return mid;

    }

    public static long getSiza(File file){
        long size = 0;
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; files != null && i < files.length; i++) {
                size += getSiza(files[i]);
            }
        }
        else{
                size += file.length();
            }
            return size;
    }
    public  void test2(){
        test1 = 2;
    }

}


