import java.util.Random;

public class TestData {
    public static String[] namesOfCats = {"Муся", "Пуся", "Хвостик", "Зефирка", "Матильда", "Лапочка", "Ксюша", "Маша"};
    public static String[] namesOfRobars = {"R2D2", "Bender", "Simba_1"};
    public static String[] namesOfHuman = {"Василий", "Роберт", "Вячеслав", "Игнатий"};
    public static Random rand = new Random();


    public static String getRandOfArray(String[] arr) {
        int i = rand.nextInt(arr.length);
        return arr[i];
    }
    public static String generateName(){
        return    getRandOfArray(namesOfCats);
    }

    public static int generateBarrier(int n){
        return 1+rand.nextInt(n);

    }

}