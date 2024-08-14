public class GameEntry {

    private String name;
    private int score;

    public GameEntry(String n, int s){
        this.name = n;
        this.score = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
