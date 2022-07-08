package ApiTp.bo;

import ApiTp.Main;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.nio.file.Paths;
import java.util.ArrayList;

public class Root {
    Coord coord;
    ArrayList<Weather> weather;
    String base;
    Humidity main;
    int visibility;
    Wind wind;
    Clouds clouds;
    int dt;
    Pays sys;
    int timezone;
    int id;
    String name;
    int cod;

    @JsonProperty("coord")
    public Coord getCoord() {
        return this.coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    @JsonProperty("weather")
    public ArrayList<Weather> getWeather() {
        return this.weather;
    }

    public void setWeather(ArrayList<Weather> weather) {
        this.weather = weather;
    }

    @JsonProperty("base")
    public String getBase() {
        return this.base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    @JsonProperty("main")
    public Humidity getHumidity() {
        return this.main;
    }

    public void setHumidity(Humidity main) {
        this.main = main;
    }

    @JsonProperty("visibility")
    public int getVisibility() {
        return this.visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("wind")
    public Wind getWind() {
        return this.wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @JsonProperty("clouds")
    public Clouds getClouds() {
        return this.clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    @JsonProperty("dt")
    public int getDt() {
        return this.dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    @JsonProperty("sys")
    public Pays getPays() {
        return this.sys;
    }

    public void setPays(Pays sys) {
        this.sys = sys;
    }

    @JsonProperty("timezone")
    public int getTimezone() {
        return this.timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("cod")
    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Root{" +
                "coord=" + coord +
                ", weather=" + weather +
                ", base='" + base + '\'' +
                ", main=" + main +
                ", visibility=" + visibility +
                ", wind=" + wind +
                ", clouds=" + clouds +
                ", dt=" + dt +
                ", sys=" + sys +
                ", timezone=" + timezone +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", cod=" + cod +
                '}';
    }
}
