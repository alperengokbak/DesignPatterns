package Lab4_Quiz;

public class OnDemandMemory extends Resources{

    @Override
    public String getDescription() {
        return server.getDescription() + "OnDemandMemory ";
    }

    public OnDemandMemory(Server server) {
        this.server = server;
    }

    @Override
    public double cost() {
        return server.cost() + 0.003067;
    }
    
}
