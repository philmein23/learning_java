public class TelevisionProgram {

    private String programName;
    private int duration;

    public TelevisionProgram(String programName, int duration) {
        this.programName = programName;
        this.duration = duration;
    }

    public String toString() {
        return String.format("%s, %d minutes", this.programName, this.duration);
    }

    public int getDuration() {
        return this.duration;
    }

}