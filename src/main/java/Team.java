public abstract class Team {

    private final String name;

    Team(String name) {
        this.name = name;
    }

    public abstract void celebrate();
    public abstract int scoreGoals();

    String getName() {
        return name;
    }
}
