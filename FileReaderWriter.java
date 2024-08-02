package iostreams;

import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("C:\\Users\\LENOVO\\IdeaProjects\\javalearning\\sample.txt");
        BufferedReader bf=new BufferedReader(fileReader);
        FileWriter fileWriter=new FileWriter("text6.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        String lines;
        while((lines=bf.readLine())!=null){
            System.out.println(lines);
            bufferedWriter.write(lines);
            bufferedWriter.newLine();
        }
        System.out.println("file copied successfully");
    }
}
