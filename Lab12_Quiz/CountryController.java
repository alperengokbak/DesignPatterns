package Lab12_Quiz;

public class CountryController {
    private Country countryModel;
    private CountryView countryView;

    public CountryController(Country countryModel, CountryView countryView) {
        this.countryModel = countryModel;
        this.countryView = countryView;
    }

    void updateView() {
        countryView.print(getName(), getIso(), getContinent(), getPopulation());
    }

    void setPopulation(int i) {
        countryModel.setPopulation(i);
    }

    void countrySetIso(String iso) {
        countryModel.setIso(iso);
    }

    String getName() {
        return countryModel.getName();
    }

    String getIso() {
        return countryModel.getIso();
    }

    String getContinent() {
        return countryModel.getContinent();
    }

    int getPopulation() {
        return countryModel.getPopulation();
    }

}
