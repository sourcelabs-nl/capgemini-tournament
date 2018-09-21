import java.util.Random;

public class AmatureTeam extends Team {

    private final String mascot;
    private final String homeBar;

    public AmatureTeam(String name, String mascot, String homeBar) {
        super(name);
        this.mascot = mascot;
        this.homeBar = homeBar;
    }

    @Override
    public void celebrate() {
        System.out.println("We, " + getName() + " won!!! Having drinks the " + mascot + " mascot in our homebar :D");
    }

    @Override
    public int scoreGoals() {
        int goal = new Random().nextInt(2);
        System.out.println(getName() + " scored " + goal + " goal(s)");
        return goal;
    }

    public String getMascot() {
        return mascot;
    }

    public String getHomeBar() {
        return homeBar;
    }
}
