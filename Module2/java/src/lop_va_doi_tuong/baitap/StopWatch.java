package lop_va_doi_tuong.baitap;

import javafx.scene.paint.Stop;

import java.time.LocalDate;
import java.util.Calendar;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public long getStartTime() {
        return startTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public long start(){
        return startTime= Calendar.getInstance().getTimeInMillis();
    }
    public long stop(){
       return stopTime= Calendar.getInstance().getTimeInMillis();
    }
    public long getElapsedTime(){
        return this.stopTime-this.startTime;
    }
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        System.out.println(stopWatch.start());
        for (int i=0;i<50;i++){
        }
        System.out.println(stopWatch.stop());
        System.out.println(stopWatch.getElapsedTime());
    }
}
