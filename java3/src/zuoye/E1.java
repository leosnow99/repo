package zuoye;
import java.util.*;
import java.text.DateFormat;

public enum E1 {
    DATA_TIM{
        String getInfo() {
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    ClassPath{
        String getInfo(){
            return System.getenv("CLASSPATH");
        }
    },
    VersIon{
        String getInfo(){
            return System.getProperty("java.version");
        }
    };
    abstract String getInfo();

    public static void main(String[] args) {
        for(E1 e: values())
            System.out.println(e.getInfo());
    }
}
