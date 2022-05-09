package examples.pokesolidexample.services;

import examples.pokesolidexample.models.OpenClosedPrinciplePokemon;

public interface LiskovSubstitutionPrinciplePokemonFightService {
    long attack(OpenClosedPrinciplePokemon openClosedPrinciplePokemon);
    long deffense(OpenClosedPrinciplePokemon openClosedPrinciplePokemon);
    void doFight(OpenClosedPrinciplePokemon pokeAttack, OpenClosedPrinciplePokemon pokeDefense);
}
