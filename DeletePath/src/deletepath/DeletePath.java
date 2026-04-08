/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deletepath;

import java.nio.file.*;
import java.io.IOException;

/**
 *
 * @author RC_Student_lab
 */
public class DeletePath {

    public static void main(String[] args) throws IOException {
        
        //This will take the file address and import it to the project.
        Path myPath = Paths.get("C:\\Users\\RC_Student_lab\\Documents\\NetBeansProjects");
        int count = myPath.getNameCount();
        
        //This will display the path.
        System.out.println("Path is " + myPath.toString());
        
        try{
            Files.delete(myPath);
            System.out.println("File or directory is deleted.");
        }catch (NoSuchFileException e){
        
        //This will show the file name.
        System.out.println("No such file file or directory");
        }catch (DirectoryNotEmptyException e) {
            
        //This will tell the user the amount of elements there are within the path(User, RC Student, Docs, and NetBeans).
        System.out.println("Directory not empty");
        }catch (SecurityException e){
            
        System.out.println("");
        //This will display what number the element is. 
        for (int x = 0; x < count; ++x){
            System.out.println("Element " + x + " is " + myPath.getName(x));
            }
        
        }
    }
}