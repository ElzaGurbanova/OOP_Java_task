package com.company;

public class Main {

    public static void main(String[] args) {

        UniEntranceExam uee1 = new UniEntranceExam(288.6f, 394.3f, 400f, 688.6f);
	    Students student1 = new Students("Elza", "Gurbanova", "Freshman", 0, 0,uee1);

        UniEntranceExam uee2 = new UniEntranceExam(200f, 300f, 350f, 550f);
        Students student2 = new Students("Jane", "Smith", "Freshman", 0, 0, uee2);



        System.out.println(student1.name);
        System.out.println(student1.surname);
        System.out.println(student1.status);
        String graduationScore = student1.uee.showingGraduationExamScore();
        System.out.println(graduationScore);
        String firstExamScore = student1.uee.showingFirstExamScore();
        System.out.println(firstExamScore);
        String secondExamScore = student1.uee.showingSecondExamScore();
        System.out.println(secondExamScore);
        String level1 = student1.uee.calculatingLevel();
        System.out.println(level1);


        student1.study();
        student1.makingPresentation();
        student1.gradedWriting();
        student1.achievements();
        student1.preExamScore();
        student1.overallScoreOfTheStudent();
        student1.scholarship();


        System.out.println(student2.name);
        System.out.println(student2.surname);
        System.out.println(student2.status);

        student2.study();
        student2.makingPresentation();
        student2.gradedWriting();
        student2.achievements();
        student2.preExamScore();
        student2.overallScoreOfTheStudent();
        student2.scholarship();

    }
}
