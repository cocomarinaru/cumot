package cumot.service.impl;

import cumot.model.Place;
import cumot.service.PlaceService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by coco on 6/4/16.
 */
@Service
public class PlaceServiceImpl implements PlaceService {

    private static final List<Place> places = new ArrayList<>();

    @PostConstruct
    public void initialize() {

        places.add(new Place("Rochelle", "Timisoara", "Miron Costin nr 11"));
        places.add(new Place("Napoletana", "Timisoara", "Strada Cluj"));
        places.add(new Place("Core Napoli", "Timisoara", "Bastion"));
        places.add(new Place("Cora", "Timisoara", "Marasesti nr 10"));

    }

    @Override
    public List<Place> getAllPlaces() {
        return places;
    }

    @Override
    public Optional<Place> getPlaceByName(String name) {

        return places.stream()
                .filter(p -> p.getName().equals(name))
                .findFirst();
    }


}
