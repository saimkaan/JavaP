import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import static java.lang.Thread.sleep;

/**
 * Created by saim on 28/06/16.
 */
public class RandomTime extends Thread{
    String name;

    public RandomTime(String name) {
        super();
        this.name = name;
    }

    // Thread erweitern oder Runnable implementieren
    // Klassenvariable String name (über Kontruktor setzen)
    // showRandomTime() -> zufällig im abstand von
    // 1-5 Sek.Zeit ausgeben
    @Override
    public void run() {
        try {
            showRandomTime();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public void showRandomTime(){
//        for (int i = 0; i < 20; i++) {
//            long startZeit = System.currentTimeMillis();
//            System.out.println(name);
//            Calendar cal = Calendar.getInstance();
//            System.out.printf("%tT%n", cal );
//            System.out.println();
//            try {
//                Thread.sleep((long) (Math.random() * 4000 + 1000));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            long dauer = System.currentTimeMillis()-startZeit;
//            System.out.println("vergangene Zeit "
//                    + dauer);
//        }
//    }

    public void showRandomTime() throws InterruptedException {
        Random rnd = new Random();
        Calendar cal = Calendar.getInstance();
        int time;

        for (int i = 0; i < 20; i++) {
            time = rnd.nextInt(4000)+1000;
            System.out.println("[" + name + "]\t");
            System.out.printf("%tT%n", cal );
            System.out.println("(" + time + ")");
            sleep(time);
        }
    }


}
