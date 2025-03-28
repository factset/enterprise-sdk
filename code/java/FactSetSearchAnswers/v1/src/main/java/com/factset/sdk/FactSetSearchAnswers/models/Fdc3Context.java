/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetSearchAnswers.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetSearchAnswers.models.CountryID;
import com.factset.sdk.FactSetSearchAnswers.models.Fdc3Country;
import com.factset.sdk.FactSetSearchAnswers.models.Fdc3Instrument;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetSearchAnswers.JSON;

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
import com.factset.sdk.FactSetSearchAnswers.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

@JsonDeserialize(using = Fdc3Context.Fdc3ContextDeserializer.class)
@JsonSerialize(using = Fdc3Context.Fdc3ContextSerializer.class)
public class Fdc3Context extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(Fdc3Context.class.getName());

    public static class Fdc3ContextSerializer extends StdSerializer<Fdc3Context> {
        public Fdc3ContextSerializer(Class<Fdc3Context> t) {
            super(t);
        }

        public Fdc3ContextSerializer() {
            this(null);
        }

        @Override
        public void serialize(Fdc3Context value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class Fdc3ContextDeserializer extends StdDeserializer<Fdc3Context> {
        public Fdc3ContextDeserializer() {
            this(Fdc3Context.class);
        }

        public Fdc3ContextDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public Fdc3Context deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            Fdc3Context newFdc3Context = new Fdc3Context();
            Map<String,Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("type");
            switch (discriminatorValue) {
                case "Fdc3Country":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Fdc3Country.class);
                    newFdc3Context.setActualInstance(deserialized);
                    return newFdc3Context;
                case "Fdc3Instrument":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Fdc3Instrument.class);
                    newFdc3Context.setActualInstance(deserialized);
                    return newFdc3Context;
                case "fdc3.country":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Fdc3Country.class);
                    newFdc3Context.setActualInstance(deserialized);
                    return newFdc3Context;
                case "fdc3.instrument":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Fdc3Instrument.class);
                    newFdc3Context.setActualInstance(deserialized);
                    return newFdc3Context;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for Fdc3Context. Possible values: Fdc3Country Fdc3Instrument fdc3.country fdc3.instrument", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize Fdc3Instrument
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Fdc3Instrument.class.equals(Integer.class) || Fdc3Instrument.class.equals(Long.class) || Fdc3Instrument.class.equals(Float.class) || Fdc3Instrument.class.equals(Double.class) || Fdc3Instrument.class.equals(Boolean.class) || Fdc3Instrument.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Fdc3Instrument.class.equals(Integer.class) || Fdc3Instrument.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Fdc3Instrument.class.equals(Float.class) || Fdc3Instrument.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Fdc3Instrument.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Fdc3Instrument.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Fdc3Instrument>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Fdc3Instrument'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Fdc3Instrument'", e);
            }

            // deserialize Fdc3Country
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Fdc3Country.class.equals(Integer.class) || Fdc3Country.class.equals(Long.class) || Fdc3Country.class.equals(Float.class) || Fdc3Country.class.equals(Double.class) || Fdc3Country.class.equals(Boolean.class) || Fdc3Country.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Fdc3Country.class.equals(Integer.class) || Fdc3Country.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Fdc3Country.class.equals(Float.class) || Fdc3Country.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Fdc3Country.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Fdc3Country.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Fdc3Country>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Fdc3Country'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Fdc3Country'", e);
            }

            if (match == 1) {
                Fdc3Context ret = new Fdc3Context();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for Fdc3Context: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public Fdc3Context getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "Fdc3Context cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public Fdc3Context() {
        super("oneOf", Boolean.FALSE);
    }

    public Fdc3Context(Fdc3Instrument o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public Fdc3Context(Fdc3Country o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    static {
        schemas.put("Fdc3Country", new GenericType<Fdc3Country>() {
        });
        schemas.put("Fdc3Instrument", new GenericType<Fdc3Instrument>() {
        });
        JSON.registerDescendants(Fdc3Context.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("Fdc3Country", Fdc3Country.class);
        mappings.put("Fdc3Instrument", Fdc3Instrument.class);
        mappings.put("fdc3.country", Fdc3Country.class);
        mappings.put("fdc3.instrument", Fdc3Instrument.class);
        mappings.put("Fdc3Context", Fdc3Context.class);
        JSON.registerDiscriminator(Fdc3Context.class, "type", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return Fdc3Context.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Fdc3Country, Fdc3Instrument
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        // Fdc3Instrument
        if (JSON.isInstanceOf(Fdc3Instrument.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // Fdc3Country
        if (JSON.isInstanceOf(Fdc3Country.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Fdc3Country, Fdc3Instrument");
    }

    /**
     * Get the actual instance, which can be the following:
     * Fdc3Country, Fdc3Instrument
     *
     * @return The actual instance (Fdc3Country, Fdc3Instrument)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Fdc3Instrument`. If the actual instance is not `Fdc3Instrument`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Fdc3Instrument`
     * @throws ClassCastException if the instance is not `Fdc3Instrument`
     */
    public Fdc3Instrument getFdc3Instrument() throws ClassCastException {
        return (Fdc3Instrument)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Fdc3Country`. If the actual instance is not `Fdc3Country`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Fdc3Country`
     * @throws ClassCastException if the instance is not `Fdc3Country`
     */
    public Fdc3Country getFdc3Country() throws ClassCastException {
        return (Fdc3Country)super.getActualInstance();
    }

}

