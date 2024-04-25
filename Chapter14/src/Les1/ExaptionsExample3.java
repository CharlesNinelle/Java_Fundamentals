package Les1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExaptionsExample3 {
    public static void main(String[] args) {
        String a="C:\\Users\\Intec\\Decstop\\exeptions.docs";
        try {
            FileInputStream fis = new FileInputStream(a);
            System.out.println("Deze file bestaat");
        } catch (FileNotFoundException exception) {
            System.out.println("Exception :" + exception);
        }
    }
}
