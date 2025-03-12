public class BasketballPlayer {
    private String firstName;
    private String lastName;
    private int shots;
    private int rebounds;
    private int blocks;
    private int passes;
    private int turnovers;

    public BasketballPlayer(String firstName, String lastName, int shots, int rebounds, int blocks, int passes, int turnovers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.shots = shots;
        this.rebounds = rebounds;
        this.blocks = blocks;
        this.passes = passes;
        this.turnovers = turnovers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getRebounds() {
        return rebounds;
    }

    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getPasses() {
        return passes;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }

    public int getTurnovers() {
        return turnovers;
    }

    public void setTurnovers(int turnovers) {
        this.turnovers = turnovers;
    }

    public double getRating() {
        return shots * 1.0 + rebounds * 1.0 + blocks * 2.0 + passes * 1.5 - turnovers * 2.0;
    }

    public String toString() {
        return firstName + " " + lastName + " - Rating: " + getRating();
    }
}
