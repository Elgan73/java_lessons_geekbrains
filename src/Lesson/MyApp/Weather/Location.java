package Lesson.MyApp.Weather;

public class Location {
        private String name;
        private String country;
        private String region;
        private String lat;
        private String lon;
        private String localtime;

        public String getName() {
            return name;
        }

        public String getCountry() {
            return country;
        }

        public String getRegion() {
            return region;
        }

        public String getLat() {
            return lat;
        }

        public String getLon() {
            return lon;
        }


        public String getLocaltime() {
            return localtime;
        }



        public void setName(String name) {
            this.name = name;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }


        public void setLocaltime(String localtime) {
            this.localtime = localtime;
        }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", localtime='" + localtime + '\'' +
                '}';
    }
}
