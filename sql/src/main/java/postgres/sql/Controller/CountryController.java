package postgres.sql.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import postgres.sql.Entity.Country;
import postgres.sql.Repo.CountryRepo;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private CountryRepo countryRepo;

    @Autowired
    public CountryController(CountryRepo countryRepo) {
        this.countryRepo = countryRepo;
    }

    @GetMapping()
    public Iterable<Country> getCountries() {
        return countryRepo.findAll();
    }

    @GetMapping("/region/{regionId}")
    public Iterable<Country> getCountriesByRegionId(@PathVariable int regionId) {
        return countryRepo.findByRegionId(regionId);
    }

    @PutMapping()
    public void updateCountry(@RequestBody Country body) {
        Country country = countryRepo.findById(body.getCountryId()).get();

        country.setCountryName(body.getCountryName());

        countryRepo.save(country);
    }


}
