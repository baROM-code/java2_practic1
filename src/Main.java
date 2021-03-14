public class Main {

    public static void main(String[] args) {
        RunJumpable[] members = {
            new Human("Ivan", 1.5, 500),
            new Cat("Vaska", 2.5, 110),
            new Robot(999)
        };

        Obstacle[] obstacles = {
            new RunningTrack(),
            new Wall()
        };

        for (RunJumpable r: members)
           for (Obstacle o: obstacles) {
               if (!o.go(r)) break;
           }

        // obstacles[1].go(members[0]);
    }
}
