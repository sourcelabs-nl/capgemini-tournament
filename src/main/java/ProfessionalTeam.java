import java.util.Random;

public class ProfessionalTeam extends Team {

    private final String sponsor;

    public ProfessionalTeam(String name, String sponsor) {
        super(name);
        this.sponsor = sponsor;
    }

    public String getSponsor() {
        return sponsor;
    }

    @Override
    public void celebrate() {
        System.out.println("Easy win for " + getName() + " , celebrating with our sponsor " + getSponsor() );
    }

    @Override
    public int scoreGoals() {
        int goal = new Random().nextInt(4);
        System.out.println(getName() + " scored " + goal + " goal(s)");
        return goal;
    }
}
