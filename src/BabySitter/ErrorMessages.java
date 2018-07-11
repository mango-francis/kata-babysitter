package BabySitter;

public enum ErrorMessages
{

    START_TIME_TOO_EARLY ("The entered START TIME is TOO EARLY: must be after 5 PM or 17:00"),
    START_TIME_TOO_LATE ("The entered START TIME is TOO LATE: must be BEFORE 4 AM"),
    BED_TIME_BEFORE_START_TIME ("The entered BED TIME is TOO EARLY: must be after your start time"),
    BED_TIME_AFTER_END_TIME ("The entered BED TIME is TOO EARLY: must be before your end time"),
    END_TIME_TOO_EARLY ("The entered END TIME is TOO EARLY: must leave at least after 5 PM or 17:00"),
    END_TIME_TOO_LATE ("The entered END TIME is TOO LATE: must leave before 4 AM"),
    START_AND_END_TIMES_MISMATCH ("The entered START TIME must come before the entered END TIME");

    private String value;

    ErrorMessages(String value)
    {
        this.value = value;
    }

    public String getValue()
    {
        return this.value;
    }

}