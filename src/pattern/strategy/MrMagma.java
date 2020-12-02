package pattern.strategy;

public class MrMagma extends Avatar{
    public MrMagma() {
        super("Mr. Magma", 0.99d, new Crawl(), new Fire());
    }
}
