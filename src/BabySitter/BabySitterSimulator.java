package BabySitter;

public class BabySitterSimulator
{
    private static BabySitter babysitter;

    public static void main(String[] args)
    {
        if(args.length == 0)
        {
            babysitter = new BabySitter();
            System.out.println(babysitter.toString());
        }
        else if(args.length != 3)
        {
            printUsage();
            System.exit(0);
        }
        else
        {
            try
            {
                babysitter = new BabySitter(
                        Integer.parseInt(args[0]),
                        Integer.parseInt(args[1]),
                        Integer.parseInt(args[2])
                );
                System.out.println(babysitter.toString());
            }
            catch (Exception exception)
            {
                System.out.println(exception);
            }
        }
    }

    public static void printUsage()
    {
        System.out.println("Usage: BabySitterSimulator start_time end_time bed_time");
    }

}