import java.util.Scanner;

public class ArtificialIntelligenceChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("User: ");
            String input = scanner.nextLine();
            String[] tokens = Tokenizer.tokenize(input);
            String intent = IntentRecognizer.recognizeIntent(tokens);
            String response = ResponseGenerator.generateResponse(intent);
            System.out.println("Chatbot: " + response);
        }
    }
    public class Tokenizer {
        public static String[] tokenize(String input) {
            return input.split("\\s+");
        }
    }
    public class IntentRecognizer {
        public static String recognizeIntent(String[] tokens) {
            for (String token : tokens) {
                if (token.equalsIgnoreCase("weather")) {
                    return "weather";
                } else if (token.equalsIgnoreCase("restaurant")) {
                    return "restaurant";
                } else if (token.equalsIgnoreCase("flight")) {
                    return "flight";
                }
                else if (token.equalsIgnoreCase("hi")) {
                return "hi";
            }
            }
            return "unknown";
        }
    }
    public class ResponseGenerator {
        public static String generateResponse(String intent) {
        	intent=intent.toUpperCase();
        	switch (intent) {
                case "WEATHER":
                    return "The weather today is sunny with a temperature of 35 degrees Celsius in India.";
                case "RESTAURANT":
                    return "Sure! I recommend trying 'SK fast foods' located on Main Street. They serve fast foods.";
               case "FLIGHT":
                    return "Great! Please provide me with your preferred departure date and any specific airline preferences.";
                case "HI":
                	return "Hi! my name is Sylvia.";
                default:
                    return "I didn't understand your request. Please try again!";
            }
        }
    }
} 
