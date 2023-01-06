package Lab3_Quiz;

public interface IChannel {
    void addPerson(IPerson observer);
    void deletePerson(IPerson observer);
    void notifyPerson();
}
