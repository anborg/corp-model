package corp.util;

import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;
import corp.model.Model;
import corp.service.PersonServices;



import java.time.Instant;
import java.util.Optional;

public class MockUtil {
    public static Model.Person buildPerson() {
        return buildPerson(99L, "Jane", "Doe");
    }

    /**
     * Use this to mock creation of XREF Person (in a syb-ssystem)
     *
     * @param in Person
     * @param subsysId {AMANDA|...}
     * @return Person
     */
    public static Model.Person buildXrefPerson(Model.Person in, String subsysId) {
        Model.Person.Builder builder = Model.Person.newBuilder();
        //ignore id from main person, but make a rand
        long id = (int) (Math.random() * 10000);
        id = "AMANDA".equals(subsysId) ? (int) (Math.random() * 11000) : id;
        id = "HANSEN".equals(subsysId) ? (int) (Math.random() * 22000) : id;
        builder.setId(id)
                .setFirstName(in.getFirstName())
                .setLastName(in.getLastName())
                .setAddress(in.getAddress())
                .setEmail(in.getEmail())
                .setPhone1(in.getPhone1())
                .setPhone2(in.getPhone2());
        return builder.build();
    }

    public static Model.Case buildCase() {
        Timestamp ts = Timestamps.fromMillis(System.currentTimeMillis());
        String CASETYPE_WATER_PIPE = "WATER_PIPE_TOFIX";
        return Model.Case.newBuilder()
                .setId(1)
                .setDescription("Water pipe broken, outside the house")
                .setAddress(buildAddress())
                .setTypeId(CASETYPE_WATER_PIPE)
                .putTypeProps("location","ousideresidence")
                .setStatus("INITATED") //PENDING_CUSTOMER , PENDING_ORG, PENDING_OTHER
                .setCreatedByEmployee("rose")
                .setReportedByCustomer(buildPerson())
                .setCreateTime(ts).setUpdateTime(ts)
                .build();
    }

    public static Model.Organization buildOrganization() {
        return Model.Organization.newBuilder()
                .setName("Costco Enterprise")
                .setAddress(buildAddress())
                .build();
    }


    public static Model.Person buildPerson(Long id, String firstName, String lastname) {

        Timestamp ts = Timestamps.fromMillis(System.currentTimeMillis());
        var pb = Model.Person.newBuilder();
        Optional.ofNullable(id).ifPresent(pb::setId);
        Optional.ofNullable(firstName).ifPresent(pb::setFirstName);
        Optional.ofNullable(lastname).ifPresent(pb::setLastName);
        Optional.ofNullable("me@gmail.com").ifPresent(pb::setEmail);
        Optional.ofNullable("123445678").ifPresent(pb::setPhone1);
        Optional.ofNullable("123445678").ifPresent(pb::setPhone2);
        Optional.ofNullable(buildAddress()).ifPresent(pb::setAddress);
        Optional.ofNullable(ts).ifPresent(pb::setCreateTime);
        Optional.ofNullable(ts).ifPresent(pb::setUpdateTime);
        var amandaXref = Model.Xref.newBuilder().setId(id).setXrefSystemId("AMANDA").build();
        pb.putXrefs(amandaXref.getXrefSystemId(), amandaXref);
        return pb.build();
    }


//    public static ContactChannels buildContactChannels(){
//        return ContactChannels.newBuilder()
//                .setEmail("me@gmail.com")
//                .setPhone1(Phone.newBuilder().setCountryCode(1).setNumber("123445678").setExt("xs234").build())
//                .setPhone2(Phone.newBuilder().setCountryCode(1).setNumber("123445678").setExt("xs234").build())
//                .setPostalAddress(buildAddress())
//                .build();
//    }

//    public static Phone buildPhone(){
//        return Phone.newBuilder().setCountryCode(1).setNumber("123445678").setExt("xs234").build();
//    }

    public static Model.PostalAddress buildAddress() {
//        Timestamp ts = Timestamps.fromMillis(System.currentTimeMillis());
        Instant now = Instant.now();
        String streetNum = "111", streetName = "New Street", city = "Toronto", province = "Ontario", country = "Canada", postalCode = "L1L2M2";
        Long id = 3L;
        Double lat = 22.1111, lon = 22.1111;
        var ts = Timestamp.newBuilder().setSeconds(now.getEpochSecond()).build();
        var ab = Model.PostalAddress.newBuilder();
        Optional.ofNullable(id).ifPresent(ab::setId);
        Optional.ofNullable(streetNum).ifPresent(ab::setStreetNum);
        Optional.ofNullable(streetName).ifPresent(ab::setStreetName);
        Optional.ofNullable(city).ifPresent(ab::setCity);
        Optional.ofNullable(country).ifPresent(ab::setCountry);
        Optional.ofNullable(province).ifPresent(ab::setProvince);
        Optional.ofNullable(postalCode).ifPresent(ab::setPostalCode);
        Optional.ofNullable(lat).ifPresent(ab::setLat);
        Optional.ofNullable(lon).ifPresent(ab::setLon);
        Optional.ofNullable(ts).ifPresent(ab::setCreateTime);
        Optional.ofNullable(ts).ifPresent(ab::setUpdateTime);


        return ab.build();
    }

    public static PersonServices.SearchReqPerson buildSearchReqPerson() {
        return buildSearchReqPerson(buildPerson());
    }

    public static PersonServices.SearchReqPerson buildSearchReqPerson(Model.Person person) {
        return PersonServices.SearchReqPerson.newBuilder().setPerson(person).build();
    }

    public static Model.Person buildAnonPerson() {
        var addr = Model.PostalAddress.newBuilder().setId(0L).build();
        return Model.Person.newBuilder().setId(0L).setFirstName("Anon").setLastName("Doe").setEmail("anon@gmail.com").setAddress(addr).build();
    }

    public static Model.Person buildOrgAnonPerson() {
        var addr = Model.PostalAddress.newBuilder().setId(1L).build();
        return Model.Person.newBuilder().setId(0L).setFirstName("Org-Anon").setLastName("Doe").setEmail("admin@myorg.com").setAddress(addr).build();
    }

    public static Model.PostalAddress buildOrgAnonAddress() {
        var addr = Model.PostalAddress.newBuilder().setId(1L).build();
        return addr;
    }

    public PersonServices.SearchRes buildSearchRes_personList() {
        return PersonServices.SearchRes.newBuilder().setPersonList(Model.PersonList.newBuilder().addPersons(buildPerson())).build();
    }

    public PersonServices.SearchRes buildSearchRes_addressList() {
        return PersonServices.SearchRes.newBuilder().setPostalAddressList(PersonServices.PostalAddressList.newBuilder().addAddresses(buildAddress())).build();
    }
}
