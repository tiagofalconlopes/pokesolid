package examples.pokesolidexample.services;

import examples.pokesolidexample.models.OpenClosedPrinciplePokemon;

public interface InterfaceSegregationPrinciplePokemonLifeService {
    void addLife(OpenClosedPrinciplePokemon openClosedPrinciplePokemon, long life);
    void reduceLife(OpenClosedPrinciplePokemon openClosedPrinciplePokemon, long life);
}
