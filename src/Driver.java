import edu.princeton.cs.introcs.StdDraw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        String currentEmoji;
        Emoji[][] emojiGrid;

        Scanner fileInput = null;
        try {
            fileInput = new Scanner(new FileInputStream("emojiInput.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File not found; exiting...");
            System.exit(1);
        }

        emojiGrid = new Emoji[fileInput.nextInt()][fileInput.nextInt()];

        // We assume that the grid isn't ragged during setup
        StdDraw.setCanvasSize(emojiGrid.length * 100, emojiGrid[0].length * 100);
        StdDraw.setXscale(0, emojiGrid.length * 2);
        StdDraw.setYscale(0, emojiGrid[0].length * 2);

        for (int i =  0; i < emojiGrid.length; i++){
            for (int j  = 0; i < emojiGrid[i].length; j++){
               currentEmoji = fileInput.next();
                System.out.println(currentEmoji);

               switch (currentEmoji){
                   case "smile":
                       System.out.println("creating Smiley at " + i+1 + "," + j+1);
                       emojiGrid[i][j] = new SmileyFaceEmoji(i+1, j+1, 1);
                       break;
                   case "frown":
                       emojiGrid[i][j] = new FrowningFaceEmoji(i+1, j+1, 1);
                       break;
                   case "clock":
//                       emojiGrid[i][j] = new ClockEmoji(i+1, j+1, 1, fileInput.nextInt());
                       emojiGrid[i][j] = new ClockEmoji(i, j, 1, fileInput.nextInt());
                       System.out.println(i);
                       System.out.println(j);
                       break;
                   default:
                       System.out.println("Unrecognized command, exiting...");
                       System.exit(1);
               }

               emojiGrid[i][j].draw();
            }
        }


    }
}
