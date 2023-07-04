package corp.service;

import corp.model.Model;

import java.util.List;
import java.util.Optional;

public interface  SubsystemService {

    SubsystemDataAccess<Model.Person> person() ;
    SubsystemDataAccess<Model.Case> ccase() ;
    SubsystemDataAccess<Model.PostalAddress> address() ;

    interface SubsystemDataAccess<T>{
        //TODO priority-1. return user/customer with id
        T create(T in);
        T update(T in);

        Optional<T> get(Long id);

        List<T> find(T in);
        List<T> recent();
    }
}
