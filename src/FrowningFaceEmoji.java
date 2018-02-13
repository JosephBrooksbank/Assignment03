import edu.princeton.cs.introcs.StdDraw;

public class FrowningFaceEmoji extends FaceEmoji {
    FrowningFaceEmoji(int x, int y, int radius){
        super(x, y, radius);
    }
    void draw(){
        super.draw();
        // frowning mouth
        StdDraw.arc(x, y-1.1*radius, radius*MOUTH_MODIFIER, 30, 150);
    }
}
