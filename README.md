# Babysitter Kata

## Assumptions Made during the Design
- If not specified, the child's bed time is 8 PM or 20:00 hours (military / 24 hrs)
- Also, you will start working at exactly 5 PM or 17:00 hours
- Finally, you will end your working shift at exactly 4 AM
- Also, entered time values will be assumed to be exactly on the hour (XX:00 PM/AM
)

## How to run the program simulator and test suite

### From a Linux terminal

To run the program simulator

```
// from the project root
$ cd /out/production/kata-babysitter/

// you can also run the simulator by passing no args
// will use default values

$ java BabySitter.BabySitterSimulat <start_time> <end_time> <bed_time>
```

To run the test suite
```
$ cd /out/production/kata-babysitter/

$ java -cp .:BabySitterTest/* BabySitterTester.TestRunner
```

To run both the simulator and the test suite

 *However, default values for the simulator*

```
// navigate to this directory from project root folder
$ cd /out/prodction/kata-babysitter/

// Run the run.sh file (multiple ways to run it)
$ sh run.sh
```

## Background

This kata simulates a babysitter working and getting paid for one night.  The rules are pretty straight forward.

The babysitter:
- starts no earlier than 5:00PM
- leaves no later than 4:00AM
- gets paid $12/hour from start-time to bedtime
- gets paid $8/hour from bedtime to midnight
- gets paid $16/hour from midnight to end of job
- gets paid for full hours (no fractional hours)


## Feature
*As a babysitter<br>
In order to get paid for 1 night of work<br>
I want to calculate my nightly charge<br>*
