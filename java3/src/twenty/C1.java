package twenty;
import javax.xml.transform.sax.SAXSource;
import java.util.*;
import java.io.*;
public class C1 {
    public static void main(String[] args) throws Exception{
        /*ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("NEW YEORK");
        collection1.add("TEST!");
        collection1.add("Madison");*/
       /* List<String> alist1 = new ArrayList<>();
        alist1.add("blue");
        alist1.add("test");
        List<String> alist2 = new ArrayList<>();
        alist2.add("blue");
        alist2.add("yellow");
        alist1.add("2");
        alist1.addAll(alist2);
        System.out.println("aslite1");
        *//*ListIterator<String> ite = alist1.listIterator();
        while (ite.hasNext()){
            System.out.print(ite.next() + " ");
        }*//*
        for (String elements:alist1)
            System.out.print(elements + " ");
        System.out.println("alist2");
        for (String element:alist2)
            System.out.print(element + " ");*/

        /*
//        test diedai;
        Iterator<String> ite = collection1.iterator();
        while(ite.hasNext()){
            System.out.print(ite.next() + " ");
        }
//        test foreach
        System.out.println("--------------------");
        for(String elements: collection1){
            System.out.print(elements + " ");
        }
*/
//        create new collection
/*        ArrayList<String> collection2 = new ArrayList<>();
        collection2.add("TEST!");
        collection2.add("t1");
//        test collection
        System.out.println("c1 is: " + collection1);
        System.out.println("c2 is: " + collection2);
        System.out.println("c1 包含 c2" + collection1.containsAll(collection2));
        System.out.println("c1 + c2" + collection1.addAll(collection2));
        System.out.println("qiujiao: " + collection1.retainAll(collection2));
        System.out.println("c1 is: " + collection1.hashCode());*/
        /*ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("F:\\test\\c1.dat"));
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("New york");
        LinkedHashSet<String> set2 = (LinkedHashSet<String>)set1.clone();
        set1.add("Xinzheng");
        output.writeObject(set1);
        output.writeObject(set2);
        output.close();
//        输出
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("F:\\test\\c1.dat"));
        set1 = (LinkedHashSet<String>)input.readObject();
        set2 = (LinkedHashSet<String>)input.readObject();
        input.close();
        System.out.println(set1);
        System.out.println(set2);*/
        Map<String, String> map = new LinkedHashMap<>();
        map.put("123","John Smith");
        map.put("111","George");
        map.put("123","Steve Yao");
        map.put("222","Steve Yao");
        System.out.println("(1):" + map);
        map.put("111", "leo");
        System.out.println("(3): " + map.put("111", "leo"));
        System.out.println(map);
        System.out.println("(2):" + new TreeMap<String, String>(map));
        System.out.println( );
    }
}
