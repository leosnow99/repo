import java.awt.*;
import java.io.*;
import java.math.*;
public class C2 extends Rectangle {
    public static void main(String[] args) throws IOException{
        File file = new File("F:\\program project\\java\\java3\\1\\2.txt");
        try(FileOutputStream output = new FileOutputStream(file);){
            for (int i = 0; i < 10; i++)
                output.write((int)(Math.random()*10));
        }
        try(FileInputStream input = new FileInputStream(file);){
            int value;
           // while ( (value = input.read()) != -1)
           for (int i = 0; i < 20; i++){
                value = input.read();
                System.out.println(value + " ");
           }
        }
    }
}