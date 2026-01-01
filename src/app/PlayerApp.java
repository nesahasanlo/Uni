package app;

import java.util.Scanner;
import model.FootballPlayer;

public class PlayerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num of football players");
        int n = sc.nextInt();


        FootballPlayer[] player = new FootballPlayer[n];

        for(int i = 0; i < n; i++){
            System.out.println("Player" + (i + 1) + " information");
            sc.nextLine();

            System.out.println("Enter name of player");
            String name = sc.nextLine();

            System.out.println("Enter player position");
            String position = sc.nextLine();

            System.out.println("Enter player age");
            int age = sc.nextInt();

            System.out.println("Enter num of the player's goals");
            int goals = sc.nextInt();

            player[i] = new FootballPlayer(name, position, age, goals);
        }
        int totalGoal = 0;
        for(int i = 0; i < n; i++){
            totalGoal += player[i].getGoals();
        }
        System.out.println("Total goal: " + totalGoal);

        FootballPlayer max = player[0];

        for(int i = 0; i < n; i++) {
            if (player[i].getGoals() > max.getGoals()) {
                max = player[i];
            }
        }
        System.out.println("\nPlayer with most goals: ");
        System.out.println("name: " + max.getName() + " age: " + max.getAge() + " num of goals: " + max.getGoals());


        System.out.println("\nsort players");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                if(player[j].getGoals() < player[j + 1].getGoals()){
                    FootballPlayer temp = player[j];
                    player[j] = player[j + 1];
                    player[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println("name: " + player[i].getName() + " age: " + player[i].getAge() + " goals: " + player[i].getGoals() + " position: " + player[i].getPosition());}
    }
}
