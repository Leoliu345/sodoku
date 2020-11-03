package cn.sodoku.Entity;

public class Leaderboard {
    int puzzleid;
    String name;
    int time;

    public int getPuzzleid() {
        return puzzleid;
    }

    public void setPuzzleid(int puzzleid) {
        this.puzzleid = puzzleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
