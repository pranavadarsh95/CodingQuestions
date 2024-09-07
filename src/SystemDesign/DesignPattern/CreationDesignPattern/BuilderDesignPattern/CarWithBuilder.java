package SystemDesign.DesignPattern.BuilderDesignPattern;

public class CarWithBuilder {
    // Required Properties
    private String engine;
    private String fuel;
    private String seats;
    private String steering;

    // Optional Properties
    private String airBags;
    private String centralLock;
    private String musicSystem;
    private String sunRoof;

    @Override
    public String toString() {
        return "CarWithBuilder{" +
                "engine='" + engine + '\'' +
                ", fuel='" + fuel + '\'' +
                ", seats='" + seats + '\'' +
                ", steering='" + steering + '\'' +
                ", airBags='" + airBags + '\'' +
                ", centralLock='" + centralLock + '\'' +
                ", musicSystem='" + musicSystem + '\'' +
                ", sunRoof='" + sunRoof + '\'' +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        // Required Properties
        private String engine;
        private String fuel;
        private String seats;
        private String steering;

        // Optional Properties
        private String airBags;
        private String centralLock;
        private String musicSystem;
        private String sunRoof;

        public Builder withEngine(String engine) {
            this.engine = engine;
            return  this;
        }

        public Builder withFuel(String fuel) {
            this.fuel = fuel;
            return  this;
        }

        public Builder withSeats(String seats) {
            this.seats = seats;
            return  this;
        }

        public Builder withSteering(String steering) {
            this.steering = steering;
            return  this;
        }

        public Builder withAirBags(String airBags) {
            this.airBags = airBags;
            return  this;
        }

        public Builder withCentralLock(String centralLock) {
            this.centralLock = centralLock;
            return  this;
        }

        public Builder withMusicSystem(String musicSystem) {
            this.musicSystem = musicSystem;
            return  this;
        }

        public Builder withSunRoof(String sunRoof) {
            this.sunRoof = sunRoof;
            return  this;
        }

        public CarWithBuilder build(){
            if(this.engine == null || this.fuel == null || this.seats == null || this.steering == null)
                throw new RuntimeException("All required properties are not present");

            CarWithBuilder car = new CarWithBuilder();
            car.engine = engine;
            car.fuel = fuel;
            car.seats = seats;
            car.steering = steering;
            car.airBags = airBags;
            car.centralLock = centralLock;
            car.musicSystem = musicSystem;
            car.sunRoof = sunRoof;
            return car;
        }
    }
}
