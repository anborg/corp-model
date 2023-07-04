package corp.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import com.google.protobuf.Timestamp;
import com.google.protobuf.util.Timestamps;
import corp.util.ProtoUtil;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJsonSerdeProtoUtil {
    private static Logger logger = Logger.getLogger(TestJsonSerdeProtoUtil.class.getName());

    ObjectMapper mapper = new ObjectMapper();
    @Test
    public void test_jsonToProto_Person_roundtrip_is_equal() throws Exception{

        //with
        String jsonStr = ClasspathUtil.readFileInClasspath("person.json");
        //when
        Optional<Model.Person> p = ProtoUtil.toProto(jsonStr, Model.Person.getDefaultInstance());
        logger.info("json to Person p="+p);
        String jsonStrOut = ProtoUtil.toJson(p.get());
        assertThat(Strings.isNullOrEmpty(jsonStrOut)).isFalse();
        //then - verify
        assertEquals(mapper.readTree(jsonStr), mapper.readTree(jsonStrOut));
    }


    @Test
    public void test_emptyJson_serde_as_emptyJson()throws Exception{
        //with
        String jsonStr = ClasspathUtil.readFileInClasspath("person_null.json");
        logger.info("jsonStr=" + jsonStr);
        //when
        Optional<Model.Person> p = ProtoUtil.toProto(jsonStr, Model.Person.getDefaultInstance());
        assertThat(p.isPresent()).isFalse();
        String jsonStrOut = ProtoUtil.toJson(null);
        logger.info("empty p=" + p);
        //then - verify
        assertThat(Strings.isNullOrEmpty(jsonStrOut)).isTrue();
        //assertEquals(mapper.readTree(jsonStr), mapper.readTree(jsonStrOut));
    }

    @Test
    public void test_jsonToProto_Case_roundtrip_is_equal() throws Exception {
        //with
        String jsonStr = ClasspathUtil.readFileInClasspath("CaseJsonObj_deafult.json");
        Timestamp ts = Timestamps.fromMillis(System.currentTimeMillis());
        Long ID = 1L;
        String CASETYPE_WATER_PIPE = "WATER_PIPE_TOFIX";
        String CASE_STATUS = "AWAIT_TRIAGE";
        String CASE_DESC = "Water pipe broken, outside the house";
        var addr = Model.PostalAddress.newBuilder().setStreetNum("111").setStreetName("My St").setPostalCode("L1Lozo").build();
        var cust = Model.Person.newBuilder().setFirstName("Jane").setLastName("Doe");
        var empId = "rose";
        var xrefAmanda = Model.Xref.newBuilder().setXrefSystemId("AMANDA").build();
        var tags = List.of("WATER", "PUBLICAREA", "FEDERAL");

        var aCase = Model.Case.newBuilder()
                .setId(ID)
                .setStatus(CASE_STATUS)
                .setDescription(CASE_DESC)
                .setAddress(addr)
                .setReportedByCustomer(cust)
                .setCreatedByEmployee(empId)
                .putXrefs(xrefAmanda.getXrefSystemId(), xrefAmanda)
                //
                .setTypeId(CASETYPE_WATER_PIPE)
                .putTypeProps("location", "ousideresidence")
                .addAllTags(tags)
                // .setCreateTime(ts).setUpdateTime(ts)
                .build();
//        jsonStr = ProtoUtil.toJson();
//        //when
//        Optional<Model.Case> c = ProtoUtil.toProto(jsonStr, Model.Case.getDefaultInstance());
//        logger.info("json to Case ="+c);
        String jsonStrOut = ProtoUtil.toJson(aCase);
        logger.info("json to Case =\n" + jsonStrOut);
        assertThat(Strings.isNullOrEmpty(jsonStrOut)).isFalse();
        //then - verify
        assertEquals(mapper.readTree(jsonStr), mapper.readTree(jsonStrOut));
    }
}
