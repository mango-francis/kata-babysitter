package BabySitter;

public class BabySitter
{

    private int startTime, endTime, bedTime;
    private WorkPaymentCalculator workPaymentCalculator;

    private DefaultHours DEFAULT_HOURS;
    private ErrorMessages ERROR_MESSAGES;

    // Empty Constructor

    public BabySitter()
    {
        this.startTime = DEFAULT_HOURS.START_TIME.getValue();
        this.endTime = DEFAULT_HOURS.END_TIME.getValue();
        this.bedTime = DEFAULT_HOURS.BED_TIME.getValue();
        workPaymentCalculator = new WorkPaymentCalculator(this.startTime, this.endTime, this.bedTime);
    }


    /**
     Full constructor
     @param startTime - user entered start time
     @param endTime - user entered end time
     @param bedTime - user entered bed time (for the child)
     @throws TimeEntryException - bad time is entered for any field
     */

    public BabySitter(int startTime, int endTime, int bedTime) throws TimeEntryException
    {
        this.checkInitTimes(startTime, endTime, bedTime);
        this.startTime = startTime;
        this.endTime = endTime;
        this.bedTime = bedTime;
        workPaymentCalculator = new WorkPaymentCalculator(this.startTime, this.endTime, this.bedTime);
    }

    /**
     Accessor method
     @return int - babysitter's start time
     */

    public int getStartTime()
    {
        return this.startTime;
    }


    /**
     Accessor method
     @return int - babysitter's end time
     */

    public int getEndTime()
    {
        return this.endTime;
    }


    /**
     Accessor method
     @return int - child's bed time
     */

    public int getBedTime()
    {
        return this.bedTime;
    }


    /**
     Accessor method
     @return int - baby sitter's pay for one night
     */

    public int getPay()
    {
        return workPaymentCalculator.calculatePay();
    }


    /**
     Helper method for the constructor
     Checks if initial times entered are valid

     @throws TimeEntryException - if bad time is entered
     */

    public void checkInitTimes(int startTime, int endTime, int bedTime) throws TimeEntryException
    {
        // check for too early start time
        if (startTime < DEFAULT_HOURS.START_TIME.getValue())
        {
            throw new TimeEntryException(ERROR_MESSAGES.START_TIME_TOO_EARLY.getValue());
        }

        // check for too late start time
        if (startTime > DEFAULT_HOURS.END_TIME.getValue() + 24)
        {
            throw new TimeEntryException(ERROR_MESSAGES.START_TIME_TOO_LATE.getValue());
        }

        // check if end time is too early
        if (endTime + 24 < DEFAULT_HOURS.START_TIME.getValue())
        {
            throw new TimeEntryException(ERROR_MESSAGES.END_TIME_TOO_EARLY.getValue());
        }
        // check if end time is too late
        if (endTime > DEFAULT_HOURS.END_TIME.getValue())
        {
            throw new TimeEntryException(ERROR_MESSAGES.END_TIME_TOO_LATE.getValue());
        }

        // check if bed time is too early
        if (bedTime < startTime)
        {
            throw new TimeEntryException(ERROR_MESSAGES.BED_TIME_BEFORE_START_TIME.getValue());
        }
        // check if bed time is too late
        if (bedTime > endTime + 24)
        {
            throw new TimeEntryException(ERROR_MESSAGES.BED_TIME_AFTER_END_TIME.getValue());
        }
    }


    /**
     Utility method
     @return string - stringified version of Babysitter
     */

    public String toString()
    {
        StringBuffer buffer = new StringBuffer();

        if (this.startTime > 12)
        {
            buffer.append("Your start time is: " + (this.startTime - 12) + " PM\n");
        }
        else
        {
            buffer.append("Your start time is: " + this.startTime + " AM\n");
        }

        if (this.bedTime > 12)
        {
            buffer.append("The child's bed time is: " + (this.bedTime - 12) + " PM\n");
        }
        else
        {
            buffer.append("The child's bed time is: " + this.bedTime + " AM\n");
        }

        if (this.endTime > 12)
        {
            buffer.append("Your end time is: " + (this.endTime - 12) + " PM\n");
        }
        else
        {
            buffer.append("Your end time is: " + this.endTime + " AM\n");
        }


        buffer.append("Your pay is: $" + String.format("%.2f", (double)getPay()));

        return buffer.toString();
    }

}