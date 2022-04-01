package BT_StopWatch;

public class StopWatch {
    float startTime;
    float stopTime;
    public StopWatch(float startTime, float stopTime) {
        this.startTime = startTime;
        this.stopTime = stopTime;
    }
    public float start() {
        return startTime = (float) System.currentTimeMillis();
    }
    public float stop() {
        return stopTime = (float) System.currentTimeMillis();
    }
    public float getElapsedTime(){
        return stopTime - startTime;
    }
}  vb