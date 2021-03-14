public class Wall implements Obstacle{
    private double hight = 2;

    public Wall() {
        this.hight = hight;
    }

    @Override
    public boolean go(RunJumpable a){
        return a.jump(hight);
    };
}
