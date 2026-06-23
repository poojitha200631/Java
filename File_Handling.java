import java.io.File;
public class File_Handling {
    public static void main(String[] args) {
        try {
            File Data = new File("sample.java");
        System.out.println(Data.getName());
        System.out.println(Data.getAbsolutePath());
        System.out.println(Data.canRead());
        System.out.println(Data.canWrite());
        System.out.println(Data.canExecute());
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
