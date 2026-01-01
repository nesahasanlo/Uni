package model;

public class FootballPlayer {
    private String name;
    private String position;
    private int age;
    private int goals;

    public FootballPlayer(String name, String position, int age, int goals){
        this.name = name;
        this.position = position;
        this.age = age;
        this.goals = goals;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return position;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGoals(int goals){
        this.goals = goals;
    }
    public int getGoals(){
        return goals;
    }
}
