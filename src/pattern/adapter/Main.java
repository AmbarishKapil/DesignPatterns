package pattern.adapter;

/**
 * This is an implementation of the adapter pattern
 *
 * Here we are designing an Adapter: SmartBehaviourAdapter which lays between the client code
 * and a NLP library(used for NPC character dialogue). This has two advantages: 1. It handles
 * any intermediary processing such as data format mismatch, additional parameters etc... that the client
 * need not be bothered about. 2. If, say, we decide to use another NLP library in the future
 * then all the clients that were using the previous library need not be bothered, we can simply
 * use another library in the SmartBehaviourAdapter class and not touch any other file.
 */
public class Main {
    public static void main(String[] args) {
        PlayerAI ai = new SmartBehaviourAdapter();
        String aiResponse = ai.smartResponse("easy peasy lemon squeezy!");
        System.out.println(aiResponse);
    }
}
