package iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NoOfLinesChars {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("sample.txt");
        int data=0,ch=0,words=1,lines=1;
        while((data=fileInputStream.read())!=-1){
            ch++;
            if((char)data==' '){
                words++;
            }
            if((char)data=='\n'){
                lines++;
            }
        }
        words=words+lines-1;
        System.out.println("character:"+ch+"\nWords:"+words+"\nLines:"+lines);
    }
}
