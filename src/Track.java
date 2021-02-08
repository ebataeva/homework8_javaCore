public class Track implements Barriers {
    int length;

    public Track(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }


    @Override
    public void info() {
        System.out.println("Длина дороги "+ length);
    }
}
