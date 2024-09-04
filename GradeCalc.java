/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradecalc;


import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author igntl
 */
public class GradeCalc {

    public static void main(String[] args) {
       
        System.out.println("Subject Grading Calculator");
        
        Scanner input = new Scanner(System.in);
        int distinctionCounter;
        HashMap<String, Integer> Subjects = new HashMap<>();
        
        
        //Hashmap instead of array list
        
        // Text to explain the program, program will run a forloop to see if text input says "done"
        // If not, will ask for the subject name (String) and grade (Int)
        // Will also check if grade is a distinction (75+), if so add a count to distinctionCounter
        // Once user is satisfied, they will input "done"
        // Application will add up the grades to calculate an average
        // will also display the total sum of subjects, and give a distinction counter
        
        
        System.out.println("You will be asked the name of the given subject, which will be followed by the grade of said subject");
        System.out.println("After such, you will do so for as many subjects as needed");
        System.out.println("When you have completed your subjects, simply type 'done'");
        System.out.println("After which, your average will be given" + "\n");
        System.out.println("Please Mention The Subject Name and Press Enter");
        System.out.println("After Such, Please Mention The Subject Average and Press Enter");
        
        Subjects.put(input.nextLine(), input.nextInt());
        
        System.out.println("Good, Please Continue on with the rest of your Grades");
        
        
            while (true) {
               
                System.out.println("Please Mention The Subject Name and Grade");
                
                String keyInput = input.nextLine();
                Subjects.put(keyInput, null);
                
                if (keyInput.equals("done")) {
                    Subjects.remove("done");
                    break;
                }
                
                int valueInput = input.nextInt();
                Subjects.put(keyInput, valueInput);
                
            }
            
            
            System.out.println("Calculation Complete");
            System.out.println("Your Average for the " + Subjects.size() + " calculated subjects is:");
            
            
            System.out.println(Subjects.size() + "%");
            System.out.println("Not Bad ;)");
            
        }
            
        
    
}
