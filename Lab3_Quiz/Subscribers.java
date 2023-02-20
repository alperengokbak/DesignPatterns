package Lab3_Quiz;

public class Subscribers implements IPerson{
    Channel channel;
    String firstName;
    String lastName;

    public Subscribers(String firstName, String lastName, Channel channel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.channel = channel;
    }

    @Override
    public void update() {
        System.out.println("Wake up! " + this.firstName + " " + this.lastName + " ! " + channel.getClass() + " uploaded new video.");
    }
}
