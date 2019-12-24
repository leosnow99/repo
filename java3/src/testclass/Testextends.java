package testclass;

public class Testextends extends Mill {
    public Testextends(String s){
        System.out.println("s");
    }

    public Testextends(){
        System.out.println("wucan");
    }
    public static void main(String[] args) {
        /*System.out.println("test one:");
        Testextends ab = new Testextends();
        System.out.println(ab.g(1));
        //System.out.println(ab.f(1));
        System.out.println("the private shu ju yu:"  + " " + ab.a);*/
        Testextends t1 = new Testextends("sss");
        Mill mii = new Mill();
        Mill.testclass nii1 = new testclass();

    }
}

class Grain{
    Grain(){}
    public String toString() {return "Grain";}

}
class Wheat extends Grain{
    Wheat(){
        System.out.println("wheat is creat");
    }
    public String toString() {return "Wheat";}
}
class Mill {
    Mill() {
        System.out.println("wucan fu");
    }
    static Wheat wheats = new Wheat();
    public Mill(String s){
        System.out.println("s");
    }

    static class testclass{
        testclass(){
            System.out.println("123");
        }
    }
    public Grain process() {
        return new Grain();
    }
    public int green(){ return  1;}

    public static Mill.testclass mi = new testclass();

}


