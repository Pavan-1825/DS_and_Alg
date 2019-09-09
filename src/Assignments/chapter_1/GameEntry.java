package Assignments.chapter_1;

public class GameEntry {

    int scores;

    public GameEntry(int scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "scores=" + scores +
                '}';
    }
}

