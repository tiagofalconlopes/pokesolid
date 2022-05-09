package examples.compositioninsteadinheritanceexample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComposedPokemon {

    private BasicPokemonInformation basicPokemonInformation;

    public void doWhatYouKnow(){
        System.out.println("swimming...");
    }
}
