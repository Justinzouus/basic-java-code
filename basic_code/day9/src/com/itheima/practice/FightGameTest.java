package com.itheima.practice;

public class FightGameTest {
    public static void main(String[] args) {
        Role player1 = new Role("乔峰",100,'男');
        Role player2 = new Role("鸠摩智",100,'男');

        player1.showPlayerInfo();
        player2.showPlayerInfo();

        while (true) {
            player1.attack(player2);
            if (player2.getHealth() == 0) {
                System.out.println(player1.getName() + "获胜");
                break;
            }
            player2.attack(player1);
            if (player1.getHealth() == 0) {
                System.out.println(player2.getName() + "获胜");
                break;
            }
        }
    }
}
