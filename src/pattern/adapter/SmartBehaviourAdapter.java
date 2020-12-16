package pattern.adapter;

//This is the adapter, currently we are using LSTM model for nlp but in the future we can switch to the GPT model
public class SmartBehaviourAdapter implements PlayerAI{
    LSTMLibrary LSTMLibrary;

    public SmartBehaviourAdapter(){
        LSTMLibrary = new LSTMLibrary();
    }

    @Override
    public String smartResponse(String input) {
        return LSTMLibrary.smartChat(input);
    }
}
