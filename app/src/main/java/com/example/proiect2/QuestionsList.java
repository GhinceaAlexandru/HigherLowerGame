package com.example.proiect2;

public class QuestionsList {

    private String question,option1 , option2 ,answer;
    private String userSelectedAnswer;

    public QuestionsList(String question, String option1, String option2, String answer, String userSelectedAnswer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.answer = answer;
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getAnswer() {
        return answer;
    }

    public void setUserSelectedAnswer(String userSelectedAnswer) {
        this.userSelectedAnswer = userSelectedAnswer;
    }

    public String getUserSelectedAnswer() {
        return userSelectedAnswer;
    }
}
