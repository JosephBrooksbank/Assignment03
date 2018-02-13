import edu.princeton.cs.introcs.StdDraw;

public class ClockEmoji extends Emoji {
    int hour;
    double angle;
    ClockEmoji(int x, int y, int radius, int hour){
        super(x, y, radius);
        this.hour  = hour;
    }

    void draw(){

        // Weird logic to get the correct angle of the hour hand.
        // 30 = the degree change for each position in a 12 hour clock
        // hour - 3 = accounting for the different starting positions between a circle (0deg) and a clock (90 deg)
        // * -1 = flipping the rotation
        // Done in degrees and converted to radians because its easier than radian multiplication
        angle = Math.toRadians(30*(hour-3) * -1);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.circle(x, y, radius);
        StdDraw.line(x,y, (x + radius*Math.cos(angle)), (y + radius*Math.sin(angle)));
    }
}

