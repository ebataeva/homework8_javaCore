public class Human implements Athletes {
    private String name;
    private int maxHeight;
    private int maxLength;

    public Human(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public void info() {
        System.out.printf("Я человек %s", name);
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

    @Override
    public void run(Track track) {
        if (maxHeight >= track.getLength()) {
            System.out.printf(" \n %s пробежал %d ", name, track.Length);
        } else {
            System.out.printf(" \n %s не смог пробежать %d ", name, track.Length);

        }
    }
}
