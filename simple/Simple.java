/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package resourcepack.simple;


 import java.util.Scanner;

class Student {
    String name;
    int age;
    String course;

    void displayInfo() {
            System.out.println("Student Information");
           System.out.println("-------------------");
          System.out.println("Name: " + name);
         System.out.println("Age: " + age);
        System.out.println("Course: " + course);
       System.out.println();
    }
}

public class Simple {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Name 1
        Student CrlF4 = new Student();
        System.out.print("Enter name for student> ");
        CrlF4.name = sc.nextLine();
        
        System.out.print("Enter age for student> ");
        CrlF4.age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter course for student>"
                + " :3 ");
        CrlF4.course = sc.nextLine();

        System.out.println();

        // Second student
        Student FixGrade = new Student();
        System.out.print("Enter name for student> ");
        FixGrade.name = sc.nextLine();
        
        System.out.print("Enter age for student> ");
        FixGrade.age = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter course for student> ");
        FixGrade.course = sc.nextLine();

        System.out.println();
        CrlF4.displayInfo();
        FixGrade.displayInfo();
 }
}
