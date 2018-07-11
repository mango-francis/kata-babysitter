package BabySitter;

public enum PayRates
{

    START_TO_BEDTIME(12),
    BEDTIME_TO_MIDNIGHT(8),
    MIDNIGHT_TO_END(16);

    private int value;

    PayRates(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

}