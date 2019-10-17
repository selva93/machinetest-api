package machine.test.api.service;

import machine.test.api.repository.GenericRepository;

import java.util.List;
import java.util.Optional;


public abstract class GenericService<T> {
    GenericRepository<T> repository;

    public GenericService(GenericRepository<T> genericRepository) {
        this.repository = genericRepository;
    }

    public T add(T model) {
     return repository.save(model);
    }
    public T update(T model) {
        return repository.save(model);
    }
    public Optional<T> read(Long id) {
        return repository.findById(id);
    }
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    public void delete(T model) {
        repository.delete(model);
    }
    public <T> List<T> findAll() {
        return (List<T>) repository.findAll();
    }
}
