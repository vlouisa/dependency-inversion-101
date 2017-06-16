package nl.devoteam.di.example01;

public class Band {
    private String drummer;

    public static void main(String[] args) throws NoDrummerToPlaySongException {
        Band band = new Band("Dave");
        band.playWeWillRockYou();
    }

    public Band(String drummer) {
        this.drummer = drummer;
    }

    public void playWeWillRockYou() throws NoDrummerToPlaySongException {
        if (drummer.equals("Dave")){
            DaveGrohl dave = new DaveGrohl();
            dave.beatTheCrapOutOfTheBassDrum();
            dave.beatTheCrapOutOfTheBassDrum();
            dave.whackTheSnareDrumHard();
        } else if (drummer.equals("Charlie")){
            CharlieWatts charlie = new CharlieWatts();
            charlie.strikeTheBassDrum();
            charlie.strikeTheBassDrum();
            charlie.hitTheSnareDrumGently();
        } else {
            throw new NoDrummerToPlaySongException();
        }
    }
}
