import edu.princeton.cs.introcs.StdDraw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Driver {
    public static void main(String[] args) {

        String currentEmoji;
        Emoji[][] emojiGrid;
        Scanner fileInput = null;
        try {
            fileInput = new Scanner(new FileInputStream("emojiInput.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found; exiting...");
            System.exit(1);
        }

        emojiGrid = new Emoji[fileInput.nextInt()][fileInput.nextInt()];

        // We assume that the grid isn't ragged during setup
        StdDraw.setCanvasSize(emojiGrid.length * 100, emojiGrid[0].length * 100);
        StdDraw.setXscale(0, emojiGrid.length);
        StdDraw.setYscale(0, emojiGrid[0].length);
        StdDraw.enableDoubleBuffering();

        for (int i = 0; i < emojiGrid.length; i++) {
            for (int j = 0; j < emojiGrid[i].length; j++) {
                currentEmoji = fileInput.next();

                /* Switch statement when reading in the emoji to place */
                switch (currentEmoji) {
                    case "smile":
                        // adding 0.5 to coordinates to account for zero index / radius size
                        emojiGrid[i][j] = new SmileyFaceEmoji(j + 0.5, i + 0.5, 0.5);
                        break;
                    case "frown":
                        emojiGrid[i][j] = new FrowningFaceEmoji(j + 0.5, i + 0.5, 0.5);
                        break;
                    case "clock":
                        emojiGrid[i][j] = new ClockEmoji(j + 0.5, i + 0.5, 0.5, fileInput.nextInt());
                        break;
                    default:
                        System.out.println("Unrecognized command, exiting...");
                        System.exit(1);
                }

                emojiGrid[i][j].draw();
            }
        }

        //noinspection InfiniteLoopStatement
        while (true) {
            StdDraw.clear();
            for (Emoji[] anEmojiGrid : emojiGrid) {
                for (Emoji anEmoji : anEmojiGrid) {

                    //// OLD CODE, INEFFICIENT /////

//                    if (emojiGrid[i][j] instanceof FaceEmoji){
//                        FaceEmoji temp  = (FaceEmoji)anEmoji;
//                        temp.wink();
//                        temp.draw();
//                    } else if (emojiGrid[i][j] instanceof ClockEmoji){
//                        ClockEmoji temp = (ClockEmoji)anEmoji;
//                        temp.tick();
//                        temp.draw();
//                    }

                    ///// Much more efficient calling of animate() /////

                    anEmoji.animate();
                    anEmoji.draw();

                }
            }
            StdDraw.show();
            StdDraw.pause(400);
        }


    }
}
