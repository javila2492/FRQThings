public class APCalendar
{
    /** Returns true if year is a leap year and false otherwise. */
    private static boolean isLeapYear(int year)
    {
        return ((year / 4) % 2 == 0);
    }

    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
     */
    public static int numberOfLeapYears(int year1, int year2)
    {
        int counter = 0;
        for(int i = year1; i <= year2; i++)
            if(isLeapYear(i))
                counter++;
        return counter;
    }

    /** Returns the value representing the day of the week for the first day of year,
     * where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
     */
    private static int firstDayOfYear(int year)
    {
        return year % 7;
    }

    /** Returns n, where month, day, and year specify the nth day of the year.
     * Returns 1 for January 1 (month = 1, day = 1) of any year.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    private static int dayOfYear(int month, int day, int year)
    {
        return (month * 30) + day;
    }

    /** Returns the value representing the day of the week for the given date
     * (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
     * and 6 denotes Saturday.
     * Precondition: The date represented by month, day, year is a valid date.
     */
    public static int dayOfWeek(int month, int day, int year)
    {
        int b = dayOfYear(month, day, year);
        int c = firstDayOfYear(year);
        for(int i = firstDayOfYear(year); i <= b; i++)
        {
            c++;
            if(c >= 7)
                c = 0;
        }
        return c;
    }
}
