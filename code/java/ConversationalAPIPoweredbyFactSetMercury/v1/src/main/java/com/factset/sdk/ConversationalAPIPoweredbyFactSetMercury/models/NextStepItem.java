/*
 * Conversational API Powered by FactSet Mercury
 * ### OVERVIEW  The FactSet Conversational API allows clients to integrate core FactSet Mercury capabilities in chatbot experiences.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  #### Conversational API Consumer Workflow  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   ##### Current Limitations  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FactSet Support.  #### FAQ   **How can I receive updates on changes to the Conversational API?** - Please subscribe to our FactSet Notify by clicking \"Subscribe to notifications\" in the upper right above the API overview. You will receive email updates when any updates occur to the API. **Why am I receiving a 403 error with a valid API key?** - Please ensure that your current public IP is within the IP range allocated to the API key you are using to authenticate API requests. You can update your API key's allowable IP range via the [FactSet Developer Portal API Authentication page](https://developer.factset.com/api-authentication). If this does not resolve the issue, please reach out to FactSet Support to ensure you are appropriately authorized to access the Conversational API. 
 *
 * The version of the OpenAPI document: 1.0.5
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
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.Download;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.FileGenerationErrorObject;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.OpenUrl;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.OpenUrlUrl;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.JSON;


import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

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
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.JSON;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

@JsonDeserialize(using=NextStepItem.NextStepItemDeserializer.class)
@JsonSerialize(using = NextStepItem.NextStepItemSerializer.class)
public class NextStepItem extends AbstractOpenApiSchema implements Serializable {
    private static final Logger log = Logger.getLogger(NextStepItem.class.getName());

    public static class NextStepItemSerializer extends StdSerializer<NextStepItem> {
        public NextStepItemSerializer(Class<NextStepItem> t) {
            super(t);
        }

        public NextStepItemSerializer() {
            this(null);
        }

        @Override
        public void serialize(NextStepItem value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class NextStepItemDeserializer extends StdDeserializer<NextStepItem> {
        public NextStepItemDeserializer() {
            this(NextStepItem.class);
        }

        public NextStepItemDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public NextStepItem deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();

            Object deserialized = null;
            Class<?> cls = JSON.getClassForElement(tree, NextStepItem.class);
            if (cls != null) {
                // When the OAS schema includes a discriminator, use the discriminator value to
                // discriminate the anyOf schemas.
                // Get the discriminator mapping value to get the class.
                deserialized = tree.traverse(jp.getCodec()).readValueAs(cls);
                NextStepItem ret = new NextStepItem();
                ret.setActualInstance(deserialized);
                return ret;
            }
            // deserialize OpenUrl
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<OpenUrl>(){});
                NextStepItem ret = new NextStepItem();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'NextStepItem'", e);
            }

            // deserialize Download
            try {
                deserialized = tree.traverse(jp.getCodec()).readValueAs(new TypeReference<Download>(){});
                NextStepItem ret = new NextStepItem();
                ret.setActualInstance(deserialized);
                return ret;
            } catch (Exception e) {
                // deserialization failed, continue, log to help debugging
                log.log(Level.FINER, "Input data does not match 'NextStepItem'", e);
            }

            throw new IOException(String.format("Failed deserialization for NextStepItem: no match found"));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public NextStepItem getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "NextStepItem cannot be null");
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public NextStepItem() {
        super("anyOf", Boolean.FALSE);
    }

    public NextStepItem(Download o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public NextStepItem(OpenUrl o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("Download", new GenericType<Download>() {
        });
        schemas.put("OpenUrl", new GenericType<OpenUrl>() {
        });
        JSON.registerDescendants(NextStepItem.class, Collections.unmodifiableMap(schemas));
        // Initialize and register the discriminator mappings.
        Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
        mappings.put("Download", Download.class);
        mappings.put("OpenUrl", OpenUrl.class);
        mappings.put("NextStepItem", NextStepItem.class);
        JSON.registerDiscriminator(NextStepItem.class, "action", mappings);
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return NextStepItem.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * Download, OpenUrl
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(OpenUrl.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        if (JSON.isInstanceOf(Download.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be Download, OpenUrl");
    }

    /**
     * Get the actual instance, which can be the following:
     * Download, OpenUrl
     *
     * @return The actual instance (Download, OpenUrl)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `OpenUrl`.
     * If the actual instance is not `OpenUrl`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `OpenUrl`
     * @throws ClassCastException if the instance is not `OpenUrl`
     */
    public OpenUrl getOpenUrl() throws ClassCastException {
        return (OpenUrl)super.getActualInstance();
    }

    /**
     * Get the actual instance of `Download`.
     * If the actual instance is not `Download`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `Download`
     * @throws ClassCastException if the instance is not `Download`
     */
    public Download getDownload() throws ClassCastException {
        return (Download)super.getActualInstance();
    }

}

