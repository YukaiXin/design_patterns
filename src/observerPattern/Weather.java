package observerPattern;

/**
 * Created by kxyu on 2018/7/17
 */
public class Weather {

    private String description;

    public Weather(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "Weather {" +
                "description :" +description+
                "}";
    }
}
