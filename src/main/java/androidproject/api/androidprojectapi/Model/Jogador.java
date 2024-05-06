package androidproject.api.androidprojectapi.Model;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "jogador")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID Id;
    private String Nome;
    private Date Data_Nascimento;

    @ManyToOne
    @JoinColumn(name = "equipe_id")
    private Equipa Equipa;

    public void setId(UUID id) {
        Id = id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setData_Nascimento(Date data_Nascimento) {
        Data_Nascimento = data_Nascimento;
    }

    public void setEquipa(Equipa equipa) {
        Equipa = equipa;
    }

    public UUID getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public Date getData_Nascimento() {
        return Data_Nascimento;
    }

    public Equipa getEquipa() {
        return Equipa;
    }
}
