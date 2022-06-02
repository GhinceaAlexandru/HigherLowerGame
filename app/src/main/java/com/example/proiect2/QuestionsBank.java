package com.example.proiect2;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> languagesQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Python has 235,000 average monthly searches . C++  has higher(>) or(| |) lower(<) searches than Python?", "Higher", "Lower", "Lower", "");
        final QuestionsList question2 = new QuestionsList("C language has 5,800 average monthly searches . Java  has higher(>) or(| |) lower(<) searches than Python?", "Higher", "Lower", "Higher", "");
        final QuestionsList question3 = new QuestionsList("Java has 84,000 average monthly searches . Java Script  has higher(>) or(| |) lower(<) searches than Python?", "Higher", "Lower", "Lower", "");
        final QuestionsList question4 = new QuestionsList("Kotlin has 6,200 average monthly searches . R  has higher(>) or(| |) lower(<) searches than Python?", "Higher", "Lower", "Higher", "");
        final QuestionsList question5 = new QuestionsList("PHP has 31,400 average monthly searches . SQL  has higher(>) or(| |) lower(<) searches than Python?", "Higher", "Lower", "Higher", "");
        final QuestionsList question6 = new QuestionsList("C++ has 56,400 average monthly searches . MATLAB  has higher(>) or(| |) lower(<) searches than Python?", "Higher", "Lower", "Lower", "");
        final QuestionsList question7 = new QuestionsList("Java Script has 1,900 average monthly searches . Swift has higher(>) or(| |) lower(<) searches than Python?", "Higher", "Lower", "Higher", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);

        return questionsLists;
    }

    private static List<QuestionsList> musicQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Ian has 195,850 average monthly listeners . Azteca has higher(>) or(| |) lower(<) listeners than Ian?", "Higher", "Lower", "Lower", "");
        final QuestionsList question2 = new QuestionsList("Future has 39,766,176 average monthly listeners . Kendrick Lamar has higher(>) or(| |) lower(<) listeners than Future?", "Higher", "Lower", "Higher", "");
        final QuestionsList question3 = new QuestionsList("Gunna has 26,446,305 average monthly listeners . Travis Scott has higher(>) or(| |) lower(<) listeners than Gunna?", "Higher", "Lower", "Higher", "");
        final QuestionsList question4 = new QuestionsList("Don Toliver has 28,176,552 average monthly listeners . Justin Bieber has higher(>) or(| |) lower(<) listeners than Don Toliver?", "Higher", "Lower", "Higher", "");
        final QuestionsList question5 = new QuestionsList("Nane has 317,508 average monthly listeners . YNY Sebi has higher(>) or(| |) lower(<) listeners than Nane?", "Higher", "Lower", "Lower", "");
        final QuestionsList question6 = new QuestionsList("The Weeknd has 74,709,321 average monthly listeners . A$AP Rocky has higher(>) or(| |) lower(<) listeners than The Weeknd?", "Higher", "Lower", "Higher", "");
        final QuestionsList question7 = new QuestionsList("Drake has 57,989,172 average monthly listeners . Migos has higher(>) or(| |) lower(<) listeners than Drake?", "Higher", "Lower", "Lower", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);


        return questionsLists;
    }
    private static List<QuestionsList> footballQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Lionel Messi has 5,820,000 average monthly searches . Cristiano Ronaldo has higher(>) or(| |) lower(<) searches than Messi?", "Higher", "Lower", "Lower", "");
        final QuestionsList question2 = new QuestionsList("Neymar has 482,636 average monthly searches . Kylian Mbappe has higher(>) or(| |) lower(<) searches than Neymar?", "Higher", "Lower", "Lower", "");
        final QuestionsList question3 = new QuestionsList("Barcelona has five UEFA Champions League titles . Real Madrid has higher(>) or(| |) lower(<) titles than Barcelona?", "Higher", "Lower", "Higher", "");
        final QuestionsList question4 = new QuestionsList("Andres Iniesta has 186 assists for Barcelona . Xavi has higher(>) or(| |) lower(<) assists than Iniesta?", "Higher", "Lower", "Higher", "");
        final QuestionsList question5 = new QuestionsList("Kun Aguero has 427 career goals . Rooney has higher(>) or(| |) lower(<) goals than Aguero?", "Higher", "Lower", "Lower", "");
        final QuestionsList question6 = new QuestionsList("Cristiano Ronaldo has five Ballon d'Or trophies. Messi has higher(>) or(| |) lower(<) trophies than Ronaldo?", "Higher", "Lower", "Higher", "");
        final QuestionsList question7 = new QuestionsList("Mohamed Salah won the Premier League once . Eden Hazard has higher(>) or(| |) lower(<) titles than Salah?", "Higher", "Lower", "Higher", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);


        return questionsLists;
    }
    private static List<QuestionsList> gamesQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("League of Legends has 125,000,000 average monthly players . CS:GO  has higher(>) or(| |) lower(<) players than LoL?", "Higher", "Lower", "Lower", "");
        final QuestionsList question2 = new QuestionsList("Fortnite has 268,000,000 average monthly players . Roblox has higher(>) or(| |) lower(<) players than Fortnite?", "Higher", "Lower", "Lower", "");
        final QuestionsList question3 = new QuestionsList("Minecraft has 1,400,000 average monthly players . Crossfire has higher(>) or(| |) lower(<) players than Minecraft?", "Higher", "Lower", "Higher", "");
        final QuestionsList question4 = new QuestionsList("Dota 2 has 7,600,000 average monthly players . FIFA has higher(>) or(| |) lower(<) players than Dota 2?", "Higher", "Lower", "Higher", "");
        final QuestionsList question5 = new QuestionsList("GTA V has 2,500,000 average monthly players . Metin 2 has higher(>) or(| |) lower(<) players than GTA V?", "Higher", "Lower", "Lower", "");
        final QuestionsList question6 = new QuestionsList("Rust has 12,000,000 average monthly players . Rocket League  has higher(>) or(| |) lower(<) players than Rust?", "Higher", "Lower", "Higher", "");
        final QuestionsList question7 = new QuestionsList("Clash Royale has 18,324,326 average monthly players . 8 Ball Pool  has higher(>) or(| |) lower(<) players than Clash Royale?", "Higher", "Lower", "Higher", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "Football":
                return footballQuestions();
            case "Music":
                return musicQuestions();
            case "Games":
                return gamesQuestions();
            default:
                return languagesQuestions();
        }






}
}
