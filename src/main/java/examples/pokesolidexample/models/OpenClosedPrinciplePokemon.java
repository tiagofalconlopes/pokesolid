package examples.pokesolidexample.models;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public abstract class OpenClosedPrinciplePokemon {
    private String name;
    private String type;
    private double height;
    private long experience;
    private long life;
    private long strength;

    public void addLife(long life) {
        this.life += life;
    }

    public void reduceLife(long life) {
        this.life -= life;
    }

    public abstract void doWhatYouKnow();
}
