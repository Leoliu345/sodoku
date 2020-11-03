package cn.sodoku.Entity;

public class Puzzle {
    int id;
    String puzzle;

    int difficulty;

    public Puzzle(String puzzle) {
        this.puzzle = puzzle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(String puzzle) {
        this.puzzle = puzzle;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }
}
