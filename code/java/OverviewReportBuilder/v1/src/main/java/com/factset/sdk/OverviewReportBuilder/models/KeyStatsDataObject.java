/*
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.1.0
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
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntity;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityActiveInvestors;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityAnnualDividend;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityAverageDailyVol;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityAverageDailyVol30D;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityAverageRating;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityBasicShares;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityBeta;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityBranches;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityBrokerContributors;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityCirculatingSupply;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityDilutedMarketCap;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityDilutedShares;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityDividendYield;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityEmployees;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityEnterpriseValue;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityEstimatedVcRaised;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityExDividendDate;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityFirstDate;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityFirstFunding;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityFloat;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityFundingRounds;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityGrossAssets;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityGrossPremiums;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityInstitutional;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityLastFunding;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityLastFundingRound;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityLatestPostMoneyValuation;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityLtGrowthRate;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityMarketCap;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityNetInterestIncome;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityNextEarnings;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityOpen;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityPremiums;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityPreviousClose;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityPrimaryId;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityPrimaryTicker;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityRange52Week;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityRevenue;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntitySecurityId;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityShortInterest;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityTargetPrice;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityTop10InstitutionalHolders;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityTotalDeposits;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityTotalInvestors;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityVolume;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectEntityWacc;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFund;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundAumFundMonth;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundAumShareDaily;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundAvailableForSale;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundAverageSpread;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundCurrencyIso;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundDailyTradingVol;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundDistributionYield;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundEsgCompliance;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundEsgObjective;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundExpenseRatio;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundFirstNavRecord;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundFundFlowYTD;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundInceptionDateFund;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundInceptionDateShare;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundMeta;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundOutstandingShare;
import com.factset.sdk.OverviewReportBuilder.models.KeyStatsDataObjectFundSfdrClassification;
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
import com.factset.sdk.OverviewReportBuilder.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

@JsonDeserialize(using = KeyStatsDataObject.KeyStatsDataObjectDeserializer.class)
@JsonSerialize(using = KeyStatsDataObject.KeyStatsDataObjectSerializer.class)
public class KeyStatsDataObject extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(KeyStatsDataObject.class.getName());

    public static class KeyStatsDataObjectSerializer extends StdSerializer<KeyStatsDataObject> {
        public KeyStatsDataObjectSerializer(Class<KeyStatsDataObject> t) {
            super(t);
        }

        public KeyStatsDataObjectSerializer() {
            this(null);
        }

        @Override
        public void serialize(KeyStatsDataObject value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class KeyStatsDataObjectDeserializer extends StdDeserializer<KeyStatsDataObject> {
        public KeyStatsDataObjectDeserializer() {
            this(KeyStatsDataObject.class);
        }

        public KeyStatsDataObjectDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public KeyStatsDataObject deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize KeyStatsDataObjectEntity
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (KeyStatsDataObjectEntity.class.equals(Integer.class) || KeyStatsDataObjectEntity.class.equals(Long.class) || KeyStatsDataObjectEntity.class.equals(Float.class) || KeyStatsDataObjectEntity.class.equals(Double.class) || KeyStatsDataObjectEntity.class.equals(Boolean.class) || KeyStatsDataObjectEntity.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((KeyStatsDataObjectEntity.class.equals(Integer.class) || KeyStatsDataObjectEntity.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((KeyStatsDataObjectEntity.class.equals(Float.class) || KeyStatsDataObjectEntity.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (KeyStatsDataObjectEntity.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (KeyStatsDataObjectEntity.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<KeyStatsDataObjectEntity>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'KeyStatsDataObjectEntity'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'KeyStatsDataObjectEntity'", e);
            }

            // deserialize KeyStatsDataObjectFund
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (KeyStatsDataObjectFund.class.equals(Integer.class) || KeyStatsDataObjectFund.class.equals(Long.class) || KeyStatsDataObjectFund.class.equals(Float.class) || KeyStatsDataObjectFund.class.equals(Double.class) || KeyStatsDataObjectFund.class.equals(Boolean.class) || KeyStatsDataObjectFund.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((KeyStatsDataObjectFund.class.equals(Integer.class) || KeyStatsDataObjectFund.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((KeyStatsDataObjectFund.class.equals(Float.class) || KeyStatsDataObjectFund.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (KeyStatsDataObjectFund.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (KeyStatsDataObjectFund.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<KeyStatsDataObjectFund>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'KeyStatsDataObjectFund'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'KeyStatsDataObjectFund'", e);
            }

            if (match == 1) {
                KeyStatsDataObject ret = new KeyStatsDataObject();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for KeyStatsDataObject: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public KeyStatsDataObject getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "KeyStatsDataObject cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public KeyStatsDataObject() {
        super("oneOf", Boolean.FALSE);
    }

    public KeyStatsDataObject(KeyStatsDataObjectEntity o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public KeyStatsDataObject(KeyStatsDataObjectFund o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    static {
        schemas.put("KeyStatsDataObjectEntity", new GenericType<KeyStatsDataObjectEntity>() {
        });
        schemas.put("KeyStatsDataObjectFund", new GenericType<KeyStatsDataObjectFund>() {
        });
        JSON.registerDescendants(KeyStatsDataObject.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return KeyStatsDataObject.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * KeyStatsDataObjectEntity, KeyStatsDataObjectFund
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        // KeyStatsDataObjectEntity
        if (JSON.isInstanceOf(KeyStatsDataObjectEntity.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // KeyStatsDataObjectFund
        if (JSON.isInstanceOf(KeyStatsDataObjectFund.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be KeyStatsDataObjectEntity, KeyStatsDataObjectFund");
    }

    /**
     * Get the actual instance, which can be the following:
     * KeyStatsDataObjectEntity, KeyStatsDataObjectFund
     *
     * @return The actual instance (KeyStatsDataObjectEntity, KeyStatsDataObjectFund)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `KeyStatsDataObjectEntity`. If the actual instance is not `KeyStatsDataObjectEntity`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `KeyStatsDataObjectEntity`
     * @throws ClassCastException if the instance is not `KeyStatsDataObjectEntity`
     */
    public KeyStatsDataObjectEntity getKeyStatsDataObjectEntity() throws ClassCastException {
        return (KeyStatsDataObjectEntity)super.getActualInstance();
    }

    /**
     * Get the actual instance of `KeyStatsDataObjectFund`. If the actual instance is not `KeyStatsDataObjectFund`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `KeyStatsDataObjectFund`
     * @throws ClassCastException if the instance is not `KeyStatsDataObjectFund`
     */
    public KeyStatsDataObjectFund getKeyStatsDataObjectFund() throws ClassCastException {
        return (KeyStatsDataObjectFund)super.getActualInstance();
    }

}

