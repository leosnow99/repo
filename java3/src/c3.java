import java.util.Scanner;
public class c3 {
    public static void main(String[] args) {
        boolean te = false;
        do{
            System.out.println("Enter a URL: ");
            String URLString = new Scanner(System.in).next();
            try{
                java.net.URL url = new java.net.URL(URLString);
                int count = 0;
                int linecount = 0;
                Scanner input = new Scanner(url.openStream());
                while (input.hasNext()){
                    String line = input.nextLine();
                    linecount++;
                    count += line.length();
                }
                System.out.println("The file size is " + count + " characters" + "The linecount is: " + linecount);
            }

            catch (java.net.MalformedURLException ex){
                System.out.println("Invalid URL");
                te = true;
            }

            catch (java.io.IOException ex){
                System.out.println("IO errors : no such file");
                te = true;
            }
        }while(te);
    }
}
