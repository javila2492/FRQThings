public class StepTracker
{
    private int stepsTaken = 0;
    private int totalDays = 0;
    private int activeDays = 0;
    private int minSteps;

    public StepTracker(int minSteps)
    {
        this.minSteps = minSteps;
    }

    public void addDailySteps(int steps)
    {
        stepsTaken += steps;
        if(steps >= minSteps)
            activeDays++;
    }

    public int activeDays()
    {
        return activeDays;
    }

    public double averageSteps()
    {
        return (double) (stepsTaken / totalDays);
    }
}
