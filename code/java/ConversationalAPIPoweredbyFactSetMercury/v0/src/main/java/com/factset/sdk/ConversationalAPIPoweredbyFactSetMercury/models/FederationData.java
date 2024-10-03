/*
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client’s chatbot experience.  Request data from FactSet using natural language queries. Start the response generation using the `/query` endpoint, poll the status using `/status`. Once the result is ready, retrieve it using `/result`.  If your response contains a file ID, such as for an Excel chart or a FactSet ActiveGraph, retrieve it using the file ID at the `/download/file` endpoint.  We also encourage you to provide feedback on your responses using the `/feedback` endpoint!  **Please note:** \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable.  **Try the Conversational API and view Available Content**  In the [Using the Conversational API Online Assistant](https://my.apps.factset.com/oa/pages/23209) you can find instructions on how to start using the Conversational API, and the full list of content available.  Some of the prompts supported are:  - What is Tesla's enterprise value? - Create a chart showing CME price relative to the S&P 500 - What were the highlights from Palantir's recent earnings call?  **Adaptive Card Format**  The Conversational API uses the Microsoft Adaptive Card format for response data surfaced from FactSet content sets. `Value` property of parent FederationData contains a JSON serialized presentation of a Microsoft Adaptive Card. See [Microsoft docs](https://learn.microsoft.com/en-us/adaptive-cards/) for Adaptive Card documentation, and the [Adaptive Card schema explorer](https://adaptivecards.io/explorer/) for schema details. **Please note**: \"The adaptive card may contain actions, which represent functionality within the card itself. In order to execute these actions, a handler must be implemented in your Adaptive Card rendering process. See [handling actions](https://learn.microsoft.com/en-us/adaptive-cards/sdk/rendering-cards/javascript/actions) for an example implementation.  **STACH Format**  The Conversational API may use Factset's STACH V3 format to represent tabular data in JSON. Please refer to the [STACH V3 documentation](https://factset.github.io/stachschema/#/v3/README) on column organized data for more information on how to process STACH-organized data. <details>   <summary><u>**STACH Example**</u></summary>   ```json   {     \"version\": \"3.1\",     \"table\": {       \"primaryKeys\": [         \"Insider Holders\",         \"MV (M,$)\",         \"% O/S\"       ],       \"totalNumRows\": 5     },     \"views\": [       {         \"name\": \"view\",         \"displayName\": \"who are the suppliers of nike\",         \"table\": {           \"columns\": [             \"Insider Holders\",             \"MV (M,$)\",             \"% O/S\"           ],           \"headers\": {             \"Insider Holders\": \"Insider Holders\",             \"MV (M,$)\": \"MV (M,$)\",             \"% O/S\": \"% O/S\"           }         }       }     ],     \"columns\": [       {         \"name\": \"Insider Holders\",         \"contextualType\": \"string\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 100           }         }       },       {         \"name\": \"MV (M,$)\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 67           }         }       },       {         \"name\": \"% O/S\",         \"contextualType\": \"real\",         \"customMetadata\": {           \"relevancy\": {             \"contextualType\": \"int32\",             \"value\": 34           }         }       }     ],     \"rows\": [       {         \"Insider Holders\": \"Knight Philip Hampson\",         \"MV (M,$)\": 3156.8,         \"% O/S\": 1.531       },       {         \"Insider Holders\": \"Knight Travis A\",         \"MV (M,$)\": 601.6,         \"% O/S\": 0.496       },       {         \"Insider Holders\": \"Wellcome Trust Ltd. (Direct Investments)\",         \"MV (M,$)\": 225.5,         \"% O/S\": 0.105       },       {         \"Insider Holders\": \"Parker Mark G\",         \"MV (M,$)\": 100.1,         \"% O/S\": 0.056       },       {         \"Insider Holders\": \"Donahoe John J Ii\",         \"MV (M,$)\": 19.8,         \"% O/S\": 0.018       }     ]   }   ``` </details>  **Citations**  Responses from the Conversational API may contain `citations` which provide references to the source of the data directly within the textual response. Phrases within the response text are mapped to a data item in the `citations` object via a bracketed ID (e.g. `[1]`). Citations may be used to provide additional context or to verify the source of the data; in some cases, a single phrase within the response may be supported by multiple data sources. **Please note**: Links to the source data are provided as links to FactSet's Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). The link will direct you to the entire document; you may need to search for the specific phrase within the document. We are currently working on providing direct links to the specific section or excerpt of the document. <details>   <summary><u>**Citation Example**</u></summary>   ```json   {     \"type\": \"string\",     \"value\": \"FactSet has expressed optimism about the potential of generative AI (GenAI) to enhance their product offerings and drive efficiency[1].\"     \"citations\": {       \"[1]\": [         \"phraseId\": \"aba1d533-08b3-4d3e-8961-5d37bb2caff6\",         \"content\": \"At the same time, expectations are high around the effect generative AI will have on our industry.\",         \"speakerInfo\": {           \"companyId\": \"0016YD-E\",           \"companyName\": \"FactSet Research Systems, Inc.\",           \"speakerId\": \"0DPHLH-E\",           \"speakerName\": \"Philip Snow\",           \"speakerTitle\": \"Chief Executive Officer & Director\"         },         \"sourceURL\": \"https://my.apps.factset.com/viewer-fusion/?_doc_id=2948302-t&_doc_date=20231219&_doc_product=FCST&_doc_docfn=/home/docs/fcst/8/302/2948302-t.pdf&e=false\"       ]     }   }   ``` </details> 
 *
 * The version of the OpenAPI document: 0.6.0
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
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.ResponseString;
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
                case "ResponseString":
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ResponseString.class);
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
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(ResponseString.class);
                    newFederationData.setActualInstance(deserialized);
                    return newFederationData;
                default:
                    log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for FederationData. Possible values: AdaptiveCard NextStep ResponseString SuggestedPrompts Table string", discriminatorValue));
            }

            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize ResponseString
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ResponseString.class.equals(Integer.class) || ResponseString.class.equals(Long.class) || ResponseString.class.equals(Float.class) || ResponseString.class.equals(Double.class) || ResponseString.class.equals(Boolean.class) || ResponseString.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ResponseString.class.equals(Integer.class) || ResponseString.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ResponseString.class.equals(Float.class) || ResponseString.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ResponseString.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ResponseString.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<ResponseString>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ResponseString'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ResponseString'", e);
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

    public FederationData(ResponseString o) {
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
        schemas.put("ResponseString", new GenericType<ResponseString>() {
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
        mappings.put("ResponseString", ResponseString.class);
        mappings.put("SuggestedPrompts", SuggestedPrompts.class);
        mappings.put("Table", Table.class);
        mappings.put("string", ResponseString.class);
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
     * AdaptiveCard, NextStep, ResponseString, SuggestedPrompts, Table
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        // ResponseString
        if (JSON.isInstanceOf(ResponseString.class, instance, new HashSet<Class<?>>())) {
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

        throw new RuntimeException("Invalid instance type. Must be AdaptiveCard, NextStep, ResponseString, SuggestedPrompts, Table");
    }

    /**
     * Get the actual instance, which can be the following:
     * AdaptiveCard, NextStep, ResponseString, SuggestedPrompts, Table
     *
     * @return The actual instance (AdaptiveCard, NextStep, ResponseString, SuggestedPrompts, Table)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ResponseString`. If the actual instance is not `ResponseString`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ResponseString`
     * @throws ClassCastException if the instance is not `ResponseString`
     */
    public ResponseString getResponseString() throws ClassCastException {
        return (ResponseString)super.getActualInstance();
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

