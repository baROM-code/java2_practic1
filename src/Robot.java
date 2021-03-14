public class Robot implements RunJumpable{
    private double maxRun;

    public Robot(double maxRun) {
       this.maxRun = maxRun;
    }

    @Override
    public boolean jump(double h) {
        System.out.println("Robot can not jump...");
        return false;
    }

    @Override
    public boolean run(double l) {
        if (l <= maxRun) {
            System.out.println("Robot run!");
        } else {
            System.out.println("Robot could not run...");
        }
        return l <= maxRun;
    }
}
