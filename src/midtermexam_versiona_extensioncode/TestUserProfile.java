/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author eric1
 */
public class TestUserProfile {
    
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter Name");
        String name = input.nextLine();
        
        System.out.println("Please Enter Favorite Genre. "
                + "\nGenres include Comedy, Drama, Action, Mystery");
        String genre = input.nextLine();
        
        
        
        UserProfile prof1 = new UserProfile(name, genre );
        
        
        System.out.println("Success! Profile Created");
        
        
        
        
        
        
        
        
        
        
    }
    
}
