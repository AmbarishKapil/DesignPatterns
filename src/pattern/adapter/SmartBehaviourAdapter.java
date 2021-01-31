package pattern.adapter;

public class SmartBehaviourAdapter implements PlayerAI{
    LSTMLibrary lstmLibrary;
    GPTLibrary gptLibrary;

    public SmartBehaviourAdapter(){
        lstmLibrary = new LSTMLibrary();
        gptLibrary = new GPTLibrary();
    }

    @Override
    public String smartResponse(String input) {
        //return lstmLibrary.smartChat(input);
        return gptLibrary.gptResponse(input);
    }
}
