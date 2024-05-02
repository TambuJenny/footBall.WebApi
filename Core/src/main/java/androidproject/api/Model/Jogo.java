import java.util.UUID;

import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Tables(name = "jogo")
public class Jogo {

    @Id
    private UUID Id;
    private Date Data_jogo;
    private String Hora_jogo;
    private Estadio Estadio;

    @ManyToOne
    @JoinColumn(name = "equipe1_id")
    private Equipa Equipa_1;

    @ManyToOne
    @JoinColumn(name = "equipe2_id")
    private Equipa Equipa_2;

    public UUID getId() {
        return Id;
    }

    public Date getData_jogo() {
        return Data_jogo;
    }

    public String getHora_jogo() {
        return Hora_jogo;
    }

    public Estadio getEstadio() {
        return Estadio;
    }

    public Equipa getEquipa_1() {
        return Equipa_1;
    }

    public Equipa getEquipa_2() {
        return Equipa_2;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public void setData_jogo(Date data_jogo) {
        Data_jogo = data_jogo;
    }

    public void setHora_jogo(String hora_jogo) {
        Hora_jogo = hora_jogo;
    }

    public void setEstadio(Estadio estadio) {
        Estadio = estadio;
    }

    public void setEquipa_1(Equipa equipa_1) {
        Equipa_1 = equipa_1;
    }

    public void setEquipa_2(Equipa equipa_2) {
        Equipa_2 = equipa_2;
    }
}
