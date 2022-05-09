package examples.mock;

import examples.pokesolidexample.models.OpenClosedPrinciplePokemon;
import examples.pokesolidexample.models.SingleResponsabilityWaterPokemon;

public class PokemonMock {

    private static final double HEIGHT = 0.6;
    private static final long EXPERIENCE = 100l;
    private static final long STRENGTH = 100l;
    private static final long LIFE = 100l;
    private static final String TYPE = "water";

    public static OpenClosedPrinciplePokemon createWaterPokemon(String name) {
        return SingleResponsabilityWaterPokemon
                .builder()
                .name(name)
                .type(TYPE)
                .height(HEIGHT)
                .experience(EXPERIENCE)
                .strength(STRENGTH)
                .life(LIFE)
                .build();
    }
}
