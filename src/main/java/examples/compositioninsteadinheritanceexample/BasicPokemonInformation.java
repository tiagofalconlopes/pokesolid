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
public class BasicPokemonInformation {
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

}
