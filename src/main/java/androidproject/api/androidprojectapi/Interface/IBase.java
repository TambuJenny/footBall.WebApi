package androidproject.api.androidprojectapi.Interface;

import java.util.List;
import java.util.UUID;

public interface IBase<T> {

    public List<T> GetAll();

    public T GetById(UUID id);

    public boolean Insert(T obj);

    public T Update(T obj);

    public boolean Delete(T obj);
}
