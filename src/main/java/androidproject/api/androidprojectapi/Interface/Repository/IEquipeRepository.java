package androidproject.api.androidprojectapi.Interface.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import androidproject.api.androidprojectapi.Model.Equipa;

public interface IEquipeRepository extends JpaRepository<Equipa, UUID> {

}
