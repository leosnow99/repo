package testclass;

class Super {

    public int getLength() { return 4; }

}

public class Sub extends Super {

    public  int getLength() { return 5; }

    public static void main (String[]args) {

        Super sooper = new Super ();

        Super sub = new Sub();

        System.out.println(sooper.getLength()+ "，"+ sub.getLength() ); }

}