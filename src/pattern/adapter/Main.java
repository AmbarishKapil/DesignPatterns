package pattern.adapter;

public class Main {
    public static void main(String[] args) {
        PlayerAI ai = new SmartBehaviourAdapter();
        String aiResponse = ai.smartResponse("easy peasy lemon squeezy!");
        System.out.println(aiResponse);
    }
}
