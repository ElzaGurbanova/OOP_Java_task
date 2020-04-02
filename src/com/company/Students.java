package com.company;

import java.util.Scanner;

import static javafx.scene.input.KeyCode.U;

public class Students {


    String name, surname;
    static String status;
    float preExamScore;
    float overallScore;
    UniEntranceExam uee;


    Students(String n, String l, String s, int p, int o, UniEntranceExam U){
        name = n;
        surname = l;
        status = s;
        preExamScore = p;
        overallScore = o;
        uee = U;
    }


    void study(){
        System.out.println("The student is preparing for the exams...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your participation score: ");
        float participationScore = scanner.nextInt();
        preExamScore += participationScore;
    }
    void makingPresentation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Presentation Score: ");
        float presentationScore =scanner.nextInt();
        preExamScore += presentationScore;

    }
    void gradedWriting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your writing score: ");
        float gradedWritingScore = scanner.nextInt();
        preExamScore += gradedWritingScore;

    }
    void achievements(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your achievement score: ");
        float achiScore = scanner.nextInt();
        preExamScore += achiScore;

    }
    void preExamScore(){
        System.out.println("Your preExam score is "+ preExamScore);
    }

    void overallScoreOfTheStudent(){
        System.out.println("Enter your Midterm exam score: ");
        Scanner scanner = new Scanner(System.in);
        float midtermScore = scanner.nextInt();
        overallScore = preExamScore + midtermScore;
        System.out.println("Hey " + name +", Your overall score is "+ overallScore );

    }
    void scholarship(){
        if( overallScore >70){
            System.out.println("Hey " + name +", You maintained your scholarship )))");}
        else {
            System.out.println("Hey " + name +", You lost your scholarship (((");
        }

    }
}
