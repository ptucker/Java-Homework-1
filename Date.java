/*
I have failed on this project.  I'm already late on turning it in, I've already been working
on it for over 4 hours, and I'm throwing int he towel.  I feel like I have thoroughly confused
myself and gotten off track.  I acknowledge that this project is lacking a test class,
assertions, and does not accurately compute the amount of days between two Date objects 
within the Compare function.  I'll just take this one on the cheek...
*/


public class Date {

    // Private member variables
    private int month;                          
    private int date;
    private int year;
    // Private static member variables to track the current date
    private static int thisMonth = 1;
    private static int today = 5;
    private static int currentYear = 2019;

    // Constructors
    
    // No Arg Constructor automatically creates a date object for the current date.
    Date() {
        Date todayDate = new Date(today, thisMonth, currentYear);
            // 1st Check is to see if the current month has 31 days but isn't December
            if (thisMonth == 1 || thisMonth == 3 || thisMonth == 5 || thisMonth == 7 || thisMonth == 8 || thisMonth == 10) {
                if (today < 31) {           // If it isn't the last day of the month
                    today++;                // Increment the day
                }
                else {                      // Since it's the last day of the month
                    thisMonth++;            // We better increment the month 
                    today = 1;              // And reset the day to the 1st
                }
            // Now, let's see if the current month has 30 days    
            }
            else if (thisMonth == 4 || thisMonth == 6 || thisMonth == 9 || thisMonth == 11) {
                if (today < 30) {           // It isn't the last day of the month so
                    today++;                // Let's increment the day
                }
                else {                      // It is the last day of the month so
                    thisMonth++;            // let's increment the month
                    today = 1;              // and reset the day to the 1st
                }
            }
            // Is it currently February?
            else if (thisMonth == 2) {
                if (today < 28) {           // Is the current day the last day of February?
                    today++;                // Okay, then we can increment the day
                }
                else {                      // Yes, today is February 28th
                    thisMonth++;            // So, we better jump to March
                    today = 1;              // And reset the day to the 1st
                }
            }
            // Well, we've reached the end of another year...it's Christmas time!
            else {
                if (today < 31) {           // Is it the last day of this year?
                    today++;                // Nope, let's increment the day                    
                }
                else {                      // Holy Moly!  Let's party, it's New Year's Eve!
                    thisMonth = 1;          // We better reset the month to January
                    today = 1;              // And reset the day to the 1st
                    currentYear++;          // And not forget to increment the year
                }
            }

            month = thisMonth;
            date = today;
            year = currentYear;

        }
        // Overloaded constructor constructs a date object for the date specified by the arguments
        Date(int Month, int Day, int Year) {
            month = Month;
            date = Day;
            year = Year;
        }

        // Getter Functions
        int getMonth() { return month; }
        int getDate() { return date; }
        int getYear() { return year; }

        // Setter Functions
        void setMonth(int adjustedMonth) { month = adjustedMonth; }
        void setDate(int adjustedDate) { date = adjustedDate; }
        void setYear(int adjustedYear) { year = adjustedYear; }

        // Class Methods for comparing Date objects and obtainging information about Date objects

        // A static function that returns today's date
        public static String todaysDate() {
            return thisMonth + "-" + today + "-" + currentYear;
        }
        // A function for caluculating how many days are between 2 date objects
        // This is basically where I realized how long I've spent on a project that is 
        // worth 10 points and gave up.  I'm completely lost on how to make this accurate.
        public int Compare(Date one, Date two) {
            if(one.year == two.year) {
                if(one.month == two.month){
                    if(one.date == two.date) {
                        return 0;
                    }
                    else if(one.month > two.month){
                        return one.month - two.month;
                    }
                    else{
                        return two.month - one.month;
                    }
                }
                else if (one.month > two.month){
                    int Holder = one.month - two.month;
                    int Holder2 = 31 - two.month;
                    int Holder3 = 31 - one.month;
                    if (Holder > 1) {
                        Holder *= 31;
                    } 
                    return Holder + Holder2 + Holder3;
                }
                else {
                    int Holder = one.month - two.month;
                    int Holder2 = 31 - two.month;
                    int Holder3 = 31 - one.month;
                    if (Holder > 1) {
                        Holder *= 31;
                    } 
                    return Holder + Holder2 + Holder3; 
                }
            }
            else if (one.year > two.year) {
                int Holder = one.year - two.year;
                int Holder2 = one.month * 31;
                int Holder3 = two.month * 31;
                if (Holder > 1) {
                    Holder *= 365;
                }
                return Holder + Holder2 + Holder3;
            }
            else {
                int Holder = two.year - one.year;
                int Holder2 = one.month * 31;
                int Holder3 = two.month * 31;
                if (Holder > 1) {
                    Holder *= 365;
                }
                return Holder + Holder2 + Holder3;
            }
        }
    
}