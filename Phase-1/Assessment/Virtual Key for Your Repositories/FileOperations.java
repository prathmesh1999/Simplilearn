import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileOperations {
	static String Path;
    File files;

    public FileOperations() {
        Path = System.getProperty("user.dir");
        files = new File(Path+"/ProjectFiles");
        if (!files.exists())
            files.mkdirs();
        
    }
    // Display all files
    void listAllFiles() {
        if (files.list().length==0)
            System.out.println("Files are not found at "+files);
        else {
            String[] list = files.list();
            System.out.println("************************************************\n");
            System.out.println("The files in "+ files +" are :\n");
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
            System.out.println("\nTotal files are : "+list.length);
            System.out.println("\n************************************************");

        }
    }
    	//Creating new file
    void createNewFile(String filename) throws IOException {
        File filepath = new File(files +"/"+filename);
        String[] list = files.list();
        
        for (String file: list) {
            if (filename.equalsIgnoreCase(file)) {
            	System.out.println("**********************************************************************\n");
                System.out.println(filename + " File already exists at " + files);
                System.out.println("\n**********************************************************************");
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("***************************************************************\n");
        System.out.println(filename+" File Succesfully Created at "+ files);
        System.out.println("\n***************************************************************");
    }
    	//Delete file
    void deleteFile(String filename) {
        File filepath = new File(files +"/"+filename);
        String[] list = files.list();
        
        for (String file: list) {
            if (filename.equals(file) && filepath.delete()) {
            	System.out.println("*******************************************\n");
                System.out.println(filename + " File Deleted Succesfully.");
                System.out.println("\n*******************************************");
                return;
            }
        }
        System.out.println("**********************************\n");
        System.out.println("FILE NOT FOUND");
        System.out.println("\n**********************************");
    }

    void searchFile(String filename) {
        String[] list = files.list();
        
        for (String file: list) {
            if (filename.equals(file)) {
            	System.out.println("****************************************************************\n");
                System.out.println(filename +" File found at loaction: " + files);
                System.out.println("\n****************************************************************");
                return;
            }
        }
        System.out.println("**********************************\n");
        System.out.println("FILE NOT FOUND");
        System.out.println("\n**********************************");
    }
}
