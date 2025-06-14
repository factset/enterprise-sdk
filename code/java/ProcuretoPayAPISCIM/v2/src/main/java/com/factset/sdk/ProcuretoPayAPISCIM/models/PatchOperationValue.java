/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ProcuretoPayAPISCIM.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ProcuretoPayAPISCIM.JSON;


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
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.factset.sdk.ProcuretoPayAPISCIM.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

@JsonDeserialize(using=PatchOperationValue.PatchOperationValueDeserializer.class)
@JsonSerialize(using = PatchOperationValue.PatchOperationValueSerializer.class)
public class PatchOperationValue extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(PatchOperationValue.class.getName());

    public static class PatchOperationValueSerializer extends StdSerializer<PatchOperationValue> {
        public PatchOperationValueSerializer(Class<PatchOperationValue> t) {
            super(t);
        }

        public PatchOperationValueSerializer() {
            this(null);
        }

        @Override
        public void serialize(PatchOperationValue value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class PatchOperationValueDeserializer extends StdDeserializer<PatchOperationValue> {
        public PatchOperationValueDeserializer() {
            this(PatchOperationValue.class);
        }

        public PatchOperationValueDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public PatchOperationValue deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            // deserialize java.util.List<Object>
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<java.util.List<Object>>(){});
                PatchOperationValue ret = new PatchOperationValue();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'PatchOperationValue'", e);
            }

            // deserialize Boolean
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Boolean>(){});
                PatchOperationValue ret = new PatchOperationValue();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'PatchOperationValue'", e);
            }

            // deserialize BigDecimal
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<BigDecimal>(){});
                PatchOperationValue ret = new PatchOperationValue();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'PatchOperationValue'", e);
            }

            // deserialize Object
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Object>(){});
                PatchOperationValue ret = new PatchOperationValue();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'PatchOperationValue'", e);
            }

            // deserialize String
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<String>(){});
                PatchOperationValue ret = new PatchOperationValue();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'PatchOperationValue'", e);
            }

            throw new IOException(String.format("Failed deserialization for PatchOperationValue: no match found"));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public PatchOperationValue getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "PatchOperationValue cannot be null");
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public PatchOperationValue() {
        super("anyOf", Boolean.FALSE);
    }

    public PatchOperationValue(BigDecimal o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PatchOperationValue(Boolean o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PatchOperationValue(Object o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PatchOperationValue(String o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PatchOperationValue(java.util.List<Object> o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BigDecimal", new GenericType<BigDecimal>() {
        });
        schemas.put("Boolean", new GenericType<Boolean>() {
        });
        schemas.put("Object", new GenericType<Object>() {
        });
        schemas.put("String", new GenericType<String>() {
        });
        schemas.put("java.util.List<Object>", new GenericType<java.util.List<Object>>() {
        });
        JSON.registerDescendants(PatchOperationValue.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return PatchOperationValue.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * BigDecimal, Boolean, Object, String, java.util.List<Object>
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(java.util.List.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Boolean.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(BigDecimal.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Object.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(String.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BigDecimal, Boolean, Object, String, java.util.List<Object>");
    }

    /**
     * Get the actual instance, which can be the following:
     * BigDecimal, Boolean, Object, String, java.util.List<Object>
     *
     * @return The actual instance (BigDecimal, Boolean, Object, String, java.util.List<Object>)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `java.util.List<Object>`.
     * If the actual instance is not `java.util.List<Object>`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `java.util.List<Object>`
     * @throws ClassCastException if the instance is not `java.util.List<Object>`
     */
    public java.util.List<Object> getAnyOf0() throws ClassCastException {
        return (java.util.List<Object>)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Boolean`.
     * If the actual instance is not `Boolean`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Boolean`
     * @throws ClassCastException if the instance is not `Boolean`
     */
    public Boolean getBoolean() throws ClassCastException {
        return (Boolean)super.getActualInstance();
    }

    /**
     * Get the actual instance of `BigDecimal`.
     * If the actual instance is not `BigDecimal`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BigDecimal`
     * @throws ClassCastException if the instance is not `BigDecimal`
     */
    public BigDecimal getBigDecimal() throws ClassCastException {
        return (BigDecimal)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Object`.
     * If the actual instance is not `Object`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Object`
     * @throws ClassCastException if the instance is not `Object`
     */
    public Object getObject() throws ClassCastException {
        return (Object)super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`.
     * If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }

}

