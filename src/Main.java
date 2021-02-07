public class Main {
    public static void main(String[] args) {
Wall wall = new Wall(5);
Athletes[] athletes =  GenerateCompetitors.getCompetitors();
for (Athletes a: athletes){
    a.jump(wall);
}
    }
}
