/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;
import java.util.Scanner;

/**
 *
 * @author Vansh
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // changed array size to 3
        Student[] students = new Student[3];
        
        Scanner input = new Scanner(System.in);
        
        for( int i = 0; i<students.length; i++){
            System.out.println("Enter the students name");
            String name = input.nextLine();
            Student student = new Student(name);
           
            students[i] = student;
            
        }
        System.out.println("Printing the students:");
        String format = "The students name is %s\n";
        
        for(Student student: students){
            System.out.printf(format, student.getName());
        }
    }
    
}
