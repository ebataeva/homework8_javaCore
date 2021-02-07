public class Cat implements Athletes {
 private String name;
 private int maxHeight;
 private int maxLength;

    public Cat(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    public void info(){
        System.out.printf("Я кошка %s", name);
    }

    @Override
    public void run() {
        System.out.printf("я могу пробежать %d \n", maxLength);
    }

    @Override
    public void jump() {
        System.out.printf("я могу перепрыгнуть %d \n", maxHeight);

    }
    public void jump(Wall wall) {
        if (maxHeight >= wall.height) {
            System.out.printf(" \n %s перепрыгнул стену высотой %d ", name, wall.height);
        } else {
            System.out.printf(" \n %s не смог перепрыгнуть стену высотой %d ", name, wall.height);

        }
    }
}
