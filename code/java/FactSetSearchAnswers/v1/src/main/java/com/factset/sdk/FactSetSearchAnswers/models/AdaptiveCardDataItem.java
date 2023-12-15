/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: FactSearch.Team@factset.com
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
import com.factset.sdk.FactSetSearchAnswers.models.AdaptiveCardWithThumbnail;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetSearchAnswers.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = AdaptiveCardDataItem.AdaptiveCardDataItemDeserializer.class)
@JsonSerialize(using = AdaptiveCardDataItem.AdaptiveCardDataItemSerializer.class)
public class AdaptiveCardDataItem extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(AdaptiveCardDataItem.class.getName());

    public static class AdaptiveCardDataItemSerializer extends StdSerializer<AdaptiveCardDataItem> {
        public AdaptiveCardDataItemSerializer(Class<AdaptiveCardDataItem> t) {
            super(t);
        }

        public AdaptiveCardDataItemSerializer() {
            this(null);
        }

        @Override
        public void serialize(AdaptiveCardDataItem value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class AdaptiveCardDataItemDeserializer extends StdDeserializer<AdaptiveCardDataItem> {
        public AdaptiveCardDataItemDeserializer() {
            this(AdaptiveCardDataItem.class);
        }

        public AdaptiveCardDataItemDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public AdaptiveCardDataItem deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize Object
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Object.class.equals(Integer.class) || Object.class.equals(Long.class) || Object.class.equals(Float.class) || Object.class.equals(Double.class) || Object.class.equals(Boolean.class) || Object.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Object.class.equals(Integer.class) || Object.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Object.class.equals(Float.class) || Object.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Object.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Object.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Object>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Object'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Object'", e);
            }

            // deserialize AdaptiveCardWithThumbnail
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AdaptiveCardWithThumbnail.class.equals(Integer.class) || AdaptiveCardWithThumbnail.class.equals(Long.class) || AdaptiveCardWithThumbnail.class.equals(Float.class) || AdaptiveCardWithThumbnail.class.equals(Double.class) || AdaptiveCardWithThumbnail.class.equals(Boolean.class) || AdaptiveCardWithThumbnail.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AdaptiveCardWithThumbnail.class.equals(Integer.class) || AdaptiveCardWithThumbnail.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AdaptiveCardWithThumbnail.class.equals(Float.class) || AdaptiveCardWithThumbnail.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AdaptiveCardWithThumbnail.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AdaptiveCardWithThumbnail.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<AdaptiveCardWithThumbnail>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AdaptiveCardWithThumbnail'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AdaptiveCardWithThumbnail'", e);
            }

            if (match == 1) {
                AdaptiveCardDataItem ret = new AdaptiveCardDataItem();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for AdaptiveCardDataItem: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public AdaptiveCardDataItem getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "AdaptiveCardDataItem cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public AdaptiveCardDataItem() {
        super("oneOf", Boolean.FALSE);
    }

    public AdaptiveCardDataItem(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public AdaptiveCardDataItem(AdaptiveCardWithThumbnail o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    static {
        schemas.put("AdaptiveCardWithThumbnail", new GenericType<AdaptiveCardWithThumbnail>() {
        });
        schemas.put("Object", new GenericType<Object>() {
        });
        JSON.registerDescendants(AdaptiveCardDataItem.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AdaptiveCardDataItem.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AdaptiveCardWithThumbnail, Object
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        // Object
        if (JSON.isInstanceOf(Object.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // AdaptiveCardWithThumbnail
        if (JSON.isInstanceOf(AdaptiveCardWithThumbnail.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AdaptiveCardWithThumbnail, Object");
    }

    /**
     * Get the actual instance, which can be the following:
     * AdaptiveCardWithThumbnail, Object
     *
     * @return The actual instance (AdaptiveCardWithThumbnail, Object)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `Object`. If the actual instance is not `Object`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Object`
     * @throws ClassCastException if the instance is not `Object`
     */
    public Object getObject() throws ClassCastException {
        return (Object)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AdaptiveCardWithThumbnail`. If the actual instance is not `AdaptiveCardWithThumbnail`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AdaptiveCardWithThumbnail`
     * @throws ClassCastException if the instance is not `AdaptiveCardWithThumbnail`
     */
    public AdaptiveCardWithThumbnail getAdaptiveCardWithThumbnail() throws ClassCastException {
        return (AdaptiveCardWithThumbnail)super.getActualInstance();
    }

}

