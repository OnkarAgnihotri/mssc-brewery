package guruspringframework.msscbrewery.service;

import guruspringframework.msscbrewery.web.model.BeerDTO;

import java.util.UUID;

public interface BeerService {
    public BeerDTO getBeerById(UUID beerId);
}
