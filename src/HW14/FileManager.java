package HW14;

import java.io.*;

public class FileManager {

           private static void exists(String ourFile) throws FileNotFoundException {
               File file = new File(ourFile);
               if (!file.exists()) {
                   System.out.println("Такой файл не существует!");
                   throw new FileNotFoundException(file.getName());
               }
           }

public static void write(String path, String text){
    File file = new File(path);
 try{
     if(!file.exists()){
         file.createNewFile();
         System.out.println("Файл: "+file.getName()+", создан!");
     }
     PrintWriter out = new PrintWriter(file.getAbsoluteFile());
     try{
         out.print(text);
     }finally {
         out.close();
     }
 }catch (IOException e){
     System.out.println("Что-то пошло не так...\n***Метод записи***");
     throw new RuntimeException(e);
 }
}

    public static String read(String path) {
        StringBuilder sb = new StringBuilder();
        File file = new File(path);
        file.exists();
        try {BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String wh;
                while ((wh = in.readLine()) != null) {
                    sb.append(wh);
                    sb.append("\n");
                }
            } finally {in.close();}
        } catch(IOException e) {
            System.out.println("Что-то пошло не так...\n***Метод считывания***");
            throw new RuntimeException(e);}
        return sb.toString();
    }

    public static void update(String path, String newText){
        File file = new File(path);
        file.exists();
        StringBuilder sb = new StringBuilder();
        String oldFile = read(path);
        sb.append(oldFile);
        sb.append(newText);
        write(path, sb.toString());
    }
    public static void delete(String path){
        File file = new File(path);
        file.exists();
        new File(path).delete();
        System.out.println("Файл: "+file.getName()+", удалён!");
    }

}
