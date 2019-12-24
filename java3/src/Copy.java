import java.io.*;
public class Copy {
    public static void main(String[] args) throws IOException {
        if (args.length !=2){
            System.out.println("Usage: java copy sourceFile targetfile");
            System.exit(2);
        }

        //check source file exists
        File sourceFile = new File(args[0]);
        if(!sourceFile.exists()){
            System.out.println("source file " + args[0] + " does not exists!");
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if(!targetFile.exists()){
            System.out.println("source file " + args[1] + " does not exists!");
            System.exit(2);
        }

        try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile))){
            int r, numberOfbytesCopied = 0;
            while (((r = input.read()) != -1)){
                output.write((byte)r);
                numberOfbytesCopied++;
            }
            System.out.println(numberOfbytesCopied + "bytes copied");
        }
    }
}
