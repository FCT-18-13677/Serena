package es.uji.giant.Serena.model;

import java.util.ArrayList;
import java.util.List;

public class Questionnarie {
    private String id;
    private String sex;
    private int age;
    private boolean liveAlone;
    private long timestamp;
    private int uclaScore;
    private String howAreYouComments;
    // private String lonelinessComments;
    // private String nonLonelinessComments;
    private String lastWeekLoneliness;
    private List<String> answers;

    public Questionnarie() {
        answers = new ArrayList<>();
    }

    public String getHowAreYouComments() {
        return howAreYouComments;
    }

    public void setHowAreYouComments(String howAreYouComments) {
        this.howAreYouComments = howAreYouComments;
    }

    /*public String getLonelinessComments() {
        return lonelinessComments;
    }

    public void setLonelinessComments(String lonelinessComments) {
        this.lonelinessComments = lonelinessComments;
    }

    public String getNonLonelinessComments() {
        return nonLonelinessComments;
    }

    public void setNonLonelinessComments(String nonLonelinessComments) {
        this.nonLonelinessComments = nonLonelinessComments;
    }*/

    public String getLastWeekLoneliness() {
        return lastWeekLoneliness;
    }

    public void setLastWeekLoneliness(String lastWeekLoneliness) {
        this.lastWeekLoneliness = lastWeekLoneliness;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLivingAlone() {
        return liveAlone;
    }

    public void setLiveAlone(boolean liveAlone) {
        this.liveAlone = liveAlone;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }


    public void addAnswer(String answer) {
        answers.add(answer);
    }

    public List<String> getAnswers() {
        return answers;
    }

    public boolean isLiveAlone() {
        return liveAlone;
    }

    public int getUclaScore() {
        return uclaScore;
    }

    public void setUclaScore(int uclaScore) {
        this.uclaScore = uclaScore;
    }


    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }


    @Override
    public String toString() {
        return "Questionnarie{" +
                "id='" + id + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", liveAlone=" + liveAlone +
                ", timestamp=" + timestamp +
                ", uclaScore=" + uclaScore +
                ", answers=" + answers +
                '}';
    }

    public void calculateUCLAScore() {
        int score = 0;

        for (String answer : answers) {
            switch (answer.toLowerCase()) {
                case "casi nunca":
                    score += 1;
                    break;

                case "algunas veces":
                    score += 2;
                    break;

                case "a menudo":
                    score += 3;
                    break;
            }
        }

        uclaScore = score;
    }

    public boolean hasLoneliness() {
        return uclaScore >= 6;
    }

    public boolean isMale() {
        return sex.toLowerCase().equals("masculino");
    }

    public boolean isFemale() {
        return sex.toLowerCase().equals("femenino");
    }
}
