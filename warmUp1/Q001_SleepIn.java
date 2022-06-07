package warmUp1;

public class Q001_SleepIn {
    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
    //We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    //sleepIn(false, false) → true
    //sleepIn(true, false) → false
    //sleepIn(false, true) → true

    public static void main(String[] args) {
        System.out.println(sleeping(true, true));
        System.out.println(sleeping(false, false));
        System.out.println(sleeping(true, false));
    }

    public static boolean sleeping(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
}

