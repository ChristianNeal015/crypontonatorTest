package currency;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.scheduling.annotation.EnableScheduling;


public class Ticker {
    private String base;
    private String target;
    private String price;
    private String volume;
    private String change;

    public Ticker() {
    }

    public String getBase() {
        return this.base;
    }

    public String getTarget() {
        return this.target;
    }
    public String getPrice(){
        return this.price;
    }
    public String getVolume(){
        return this.volume;
    }
    public String getChange(){
        return this.change;
    }
    public void setBase(String base) {
        this.base = base;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setChange(String change) {
        this.change = change;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "base='" + base + '\'' +
                ", target='" + target + '\'' +
                ", price='" + price + '\'' +
                ", volume='" + volume + '\'' +
                ", change='" + change + '\'' +
                '}';
    }
}
