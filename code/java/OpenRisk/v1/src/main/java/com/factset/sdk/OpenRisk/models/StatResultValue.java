/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
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
import com.factset.sdk.OpenRisk.models.StatResultValueSparseMatrix;
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

@JsonDeserialize(using = StatResultValue.StatResultValueDeserializer.class)
@JsonSerialize(using = StatResultValue.StatResultValueSerializer.class)
public class StatResultValue extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(StatResultValue.class.getName());

    public static class StatResultValueSerializer extends StdSerializer<StatResultValue> {
        public StatResultValueSerializer(Class<StatResultValue> t) {
            super(t);
        }

        public StatResultValueSerializer() {
            this(null);
        }

        @Override
        public void serialize(StatResultValue value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class StatResultValueDeserializer extends StdDeserializer<StatResultValue> {
        public StatResultValueDeserializer() {
            this(StatResultValue.class);
        }

        public StatResultValueDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public StatResultValue deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize Double
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Double.class.equals(Integer.class) || Double.class.equals(Long.class) || Double.class.equals(Float.class) || Double.class.equals(Double.class) || Double.class.equals(Boolean.class) || Double.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Double.class.equals(Integer.class) || Double.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Double.class.equals(Float.class) || Double.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Double.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Double.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                        attemptParsing |= (token == JsonToken.VALUE_NULL);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Double>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Double'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Double'", e);
            }

            // deserialize java.util.List<Double>
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (java.util.List.class.equals(Integer.class) || java.util.List.class.equals(Long.class) || java.util.List.class.equals(Float.class) || java.util.List.class.equals(Double.class) || java.util.List.class.equals(Boolean.class) || java.util.List.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((java.util.List.class.equals(Integer.class) || java.util.List.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((java.util.List.class.equals(Float.class) || java.util.List.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (java.util.List.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (java.util.List.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<java.util.List<Double>>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'java.util.List'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'java.util.List'", e);
            }

            // deserialize java.util.List<java.util.List<Double>>
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (java.util.List.class.equals(Integer.class) || java.util.List.class.equals(Long.class) || java.util.List.class.equals(Float.class) || java.util.List.class.equals(Double.class) || java.util.List.class.equals(Boolean.class) || java.util.List.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((java.util.List.class.equals(Integer.class) || java.util.List.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((java.util.List.class.equals(Float.class) || java.util.List.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (java.util.List.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (java.util.List.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<java.util.List<java.util.List<Double>>>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'java.util.List'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'java.util.List'", e);
            }

            // deserialize StatResultValueSparseMatrix
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (StatResultValueSparseMatrix.class.equals(Integer.class) || StatResultValueSparseMatrix.class.equals(Long.class) || StatResultValueSparseMatrix.class.equals(Float.class) || StatResultValueSparseMatrix.class.equals(Double.class) || StatResultValueSparseMatrix.class.equals(Boolean.class) || StatResultValueSparseMatrix.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((StatResultValueSparseMatrix.class.equals(Integer.class) || StatResultValueSparseMatrix.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((StatResultValueSparseMatrix.class.equals(Float.class) || StatResultValueSparseMatrix.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (StatResultValueSparseMatrix.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (StatResultValueSparseMatrix.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<StatResultValueSparseMatrix>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'StatResultValueSparseMatrix'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'StatResultValueSparseMatrix'", e);
            }

            if (match == 1) {
                StatResultValue ret = new StatResultValue();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for StatResultValue: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public StatResultValue getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "StatResultValue cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public StatResultValue() {
        super("oneOf", Boolean.FALSE);
    }

    public StatResultValue(Double o) {
        super("oneOf", Boolean.TRUE);
        setActualInstance(o);
    }
    public StatResultValue(StatResultValueSparseMatrix o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    static {
        schemas.put("Double", new GenericType<Double>() {
        });
        schemas.put("StatResultValueSparseMatrix", new GenericType<StatResultValueSparseMatrix>() {
        });
        schemas.put("java.util.List<Double>", new GenericType<java.util.List<Double>>() {
        });
        schemas.put("java.util.List<java.util.List<Double>>", new GenericType<java.util.List<java.util.List<Double>>>() {
        });
        JSON.registerDescendants(StatResultValue.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return StatResultValue.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Double, StatResultValueSparseMatrix, java.util.List<Double>, java.util.List<java.util.List<Double>>
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        // Double
        if (JSON.isInstanceOf(Double.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // java.util.List<Double>
        if (JSON.isInstanceOf(java.util.List.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // java.util.List<java.util.List<Double>>
        if (JSON.isInstanceOf(java.util.List.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // StatResultValueSparseMatrix
        if (JSON.isInstanceOf(StatResultValueSparseMatrix.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Double, StatResultValueSparseMatrix, java.util.List<Double>, java.util.List<java.util.List<Double>>");
    }

    /**
     * Get the actual instance, which can be the following:
     * Double, StatResultValueSparseMatrix, java.util.List<Double>, java.util.List<java.util.List<Double>>
     *
     * @return The actual instance (Double, StatResultValueSparseMatrix, java.util.List<Double>, java.util.List<java.util.List<Double>>)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Double`. If the actual instance is not `Double`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Double`
     * @throws ClassCastException if the instance is not `Double`
     */
    public Double getDouble() throws ClassCastException {
        return (Double)super.getActualInstance();
    }

    /**
     * Get the actual instance of `java.util.List<Double>`. If the actual instance is not `java.util.List<Double>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `java.util.List<Double>`
     * @throws ClassCastException if the instance is not `java.util.List<Double>`
     */
    public java.util.List<Double> getOneOf1() throws ClassCastException {
        return (java.util.List<Double>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `java.util.List<java.util.List<Double>>`. If the actual instance is not `java.util.List<java.util.List<Double>>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `java.util.List<java.util.List<Double>>`
     * @throws ClassCastException if the instance is not `java.util.List<java.util.List<Double>>`
     */
    public java.util.List<java.util.List<Double>> getOneOf2() throws ClassCastException {
        return (java.util.List<java.util.List<Double>>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `StatResultValueSparseMatrix`. If the actual instance is not `StatResultValueSparseMatrix`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `StatResultValueSparseMatrix`
     * @throws ClassCastException if the instance is not `StatResultValueSparseMatrix`
     */
    public StatResultValueSparseMatrix getStatResultValueSparseMatrix() throws ClassCastException {
        return (StatResultValueSparseMatrix)super.getActualInstance();
    }

}

