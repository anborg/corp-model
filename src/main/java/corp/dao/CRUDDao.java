package corp.dao;

import java.util.List;
import java.util.Optional;

public interface CRUDDao<T> {
    Long create(T in); //CreateOrUpdate
    Long update(T in); //CreateOrUpdate

    Optional<T> get(Long id); //select - where active=true ()

    List<T> find(T in);//dynamic select
    void setInactive(T in);// pass an object so, lifecycle of subobjects can be determined.

//Marked deprecated - not for production
    @Deprecated
    List<T> getAll();

    @Deprecated
    void deleteAll();

    @Deprecated
    void delete(Long id);

}
