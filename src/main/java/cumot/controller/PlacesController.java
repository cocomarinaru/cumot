package cumot.controller;

import cumot.model.Place;
import cumot.service.PlaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * Created by coco on 6/4/16.
 */
@RestController
public class PlacesController {

    private static final Logger LOG = LoggerFactory.getLogger(PlacesController.class);

    @Autowired
    private PlaceService placeService;

    @RequestMapping("/places")
    public List<Place> getAllPlaces() {
        LOG.debug("getAllPlaces");
        return placeService.getAllPlaces();
    }


    @RequestMapping("/place/{name}")
    public Place getPlaceByName(@PathVariable String name) {
        LOG.debug("getPlaceByName name:" + name);
        Optional<Place> place = placeService.getPlaceByName(name);

        if (place.isPresent()) {
            LOG.debug("Found place with name: " + name);
            return place.get();
        }
        LOG.debug("Found place with name: " + name);
        return null;

    }
}
