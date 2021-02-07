public class GenerateCompetitors {

    public static  Athletes[] getCompetitors() {
         Cat cat = new Cat("Муся", 5, 4);
         Human human = new Human("Глеб", 2, 5);
         Robot robot = new Robot("R2D2", 20, 20);
         return new Athletes[]{cat, human, robot};
    }

}
