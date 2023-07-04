package corp.util;
import com.google.common.base.Strings;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;

import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Author @espresso stackoverflow.
 * Sample use:
 * Model.Person reqObj = ProtoUtil.toProto(reqJson, Model.Person.getDefaultInstance());
 * Model.Person res = personSvc.update(reqObj);
 * final String resJson = ProtoUtil.toJson(res);
 **/
public class ProtoUtil {
    private static final String EMPTY_JSON_ARRAY = "[]";

    /**
     * Convert a collection of Protobuf  to a JSON array string  ->
     * @param listOfProto collection of ..
     * @param <T> a Protobuf Message
     * @return a json array
     */
    public static <T extends Message> String toJsonArray(Collection<T> listOfProto) {
        if(Objects.isNull(listOfProto)) throw new RuntimeException("Don't give null to me!");
        if(listOfProto.isEmpty()) return EMPTY_JSON_ARRAY;//empty json
        try {
            String jsonArray = listOfProto.stream()
                    .map(ProtoUtil::toJson)
                    .collect(Collectors.joining(","));
            return "[" + jsonArray + "]";
        } catch (Exception e) {
            throw new RuntimeException("Error converting Collection<Proto> to json", e);
        }
    }//toJsonArray

    /**
     * Convert ONE protobuf object to JSON string
     * @param obj input, a protobuf Message
     * @param <T> proto
     * @return json String
     */
    public static <T extends Message> String toJson(T obj) {
        if(isNullable(obj)) return null;
        try {
            return JsonFormat.printer().print(obj);
        } catch (Exception e) {
            throw new RuntimeException("Error converting Proto to json", e);
        }
    }//toJson

    /**
     * Convert ONE Json string equivalent of protobufMessage to a Protobuf object
     * @param protoJsonStr json str
     * @param message, pass a Message.getDefaultInstance(), e,g Model.Person.getDefaultInstance()
     * @param <T> proto
     * @return a Protobuf Message
     */
    public static <T extends MessageOrBuilder> Optional<T> toProto(String protoJsonStr, T message) {
        //TODO perhaps for null, I have to return defaultInstance() ?
        if(isNullable(protoJsonStr)) return Optional.empty();
        try {
            Message.Builder builder = message.getDefaultInstanceForType().toBuilder();
            JsonFormat.parser().ignoringUnknownFields().merge(protoJsonStr, builder);
            T out = (T) builder.build();
            return Optional.of(out);
        } catch (Exception e) {
            throw new RuntimeException("Error converting json to Proto", e);
        }
    }//toProto
    static final String EMPTY_JSON = "{}";

    /**
     * Check if a protobuf Message is semantically-equal to null/notfound ...
     *
     * @param message proto
     * @return bool
     */
    public static boolean isNullable(Message message){
        return (Objects.isNull(message)
                || Strings.isNullOrEmpty(message.toString()));
    }

    /**
     * Check if a json string can be semantically equated to null/notfound ...
     * @param jsonStr json str
     * @return bool
     */
    public static boolean isNullable(String jsonStr){
        return (Strings.isNullOrEmpty(jsonStr) || jsonStr.contentEquals(EMPTY_JSON));
    }
    //TODO find reason: This fails in serializer:: class SerGeneric extends JsonSerializer< Message>
    public static <T extends Message> Optional<String> toJsonOptional(T obj) {
        if(isNullable(obj)) return Optional.empty();
        try {
            return Optional.of(JsonFormat.printer().print(obj));
        } catch (Exception e) {
            throw new RuntimeException("Error converting Proto to json", e);
        }
    }//toJson
}