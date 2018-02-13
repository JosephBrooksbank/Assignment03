import edu.princeton.cs.introcs.StdDraw;


class FrowningFaceEmoji extends FaceEmoji {

    /**
     * Frowning face constructor
     *
     * @param x      X coord of emoji
     * @param y      Y coord of emoji
     * @param radius radius of emoji
     */
    FrowningFaceEmoji(double x, double y, double radius) {
        super(x, y, radius);
    }

    void draw() {
        super.draw();
        // frowning mouth
        StdDraw.arc(x, y - 1.1 * radius, radius * MOUTH_MODIFIER, 30, 150);
    }
}
