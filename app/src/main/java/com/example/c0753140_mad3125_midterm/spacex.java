package com.example.c0753140_mad3125_midterm;

import java.util.List;

public abstract class spacex {

    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("timeline")
    private Timeline timeline;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("static_fire_date_unix")
    private int static_fire_date_unix;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("static_fire_date_utc")
    private String static_fire_date_utc;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("details")
    private String details;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("links")
    private Links links;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("launch_failure_details")
    private Launch_failure_details launch_failure_details;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("launch_success")
    private boolean launch_success;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("launch_site")
    private Launch_site launch_site;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("telemetry")
    private Telemetry telemetry;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("ships")
    private List<String> ships;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("rocket")
    private Rocket rocket;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("launch_window")
    private int launch_window;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("tbd")
    private boolean tbd;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("tentative_max_precision")
    private String tentative_max_precision;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("is_tentative")
    private boolean is_tentative;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("launch_date_local")
    private String launch_date_local;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("launch_date_utc")
    private String launch_date_utc;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("launch_date_unix")
    private int launch_date_unix;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("launch_year")
    private String launch_year;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("upcoming")
    private boolean upcoming;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("mission_id")
    private List<String> mission_id;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("mission_name")
    private String mission_name;
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName("flight_number")
    private int flight_number;

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public int getStatic_fire_date_unix() {
        return static_fire_date_unix;
    }

    public void setStatic_fire_date_unix(int static_fire_date_unix) {
        this.static_fire_date_unix = static_fire_date_unix;
    }

    public String getStatic_fire_date_utc() {
        return static_fire_date_utc;
    }

    public void setStatic_fire_date_utc(String static_fire_date_utc) {
        this.static_fire_date_utc = static_fire_date_utc;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Launch_failure_details getLaunch_failure_details() {
        return launch_failure_details;
    }

    public void setLaunch_failure_details(Launch_failure_details launch_failure_details) {
        this.launch_failure_details = launch_failure_details;
    }

    public boolean getLaunch_success() {
        return launch_success;
    }

    public void setLaunch_success(boolean launch_success) {
        this.launch_success = launch_success;
    }

    public Launch_site getLaunch_site() {
        return launch_site;
    }

    public void setLaunch_site(Launch_site launch_site) {
        this.launch_site = launch_site;
    }

    public Telemetry getTelemetry() {
        return telemetry;
    }

    public void setTelemetry(Telemetry telemetry) {
        this.telemetry = telemetry;
    }

    public List<String> getShips() {
        return ships;
    }

    public void setShips(List<String> ships) {
        this.ships = ships;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public int getLaunch_window() {
        return launch_window;
    }

    public void setLaunch_window(int launch_window) {
        this.launch_window = launch_window;
    }

    public boolean getTbd() {
        return tbd;
    }

    public void setTbd(boolean tbd) {
        this.tbd = tbd;
    }

    public String getTentative_max_precision() {
        return tentative_max_precision;
    }

    public void setTentative_max_precision(String tentative_max_precision) {
        this.tentative_max_precision = tentative_max_precision;
    }

    public boolean getIs_tentative() {
        return is_tentative;
    }

    public void setIs_tentative(boolean is_tentative) {
        this.is_tentative = is_tentative;
    }

    public String getLaunch_date_local() {
        return launch_date_local;
    }

    public void setLaunch_date_local(String launch_date_local) {
        this.launch_date_local = launch_date_local;
    }

    public String getLaunch_date_utc() {
        return launch_date_utc;
    }

    public void setLaunch_date_utc(String launch_date_utc) {
        this.launch_date_utc = launch_date_utc;
    }

    public int getLaunch_date_unix() {
        return launch_date_unix;
    }

    public void setLaunch_date_unix(int launch_date_unix) {
        this.launch_date_unix = launch_date_unix;
    }

    public String getLaunch_year() {
        return launch_year;
    }

    public void setLaunch_year(String launch_year) {
        this.launch_year = launch_year;
    }

    public boolean getUpcoming() {
        return upcoming;
    }

    public void setUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
    }

    public List<String> getMission_id() {
        return mission_id;
    }

    public void setMission_id(List<String> mission_id) {
        this.mission_id = mission_id;
    }

    public String getMission_name() {
        return mission_name;
    }

    public void setMission_name(String mission_name) {
        this.mission_name = mission_name;
    }

    public int getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(int flight_number) {
        this.flight_number = flight_number;
    }

    public static class Timeline {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("webcast_liftoff")
        private int webcast_liftoff;

        public int getWebcast_liftoff() {
            return webcast_liftoff;
        }

        public void setWebcast_liftoff(int webcast_liftoff) {
            this.webcast_liftoff = webcast_liftoff;
        }
    }

    public static class Links {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("flickr_images")
        private List<String> flickr_images;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("youtube_id")
        private String youtube_id;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("video_link")
        private String video_link;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("wikipedia")
        private String wikipedia;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("article_link")
        private String article_link;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("mission_patch_small")
        private String mission_patch_small;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("mission_patch")
        private String mission_patch;

        public List<String> getFlickr_images() {
            return flickr_images;
        }

        public void setFlickr_images(List<String> flickr_images) {
            this.flickr_images = flickr_images;
        }

        public String getYoutube_id() {
            return youtube_id;
        }

        public void setYoutube_id(String youtube_id) {
            this.youtube_id = youtube_id;
        }

        public String getVideo_link() {
            return video_link;
        }

        public void setVideo_link(String video_link) {
            this.video_link = video_link;
        }

        public String getWikipedia() {
            return wikipedia;
        }

        public void setWikipedia(String wikipedia) {
            this.wikipedia = wikipedia;
        }

        public String getArticle_link() {
            return article_link;
        }

        public void setArticle_link(String article_link) {
            this.article_link = article_link;
        }

        public String getMission_patch_small() {
            return mission_patch_small;
        }

        public void setMission_patch_small(String mission_patch_small) {
            this.mission_patch_small = mission_patch_small;
        }

        public String getMission_patch() {
            return mission_patch;
        }

        public void setMission_patch(String mission_patch) {
            this.mission_patch = mission_patch;
        }
    }

    public static class Launch_failure_details {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("reason")
        private String reason;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("time")
        private int time;

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }
    }

