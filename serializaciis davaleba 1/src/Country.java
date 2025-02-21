import java.io.Serializable;

public class Country implements Serializable {
    private String name ;
    private long population ;
    private double area ;

    public Country(String name, long population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    @Override
    public String toString() {
        return "Country{name='" + name + "', population=" + population + ", area=" + area + "}";
    }
}
