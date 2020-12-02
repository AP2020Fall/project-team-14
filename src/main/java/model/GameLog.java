package model;

public class GameLog {
    private int gamesCount;
    private int gameslost;
    private String logId;
    private int score;

    public GameLog(int gamesCount, int gameslost, String logId, int score) {
        this.gamesCount = gamesCount;
        this.gameslost = gameslost;
        this.logId = logId;
        this.score = score;
    }

    public int getGamesCount() {
        return gamesCount;
    }

    public void setGamesCount(int gamesCount) {
        this.gamesCount = gamesCount;
    }

    public int getGameslost() {
        return gameslost;
    }

    public void setGameslost(int gameslost) {
        this.gameslost = gameslost;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
