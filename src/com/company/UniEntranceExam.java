package com.company;

public class UniEntranceExam {

    float scoreOfTheGraduationExam;
    float scoreOfTheFirstExam;
    float scoreOfTheSecondExam;
    float totalScore;
    String level;


    public UniEntranceExam (float G, float FE, float SE, float T ){
        scoreOfTheGraduationExam = G;
        scoreOfTheFirstExam = FE;
        scoreOfTheSecondExam = SE;
        totalScore = T;
    }

    String calculatingLevel() {
        if (totalScore >700 || totalScore < 0){
            return "Please, enter valid score!";
        }
        else if (totalScore >= 600){
            level = "High";
            return "Your level according to The University Entrance exam is " + level;
        }
        else if (totalScore < 600 && totalScore >= 400){
            level = "Medium";
            return "Your level according to The University Entrance exam is " + level;
        }
        else if (totalScore < 400 && totalScore >=150 ){
            level = "Low";
            return "Your level according to The University Entrance exam is " + level;
        }
        else{
            return "You could not enter any university";
        }
    }

    String showingGraduationExamScore(){
        return "The score of the graduation exam is " + scoreOfTheGraduationExam;
    }
    String showingFirstExamScore(){
        return "The score of the first subject exam is "+ scoreOfTheFirstExam;
    }
    String showingSecondExamScore(){
        return "The score of the second subject exam is "+ scoreOfTheSecondExam;
    }


}
