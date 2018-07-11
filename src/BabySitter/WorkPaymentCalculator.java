package BabySitter;

public class WorkPaymentCalculator
{

    private int startTime, endTime, bedTime;

    private PayRates PAYRATES;

    public WorkPaymentCalculator(int startTime, int endTime, int bedTime)
    {
        this.startTime = startTime;
        this.endTime = endTime;
        this.bedTime = bedTime;
    }

    public int calculatePay()
    {
        return (payFromStartToBed() + payFromBedToMidnight() + payFromMidnightToEnd());
    }

    public int payFromStartToBed()
    {
        return (this.bedTime - this.startTime) * PAYRATES.START_TO_BEDTIME.getValue();
    }

    public int payFromBedToMidnight()
    {
        if (this.bedTime >= 24)
        {
            return 0;
        }
        return (24 - this.bedTime) * PAYRATES.BEDTIME_TO_MIDNIGHT.getValue();
    }

    public int payFromMidnightToEnd()
    {
        if (this.endTime > 5)
        {
            return 0;
        }
        return (this.endTime * PAYRATES.MIDNIGHT_TO_END.getValue());
    }

}