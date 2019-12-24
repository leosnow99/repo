package twenty;
import java.util.*;
public class C2 {
    public static void main(String[] args)throws CloneNotSupportedException {
        tete a = new tete(3);
        tete b = new tete(4);
        test1(a,b);
        a.out();
        b.out();

    }
    public static void test1(tete a1,tete a2) throws CloneNotSupportedException{
        tete temp = new tete();
        temp = (tete)a1.clone();
        a1 = (tete)a2.clone();
        a2 = (tete)temp.clone();
    }
}
class tete implements Cloneable{
    public int a;
    public tete(){
        a = 0;
    }
    public tete(int aa){
        a = aa;
    }
    public void out(){
        System.out.println(a);
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
