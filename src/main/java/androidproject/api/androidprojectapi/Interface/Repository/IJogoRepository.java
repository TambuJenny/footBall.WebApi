package androidproject.api.androidprojectapi.Interface.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import androidproject.api.androidprojectapi.Model.Jogo;

public interface IJogoRepository extends JpaRepository<Jogo,UUID>{

}
