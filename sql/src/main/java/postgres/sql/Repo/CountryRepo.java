package postgres.sql.Repo;

import org.springframework.data.repository.CrudRepository;
import postgres.sql.Entity.Country;

import java.util.List;

public interface CountryRepo extends CrudRepository<Country, String> {

    List<Country> findByRegionId(int regionId);
}
