import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, " + name + "! How are you today?";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();

        return "The date today is " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        
        return "The conversation";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

