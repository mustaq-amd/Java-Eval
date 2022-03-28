package com.masai.practice.filehandling;

import java.io.*;
import java.util.*;

public class SerializationDeserialization implements Serializable {

    public static void main(String[] args) throws IOException {

        List<Map> list=new ArrayList<>();

        Map<String,String> map=new LinkedHashMap<>();

        map.put("name","Mustaq");
        map.put("mobile","12345");
        map.put("batch","java");

        list.add(map);

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("file1.txt"));
        oos.writeObject(list);

        oos.flush();
        oos.close();

        System.out.println("done");
        deserializingAnObject();
    }

    static void deserializingAnObject() throws IOException {

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file1.txt"));

        try {

//           Map<String,String> map= (Map<String, String>) ois.readObject();
//            Map map= (Map) ois.readObject();

//            Set<Map.Entry<String, String>> entries= map.entrySet();
//
//            for (Map.Entry<String, String> entry:entries) {
//                System.out.println(entry.getKey()+"------------>"+entry.getValue());
//            }

            List list=(List)ois.readObject();
            System.out.println(list);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

    }

}




