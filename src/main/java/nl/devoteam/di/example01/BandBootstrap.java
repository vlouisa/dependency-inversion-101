package nl.devoteam.di.example01;

public class BandBootstrap {

    public static void main(String[] args) throws NoDrummerToPlaySongException {
        Band band = new Band("Charlie Watts");
        band.playWeWillRockYou();
    }
}
