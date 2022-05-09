package examples.pokesolidexample.services;

import examples.pokesolidexample.models.OpenClosedPrinciplePokemon;

public class PokemonLifeService implements InterfaceSegregationPrinciplePokemonLifeService {

    @Override
    public void addLife(OpenClosedPrinciplePokemon openClosedPrinciplePokemon, long life) {
        System.out.println("Get more life support.");
        openClosedPrinciplePokemon.addLife(life);
    }

    @Override
    public void reduceLife(OpenClosedPrinciplePokemon openClosedPrinciplePokemon, long life) {
        System.out.println("Reduce life support.");
        if (life > openClosedPrinciplePokemon.getLife()) {
            System.out.println(openClosedPrinciplePokemon.getName() + " is dead.");
            openClosedPrinciplePokemon.setLife(0);
        } else {
            openClosedPrinciplePokemon.reduceLife(life);
        }
    }
}
