package cumot.model;

/**
 * Created by coco on 6/4/16.
 */
public class Place {

    public String name;

    public String city;

    public String address;

    public Place(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public Place(String name, String city, String address) {
        this.name = name;
        this.city = city;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }
}
