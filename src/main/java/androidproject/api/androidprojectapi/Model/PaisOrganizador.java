package androidproject.api.androidprojectapi.Model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "paisorganizador")

public class PaisOrganizador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID Id;
    private String Nome;
    private String Sigla;

    public void setId(UUID id) {
        Id = id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setSigla(String sigla) {
        Sigla = sigla;
    }

    public UUID getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public String getSigla() {
        return Sigla;
    }
}
