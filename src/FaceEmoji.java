import edu.princeton.cs.introcs.StdDraw;

public abstract class FaceEmoji extends Emoji {
    /* How big the curve of the mouth should be in comparison to the head */
    protected static final double MOUTH_MODIFIER = 0.7;

    FaceEmoji(int x, int y, int radius){
        super(x,y,radius);
    }

    void draw(){
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.filledCircle(x ,y, radius);
        StdDraw.setPenColor(StdDraw.BLACK);
        // left eye
        StdDraw.filledCircle(x - 0.3*radius, y + 0.4 * radius, 0.1*radius);
        // right eye
        StdDraw.filledCircle(x + 0.3*radius, y + 0.4 * radius, 0.1*radius);


    }
}
