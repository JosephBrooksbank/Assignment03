/**
 * Abstract class for all emoji
 */
abstract class Emoji {
    /**
     * The x and y coordinates of an emoji
     */
    double x, y;
    /**
     * the radius of an emoji, all emoji derived from this class are circle-based (currently)
     */
    double radius;

    /**
     * Constructor for emoji objects
     *
     * @param x      The x coord of the emoji
     * @param y      The y coord of the emoji
     * @param radius The radius of the emoji
     */
    Emoji(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /* abstract method for drawing the emoji */
    abstract void draw();

    /* abstract method for animating the emoji */
    abstract void animate();

}
