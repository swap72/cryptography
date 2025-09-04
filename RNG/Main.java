import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;

public class Main {

    static long Droot(long x) {
        x = Math.abs(x);
        long sum = 0;
        while (x > 0) {
            sum = sum + x % 10;
            x /= 10;
        }
        while (sum > 9) {
            return Droot(sum);
        }
        return sum;
    }

    static int TimeSalt() {
        int attempts = 10;
        for (int i = 0; i < attempts; i++) {
            long rnd1 = System.currentTimeMillis();
            int ld = (int) (rnd1 % 10);
            if (ld % 2 != 0) {
                return ld;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        return 3;
    }

    static int CustomRandom(OperatingSystemMXBean osBean) {
        double val = osBean.getProcessCpuLoad();
        String str = Double.toString(val);
        str = str.replace(".", "");
        char lastDigit = str.charAt(str.length() - 1);
        long memUsed = osBean.getTotalMemorySize() - osBean.getFreeMemorySize();
        int rnd1 = (int) Droot(Math.abs(osBean.getProcessCpuTime() - memUsed));
        return Character.getNumericValue(lastDigit) * Main.TimeSalt() + rnd1 - Main.TimeSalt() / rnd1;
    }


    public static void main(String[] args) {
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(OperatingSystemMXBean.class);
        System.out.println(CustomRandom(osBean));
    }
}
