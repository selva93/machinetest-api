package machine.test.api.controller;

import machine.test.api.service.GenericService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public abstract class GenericController<T> {
    private GenericService<T> tGenericService;

    public GenericController(GenericService<T> serviceImpl) {
        tGenericService = serviceImpl;
    }

    @GetMapping(value = "/find/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> find(@PathVariable("id") Long id) {
        Optional<T> optionalT = tGenericService.read(id);
        if(optionalT.isPresent()) {
            return new ResponseEntity<>(optionalT.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Can not find the details for the id "+id, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/find",  produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<T>> findAll() {
        List<T> tList = tGenericService.findAll();
        return new ResponseEntity<>(tList, HttpStatus.OK);
    }

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<T> add(@RequestBody T model) {
        T modelRet = (T) tGenericService.add(model);
        return new ResponseEntity<>(modelRet, HttpStatus.OK);
    }

    @PostMapping(value = "/update", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<T> update(@RequestBody T model) {
        T modelRet = (T) tGenericService.update(model);
        return new ResponseEntity<>(modelRet, HttpStatus.OK);
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        tGenericService.deleteById(id);
        return new ResponseEntity<>("The requested "+ id +" details are deleted successfully", HttpStatus.OK);
    }
}
