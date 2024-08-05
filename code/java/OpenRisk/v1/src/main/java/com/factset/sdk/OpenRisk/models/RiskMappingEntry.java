/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.26.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OpenRisk.models.MappedSecurityInfo;
import com.factset.sdk.OpenRisk.models.RiskExclusionInfo;
import com.factset.sdk.OpenRisk.models.RiskExclusionInfoExclusionInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenRisk.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.factset.sdk.OpenRisk.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

@JsonDeserialize(using = RiskMappingEntry.RiskMappingEntryDeserializer.class)
@JsonSerialize(using = RiskMappingEntry.RiskMappingEntrySerializer.class)
public class RiskMappingEntry extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(RiskMappingEntry.class.getName());

    public static class RiskMappingEntrySerializer extends StdSerializer<RiskMappingEntry> {
        public RiskMappingEntrySerializer(Class<RiskMappingEntry> t) {
            super(t);
        }

        public RiskMappingEntrySerializer() {
            this(null);
        }

        @Override
        public void serialize(RiskMappingEntry value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class RiskMappingEntryDeserializer extends StdDeserializer<RiskMappingEntry> {
        public RiskMappingEntryDeserializer() {
            this(RiskMappingEntry.class);
        }

        public RiskMappingEntryDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public RiskMappingEntry deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize MappedSecurityInfo
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MappedSecurityInfo.class.equals(Integer.class) || MappedSecurityInfo.class.equals(Long.class) || MappedSecurityInfo.class.equals(Float.class) || MappedSecurityInfo.class.equals(Double.class) || MappedSecurityInfo.class.equals(Boolean.class) || MappedSecurityInfo.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MappedSecurityInfo.class.equals(Integer.class) || MappedSecurityInfo.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MappedSecurityInfo.class.equals(Float.class) || MappedSecurityInfo.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (MappedSecurityInfo.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MappedSecurityInfo.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<MappedSecurityInfo>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'MappedSecurityInfo'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MappedSecurityInfo'", e);
            }

            // deserialize RiskExclusionInfo
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (RiskExclusionInfo.class.equals(Integer.class) || RiskExclusionInfo.class.equals(Long.class) || RiskExclusionInfo.class.equals(Float.class) || RiskExclusionInfo.class.equals(Double.class) || RiskExclusionInfo.class.equals(Boolean.class) || RiskExclusionInfo.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((RiskExclusionInfo.class.equals(Integer.class) || RiskExclusionInfo.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((RiskExclusionInfo.class.equals(Float.class) || RiskExclusionInfo.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (RiskExclusionInfo.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (RiskExclusionInfo.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<RiskExclusionInfo>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'RiskExclusionInfo'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'RiskExclusionInfo'", e);
            }

            if (match == 1) {
                RiskMappingEntry ret = new RiskMappingEntry();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for RiskMappingEntry: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public RiskMappingEntry getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "RiskMappingEntry cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public RiskMappingEntry() {
        super("oneOf", Boolean.FALSE);
    }

    public RiskMappingEntry(MappedSecurityInfo o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public RiskMappingEntry(RiskExclusionInfo o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    static {
        schemas.put("MappedSecurityInfo", new GenericType<MappedSecurityInfo>() {
        });
        schemas.put("RiskExclusionInfo", new GenericType<RiskExclusionInfo>() {
        });
        JSON.registerDescendants(RiskMappingEntry.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return RiskMappingEntry.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * MappedSecurityInfo, RiskExclusionInfo
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        // MappedSecurityInfo
        if (JSON.isInstanceOf(MappedSecurityInfo.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // RiskExclusionInfo
        if (JSON.isInstanceOf(RiskExclusionInfo.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MappedSecurityInfo, RiskExclusionInfo");
    }

    /**
     * Get the actual instance, which can be the following:
     * MappedSecurityInfo, RiskExclusionInfo
     *
     * @return The actual instance (MappedSecurityInfo, RiskExclusionInfo)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MappedSecurityInfo`. If the actual instance is not `MappedSecurityInfo`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MappedSecurityInfo`
     * @throws ClassCastException if the instance is not `MappedSecurityInfo`
     */
    public MappedSecurityInfo getMappedSecurityInfo() throws ClassCastException {
        return (MappedSecurityInfo)super.getActualInstance();
    }

    /**
     * Get the actual instance of `RiskExclusionInfo`. If the actual instance is not `RiskExclusionInfo`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RiskExclusionInfo`
     * @throws ClassCastException if the instance is not `RiskExclusionInfo`
     */
    public RiskExclusionInfo getRiskExclusionInfo() throws ClassCastException {
        return (RiskExclusionInfo)super.getActualInstance();
    }

}

