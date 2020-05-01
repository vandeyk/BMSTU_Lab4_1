package com.company;

public class Main {

    public static void main(String[] args) {

        // write your code here
        Calendar cal = new Calendar();
        cal.Show();
        cal.AddHoliday("Christmas", 0, 6);
        cal.AddHoliday("Mothers Day", 30, 31);
        cal.AddHoliday("Fathers Day", 12, 13);
        cal.AddHoliday("Quarantine", 64, 88);
        cal.Show();

    }
}
