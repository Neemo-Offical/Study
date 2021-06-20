package src.Study.Study9;

public class StopWatch {
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
