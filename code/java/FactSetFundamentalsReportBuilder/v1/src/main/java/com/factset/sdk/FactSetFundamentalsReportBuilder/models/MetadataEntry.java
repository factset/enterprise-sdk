/*
 * FactSet Fundamentals Report Builder
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFundamentalsReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.Category;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.CategoryCategory;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.CurrencyCode;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.CurrencyCodeCurrencyCode;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.CurrencySymbol;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.CurrencySymbolCurrencySymbol;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.Description;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.DescriptionDescription;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.Frequency;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.FrequencyFrequency;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.MetricFundamentals;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.MetricFundamentalsMetricFundamentals;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.ReportStatus;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.ReportStatusReportStaus;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.Scale;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.ScaleScale;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.ValueType;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.ValueTypeValueType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetFundamentalsReportBuilder.JSON;

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
import com.factset.sdk.FactSetFundamentalsReportBuilder.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

@JsonDeserialize(using = MetadataEntry.MetadataEntryDeserializer.class)
@JsonSerialize(using = MetadataEntry.MetadataEntrySerializer.class)
public class MetadataEntry extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(MetadataEntry.class.getName());

    public static class MetadataEntrySerializer extends StdSerializer<MetadataEntry> {
        public MetadataEntrySerializer(Class<MetadataEntry> t) {
            super(t);
        }

        public MetadataEntrySerializer() {
            this(null);
        }

        @Override
        public void serialize(MetadataEntry value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class MetadataEntryDeserializer extends StdDeserializer<MetadataEntry> {
        public MetadataEntryDeserializer() {
            this(MetadataEntry.class);
        }

        public MetadataEntryDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public MetadataEntry deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize CurrencyCode
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CurrencyCode.class.equals(Integer.class) || CurrencyCode.class.equals(Long.class) || CurrencyCode.class.equals(Float.class) || CurrencyCode.class.equals(Double.class) || CurrencyCode.class.equals(Boolean.class) || CurrencyCode.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CurrencyCode.class.equals(Integer.class) || CurrencyCode.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CurrencyCode.class.equals(Float.class) || CurrencyCode.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CurrencyCode.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CurrencyCode.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<CurrencyCode>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CurrencyCode'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CurrencyCode'", e);
            }

            // deserialize CurrencySymbol
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (CurrencySymbol.class.equals(Integer.class) || CurrencySymbol.class.equals(Long.class) || CurrencySymbol.class.equals(Float.class) || CurrencySymbol.class.equals(Double.class) || CurrencySymbol.class.equals(Boolean.class) || CurrencySymbol.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((CurrencySymbol.class.equals(Integer.class) || CurrencySymbol.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((CurrencySymbol.class.equals(Float.class) || CurrencySymbol.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (CurrencySymbol.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (CurrencySymbol.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<CurrencySymbol>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'CurrencySymbol'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'CurrencySymbol'", e);
            }

            // deserialize Category
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Category.class.equals(Integer.class) || Category.class.equals(Long.class) || Category.class.equals(Float.class) || Category.class.equals(Double.class) || Category.class.equals(Boolean.class) || Category.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Category.class.equals(Integer.class) || Category.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Category.class.equals(Float.class) || Category.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Category.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Category.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Category>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Category'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Category'", e);
            }

            // deserialize MetricFundamentals
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (MetricFundamentals.class.equals(Integer.class) || MetricFundamentals.class.equals(Long.class) || MetricFundamentals.class.equals(Float.class) || MetricFundamentals.class.equals(Double.class) || MetricFundamentals.class.equals(Boolean.class) || MetricFundamentals.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((MetricFundamentals.class.equals(Integer.class) || MetricFundamentals.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((MetricFundamentals.class.equals(Float.class) || MetricFundamentals.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (MetricFundamentals.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (MetricFundamentals.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<MetricFundamentals>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'MetricFundamentals'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'MetricFundamentals'", e);
            }

            // deserialize ValueType
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ValueType.class.equals(Integer.class) || ValueType.class.equals(Long.class) || ValueType.class.equals(Float.class) || ValueType.class.equals(Double.class) || ValueType.class.equals(Boolean.class) || ValueType.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ValueType.class.equals(Integer.class) || ValueType.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ValueType.class.equals(Float.class) || ValueType.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ValueType.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ValueType.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<ValueType>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ValueType'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ValueType'", e);
            }

            // deserialize Scale
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Scale.class.equals(Integer.class) || Scale.class.equals(Long.class) || Scale.class.equals(Float.class) || Scale.class.equals(Double.class) || Scale.class.equals(Boolean.class) || Scale.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Scale.class.equals(Integer.class) || Scale.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Scale.class.equals(Float.class) || Scale.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Scale.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Scale.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Scale>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Scale'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Scale'", e);
            }

            // deserialize Description
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Description.class.equals(Integer.class) || Description.class.equals(Long.class) || Description.class.equals(Float.class) || Description.class.equals(Double.class) || Description.class.equals(Boolean.class) || Description.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Description.class.equals(Integer.class) || Description.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Description.class.equals(Float.class) || Description.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Description.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Description.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Description>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Description'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Description'", e);
            }

            // deserialize Frequency
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (Frequency.class.equals(Integer.class) || Frequency.class.equals(Long.class) || Frequency.class.equals(Float.class) || Frequency.class.equals(Double.class) || Frequency.class.equals(Boolean.class) || Frequency.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((Frequency.class.equals(Integer.class) || Frequency.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((Frequency.class.equals(Float.class) || Frequency.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (Frequency.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (Frequency.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Frequency>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'Frequency'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'Frequency'", e);
            }

            // deserialize ReportStatus
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (ReportStatus.class.equals(Integer.class) || ReportStatus.class.equals(Long.class) || ReportStatus.class.equals(Float.class) || ReportStatus.class.equals(Double.class) || ReportStatus.class.equals(Boolean.class) || ReportStatus.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((ReportStatus.class.equals(Integer.class) || ReportStatus.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((ReportStatus.class.equals(Float.class) || ReportStatus.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (ReportStatus.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (ReportStatus.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<ReportStatus>() { });
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'ReportStatus'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'ReportStatus'", e);
            }

            if (match == 1) {
                MetadataEntry ret = new MetadataEntry();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for MetadataEntry: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public MetadataEntry getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "MetadataEntry cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public MetadataEntry() {
        super("oneOf", Boolean.FALSE);
    }

    public MetadataEntry(CurrencyCode o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public MetadataEntry(CurrencySymbol o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public MetadataEntry(Category o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public MetadataEntry(MetricFundamentals o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public MetadataEntry(ValueType o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public MetadataEntry(Scale o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public MetadataEntry(Description o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public MetadataEntry(Frequency o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    public MetadataEntry(ReportStatus o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }
    static {
        schemas.put("Category", new GenericType<Category>() {
        });
        schemas.put("CurrencyCode", new GenericType<CurrencyCode>() {
        });
        schemas.put("CurrencySymbol", new GenericType<CurrencySymbol>() {
        });
        schemas.put("Description", new GenericType<Description>() {
        });
        schemas.put("Frequency", new GenericType<Frequency>() {
        });
        schemas.put("MetricFundamentals", new GenericType<MetricFundamentals>() {
        });
        schemas.put("ReportStatus", new GenericType<ReportStatus>() {
        });
        schemas.put("Scale", new GenericType<Scale>() {
        });
        schemas.put("ValueType", new GenericType<ValueType>() {
        });
        JSON.registerDescendants(MetadataEntry.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return MetadataEntry.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * Category, CurrencyCode, CurrencySymbol, Description, Frequency, MetricFundamentals, ReportStatus, Scale, ValueType
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        // CurrencyCode
        if (JSON.isInstanceOf(CurrencyCode.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // CurrencySymbol
        if (JSON.isInstanceOf(CurrencySymbol.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // Category
        if (JSON.isInstanceOf(Category.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // MetricFundamentals
        if (JSON.isInstanceOf(MetricFundamentals.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // ValueType
        if (JSON.isInstanceOf(ValueType.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // Scale
        if (JSON.isInstanceOf(Scale.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // Description
        if (JSON.isInstanceOf(Description.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // Frequency
        if (JSON.isInstanceOf(Frequency.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        // ReportStatus
        if (JSON.isInstanceOf(ReportStatus.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Category, CurrencyCode, CurrencySymbol, Description, Frequency, MetricFundamentals, ReportStatus, Scale, ValueType");
    }

    /**
     * Get the actual instance, which can be the following:
     * Category, CurrencyCode, CurrencySymbol, Description, Frequency, MetricFundamentals, ReportStatus, Scale, ValueType
     *
     * @return The actual instance (Category, CurrencyCode, CurrencySymbol, Description, Frequency, MetricFundamentals, ReportStatus, Scale, ValueType)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CurrencyCode`. If the actual instance is not `CurrencyCode`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CurrencyCode`
     * @throws ClassCastException if the instance is not `CurrencyCode`
     */
    public CurrencyCode getCurrencyCode() throws ClassCastException {
        return (CurrencyCode)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CurrencySymbol`. If the actual instance is not `CurrencySymbol`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CurrencySymbol`
     * @throws ClassCastException if the instance is not `CurrencySymbol`
     */
    public CurrencySymbol getCurrencySymbol() throws ClassCastException {
        return (CurrencySymbol)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Category`. If the actual instance is not `Category`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Category`
     * @throws ClassCastException if the instance is not `Category`
     */
    public Category getCategory() throws ClassCastException {
        return (Category)super.getActualInstance();
    }

    /**
     * Get the actual instance of `MetricFundamentals`. If the actual instance is not `MetricFundamentals`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MetricFundamentals`
     * @throws ClassCastException if the instance is not `MetricFundamentals`
     */
    public MetricFundamentals getMetricFundamentals() throws ClassCastException {
        return (MetricFundamentals)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ValueType`. If the actual instance is not `ValueType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ValueType`
     * @throws ClassCastException if the instance is not `ValueType`
     */
    public ValueType getValueType() throws ClassCastException {
        return (ValueType)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Scale`. If the actual instance is not `Scale`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Scale`
     * @throws ClassCastException if the instance is not `Scale`
     */
    public Scale getScale() throws ClassCastException {
        return (Scale)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Description`. If the actual instance is not `Description`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Description`
     * @throws ClassCastException if the instance is not `Description`
     */
    public Description getDescription() throws ClassCastException {
        return (Description)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Frequency`. If the actual instance is not `Frequency`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Frequency`
     * @throws ClassCastException if the instance is not `Frequency`
     */
    public Frequency getFrequency() throws ClassCastException {
        return (Frequency)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ReportStatus`. If the actual instance is not `ReportStatus`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ReportStatus`
     * @throws ClassCastException if the instance is not `ReportStatus`
     */
    public ReportStatus getReportStatus() throws ClassCastException {
        return (ReportStatus)super.getActualInstance();
    }

}

