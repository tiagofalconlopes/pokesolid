package examples;

import examples.pokesolidexample.models.OpenClosedPrinciplePokemon;
import examples.pokesolidexample.models.SingleResponsabilityWaterPokemon;
import examples.pokesolidexample.services.InterfaceSegregationPrinciplePokemonLifeService;
import examples.pokesolidexample.services.LiskovSubstitutionPrinciplePokemonFightService;
import examples.pokesolidexample.services.PokemonFightService;
import examples.pokesolidexample.services.PokemonLifeService;

public class PokeSolidApp {
    public static void main(String[] args) {

        OpenClosedPrinciplePokemon attackPokemon = SingleResponsabilityWaterPokemon
                .builder()
                .name("Magikarp")
                .type("water")
                .height(0.6)
                .experience(100l)
                .strength(100l)
                .life(100l)
                .build();

        OpenClosedPrinciplePokemon defensePokemon = SingleResponsabilityWaterPokemon
                .builder()
                .name("Goldeen")
                .type("water")
                .height(0.8)
                .experience(100l)
                .strength(100l)
                .life(100l)
                .build();

        InterfaceSegregationPrinciplePokemonLifeService lifeService = new PokemonLifeService();
        LiskovSubstitutionPrinciplePokemonFightService fightService = new PokemonFightService(lifeService);

        fightService.doFight(attackPokemon, defensePokemon);
        System.out.println("-------------------------------");
        System.out.println("attack life");
        System.out.println(attackPokemon.getLife());
        System.out.println("-------------------------------");
        System.out.println("defense life");
        System.out.println(defensePokemon.getLife());
        System.out.println("-------------------------------");
    }
}
