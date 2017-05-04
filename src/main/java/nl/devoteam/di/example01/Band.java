package nl.devoteam.di.example01;

public class Band {
    private String drummer;

    public Band(String drummer) {
        this.drummer = drummer;
    }

    public void playWeWillRockYou() throws NoDrummerToPlaySongException {
        if ("Dave Grohl".equals(drummer)){
            DaveGrohl daveGrohl = new DaveGrohl();
            daveGrohl.beatTheCrapOutOfTheBassDrum();
            daveGrohl.beatTheCrapOutOfTheBassDrum();
            daveGrohl.whackTheSnareDrumHard();
        } else if ("Charlie Watts".equals(drummer)){
            CharlieWatts charlieWatts = new CharlieWatts();
            charlieWatts.strikeTheBassDrum();
            charlieWatts.strikeTheBassDrum();
            charlieWatts.hitTheSnareDrumGently();
        }else {
            throw new NoDrummerToPlaySongException();
        }
    }
}
