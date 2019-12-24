package zuoye;
import java.io.*;
import java.util.*;
public class C1 {
    public static void main(String[] args) throws IOException{
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_02.dat", true))) {
            for (int i = 0; i < 100; i++)
                output.writeInt((int)(Math.random() * 10000));
        }
        int[] test1 = {1,2,3,4,5};
        try(ObjectOutputStream test2 = new ObjectOutputStream(new FileOutputStream("object.dat"))) {
            test2.writeObject(test1);
        }


    }
   /*public static void main(String[] args) throws IOException {
       try (
               Formatter output =
                       new Formatter(new FileOutputStream("Exercise17_01.txt", true));
       ) {
           for (int i = 0; i < 100; i++)
               output.format("%d", (int)(Math.random() * 100000));
       }
   }*/
}
