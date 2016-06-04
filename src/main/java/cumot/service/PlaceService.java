package cumot.service;

import cumot.model.Place;

import java.util.List;
import java.util.Optional;

/**
 * Created by coco on 6/4/16.
 */
public interface PlaceService {

    List<Place> getAllPlaces();

    Optional<Place> getPlaceByName(String name);
}
