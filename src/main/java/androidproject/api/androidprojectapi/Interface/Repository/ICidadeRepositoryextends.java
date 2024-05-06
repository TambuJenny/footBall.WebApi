package androidproject.api.androidprojectapi.Interface.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import androidproject.api.androidprojectapi.Model.Cidade;

public interface ICidadeRepositoryextends extends JpaRepository<Cidade, UUID> {

}
