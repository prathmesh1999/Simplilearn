
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    
	FileOperations op=new FileOperations();
    public Menu() {
      
    }



    void mainMenu() {
    	System.out.println();
		System.out.println(" ***********************");
		System.out.println(" |        Menu         |");
		System.out.println(" |*********************|");
		System.out.println(" |1. List All Files    |");
		System.out.println(" |2. More Options      |");
		System.out.println(" |3. Exit              |");
		System.out.println(" ***********************");
        
        try{
        	System.out.print("Enter your choice: ");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice){
                case 1 : {
                    op.listAllFiles();
                    mainMenu();
                }
                case 2 : {
                    subMenu();
                }
                case 3 : {
                   System.out.println();
  				   System.out.println(" ********** THANK YOU!! **********");
  				   System.out.println(" |                               |");
  				   System.out.println(" |  Visit Again To LockedMe.com  |");
  				   System.out.println(" |                               |");
  				   System.out.println(" *********************************");
                    System.exit(0);
                }
                default: mainMenu();
            }
        }
        catch (Exception e){
        	System.out.println("**********************************************\n");
            System.out.println("Invalid Choice!! Enter Correct choice.");
        	System.out.println("\n***********************************************");
            mainMenu();
        }
    }

    void subMenu() {
    	System.out.println();
    	System.out.println(" ***********************");
		System.out.println(" |       Sub Menu      |");
		System.out.println(" |*********************|");
		System.out.println(" |1. Create New File   |");
		System.out.println(" |2. Delete File       |");
		System.out.println(" |3. Search File       |");
		System.out.println(" |4. <-Go Back         |");
		System.out.println(" ***********************");
       
        try{
        	System.out.print("Enter your choice: ");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();

            switch (choice){
                case 1 : {
                    System.out.print("Enter file Name to create : ");
                    String filename = s.next().trim().toLowerCase();
                    op.createNewFile(filename);
                    break;
                }
                case 2 : {
                    System.out.print("Enter File name to delete: ");
                    String filename = s.next().trim();
                    op.deleteFile(filename);
                    break;
                }
                case 3 : {
                    System.out.print("Enter a file name to Search : ");
                    String filename = s.next().trim();
                    op.searchFile(filename);
                    break;
                }
                case 4 : {
                   
                    mainMenu();
                    break;
                }
                default : System.out.println("Invalid choice!! Enter Valid Choice");
            }
            subMenu();
        }
        catch (Exception e){
        	System.out.println("**********************************************\n");
            System.out.println("Invalid choice!! Enter Valid Choice");
            System.out.println("\n**********************************************");
            subMenu();
        }
    }
}
