package corp.model;
import com.google.protobuf.Timestamp;
import corp.util.ProtoUtil;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;

public class TestProtogenObjects {
    private static Logger logger = Logger.getLogger(TestProtogenObjects.class.getName());

    @Test
    public void objects_UNset_must_false_hasXX() {
        Model.Person pers = Model.Person.newBuilder().setFirstName("Jane").setLastName("Doe").build();
        //unset primitives
        //TODO enable after proto3-optional bug is fixed
        assertThat(pers.hasId()).as("Unset primitive must be verifiable as empty in protobuf")
                .isFalse();
        //assertThat(pers.getId()).as("Unset primitive must be verifiable as empty in protobuf")
        //        .isEmpty();//TODO Watch! Weirdity of Protobuf
        assertThat(pers.getId()).as("Unset primitive must be verifiable as empty in protobuf")
                .isNotNull();//TODO Watch! Weirdity of Protobuf
        assertThat(pers.hasFirstName()).as("Unset primitive must be verifiable as empty in protobuf")
                .isTrue();
        //unset objects
        assertThat(pers.hasAddress()).as("ProtoObj : Unset PostalAddress must result in proto.hasXX()=false").isFalse();
        assertThat(pers.hasCreateTime()).as("ProtoObj : Unset Create-Timestamp must result in proto.hasXX()=false").isFalse();
        assertThat(pers.hasUpdateTime()).as("ProtoObj : Unset Update-Timestamp must result in proto.hasXX()=false").isFalse();
    }

    @Test
    public void objects_SET_must_true_hasXX() {
        //When
        Model.Person pers = null;
        {
            Instant now = Instant.now();
            Long id = 3L;
            String streetNum = "111", streetName = "New Street", city = "Toronto", province = "Ontario", country = "Canada", postalCode = "L1L2M2";
            Double lat = 22.1111, lon = 22.1111;
            var ts = Timestamp.newBuilder().setSeconds(now.getEpochSecond()).build();
            var add = Model.PostalAddress.newBuilder().setId(id).setStreetNum(streetNum).setStreetName(streetName).setCity(city).setProvince(province).setCountry(country).setPostalCode(postalCode).setCreateTime(ts).setUpdateTime(ts);
            pers = Model.Person.newBuilder().setId(id).setFirstName("Jane").setLastName("Doe").setAddress(add).build();//.setDirty(true)
        }//pers
        logger.info(ProtoUtil.toJson(pers));

        //Then
        //set primitives
        //assertThat(pers.hasId()).as("SET primitive must be verifiable as non-empty in protobuf").isTrue();
        assertThat(pers.getId()).as("SET primitive must be verifiable as non-empty in protobuf")
                .isEqualTo(3L);
        //assertThat(pers.getDirty()).as("SET primitive must be verifiable as empty in protobuf").isTrue();
        //set objects
        assertThat(pers.hasCreateTime()).as("ProtoObj : Unset Create-Timestamp must result in proto.hasXX()=false")
                .isFalse();
        assertThat(pers.hasUpdateTime()).as("ProtoObj : Unset Update-Timestamp must result in proto.hasXX()=false")
                .isFalse();
        //set inner objects
        final var addr = pers.getAddress();
        assertThat(pers.hasAddress()).as("ProtoObj : SET PostalAddress must result in proto.hasXX()=true")
                .isTrue();
        //assertThat(addr.hasId()).as("SET primitive must be verifiable as non-empty in protobuf").isTrue();
        assertThat(addr.getId()).as("SET primitive must be verifiable as non-empty in protobuf")
                .isEqualTo(3L);
        //TODO enable after proto3-optional bug is fixed
        //assertThat(addr.hasStreetNum()).as("SET primitive must be verifiable as non-empty in protobuf").isTrue();
        //assertThat(addr.hasStreetName()).as("SET primitive must be verifiable as non-empty in protobuf").isTrue();
        //assertThat(addr.hasPostalCode()).as("SET primitive must be verifiable as non-empty in protobuf").isTrue();
        //
        assertThat(addr.getStreetNum()).as("SET primitive must be verifiable as non-empty in protobuf").isNotEmpty();
        assertThat(addr.getStreetName()).as("SET primitive must be verifiable as non-empty in protobuf").isNotEmpty();
        assertThat(addr.getPostalCode()).as("SET primitive must be verifiable as non-empty in protobuf").isNotEmpty();
        //
        assertThat(addr.hasCreateTime()).as("ProtoObj : Unset Create-Timestamp must result in proto.hasXX()=false").isTrue();
        assertThat(addr.hasUpdateTime()).as("ProtoObj : Unset Update-Timestamp must result in proto.hasXX()=false").isTrue();
    }


//    @Test
//    public void createCase(){
//        Case mycase = MockUtil.buildCase();
//        //logger.info(mycase.toString());
//    }
//
//    @Test
//    public void createAddress(){
//        PostalAddress address = MockUtil.buildAddress();
//        //logger.info(address.toString());
//    }
//
//    @Test
//    public void createOrganization(){
//        Organization org = MockUtil.buildOrganization();
//        //logger.info(org.toString());
//    }
}
