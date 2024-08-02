package iostreams;

import java.io.*;

public class FileInputOutput {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("sample.txt");
//        String s = "kabilan";
//        byte[] bytes = s.getBytes();
//        fileOutputStream.write(bytes);
        FileInputStream fileInputStream=new FileInputStream("sample.txt");
        int i=0;
//        while((i=fileInputStream.read())!=-1) {
//            System.out.print((char) i);
//        }
        BufferedInputStream bf=new BufferedInputStream(fileInputStream);
        while ((i=bf.read())!=-1){
            System.out.print((char)i);
        }

    }
}
