package model;

public class Event {
    private String gameName;
    private String startAndEndDate;
    private int score;
    private String eventId;

    public Event(String gameName, String startAndEndDate, int score, String eventId) {
        this.gameName = gameName;
        this.startAndEndDate = startAndEndDate;
        this.score = score;
        this.eventId = eventId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getStartAndEndDate() {
        return startAndEndDate;
    }

    public void setStartAndEndDate(String startAndEndDate) {
        this.startAndEndDate = startAndEndDate;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}
