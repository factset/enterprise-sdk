/*
 * FactSet Global Prices API
 *
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
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
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.FactSetGlobalPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetGlobalPrices.Model
{
    /// <summary>
    /// BatchResult
    /// </summary>
    [JsonConverter(typeof(BatchResultJsonConverter))]
    [DataContract(Name = "batchResult")]
    public partial class BatchResult : AbstractOpenAPISchema, IEquatable<BatchResult>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BatchResult" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Price.</param>
        public BatchResult(Price actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BatchResult" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Returns.</param>
        public BatchResult(Returns actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BatchResult" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of CorporateAction.</param>
        public BatchResult(CorporateAction actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BatchResult" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of AnnualizedDividendsObject.</param>
        public BatchResult(AnnualizedDividendsObject actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BatchResult" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of SharesOutstandingResponseObject.</param>
        public BatchResult(SharesOutstandingResponseObject actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
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
                if (value is Price)
                {
                    this._actualInstance = value;
                }
                else if (value is Returns)
                {
                    this._actualInstance = value;
                }
                else if (value is CorporateAction)
                {
                    this._actualInstance = value;
                }
                else if (value is AnnualizedDividendsObject)
                {
                    this._actualInstance = value;
                }
                else if (value is SharesOutstandingResponseObject)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: Price, Returns, CorporateAction, AnnualizedDividendsObject, SharesOutstandingResponseObject");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `Price`. If the actual instance is not `Price`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Price</returns>
        public Price GetPrice()
        {
            return (Price)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `Returns`. If the actual instance is not `Returns`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Returns</returns>
        public Returns GetReturns()
        {
            return (Returns)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `CorporateAction`. If the actual instance is not `CorporateAction`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of CorporateAction</returns>
        public CorporateAction GetCorporateAction()
        {
            return (CorporateAction)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `AnnualizedDividendsObject`. If the actual instance is not `AnnualizedDividendsObject`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of AnnualizedDividendsObject</returns>
        public AnnualizedDividendsObject GetAnnualizedDividendsObject()
        {
            return (AnnualizedDividendsObject)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `SharesOutstandingResponseObject`. If the actual instance is not `SharesOutstandingResponseObject`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of SharesOutstandingResponseObject</returns>
        public SharesOutstandingResponseObject GetSharesOutstandingResponseObject()
        {
            return (SharesOutstandingResponseObject)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BatchResult {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, BatchResult.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of BatchResult
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of BatchResult</returns>
        public static BatchResult FromJson(string jsonString)
        {
            BatchResult newBatchResult = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newBatchResult;
            }

            try
            {
                var hasAdditionalProperties = !(typeof(Price).GetProperty("AdditionalProperties") is null);
                newBatchResult = new BatchResult(JsonConvert.DeserializeObject<Price>(
                    jsonString,
                    hasAdditionalProperties ? BatchResult.AdditionalPropertiesSerializerSettings : BatchResult.SerializerSettings
                ));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newBatchResult;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Price: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(Returns).GetProperty("AdditionalProperties") is null);
                newBatchResult = new BatchResult(JsonConvert.DeserializeObject<Returns>(
                    jsonString,
                    hasAdditionalProperties ? BatchResult.AdditionalPropertiesSerializerSettings : BatchResult.SerializerSettings
                ));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newBatchResult;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Returns: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(CorporateAction).GetProperty("AdditionalProperties") is null);
                newBatchResult = new BatchResult(JsonConvert.DeserializeObject<CorporateAction>(
                    jsonString,
                    hasAdditionalProperties ? BatchResult.AdditionalPropertiesSerializerSettings : BatchResult.SerializerSettings
                ));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newBatchResult;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into CorporateAction: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(AnnualizedDividendsObject).GetProperty("AdditionalProperties") is null);
                newBatchResult = new BatchResult(JsonConvert.DeserializeObject<AnnualizedDividendsObject>(
                    jsonString,
                    hasAdditionalProperties ? BatchResult.AdditionalPropertiesSerializerSettings : BatchResult.SerializerSettings
                ));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newBatchResult;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into AnnualizedDividendsObject: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(SharesOutstandingResponseObject).GetProperty("AdditionalProperties") is null);
                newBatchResult = new BatchResult(JsonConvert.DeserializeObject<SharesOutstandingResponseObject>(
                    jsonString,
                    hasAdditionalProperties ? BatchResult.AdditionalPropertiesSerializerSettings : BatchResult.SerializerSettings
                ));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newBatchResult;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into SharesOutstandingResponseObject: {1}", jsonString, exception.ToString()));
            }

            // no match found, throw an exception
            throw new InvalidDataException("The JSON string `" + jsonString + "` cannot be deserialized into any schema defined.");
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as BatchResult);
        }

        /// <summary>
        /// Returns true if BatchResult instances are equal
        /// </summary>
        /// <param name="input">Instance of BatchResult to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BatchResult input)
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
    /// Custom JSON converter for BatchResult
    /// </summary>
    public class BatchResultJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(BatchResult).GetMethod("ToJson").Invoke(value, null)));
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
                return BatchResult.FromJson(JToken.Load(reader).ToString(Formatting.None));
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
