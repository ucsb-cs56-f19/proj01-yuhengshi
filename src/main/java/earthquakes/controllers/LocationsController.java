package earthquakes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;
import java.util.HashMap;
import earthquakes.services.LocationQueryService;
import earthquakes.services.EarthquakeQueryService;
import earthquakes.geojson.FeatureCollection;
import earthquakes.searches.LocSearch;
import earthquakes.searches.EqSearch;
import java.util.List;
import com.nimbusds.oauth2.sdk.client.ClientReadRequest;
import earthquakes.osm.Place;
@Controller
public class LocationsController {
    @Autowired
    private ClientRegistrationRepository clientRegistrationRepository;
    
    @GetMapping("/locations/search")
    public String getLocationsSearch(Model model, OAuth2AuthenticationToken oAuth2AuthenticationToken,
            LocSearch locSearch) {
        return "locations/search";
    }

    @GetMapping("/locations/results")
          public String getLocationsResults(Model model, OAuth2AuthenticationToken oAuth2AuthenticationToken,
            LocSearch locSearch) {
        return "locations/results";
    }
    

}