public class Wall implements Barriers {
int height;

    public Wall(int height) {
        this.height = height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public boolean isItCan(Athletes a) {
        return (a.canDoIt);
    }
}
