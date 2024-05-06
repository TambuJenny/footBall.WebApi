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
@Entity
@NoArgsConstructor
@Table(name = "cidade")

public class Cidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID Id;
    private String Nome;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private PaisOrganizador PaisOrganizador;

    public void setId(UUID id) {
        Id = id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setPaisOrganizador(PaisOrganizador paisOrganizador) {
        PaisOrganizador = paisOrganizador;
    }

    public UUID getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public PaisOrganizador PaisOrganizador() {
        return PaisOrganizador;
    }
}
