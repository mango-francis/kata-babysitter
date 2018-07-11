package BabySitter;

public enum DefaultHours
{

    START_TIME(17),
    END_TIME(4),
    BED_TIME(20);

    private int value;

    DefaultHours(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return this.value;
    }

}