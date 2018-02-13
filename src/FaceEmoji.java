import edu.princeton.cs.introcs.StdDraw;

abstract class FaceEmoji extends Emoji {

    /**
     * How big the curve of the mouth should be in comparison to the head
     */
    static final double MOUTH_MODIFIER = 0.7;
    /**
     * Whether the emoji should be winking or not
     */
    private boolean winking;

    /**
     * Constructor for FaceEmoji objects
     *
     * @param x      The x position of the emoji
     * @param y      The y position of the emoji
     * @param radius The radius of the emoji
     */
    FaceEmoji(double x, double y, double radius) {
        super(x, y, radius);
        winking = false;
    }

    /**
     * Method to draw the emoji
     */
    void draw() {
        // Drawing background
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.filledCircle(x, y, radius);
        // Drawing eyes
        StdDraw.setPenColor(StdDraw.BLACK);
        // left eye
        StdDraw.filledCircle(x - 0.3 * radius, y + 0.4 * radius, 0.1 * radius);
        // right eye, winks
        if (winking) {
            StdDraw.line(x + 0.2 * radius, y + 0.4 * radius, x + 0.4 * radius, y + 0.4 * radius);
        } else {
            StdDraw.filledCircle(x + 0.3 * radius, y + 0.4 * radius, 0.1 * radius);
        }
    }

    /**
     * Method to animate Face Emoji, same note as the clock emoji about the wink() method.
     */
    void animate() {
        wink();
    }

    /**
     * Method to change if the face is winking or not
     */
    private void wink() {
        winking = !winking;
    }
}
