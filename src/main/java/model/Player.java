package model;

import java.util.ArrayList;

public class Player extends Account{
    private int registrationDaysCount;
    private int money;
    private int score;
    private ArrayList<GameLog> gameLogs;
    private ArrayList<Account> Friends;
    private ArrayList<String> friendRequests;

    public Player(String firstName, String lastName, String username, String userId, String password, String phoneNumber, String emailAddress) {
        super(firstName, lastName, username, userId, password, phoneNumber, emailAddress);
        this.registrationDaysCount = 0;
        this.money = 0;
        this.score = 0;
    }

    public int getRegistrationDaysCount() {
        return registrationDaysCount;
    }

    public void setRegistrationDaysCount(int registrationDaysCount) {
        this.registrationDaysCount = registrationDaysCount;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<GameLog> getGameLogs() {
        return gameLogs;
    }

    public void setGameLogs(ArrayList<GameLog> gameLogs) {
        this.gameLogs = gameLogs;
    }

    public ArrayList<Account> getFriends() {
        return Friends;
    }

    public void setFriends(ArrayList<Account> friends) {
        Friends = friends;
    }

    public ArrayList<String> getFriendRequests() {
        return friendRequests;
    }

    public void setFriendRequests(ArrayList<String> friendRequests) {
        this.friendRequests = friendRequests;
    }
}
