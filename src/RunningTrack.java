public class RunningTrack implements Obstacle{
    private double length = 150;

    public RunningTrack() {
        this.length = length;
    }

    @Override
    public boolean go(RunJumpable a){
        return a.run(length);
    };
}
