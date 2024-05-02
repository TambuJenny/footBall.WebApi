import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Tables(name = "cidade")

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
        IdPaisOrganizador = paisOrganizador;
    }

    public UUID getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }

    public PaisOrganizador PaisOrganizador() {
        return IdPaisOrganizador;
    }
}
