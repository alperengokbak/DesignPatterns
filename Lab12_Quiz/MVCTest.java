package Lab12_Quiz;

public class MVCTest {
    private static Country retriveEmployeeFromDatabase() {
        Country country = new Country();
        country.setName("Liechtenstein");
        country.setIso("LI");
        country.setContinent("Europe");
        country.setPopulation(38387);
        return country;
    }

    public static void main(String[] args) {
        Country countryModel = retriveEmployeeFromDatabase();
        CountryView countryView = new CountryView();

        CountryController countryController = new CountryController(countryModel, countryView);
        countryController.updateView();

        countryController.setPopulation(38390);
        countryController.countrySetIso("LIE");
        countryController.updateView();
    }
}
