public class Human implements RunJumpable {
    private String name;
    private double maxJump;
    private double maxRun;

    public Human(String name, double maxJump, double maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public boolean jump(double h) {
        if (h <= maxJump) {
            System.out.println("Human " + name + " jump!");
        } else {
            System.out.println("Human " + name + " could not jump...");
        }
        return h <= maxJump;
    }

    @Override
    public boolean run(double l) {
        if (l <= maxRun) {
            System.out.println("Human " + name +" run!");
        } else {
            System.out.println("Human " + name + " could not run...");
        }
        return l <= maxRun;
    }
}
