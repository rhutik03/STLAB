package org.example;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

class student{
    public int rollNum;
    public String studName;
    public int[] marks = new int[3];

    public student(int rollNumber, String name, int[] subMarks){
        this.rollNum=rollNumber;
        this.studName=name;
        this.marks[0]=subMarks[0];
        this.marks[1]=subMarks[1];
        this.marks[2]=subMarks[2];
    }

    public String getResult(){
        int total = marks[0]+marks[1]+marks[2];
        System.out.println("Total: "+total);
        System.out.println("Percentage: "+(total/3));
        float avg = (float) (total/3);

        System.out.print("Grade: ");
        if(avg<45){
            return "F";
        }
        else if(avg<55){
            return "E";
        }
        else if(avg<65){
            return "D";
        }
        else if(avg<75){
            return "C";
        }
        else if(avg<85){
            return "B";
        }
        else{
            return "A";
        }



    }
}

public class Main{
    public static void main(String[] args){

        Vector<student> students = new Vector<>();
        int[] subMarks = new int[3];

        boolean rollNumIsValid=false;
        boolean marksIsValid=false;
        boolean nameIsValid=false;

        int rollNum=-1,marks=0;
        String name="";

        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        while (students.size()<3) {

            System.out.println("Enter Roll Number: ");
            rollNumIsValid = false;
            while (!rollNumIsValid) {
                rollNum=scInt.nextInt();
                if (rollNum>9999) {
                    System.out.println("Invalid Roll Number");
                }
                else{
                    rollNumIsValid=true;
                }
            }

            System.out.println("Enter Name: ");
            nameIsValid = false;
            while (!nameIsValid) {
                name=scStr.nextLine();
                if (name.length()>10) {
                    System.out.println("Name should be 10 or less chars");
                }
                else{
                    nameIsValid=true;
                }
            }

            System.out.println("Enter Marks: ");

            for(int i=0;i<3;i++){
                marksIsValid = false;
                while (!marksIsValid) {
                    marks=scInt.nextInt();
                    if (marks>100 || marks<0) {
                        System.out.println("Marks should be out of 100 and positive");
                    }
                    else{

                        subMarks[i]=marks;
                        marksIsValid=true;
                    }
                }
            }

            student avg = new student(rollNum,name,subMarks);

            students.add(avg);

        }

        for(student x:students){
            System.out.println("Roll Number: "+x.rollNum);
            System.out.println("Student Name: "+x.studName);
            String res=x.getResult();
            System.out.println(res);
        }


    }
}