package example;

public class GameProcess {
    public int times;

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String playGame(int times, int[] inputNumber) {
        String result = "";
        if (times > 6) {
            return "The game is over";
        }
        return result;
    }
}
