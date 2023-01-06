package Lab4_Quiz;

public class OnDemandCpu extends Resources{

    public OnDemandCpu(Server server) {
        this.server = server;
    }

    @Override
    public double cost() {
        return server.cost() + 0.022890;
    }

    @Override
    public String getDescription() {
        return server.getDescription() + "OnDemandCpu ";
    }
    
}
