package Lab4_Quiz;

public class PreEmtibleCpu extends Resources{

    public PreEmtibleCpu(Server server) {
        this.server = server;
    }

    @Override
    public double cost() {
        return server.cost() + 0.006867;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + "PreEmtibleCpu ";
    }
    
}
