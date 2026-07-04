package com.pratic;


class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] getLastWeek = {0, 2, 5, 3, 7, 8, 4};
        return getLastWeek;
    }

    public int getToday() {
        int getToday = birdsPerDay[6];
        return getToday;
    }

    public void incrementTodaysCount() {
        birdsPerDay[6] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] == 0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalBirds = 0;
        if (numberOfDays > 7){
            for (int higher : birdsPerDay){
                totalBirds += higher;
            }
        } else{
            for (int i = 0; i < numberOfDays; i++){
                totalBirds += birdsPerDay[i];
            }
        }
        return totalBirds;
    }

    public int getBusyDays() {
        int days = 0;
        for (int i = 0; i < birdsPerDay.length; i++){
            if (birdsPerDay[i] >= 5){
                days++;
            }
        }
        return days;
    }
}
