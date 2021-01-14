package pattern.chainofresponsibility;

public abstract class MovementHandler {
    MovementHandler next;

    abstract void handle(String destination);

    MovementHandler setNext(MovementHandler h){
        this.next = h;
        return this;
    }
}
