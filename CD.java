public class CD implements Packable {
    private String artist;
    private String albumName;
    private int year;
    private double weight;

    public CD(String artist, String albumName, int year) {
        this.artist = artist;
        this.albumName = albumName;
        this.year = year;
        this.weight = 0.1;
    }

    public double weight() {
        return this.weight;
    }

    public String toString() {
        return String.format("%s: %s (%d) ", this.artist, this.albumName, this.year);
    }
}