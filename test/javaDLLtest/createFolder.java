import java.io.File;

public class createFolder {
    public static void main(String[] args) {
        String path = "C:/student-playgroundV3";
        String DLLpath = "C:/student-playgroundV3/DLL";

        File folder = new File(path);
        File DLLfolder = new File(DLLpath);

        if (folder.mkdirs()){
            System.out.println("creating folder at:" + path);
        } else {
            System.out.println("found folder at:" + path);
        }

        if (DLLfolder.mkdirs()){
            System.out.println("creating DLLfolder at:" + DLLpath);
        } else {
            System.out.println("found DLLfolder at:" + DLLpath);
        }
    }
}
