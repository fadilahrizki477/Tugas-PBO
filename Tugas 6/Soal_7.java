class TheThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread baru sedang berjalan...");
    }
}
public class Soal_7 {

    public static void main(String[] args) {
        TheThread threadBaru = new TheThread();

        threadBaru.start();
    }
}