    public static class Launch_site {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("site_name_long")
        private String site_name_long;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("site_name")
        private String site_name;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("site_id")
        private String site_id;

        public String getSite_name_long() {
            return site_name_long;
        }

        public void setSite_name_long(String site_name_long) {
            this.site_name_long = site_name_long;
        }

        public String getSite_name() {
            return site_name;
        }

        public void setSite_name(String site_name) {
            this.site_name = site_name;
        }

        public String getSite_id() {
            return site_id;
        }

        public void setSite_id(String site_id) {
            this.site_id = site_id;
        }
    }

    public static class Telemetry {
    }

    public static class Rocket {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("fairings")
        private Fairings fairings;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("second_stage")
        private Second_stage second_stage;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("first_stage")
        private First_stage first_stage;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("rocket_type")
        private String rocket_type;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("rocket_name")
        private String rocket_name;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("rocket_id")
        private String rocket_id;

        public Fairings getFairings() {
            return fairings;
        }

        public void setFairings(Fairings fairings) {
            this.fairings = fairings;
        }

        public Second_stage getSecond_stage() {
            return second_stage;
        }

        public void setSecond_stage(Second_stage second_stage) {
            this.second_stage = second_stage;
        }

        public First_stage getFirst_stage() {
            return first_stage;
        }

        public void setFirst_stage(First_stage first_stage) {
            this.first_stage = first_stage;
        }

        public String getRocket_type() {
            return rocket_type;
        }

        public void setRocket_type(String rocket_type) {
            this.rocket_type = rocket_type;
        }

        public String getRocket_name() {
            return rocket_name;
        }

        public void setRocket_name(String rocket_name) {
            this.rocket_name = rocket_name;
        }

        public String getRocket_id() {
            return rocket_id;
        }

        public void setRocket_id(String rocket_id) {
            this.rocket_id = rocket_id;
        }
    }

    public static class Fairings {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("recovered")
        private boolean recovered;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("recovery_attempt")
        private boolean recovery_attempt;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("reused")
        private boolean reused;

        public boolean getRecovered() {
            return recovered;
        }

        public void setRecovered(boolean recovered) {
            this.recovered = recovered;
        }

        public boolean getRecovery_attempt() {
            return recovery_attempt;
        }

        public void setRecovery_attempt(boolean recovery_attempt) {
            this.recovery_attempt = recovery_attempt;
        }

        public boolean getReused() {
            return reused;
        }

        public void setReused(boolean reused) {
            this.reused = reused;
        }
    }

    public static class Second_stage {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("payloads")
        private List<Payloads> payloads;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("block")
        private int block;

        public List<Payloads> getPayloads() {
            return payloads;
        }

        public void setPayloads(List<Payloads> payloads) {
            this.payloads = payloads;
        }

        public int getBlock() {
            return block;
        }

