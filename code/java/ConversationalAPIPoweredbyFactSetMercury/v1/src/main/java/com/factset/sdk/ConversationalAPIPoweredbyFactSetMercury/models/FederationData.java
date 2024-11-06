/*
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client's chatbot experience.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  **Conversational API Consumer Workflow**  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   **FAQ and Limitations**  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FatSet Support. 
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.AdaptiveCard;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.NextStep;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.Phrase;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.PromptItem;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ResponseText;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.SuggestedPrompts;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.Table;
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
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.JSON;

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
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

@JsonDeserialize(using = FederationData.FederationDataDeserializer.class)
@JsonSerialize(using = FederationData.FederationDataSerializer.class)
public class FederationData extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(FederationData.class.getName());

    public static class FederationDataSerializer extends StdSerializer<FederationData> {
        public FederationDataSerializer(Class<FederationData> t) {
            super(t);
        }

        public FederationDataSerializer() {
            this(null);
        }

        @Override
        public void serialize(FederationData value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class FederationDataDeserializer extends StdDeserializer<FederationData> {
        public FederationDataDeserializer() {
            this(FederationData.class);
        }

        public FederationDataDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public FederationData deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            FederationData newFederationData = new FederationData();
            Map<String,Object> result2 = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Map<String, Object>>() {});
            String discriminatorValue = (String)result2.get("type");
            switch (discriminatorValue) {
                case "AdaptiveCard":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(AdaptiveCard.class);
                    newFederationData.setActualInstance(deserialized);
                    return newFederationData;
                case "NextStep":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(NextStep.class);
                    newFederationData.setActualInstance(deserialized);
                    return newFederationData;
                case "ResponseText":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ResponseText.class);
                    newFederationData.setActualInstance(deserialized);
                    return newFederationData;
                case "SuggestedPrompts":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(SuggestedPrompts.class);
                    newFederationData.setActualInstance(deserialized);
                    return newFederationData;
                case "Table":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(Table.class);
                    newFederationData.setActualInstance(deserialized);
                    return newFederationData;
                case "string":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ResponseText.class);
                    newFederationData.setActualInstance(deserialized);
                    return newFederationData;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for FederationData. Possible values: AdaptiveCard NextStep ResponseText SuggestedPrompts Table string", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ResponseText
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ResponseText.class.equals(Integer.class) || ResponseText.class.equals(Long.class) || ResponseText.class.equals(Float.class) || ResponseText.class.equals(Double.class) || ResponseText.class.equals(Boolean.class) || ResponseText.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ResponseText.class.equals(Integer.class) || ResponseText.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ResponseText.class.equals(Float.class) || ResponseText.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ResponseText.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ResponseText.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<ResponseText>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ResponseText'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ResponseText'", e);
            }

            // deserialize AdaptiveCard
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (AdaptiveCard.class.equals(Integer.class) || AdaptiveCard.class.equals(Long.class) || AdaptiveCard.class.equals(Float.class) || AdaptiveCard.class.equals(Double.class) || AdaptiveCard.class.equals(Boolean.class) || AdaptiveCard.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((AdaptiveCard.class.equals(Integer.class) || AdaptiveCard.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((AdaptiveCard.class.equals(Float.class) || AdaptiveCard.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (AdaptiveCard.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (AdaptiveCard.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<AdaptiveCard>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'AdaptiveCard'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'AdaptiveCard'", e);
            }

            // deserialize Table
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Table.class.equals(Integer.class) || Table.class.equals(Long.class) || Table.class.equals(Float.class) || Table.class.equals(Double.class) || Table.class.equals(Boolean.class) || Table.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Table.class.equals(Integer.class) || Table.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Table.class.equals(Float.class) || Table.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Table.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Table.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Table>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Table'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Table'", e);
            }

            // deserialize NextStep
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (NextStep.class.equals(Integer.class) || NextStep.class.equals(Long.class) || NextStep.class.equals(Float.class) || NextStep.class.equals(Double.class) || NextStep.class.equals(Boolean.class) || NextStep.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((NextStep.class.equals(Integer.class) || NextStep.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((NextStep.class.equals(Float.class) || NextStep.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (NextStep.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (NextStep.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<NextStep>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'NextStep'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'NextStep'", e);
            }

            // deserialize SuggestedPrompts
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (SuggestedPrompts.class.equals(Integer.class) || SuggestedPrompts.class.equals(Long.class) || SuggestedPrompts.class.equals(Float.class) || SuggestedPrompts.class.equals(Double.class) || SuggestedPrompts.class.equals(Boolean.class) || SuggestedPrompts.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((SuggestedPrompts.class.equals(Integer.class) || SuggestedPrompts.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((SuggestedPrompts.class.equals(Float.class) || SuggestedPrompts.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (SuggestedPrompts.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (SuggestedPrompts.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<SuggestedPrompts>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'SuggestedPrompts'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'SuggestedPrompts'", e);
            }

            if (match == 1) {
                FederationData ret = new FederationData();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for FederationData: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public FederationData getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "FederationData cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public FederationData() {
        super("oneOf", Boolean.FALSE);
    }

    public FederationData(ResponseText o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public FederationData(AdaptiveCard o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public FederationData(Table o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public FederationData(NextStep o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public FederationData(SuggestedPrompts o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    static {
        schemas.put("AdaptiveCard", new GenericType<AdaptiveCard>() {
        });
        schemas.put("NextStep", new GenericType<NextStep>() {
        });
        schemas.put("ResponseText", new GenericType<ResponseText>() {
        });
        schemas.put("SuggestedPrompts", new GenericType<SuggestedPrompts>() {
        });
        schemas.put("Table", new GenericType<Table>() {
        });
        JSON.registerDescendants(FederationData.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("AdaptiveCard", AdaptiveCard.class);
        mappings.put("NextStep", NextStep.class);
        mappings.put("ResponseText", ResponseText.class);
        mappings.put("SuggestedPrompts", SuggestedPrompts.class);
        mappings.put("Table", Table.class);
        mappings.put("string", ResponseText.class);
        mappings.put("FederationData", FederationData.class);
        JSON.registerDiscriminator(FederationData.class, "type", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return FederationData.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AdaptiveCard, NextStep, ResponseText, SuggestedPrompts, Table
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        // ResponseText
        if (JSON.isInstanceOf(ResponseText.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // AdaptiveCard
        if (JSON.isInstanceOf(AdaptiveCard.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // Table
        if (JSON.isInstanceOf(Table.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // NextStep
        if (JSON.isInstanceOf(NextStep.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // SuggestedPrompts
        if (JSON.isInstanceOf(SuggestedPrompts.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AdaptiveCard, NextStep, ResponseText, SuggestedPrompts, Table");
    }

    /**
     * Get the actual instance, which can be the following:
     * AdaptiveCard, NextStep, ResponseText, SuggestedPrompts, Table
     *
     * @return The actual instance (AdaptiveCard, NextStep, ResponseText, SuggestedPrompts, Table)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ResponseText`. If the actual instance is not `ResponseText`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ResponseText`
     * @throws ClassCastException if the instance is not `ResponseText`
     */
    public ResponseText getResponseText() throws ClassCastException {
        return (ResponseText)super.getActualInstance();
    }

    /**
     * Get the actual instance of `AdaptiveCard`. If the actual instance is not `AdaptiveCard`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AdaptiveCard`
     * @throws ClassCastException if the instance is not `AdaptiveCard`
     */
    public AdaptiveCard getAdaptiveCard() throws ClassCastException {
        return (AdaptiveCard)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Table`. If the actual instance is not `Table`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Table`
     * @throws ClassCastException if the instance is not `Table`
     */
    public Table getTable() throws ClassCastException {
        return (Table)super.getActualInstance();
    }

    /**
     * Get the actual instance of `NextStep`. If the actual instance is not `NextStep`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `NextStep`
     * @throws ClassCastException if the instance is not `NextStep`
     */
    public NextStep getNextStep() throws ClassCastException {
        return (NextStep)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SuggestedPrompts`. If the actual instance is not `SuggestedPrompts`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SuggestedPrompts`
     * @throws ClassCastException if the instance is not `SuggestedPrompts`
     */
    public SuggestedPrompts getSuggestedPrompts() throws ClassCastException {
        return (SuggestedPrompts)super.getActualInstance();
    }

}

