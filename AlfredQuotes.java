import java.util.Date;
import java.text.SimpleDateFormat;

public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        // returns a response with the name formatted in
        String guest = String.format("Hello %s, It is so nice to see you again!", name);
        return guest;
    }

    public String dateAnnouncement() {
        // gets todays date and time and returns a response
        Date todaysDate = new Date();
        return String.format("The current date and time today is %s.", todaysDate);
    }

    public String respondBeforeAlexis(String conversation) {
        // Checks to see if the arg has these strings then returns the proper response
        if (conversation.indexOf("Alexis") > -1) {
            String messageBeforeAlexis = "I've got it sir, don't expect Her to do it....";
            return messageBeforeAlexis;
        } else if (conversation.indexOf("Alfred") > -1) {
            String messageBeforeAlexis = "You know I will always have your back sir, don't you forget it";
            return messageBeforeAlexis;
        } else {
            String messageBeforeAlexis = "Ok then, if there is nothing else sir, then I'll call it a night";
            return messageBeforeAlexis;
        }
    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method

    public String guestGreeting(String name, int arg) {
        // returns a response with the name and current date formatted in
        Date today = new Date();
        SimpleDateFormat todayHour = new SimpleDateFormat("hh");
        int hourOfDay = Integer.parseInt(todayHour.format(today));

        // System.out.println("");
        // System.out.println("hourInt");
        // System.out.println(hourOfDay);
        // System.out.println("");

        // add in if/elseif/else to find the time of day
        // 0 to 11 - "morning"
        // 12 to 6 - "afternoon"
        // 7 to 23 - "evening"
        String dayTimResponse;
        if (hourOfDay > 0 && hourOfDay < 12) {
            dayTimResponse = ("Morning");

        } else if (hourOfDay > 12 && hourOfDay < 18) {
            dayTimResponse = ("Afternoon");

        } else {
            dayTimResponse = ("Evening");

        }

        String guest = String.format(
                "Well good %s %s, its %s O'clock in the %s, so nice of you to show up at this time!", dayTimResponse,
                name,
                (hourOfDay % 12), dayTimResponse);
        return guest;
    }

    // t- ================================ IN WORK
    // t- =========vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv==============

    public String dontWakeMeUpEarly() {
        Date today = new Date();
        SimpleDateFormat todayHour = new SimpleDateFormat("hh");
        int hourOfDay = Integer.parseInt(todayHour.format(today));

        String dayTimResponse;
        if (hourOfDay > 0 && hourOfDay < 12) {
            dayTimResponse = ("IT'S WAY TO EARLY IN THE MORNING TO NEED ANYTHING, GO BACK TO BED you @#^$%@$^&!!!!");
        } else if (hourOfDay > 12 && hourOfDay < 18) {
            dayTimResponse = ("OK, WHAT TO DO YOU WANT NOW?????");
        } else {
            dayTimResponse = ("Well, Good Evening, I'll be happy to do that at this time.");
        }
        return dayTimResponse;
    }
    // t- ================^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^=================
    // t- ================================ IN WORK

    // SENSEI BONUS

}