public class Robot implements Athletes {
    private String name;
    private int maxHeight;
    private int maxLength;

    public Robot(String name, int maxHeight, int maLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maLength;
    }


    public void jump(Wall wall) {
        if (maxHeight >= wall.height) {
            System.out.printf(" \n %s перепрыгнул стену высотой %d ", name, wall.height);
        } else {
            System.out.printf(" \n %s не смог перепрыгнуть стену высотой %d ", name, wall.height);

        }
    }



    @Override
    public void info(){
        System.out.printf("\n Я робот %s", name);
    }

    @Override
    public void run() {
        System.out.printf("я могу пробежать %d \n", maxLength);
    }

    @Override
    public void jump() {

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

