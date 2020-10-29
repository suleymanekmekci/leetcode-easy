/*
1154. Day of the Year
https://leetcode.com/problems/day-of-the-year/

Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

 

Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:

Input: date = "2019-02-10"
Output: 41
Example 3:

Input: date = "2003-03-01"
Output: 60
Example 4:

Input: date = "2004-03-01"
Output: 61
 

Constraints:

date.length == 10
date[4] == date[7] == '-', and all other date[i]'s are digits
date represents a calendar date between Jan 1st, 1900 and Dec 31, 2019.
*/

class dayOfYear {
    public int dayOfYear(String date) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        
        int day = Integer.parseInt(date.split("-")[2]);
        int month = Integer.parseInt(date.split("-")[1]);
        int year = Integer.parseInt(date.split("-")[0]);
      
        // overleap year find the month and day. for month section find sum of the months from 1 to month + days. if overleap year +1
        
        int totalDay = 0;
        
        for (int i = 0; i < month-1; i++) {
            totalDay+= days[i];
        }
        
        totalDay += day;
        
        if (year % 4 == 0 && month > 2 && year != 1900){
            
            totalDay+=1;
        }
        
        return totalDay;
        
        
        
    }
}
