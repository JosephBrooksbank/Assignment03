public abstract class Emoji {
    int x, y, radius;

    Emoji(int x, int y, int radius){
        this.x  = x;
        this.y = y;
        this.radius = radius;
    }

    abstract void draw();

}
