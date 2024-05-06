package androidproject.api.androidprojectapi.Interface.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import androidproject.api.androidprojectapi.Model.Jogador;

public interface IJogadorRepository extends JpaRepository<Jogador, UUID> {

}
