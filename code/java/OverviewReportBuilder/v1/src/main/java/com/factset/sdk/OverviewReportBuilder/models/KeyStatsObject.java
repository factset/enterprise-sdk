/*
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OverviewReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObject;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectActiveInvestors;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectAverageDailyVol;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectAverageRating;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectBasicShares;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectBranches;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectBrokerContributors;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectDilutedMarketCap;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectDilutedShares;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectDividendYield;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectEmployees;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectEnterpriseValue;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectEstimatedVcRaised;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectFirstDate;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectFirstFunding;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectFloat;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectFundingRounds;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectGrossAssets;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectGrossPremiums;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectInstitutional;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectLastFunding;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectLatestPostMoneyValuation;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectLtGrowthRate;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectMarketCap;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectNetInterestIncome;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectPremiums;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectRange52Week;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectRevenue;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectTargetPrice;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectTop10InstitutionalHolders;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectTotalDeposits;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectTotalInvestors;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsEntityObjectWacc;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObject;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectAumFundMonth;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectAumShareDaily;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectAvailableForSale;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectAverageSpread;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectCurrencyIso;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectDailyTradingVol;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectDistributionYield;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectEsgCompliance;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectExpenseRatio;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectFirstNavRecord;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectFundFlowYTD;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectInceptionDateFund;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectInceptionDateShare;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectMeta;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectOutstandingShare;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsFundObjectSfdrClassification;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OverviewReportBuilder.JSON;

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
import com.factset.sdk.OverviewReportBuilder.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = KeyStatsObject.KeyStatsObjectDeserializer.class)
@JsonSerialize(using = KeyStatsObject.KeyStatsObjectSerializer.class)
public class KeyStatsObject extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(KeyStatsObject.class.getName());

    public static class KeyStatsObjectSerializer extends StdSerializer<KeyStatsObject> {
        public KeyStatsObjectSerializer(Class<KeyStatsObject> t) {
            super(t);
        }

        public KeyStatsObjectSerializer() {
            this(null);
        }

        @Override
        public void serialize(KeyStatsObject value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class KeyStatsObjectDeserializer extends StdDeserializer<KeyStatsObject> {
        public KeyStatsObjectDeserializer() {
            this(KeyStatsObject.class);
        }

        public KeyStatsObjectDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public KeyStatsObject deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize KeyStatsEntityObject
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (KeyStatsEntityObject.class.equals(Integer.class) || KeyStatsEntityObject.class.equals(Long.class) || KeyStatsEntityObject.class.equals(Float.class) || KeyStatsEntityObject.class.equals(Double.class) || KeyStatsEntityObject.class.equals(Boolean.class) || KeyStatsEntityObject.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((KeyStatsEntityObject.class.equals(Integer.class) || KeyStatsEntityObject.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((KeyStatsEntityObject.class.equals(Float.class) || KeyStatsEntityObject.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (KeyStatsEntityObject.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (KeyStatsEntityObject.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<KeyStatsEntityObject>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'KeyStatsEntityObject'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'KeyStatsEntityObject'", e);
            }

            // deserialize KeyStatsFundObject
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (KeyStatsFundObject.class.equals(Integer.class) || KeyStatsFundObject.class.equals(Long.class) || KeyStatsFundObject.class.equals(Float.class) || KeyStatsFundObject.class.equals(Double.class) || KeyStatsFundObject.class.equals(Boolean.class) || KeyStatsFundObject.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((KeyStatsFundObject.class.equals(Integer.class) || KeyStatsFundObject.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((KeyStatsFundObject.class.equals(Float.class) || KeyStatsFundObject.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (KeyStatsFundObject.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (KeyStatsFundObject.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<KeyStatsFundObject>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'KeyStatsFundObject'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'KeyStatsFundObject'", e);
            }

            if (match == 1) {
                KeyStatsObject ret = new KeyStatsObject();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for KeyStatsObject: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public KeyStatsObject getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "KeyStatsObject cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public KeyStatsObject() {
        super("oneOf", Boolean.FALSE);
    }

    public KeyStatsObject(KeyStatsEntityObject o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public KeyStatsObject(KeyStatsFundObject o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    static {
        schemas.put("KeyStatsEntityObject", new GenericType<KeyStatsEntityObject>() {
        });
        schemas.put("KeyStatsFundObject", new GenericType<KeyStatsFundObject>() {
        });
        JSON.registerDescendants(KeyStatsObject.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return KeyStatsObject.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * KeyStatsEntityObject, KeyStatsFundObject
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        // KeyStatsEntityObject
        if (JSON.isInstanceOf(KeyStatsEntityObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // KeyStatsFundObject
        if (JSON.isInstanceOf(KeyStatsFundObject.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be KeyStatsEntityObject, KeyStatsFundObject");
    }

    /**
     * Get the actual instance, which can be the following:
     * KeyStatsEntityObject, KeyStatsFundObject
     *
     * @return The actual instance (KeyStatsEntityObject, KeyStatsFundObject)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `KeyStatsEntityObject`. If the actual instance is not `KeyStatsEntityObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `KeyStatsEntityObject`
     * @throws ClassCastException if the instance is not `KeyStatsEntityObject`
     */
    public KeyStatsEntityObject getKeyStatsEntityObject() throws ClassCastException {
        return (KeyStatsEntityObject)super.getActualInstance();
    }

    /**
     * Get the actual instance of `KeyStatsFundObject`. If the actual instance is not `KeyStatsFundObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `KeyStatsFundObject`
     * @throws ClassCastException if the instance is not `KeyStatsFundObject`
     */
    public KeyStatsFundObject getKeyStatsFundObject() throws ClassCastException {
        return (KeyStatsFundObject)super.getActualInstance();
    }

}

