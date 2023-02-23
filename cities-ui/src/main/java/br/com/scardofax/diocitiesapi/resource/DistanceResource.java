package br.com.scardofax.diocitiesapi.resource;

import br.com.scardofax.diocitiesapi.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceResource {

    @Autowired
    private DistanceService distanceService;

    @GetMapping("/points")
    public Double byPoints(@RequestParam(name = "from") Integer from,
                           @RequestParam(name = "to") Integer to){

        return distanceService.distanceByPointsInMiles(from, to);
    }

    @GetMapping("/cube")
    public Double byCube(@RequestParam(name = "from") Integer from,
                         @RequestParam(name = "to") Integer to){

        return distanceService.distanceByCubeInMeters(from, to);

    }

}
