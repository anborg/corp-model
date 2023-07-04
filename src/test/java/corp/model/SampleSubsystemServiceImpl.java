package corp.model;

import corp.service.SubsystemService;
import java.util.List;
import java.util.Optional;
// This Dummy is just to see structure of a SSS
public class SampleSubsystemServiceImpl implements SubsystemService {

    @Override
    public SubsystemDataAccess<Model.Person> person() {
        return buildPersonService();
    }

    @Override
    public SubsystemDataAccess<Model.PostalAddress> address() {
        return buildAddressService();
    }

    @Override
    public SubsystemDataAccess<Model.Case> ccase() {
        return buildCaseService();
    }

    private SubsystemDataAccess<Model.Person> buildPersonService() {
        return new SubsystemDataAccess<Model.Person>() {
            @Override
            public Model.Person create(Model.Person in) {
                return null;
            }

            @Override
            public Model.Person update(Model.Person in) {
                return null;
            }

            @Override
            public Optional<Model.Person> get(Long id) {
                return Optional.empty();
            }

            @Override
            public List<Model.Person> find(Model.Person in) {
                return null;
            }

            @Override
            public List<Model.Person> recent() {
                return null;
            }
        };
    }

    private SubsystemDataAccess<Model.Case> buildCaseService(){
        return new SubsystemDataAccess<Model.Case>() {
            @Override
            public Model.Case create(Model.Case in) {
                return null;
            }

            @Override
            public Model.Case update(Model.Case in) {
                return null;
            }

            @Override
            public Optional<Model.Case> get(Long id) {
                return Optional.empty();
            }

            @Override
            public List<Model.Case> find(Model.Case in) {
                return null;
            }

            @Override
            public List<Model.Case> recent() {
                return null;
            }
        };
    }//buildcaseService
    private SubsystemDataAccess<Model.PostalAddress> buildAddressService(){
        return new SubsystemDataAccess<Model.PostalAddress>() {

            @Override
            public Model.PostalAddress create(Model.PostalAddress in) {
                return null;
            }

            @Override
            public Model.PostalAddress update(Model.PostalAddress in) {
                return null;
            }

            @Override
            public Optional<Model.PostalAddress> get(Long id) {
                return Optional.empty();
            }

            @Override
            public List<Model.PostalAddress> find(Model.PostalAddress in) {
                return null;
            }

            @Override
            public List<Model.PostalAddress> recent() {
                return null;
            }
        };
    }
}


