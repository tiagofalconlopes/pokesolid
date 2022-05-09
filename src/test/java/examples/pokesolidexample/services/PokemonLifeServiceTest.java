package examples.pokesolidexample.services;

import org.junit.jupiter.api.Test;

import static examples.mock.PokemonMock.createWaterPokemon;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonLifeServiceTest {

    private final String POKEMON_NAME = "Magikarp";
    private final long LIFE = 50l;
    private final long LIFE_TO_KILL = 150l;

    private final InterfaceSegregationPrinciplePokemonLifeService lifeService = new PokemonLifeService();

    @Test
    public void shouldAddLifeToPokemon() {
        var waterPokemon = createWaterPokemon(POKEMON_NAME);
        lifeService.addLife(waterPokemon, LIFE);
        assertEquals(150l, waterPokemon.getLife());
    }

    @Test
    public void shouldReducePokemonLifeAndLives() {
        var waterPokemon = createWaterPokemon(POKEMON_NAME);
        lifeService.reduceLife(waterPokemon, LIFE);
        assertEquals(50l, waterPokemon.getLife());
    }

    @Test
    public void shouldReducePokemonLifeAndDie() {
        var waterPokemon = createWaterPokemon(POKEMON_NAME);
        lifeService.reduceLife(waterPokemon, LIFE_TO_KILL);
        assertEquals(0, waterPokemon.getLife());
    }
}
