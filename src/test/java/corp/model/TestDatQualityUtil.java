package corp.model;

import com.google.protobuf.Timestamp;
import corp.util.DataQuality;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

public class TestDatQualityUtil {

    @Test
    public void minimal_insertValid_person() {
        Model.Person pers = Model.Person.newBuilder().setFirstName("Jane").setLastName("Doe").setEmail("jane@gmail.com").build();
        assertThat(DataQuality.Person.isValidForInsert(pers)).isTrue();
        assertThat(DataQuality.Person.isValidForUpdate(pers)).isFalse();
    }

    @Test
    public void minimal_updateValid_person() {
        Instant now = Instant.now();
        var ts = Timestamp.newBuilder().setSeconds(now.getEpochSecond()).build();
        Model.Person pers = Model.Person.newBuilder().setId(1L).setFirstName("Jane-Updated").setCreateTime(ts).setUpdateTime(ts).build();
        assertThat(DataQuality.Person.isValidForInsert(pers)).isFalse();
        assertThat(DataQuality.Person.isValidForUpdate(pers)).isTrue();

    }

    @Test
    public void minimal_insertValid_address() {
        Instant now = Instant.now();
        String id = "3", streetNum = "111", streetName = "New Street", city = "Toronto", province = "Ontario", country = "Canada", postalCode = "L1L2M2";
        Double lat = 22.1111, lon = 22.1111;
        var ts = Timestamp.newBuilder().setSeconds(now.getEpochSecond()).build();
        var add = Model.PostalAddress.newBuilder().setStreetNum(streetNum).setStreetName(streetName).setPostalCode(postalCode).build();//.setDirty(true)
        //
        assertThat(DataQuality.Address.isValidForInsert(add)).isTrue();
        assertThat(DataQuality.Address.isValidForUpdate(add)).isFalse();
    }

    @Test
    public void minimal_updateValid_address() {
        Instant now = Instant.now();
        Long id = 3L;
        String streetNum = "111", streetName = "New Street", city = "Toronto", province = "Ontario", country = "Canada", postalCode = "L1L2M2";
        Double lat = 22.1111, lon = 22.1111;
        var ts = Timestamp.newBuilder().setSeconds(now.getEpochSecond()).build();
        var add = Model.PostalAddress.newBuilder().setId(id).setPostalCode(postalCode).setCreateTime(ts).setUpdateTime(ts).build();//.setDirty(true)
        //
        assertThat(DataQuality.Address.isValidForInsert(add)).isFalse();
        assertThat(DataQuality.Address.isValidForUpdate(add)).isTrue();
    }

    //@Test
    public void minimal_insert_INVALID_address() {
        Instant now = Instant.now();
        Long id = 3L;
        String streetNum = "111", streetName = "New Street", city = "Toronto", province = "Ontario", country = "Canada", postalCode = "L1L2M2";
        Double lat = 22.1111, lon = 22.1111;
        var ts = Timestamp.newBuilder().setSeconds(now.getEpochSecond()).build();
        var add = Model.PostalAddress.newBuilder().setId(id).setStreetNum(streetNum).setStreetName(streetName).setCity(city).setProvince(province).setCountry(country).setPostalCode(postalCode).setCreateTime(ts).setUpdateTime(ts);
    }

}
