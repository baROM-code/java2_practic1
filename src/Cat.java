public class Cat implements RunJumpable {
    private String name;
    private double maxJump;
    private double maxRun;

    public Cat(String name, double maxJump, double maxRun) {
        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    @Override
    public boolean jump(double h) {
        if (h <= maxJump) {
            System.out.println("Cat " + name + " jump!");
        } else {
            System.out.println("Cat " + name + " could not jump...");
        }
        return h <= maxJump;
    }

    @Override
    public boolean run(double l) {
        if (l <= maxRun) {
            System.out.println("Cat " + name +" run!");
        } else {
            System.out.println("Cat " + name + " could not run...");
        }
        return l <= maxRun;
    }
}