        public void setBlock(int block) {
            this.block = block;
        }
    }

    public static class Payloads {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("orbit_params")
        private Orbit_params orbit_params;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("orbit")
        private String orbit;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("payload_mass_lbs")
        private int payload_mass_lbs;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("payload_mass_kg")
        private int payload_mass_kg;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("payload_type")
        private String payload_type;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("manufacturer")
        private String manufacturer;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("nationality")
        private String nationality;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("customers")
        private List<String> customers;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("reused")
        private boolean reused;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("norad_id")
        private List<String> norad_id;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("payload_id")
        private String payload_id;

        public Orbit_params getOrbit_params() {
            return orbit_params;
        }

        public void setOrbit_params(Orbit_params orbit_params) {
            this.orbit_params = orbit_params;
        }

        public String getOrbit() {
            return orbit;
        }

        public void setOrbit(String orbit) {
            this.orbit = orbit;
        }

        public int getPayload_mass_lbs() {
            return payload_mass_lbs;
        }

        public void setPayload_mass_lbs(int payload_mass_lbs) {
            this.payload_mass_lbs = payload_mass_lbs;
        }

        public int getPayload_mass_kg() {
            return payload_mass_kg;
        }

        public void setPayload_mass_kg(int payload_mass_kg) {
            this.payload_mass_kg = payload_mass_kg;
        }

        public String getPayload_type() {
            return payload_type;
        }

        public void setPayload_type(String payload_type) {
            this.payload_type = payload_type;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public List<String> getCustomers() {
            return customers;
        }

        public void setCustomers(List<String> customers) {
            this.customers = customers;
        }

        public boolean getReused() {
            return reused;
        }

        public void setReused(boolean reused) {
            this.reused = reused;
        }

        public List<String> getNorad_id() {
            return norad_id;
        }

        public void setNorad_id(List<String> norad_id) {
            this.norad_id = norad_id;
        }

        public String getPayload_id() {
            return payload_id;
        }

        public void setPayload_id(String payload_id) {
            this.payload_id = payload_id;
        }
    }

    public static class Orbit_params {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("inclination_deg")
        private int inclination_deg;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("apoapsis_km")
        private int apoapsis_km;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("periapsis_km")
        private int periapsis_km;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("regime")
        private String regime;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("reference_system")
        private String reference_system;

        public int getInclination_deg() {
            return inclination_deg;
        }

        public void setInclination_deg(int inclination_deg) {
            this.inclination_deg = inclination_deg;
        }

        public int getApoapsis_km() {
            return apoapsis_km;
        }

        public void setApoapsis_km(int apoapsis_km) {
            this.apoapsis_km = apoapsis_km;
        }

        public int getPeriapsis_km() {
            return periapsis_km;
        }

        public void setPeriapsis_km(int periapsis_km) {
            this.periapsis_km = periapsis_km;
        }

        public String getRegime() {
            return regime;
        }

        public void setRegime(String regime) {
            this.regime = regime;
        }

        public String getReference_system() {
            return reference_system;
        }

        public void setReference_system(String reference_system) {
            this.reference_system = reference_system;
        }
    }

    public static class First_stage {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("cores")
        private List<Cores> cores;

        public List<Cores> getCores() {
            return cores;
        }

        public void setCores(List<Cores> cores) {
            this.cores = cores;
        }
    }

    public static class Cores {
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("landing_intent")
        private boolean landing_intent;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("reused")
        private boolean reused;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("legs")
        private boolean legs;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("gridfins")
        private boolean gridfins;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("flight")
        private int flight;
        @com.google.gson.annotations.Expose
        @com.google.gson.annotations.SerializedName("core_serial")
        private String core_serial;

        public boolean getLanding_intent() {
            return landing_intent;
        }

        public void setLanding_intent(boolean landing_intent) {
            this.landing_intent = landing_intent;
        }

        public boolean getReused() {
            return reused;
        }

        public void setReused(boolean reused) {
            this.reused = reused;
        }

        public boolean getLegs() {
            return legs;
        }

        public void setLegs(boolean legs) {
            this.legs = legs;
        }

        public boolean getGridfins() {
            return gridfins;
        }

        public void setGridfins(boolean gridfins) {
            this.gridfins = gridfins;
        }

        public int getFlight() {
            return flight;
        }

        public void setFlight(int flight) {
            this.flight = flight;
        }

        public String getCore_serial() {
            return core_serial;
        }

        public void setCore_serial(String core_serial) {
            this.core_serial = core_serial;
        }
    }
}
