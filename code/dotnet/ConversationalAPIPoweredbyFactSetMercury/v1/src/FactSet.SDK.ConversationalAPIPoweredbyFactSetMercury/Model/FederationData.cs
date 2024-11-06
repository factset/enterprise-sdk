/*
 * Conversational API Powered by FactSet Mercury
 *
 * ### OVERVIEW  The FactSet Conversational API allows clients to white-label core FactSet Mercury capabilities in a client's chatbot experience.  The Conversational API is powered by FactSet Mercury, FactSet's Generative Artificial Intelligence (GenAI) large language model. The Conversational API provides a variety of content and capabilities, including FactSet’s Federation layer (FactSet’s core GenAI-based technology), as well as more specific content and functionality tailored for financial services workflows.  The Conversational API provides answers to hundreds of natural language search queries and allows you to easily ask questions related to companies and markets research.  Some example supported prompts:  - Nintendo's highest closing stock price over the last 3 months - Has Yelp issued any guidance? - What are the key trends impacting costs for DaVita?  **For Information on Access to and Content Available via the Conversational API**  Please see the [Conversational API Online Assistant Page](https://my.apps.factset.com/oa/pages/23209). Here you can find instructions on how to set up access to the Conversational API, and the full list of content available.  **Conversational API Consumer Workflow**  The Conversational API is an asynchronous API that utilizes status polling to inform the consumer when a query response is complete. Please see the technical OpenAPI documentation below for specific information regarding consuming the API programmatically.  At a high level, the API consumer workflow is as follows:  1) Send a natural language query to the `/query` endpoint and start the response generation process. 2) Poll the status of the response generation process using the `/status` endpoint. 3) Once the status indicates a ready response, retrieve it using the `/result` endpoint.  - If your response contains a file ID, such as for an Excel chart or a [FactSet ActiveGraph](https://my.apps.factset.com/oa/pages/20355), retrieve it using the file ID at the `/download/file` endpoint. - To provide feedback on your response and help the Conversational API better serve you content, we encourage you to use the `/feedback` endpoint.   **FAQ and Limitations**  - \"Natural language\" in this documentation refers to modern conversational English. Support for other languages is currently unavailable. - The Conversational API is currently limited to accept 10 natural language queries per minute and 200 per hour for an individual consumer. If you anticipate your needs to be greater than these limits, please reach out to FatSet Support. 
 *
 * The version of the OpenAPI document: 1.0.2
 * Contact: api@factset.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.OpenAPIDateConverter;
using System.Reflection;

namespace FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model
{
    /// <summary>
    /// Data surfaced by processing the query through FactSet Mercury. Contains financial data, if accessible and available, as well as natural language answer to the query
    /// </summary>
    [JsonConverter(typeof(FederationDataJsonConverter))]
    [DataContract(Name = "FederationData")]
    public partial class FederationData : AbstractOpenAPISchema, IEquatable<FederationData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FederationData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ResponseText.</param>
        public FederationData(ResponseText actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FederationData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of AdaptiveCard.</param>
        public FederationData(AdaptiveCard actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FederationData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Table.</param>
        public FederationData(Table actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FederationData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of NextStep.</param>
        public FederationData(NextStep actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="FederationData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of SuggestedPrompts.</param>
        public FederationData(SuggestedPrompts actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }


        private Object _actualInstance;

        /// <summary>
        /// Gets or Sets ActualInstance
        /// </summary>
        public override Object ActualInstance
        {
            get
            {
                return _actualInstance;
            }
            set
            {
                if (value is ResponseText)
                {
                    this._actualInstance = value;
                }
                else if (value is AdaptiveCard)
                {
                    this._actualInstance = value;
                }
                else if (value is Table)
                {
                    this._actualInstance = value;
                }
                else if (value is NextStep)
                {
                    this._actualInstance = value;
                }
                else if (value is SuggestedPrompts)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: ResponseText, AdaptiveCard, Table, NextStep, SuggestedPrompts");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `ResponseText`. If the actual instance is not `ResponseText`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ResponseText</returns>
        public ResponseText GetResponseText()
        {
            return (ResponseText)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `AdaptiveCard`. If the actual instance is not `AdaptiveCard`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of AdaptiveCard</returns>
        public AdaptiveCard GetAdaptiveCard()
        {
            return (AdaptiveCard)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `Table`. If the actual instance is not `Table`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Table</returns>
        public Table GetTable()
        {
            return (Table)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `NextStep`. If the actual instance is not `NextStep`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of NextStep</returns>
        public NextStep GetNextStep()
        {
            return (NextStep)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `SuggestedPrompts`. If the actual instance is not `SuggestedPrompts`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of SuggestedPrompts</returns>
        public SuggestedPrompts GetSuggestedPrompts()
        {
            return (SuggestedPrompts)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FederationData {\n");
            sb.Append("  ActualInstance: ").Append(this.ActualInstance).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public override string ToJson()
        {
            return JsonConvert.SerializeObject(this.ActualInstance, FederationData.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of FederationData
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of FederationData</returns>
        public static FederationData FromJson(string jsonString)
        {
            FederationData newFederationData = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newFederationData;
            }

            try
            {
                var discriminatorObj = JObject.Parse(jsonString)["type"];
                string discriminatorValue =  discriminatorObj == null ?string.Empty :discriminatorObj.ToString();
                switch (discriminatorValue)
                {
                    case "AdaptiveCard":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<AdaptiveCard>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    case "NextStep":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<NextStep>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    case "ResponseText":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<ResponseText>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    case "SuggestedPrompts":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<SuggestedPrompts>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    case "Table":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<Table>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    case "string":
                        newFederationData = new FederationData(JsonConvert.DeserializeObject<ResponseText>(jsonString, FederationData.AdditionalPropertiesSerializerSettings));
                        return newFederationData;
                    default:
                        System.Diagnostics.Debug.WriteLine(string.Format("Failed to lookup discriminator value `{0}` for FederationData. Possible values: AdaptiveCard NextStep ResponseText SuggestedPrompts Table string", discriminatorValue));
                        break;
                }
            }
            catch (Exception ex)
            {
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to parse the json data : `{0}` {1}", jsonString, ex.ToString()));
            }

            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                var hasAdditionalProperties = !(typeof(ResponseText).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<ResponseText>(
                    jsonString,
                    hasAdditionalProperties ? FederationData.AdditionalPropertiesSerializerSettings : FederationData.SerializerSettings
                );
                newFederationData = new FederationData(parsedValue);
                matchedTypes.Add("ResponseText");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ResponseText: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(AdaptiveCard).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<AdaptiveCard>(
                    jsonString,
                    hasAdditionalProperties ? FederationData.AdditionalPropertiesSerializerSettings : FederationData.SerializerSettings
                );
                newFederationData = new FederationData(parsedValue);
                matchedTypes.Add("AdaptiveCard");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into AdaptiveCard: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(Table).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<Table>(
                    jsonString,
                    hasAdditionalProperties ? FederationData.AdditionalPropertiesSerializerSettings : FederationData.SerializerSettings
                );
                newFederationData = new FederationData(parsedValue);
                matchedTypes.Add("Table");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Table: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(NextStep).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<NextStep>(
                    jsonString,
                    hasAdditionalProperties ? FederationData.AdditionalPropertiesSerializerSettings : FederationData.SerializerSettings
                );
                newFederationData = new FederationData(parsedValue);
                matchedTypes.Add("NextStep");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into NextStep: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(SuggestedPrompts).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<SuggestedPrompts>(
                    jsonString,
                    hasAdditionalProperties ? FederationData.AdditionalPropertiesSerializerSettings : FederationData.SerializerSettings
                );
                newFederationData = new FederationData(parsedValue);
                matchedTypes.Add("SuggestedPrompts");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into SuggestedPrompts: {1}", jsonString, exception.ToString()));
            }

            if (match == 0)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
            }
            else if (match > 1)
            {
                throw new InvalidDataException("The JSON string `" + jsonString + "` incorrectly matches more than one schema (should be exactly one match): " + matchedTypes);
            }

            // deserialization is considered successful at this point if no exception has been thrown.
            return newFederationData;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as FederationData);
        }

        /// <summary>
        /// Returns true if FederationData instances are equal
        /// </summary>
        /// <param name="input">Instance of FederationData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FederationData input)
        {
            if (input == null)
                return false;

            return this.ActualInstance.Equals(input.ActualInstance);
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ActualInstance != null)
                    hashCode = hashCode * 59 + this.ActualInstance.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// Custom JSON converter for FederationData
    /// </summary>
    public class FederationDataJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(FederationData).GetMethod("ToJson").Invoke(value, null)));
        }

        /// <summary>
        /// To convert a JSON string into an object
        /// </summary>
        /// <param name="reader">JSON reader</param>
        /// <param name="objectType">Object type</param>
        /// <param name="existingValue">Existing value</param>
        /// <param name="serializer">JSON Serializer</param>
        /// <returns>The object converted from the JSON string</returns>
        public override object ReadJson(JsonReader reader, Type objectType, object existingValue, JsonSerializer serializer)
        {
            if(reader.TokenType != JsonToken.Null)
            {
                return FederationData.FromJson(JToken.Load(reader).ToString(Formatting.None));
            }
            return null;
        }

        /// <summary>
        /// Check if the object can be converted
        /// </summary>
        /// <param name="objectType">Object type</param>
        /// <returns>True if the object can be converted</returns>
        public override bool CanConvert(Type objectType)
        {
            return false;
        }
    }

}
