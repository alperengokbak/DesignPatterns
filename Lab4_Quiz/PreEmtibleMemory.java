package Lab4_Quiz;

public class PreEmtibleMemory extends Resources{

    public PreEmtibleMemory(Server server) {
        this.server = server;
    }

    @Override
    public double cost() {
        return server.cost() +  0.000920;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + "PreEmtibleMemory ";
    }
    
}
