public class GenerateCompetitors {

    public static  Athletes[] getCompetitors() {
         Cat cat = new Cat("Муся", 5, 4);
         Human human = new Human("Глеб", 2, 5);
         Robot robot = new Robot("R2D2", 20, 20);
         return new Athletes[]{cat, human, robot};
    }

    public static Barriers[] getBarriers(){
        Wall wall = new Wall(14);
        Track track = new Track(5);
        Wall wall1 = new Wall(2);
        Track track1 = new Track(3);
        return new Barriers[]{wall, track, wall1, track1};
    }

}
