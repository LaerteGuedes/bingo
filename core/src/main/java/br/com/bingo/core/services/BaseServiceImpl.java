package br.com.bingo.core.services;

import br.com.bingo.core.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by laerteguedes on 02/09/17.
 */
public abstract class BaseServiceImpl<T extends Model> implements BaseService<T, Long> {

    public abstract JpaRepository getRepository();

    @Override
    public List<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public T find(Long id) {
        T t = (T) getRepository().findOne(id);

//        if (t == null)
//            throw new NotFoundException("Element not found!");

        return (T) getRepository().findOne(id);
    }

    @Override
    public void insert(T t){
        if (t.getId() != null)
//            throw new ServiceException("Trying doing update on insert!");

        getRepository().save(t);
    }

    @Override
    public void update(T t){
       // if (t.getId() == null)
//            throw new ServiceException("Trying doing insert on update");

        T t2 = find(t.getId());
       // if (t2 == null)
         //   throw new NotFoundException("Element not found!");

        getRepository().save(t);
    }

    @Override
    public void delete(Long id) {
        getRepository().delete(id);
    }


}
