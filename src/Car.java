class Car {
    int initialOdometerReading;
    int finalOdometerReading;
    double litersUsed;

    public Car(int initialOdometerReading, int finalOdometerReading, double litersUsed) {
        this.initialOdometerReading = initialOdometerReading;
        this.finalOdometerReading = finalOdometerReading;
        this.litersUsed = litersUsed;
    }

    public Car(int finalOdometerReading, double litersUsed) {
        this.finalOdometerReading = finalOdometerReading;
        this.litersUsed = litersUsed;
    }

    public double getKilometersPerLiter() {
        return (finalOdometerReading - initialOdometerReading) / litersUsed;
    }

    public boolean isEconomyCar() {
        return getKilometersPerLiter() < 5;
    }

    public boolean isFuelGuttler() {
        return getKilometersPerLiter() > 15;
    }
}
