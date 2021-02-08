public class Robot implements Athletes {
    private  boolean canDoIt;
    private String name;
    private int maxHeight;
    private int maxLength;

    public Robot(String name, int maxHeight, int maLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maLength;
        this.canDoIt = true;
    }



    @Override
    public void info(){
        System.out.printf("\n Я робот %s \n", name);
        run();
        jump();
    }

    @Override
    public void run() {
        System.out.printf("я могу пробежать %d \n", maxLength);
    }

    @Override
    public void jump() {
        System.out.printf("я могу прыгнуть на  %d \n", maxHeight);

    }

    public void jump(Wall wall) {
        if(canDoIt) {
            if (maxHeight >= wall.height) {
                System.out.printf(" \n %s перепрыгнул стену высотой %d его максимум %d ", name, wall.height, maxHeight);
            } else {
                System.out.printf(" \n %s не смог перепрыгнуть стену высотой %d, его максимум %d ", name, wall.height, maxHeight);
                canDoIt = false;

            }
        }
    }

    @Override
    public void run(Track track) {
        if(canDoIt){
            if (maxLength >= track.getLength()) {
                System.out.printf(" \n %s пробежал %d , его максимум - %d", name, track.length, maxLength);
            } else {
                System.out.printf(" \n %s не смог пробежать %d, его максимум - %d", name, track.length, maxLength);
                canDoIt = false;

            }
        }
    }}