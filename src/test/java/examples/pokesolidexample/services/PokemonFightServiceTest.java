package examples.pokesolidexample.services;

import examples.pokesolidexample.models.OpenClosedPrinciplePokemon;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static examples.mock.PokemonMock.createWaterPokemon;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class PokemonFightServiceTest {

    @Spy
    private static PokemonLifeService lifeService;
    @InjectMocks
    private static PokemonFightService fightService;

    @Test
    public void shouldReturnAttackValue() {
        long attackValue = fightService.attack(createWaterPokemon("Magikarp"));
        assertTrue(attackValue > 0);
    }

    @Test
    public void shouldReturnDefenseValue() {
        long defenseValue = fightService.attack(createWaterPokemon("Magikarp"));
        assertTrue(defenseValue > 0);
    }

    @Test
    public void shouldDoFight() {
        fightService.doFight(createWaterPokemon("Magikarp"), createWaterPokemon("Goldeen"));
        verify(lifeService, times(1))
                .reduceLife(any(OpenClosedPrinciplePokemon.class), anyLong());
    }
}
