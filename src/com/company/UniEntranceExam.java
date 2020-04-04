package com.company;

public class UniEntranceExam {

    private float scoreOfTheGraduationExam;
    private float scoreOfTheFirstExam;
    private float scoreOfTheSecondExam;
    private float totalScore;
    private String level;


    public UniEntranceExam (float G, float F, float S, float T , String L){
        scoreOfTheGraduationExam = G;
        scoreOfTheFirstExam = F;
        scoreOfTheSecondExam = S;
        totalScore = T;
        level = L;
    }
    public float getScoreOfTheGraduationExam(){
        return scoreOfTheGraduationExam;
    }
    public float getScoreOfTheFirstExam(){
        return scoreOfTheFirstExam;
    }
    public float getScoreOfTheSecondExam(){
        return scoreOfTheSecondExam;
    }
    public float getTotalScore(){
        return totalScore;
    }
    public String getLevel(){
        return level;
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
