import edu.princeton.cs.introcs.StdDraw;

public class SmileyFaceEmoji extends FaceEmoji {
    SmileyFaceEmoji(int x, int y, int radius){
        super(x, y, radius);
    }
    public void draw(){
        super.draw();
        // mouth
        StdDraw.arc(x, y, radius*MOUTH_MODIFIER, 210, 330 );
    }
}
