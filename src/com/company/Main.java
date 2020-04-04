package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        UniEntranceExam uee1 = new UniEntranceExam(288.6f, 394.3f, 400f, 688.6f, "High");
	    Students student1 = new Students("Elza", "Gurbanova", "Freshman",0, 0, uee1);

        UniEntranceExam uee2 = new UniEntranceExam(200f, 300f, 350f, 550f, "Mediocre");
        Students student2 = new Students("Jane", "Smith", "Freshman",0, 0, uee2);


        System.out.println(student1.getName());
        System.out.println(student1.getSurname());
        System.out.println("The status of the student is " + student1.status);
        String graduationScore = student1.uee.showingGraduationExamScore();
        System.out.println(graduationScore);
        String firstExamScore = student1.uee.showingFirstExamScore();
        System.out.println(firstExamScore);
        String secondExamScore = student1.uee.showingSecondExamScore();
        System.out.println(secondExamScore);
        String level1 = student1.uee.calculatingLevel();
        System.out.println(level1);

        System.out.println("If you want to get further information about this student, enter \"1\", as opposed to \"2\" which directs you to the other student");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        if( option == 1) {
            student1.study();
            student1.makingPresentation();
            student1.gradedWriting();
            student1.achievements();
            student1.preExamScore();
            student1.overallScoreOfTheStudent();
            student1.scholarship();
        } else if (option ==2) {


            System.out.println("=======================");
            System.out.println(student2.getName());
            System.out.println(student2.getSurname());
            student2.setName("Kate");
            student2.setSurname("Adams");

            System.out.println("After adjustment...");
            System.out.println(student2.getName());
            System.out.println(student2.getSurname());
            System.out.println("The status of the student is " + student2.status);

            System.out.println("The initial overall score of the student was: " + student2.getOverallScore());
            student2.setOverallScore(85);
            System.out.println("After adjustment the overall score of the student is:" + student2.getOverallScore());
            // The information provided below cannot be modified
            System.out.println("Score of the graduation exam is: " + uee2.getScoreOfTheGraduationExam());
            System.out.println("Score of the first subject exam: " + uee2.getScoreOfTheFirstExam());
            System.out.println("Score of the  subject exam: " + uee2.getScoreOfTheSecondExam());
            System.out.println("Total university entrance exam score: " + uee2.getTotalScore());
            System.out.println("The level of the student is: " + uee2.getLevel());


            student2.study();
            student2.makingPresentation();
            student2.gradedWriting();
            student2.achievements();
            student2.preExamScore();
            student2.overallScoreOfTheStudent();
            student2.scholarship();
        } else{
            System.out.println("Invalid input");
        }
        scanner.close();

    }
}
