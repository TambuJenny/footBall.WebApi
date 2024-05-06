package androidproject.api.androidprojectapi.Repository;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import androidproject.api.androidprojectapi.Interface.IJogo;
import androidproject.api.androidprojectapi.Interface.Repository.IJogoRepository;
import androidproject.api.androidprojectapi.Model.Jogo;

@Repository
public class JogoRepository implements IJogo {

    private IJogoRepository _jogoRepository;

    @Autowired
    public JogoRepository(IJogoRepository jogoRepository) {
        this._jogoRepository = jogoRepository;
    }

    @Override
    public List<Jogo> GetAll() {
        return this._jogoRepository.findAll();
    }

    @Override
    public Jogo GetById(UUID id) {

        if (id != null)
            return this._jogoRepository.findById(id).orElse(null);

        throw new UnsupportedOperationException("Id do Jogo Vazio");
    }

    @Override
    public boolean Insert(Jogo obj) {
        if (!this._jogoRepository.equals(obj))
            this._jogoRepository.save(obj);

        throw new UnsupportedOperationException("Unimplemented method 'Insert'");
    }

    @Override
    public Jogo Update(Jogo obj) {
        if (this._jogoRepository.equals(obj))
            this._jogoRepository.save(obj);

        throw new UnsupportedOperationException("Unimplemented method 'Update'");
    }

    @Override
    public boolean Delete(UUID id) {

        var getJogo = this._jogoRepository.findById(id).get();

        if (getJogo != null) {
            this._jogoRepository.deleteById(id);
            return true;
        }

        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }

}
