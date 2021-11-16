package Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Singleton {

    private static Singleton object;
    //"object" nesnesi, Nesne değişkeni değil, sınıf değişkeni olmalıdır,
    //bu nedenle "static" olmalıdır.
    
    //Global erişim noktası sağlamak için gerekli metotlar:
    private Singleton(){
    }
    public static Singleton getInstance(){
        
        if (object == null){  
            object = new Singleton();  
        }  
        return object;
    }
    public List<String> getSozluk() throws FileNotFoundException {
        Scanner fileReader = new Scanner(new FileInputStream("metin.txt"));
        List<String> sozluk = new ArrayList<>();
        while (fileReader.hasNextLine()) {
            sozluk.add(fileReader.nextLine());
        }
        return sozluk;
    }
}
