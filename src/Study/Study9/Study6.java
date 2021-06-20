package src.Study.Study9;

public class Study6 {
    public static void main(String[] args) {
    StopWatch watch1 = new StopWatch();
    double start = watch1.start();

    }

    public static class StopWatch {
        private double startTime;
        private double endTime;
        StopWatch() {
            startTime = System.currentTimeMillis();
        }

        public double start() {
            return startTime = System.currentTimeMillis();
        }
        public double stop() {
            return endTime = System.currentTimeMillis();
        }

        double getElapsedTime() {
            return endTime - startTime;
        }
    }
}
