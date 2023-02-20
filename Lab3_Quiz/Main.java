package Lab3_Quiz;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Subscribers sub = new Subscribers("Alperen", "Gökbak", channel);
        MemberShipOwner member = new MemberShipOwner("Ali", "Gökçe", channel);
        sub.update();
        member.update();
        channel.addPerson(sub);
        channel.addPerson(member);
    }
}
