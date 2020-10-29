package thread.tortoise;
import javax.swing .*;
import java.sql.Time;
import java.util.Date;

    public class Tortoise extends Thread {
        private static final int MILESTONES = 5;

        private final Thread tortoise;

        public Tortoise() {
            this.tortoise = new Thread(this, "Tortoise");
        }

        public Thread getTortoise() {
            return tortoise;
        }

        @Override
        public void run() {

            for (int index = 0; index < MILESTONES; index++) {
                switch (index) {
                    case 0:
                        System.out.println("The Tortoise has started from the start line!");
                    case 1:
                        System.out.println("The Tortoise has reached the Cool River!");
                    case 2:
                        System.out.println("The Tortoise has reached the Mountain Hill!");
                    case 3:
                        System.out.println("The Tortoise has reached the Big Oak Tree!");
                    case 4: {
                        System.out.println("The Tortoise has reached the finish line!");
                        break;
                    }
                }
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e) {
                    System.err.println("The Tortoise has lost the path!");
                }
            }
            Date date = new Date();
            Time time = new Time(date.getTime());
            System.out.println("Tortoise has finished race at: " + time);
            JOptionPane.showConfirmDialog(
                    null,
                    "The Tortoise has completed the race!",
                    "Tortoise",
                    JOptionPane.OK_CANCEL_OPTION
            );
        }
    }

