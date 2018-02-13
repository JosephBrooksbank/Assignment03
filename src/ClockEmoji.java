import edu.princeton.cs.introcs.StdDraw;

class ClockEmoji extends Emoji {

    /**
     * An integer to store what hour it currently shows on the clock
     */
    private int hour;

    ClockEmoji(double x, double y, double radius, int hour) {
        super(x, y, radius);
        this.hour = hour;
    }

    /**
     * Method to draw the clock at its current hour
     */
    void draw() {

        // Weird logic to get the correct angle of the hour hand.
        // 30 = the degree change for each position in a 12 hour clock
        // hour - 3 = accounting for the different starting positions between a circle (0deg) and a clock (90 deg)
        // * -1 = flipping the rotation
        // Done in degrees and converted to radians because its easier than radian multiplication
        /* The angle of the current hour, used during drawing */
        double angle = Math.toRadians(30 * (hour - 3) * -1);
        // Drawing the actual clock
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.circle(x, y, radius);
        StdDraw.line(x, y, (x + radius * Math.cos(angle)), (y + radius * Math.sin(angle)));
    }

    /**
     * Method to animate clock
     * NOTE: In this case I personally would just move the tick() code into animate, but the assignment calls for it to
     * be left in a separate instance. I suppose this technically could be used if the clock was going to be animated in
     * more ways at a later date.
     */
    void animate() {
        tick();
    }

    /**
     * Method to increase the hour by one hour, resets after 12
     */
    private void tick() {
        if (hour >= 12) {
            hour = 1;
        } else {
            hour++;
        }
    }
}

