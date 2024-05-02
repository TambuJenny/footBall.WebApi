import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Tables(name = "equipa")
public class Equipa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID Id;
    private String Nome;

    public void setId(UUID id) {
        Id = id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public UUID getId() {
        return Id;
    }

    public String getNome() {
        return Nome;
    }
}
