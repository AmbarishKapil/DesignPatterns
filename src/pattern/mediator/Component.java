package pattern.mediator;

public interface Component {
    void setMediator(Mediator mediator);
    void operation();
}
