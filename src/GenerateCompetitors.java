public class GenerateCompetitors {

    public static  Athletes[] getCompetitors() {
         Cat cat = new Cat(TestData.generateNameOfCat(), TestData.generateBarrier(5), TestData.generateBarrier(20));
         Human human = new Human(TestData.generateNameOfHuman(), TestData.generateBarrier(5), TestData.generateBarrier(20));
         Robot robot = new Robot(TestData.generateNameOfRobats(), TestData.generateBarrier(5), TestData.generateBarrier(20));
         return new Athletes[]{cat, human, robot};
    }

    public static Barriers[] getBarriers(){
        Wall wall = new Wall(TestData.generateBarrier(5));
        Track track = new Track(TestData.generateBarrier(10));
        Wall wall1 = new Wall(TestData.generateBarrier(5));
        Track track1 = new Track(TestData.generateBarrier(10));
        return new Barriers[]{wall, track, wall1, track1};
    }

}
