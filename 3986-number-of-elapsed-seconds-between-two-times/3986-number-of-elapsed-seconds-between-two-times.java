class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int sec1=Integer.valueOf(endTime.substring(0,2))*60*60+Integer.valueOf(endTime.substring(3,5))*60+Integer.valueOf(endTime.substring(6));
         int sec2=Integer.valueOf(startTime.substring(0,2))*60*60+Integer.valueOf(startTime.substring(3,5))*60+Integer.valueOf(startTime.substring(6));
         int remSec=sec1-sec2;
        return remSec;
    }
}