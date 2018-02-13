import edu.princeton.cs.introcs.StdDraw;

class SmileyFaceEmoji extends FaceEmoji {

    /**
     * Smiley face constructor
     *
     * @param x      X coord of emoji
     * @param y      Y coord of emoji
     * @param radius radius of emoji
     */
    SmileyFaceEmoji(double x, double y, double radius) {
        super(x, y, radius);
    }

    public void draw() {
        super.draw();
        // mouth
        StdDraw.arc(x, y, radius * MOUTH_MODIFIER, 210, 330);
    }
}
