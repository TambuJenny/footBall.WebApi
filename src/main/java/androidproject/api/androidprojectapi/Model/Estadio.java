package androidproject.api.androidprojectapi.Model;

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
@Table(name = "estadio")
public class Estadio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID Id;
    private String Nome;
    private int Capacidade;

    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade Cidade;

    public void setId(UUID id) {
        Id = id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }

    public void setCidade(Cidade cidade) {
        Cidade = cidade;
    }

    public UUID getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public Cidade getCidade() {
        return Cidade;
    }
}
