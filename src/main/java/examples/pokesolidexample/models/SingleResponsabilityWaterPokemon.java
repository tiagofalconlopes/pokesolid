package examples.pokesolidexample.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class SingleResponsabilityWaterPokemon extends OpenClosedPrinciplePokemon {
    @Override
    public void doWhatYouKnow(){
        System.out.println("swimming...");
    }
}
