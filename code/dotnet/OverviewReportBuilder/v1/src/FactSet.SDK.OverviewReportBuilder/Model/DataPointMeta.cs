/*
 * FactSet Overview Report Builder API
 *
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.2.0
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
using OpenAPIDateConverter = FactSet.SDK.OverviewReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OverviewReportBuilder.Model
{
    /// <summary>
    /// DataPointMeta
    /// </summary>
    [JsonConverter(typeof(DataPointMetaJsonConverter))]
    [DataContract(Name = "DataPointMeta")]
    public partial class DataPointMeta : AbstractOpenAPISchema, IEquatable<DataPointMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DataPointMeta" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of DataPointMetaAnyOf.</param>
        public DataPointMeta(DataPointMetaAnyOf actualInstance)
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
                if (value is DataPointMetaAnyOf)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: DataPointMetaAnyOf");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `DataPointMetaAnyOf`. If the actual instance is not `DataPointMetaAnyOf`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of DataPointMetaAnyOf</returns>
        public DataPointMetaAnyOf GetDataPointMetaAnyOf()
        {
            return (DataPointMetaAnyOf)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DataPointMeta {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, DataPointMeta.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of DataPointMeta
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of DataPointMeta</returns>
        public static DataPointMeta FromJson(string jsonString)
        {
            DataPointMeta newDataPointMeta = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newDataPointMeta;
            }

            try
            {
                var hasAdditionalProperties = !(typeof(DataPointMetaAnyOf).GetProperty("AdditionalProperties") is null);
                newDataPointMeta = new DataPointMeta(JsonConvert.DeserializeObject<DataPointMetaAnyOf>(
                    jsonString,
                    hasAdditionalProperties ? DataPointMeta.AdditionalPropertiesSerializerSettings : DataPointMeta.SerializerSettings
                ));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newDataPointMeta;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into DataPointMetaAnyOf: {1}", jsonString, exception.ToString()));
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
            return this.Equals(input as DataPointMeta);
        }

        /// <summary>
        /// Returns true if DataPointMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of DataPointMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DataPointMeta input)
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
    /// Custom JSON converter for DataPointMeta
    /// </summary>
    public class DataPointMetaJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(DataPointMeta).GetMethod("ToJson").Invoke(value, null)));
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
                return DataPointMeta.FromJson(JToken.Load(reader).ToString(Formatting.None));
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
