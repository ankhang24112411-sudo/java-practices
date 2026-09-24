package TuHoc.BaiTapMultithread.OnTap137138.B17DaemonThread;

public class Main {
    static void main(String[] args) {
        Thread monitor = new Thread(() -> {
            while (true) {
                System.out.println("Monitoring...");
            }
        });
        monitor.setDaemon(true);
    }
}
