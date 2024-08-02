package iostreams;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1=new Student("kabilan",19);
        FileOutputStream fo=new FileOutputStream("text1.txt");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fo);
        objectOutputStream.writeObject(s1);
        fo.close();
        FileInputStream fileInputStream = new FileInputStream("text1.txt");
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Student s2=(Student) objectInputStream.readObject();
        System.out.println("name: " + s2.name +"\n"+"age: "+s2.age);
    }
}
