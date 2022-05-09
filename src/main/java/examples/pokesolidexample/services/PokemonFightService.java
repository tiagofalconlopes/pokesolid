package examples.pokesolidexample.services;

import lombok.AllArgsConstructor;
import examples.pokesolidexample.models.OpenClosedPrinciplePokemon;

@AllArgsConstructor
public class PokemonFightService  implements LiskovSubstitutionPrinciplePokemonFightService{

    private final InterfaceSegregationPrinciplePokemonLifeService dependencyInversionPrincipleLifeService;

    @Override
    public long attack(OpenClosedPrinciplePokemon openClosedPrinciplePokemon) {
        System.out.println("Get attack value.");
        long attackValue = getRandomNumber(1, 10) * openClosedPrinciplePokemon.getStrength();
        System.out.println(attackValue);
        return attackValue;
    }

    @Override
    public long deffense(OpenClosedPrinciplePokemon openClosedPrinciplePokemon) {
        System.out.println("Get defense value.");
        long defense = getRandomNumber(1, 10) * openClosedPrinciplePokemon.getStrength();
        System.out.println(defense);
        return defense;
    }

    @Override
    public void doFight(OpenClosedPrinciplePokemon pokeAttack, OpenClosedPrinciplePokemon pokeDefense) {
        System.out.println("Starting a fight......");
        long attack = attack(pokeAttack);
        long defense = deffense(pokeDefense);
        if (attack > defense) {
            System.out.println("Successful attack.");
            long life = attack - defense;
            dependencyInversionPrincipleLifeService.reduceLife(pokeDefense, life);
        } else {
            System.out.println("Attack failed.");
            long life = defense - attack;
            dependencyInversionPrincipleLifeService.addLife(pokeDefense, life);
            dependencyInversionPrincipleLifeService.reduceLife(pokeAttack, life);
        }
    }

    private long getRandomNumber(int min, int max) {
        return (long) ((Math.random() * (max - min)) + min);
    }
}
