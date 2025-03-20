/*
 * FactSet Search Answers API
 *
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.1.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetSearchAnswers.Client.OpenAPIDateConverter;
using System.Reflection;

namespace FactSet.SDK.FactSetSearchAnswers.Model
{
    /// <summary>
    /// AdaptiveCardDataItem
    /// </summary>
    [JsonConverter(typeof(AdaptiveCardDataItemJsonConverter))]
    [DataContract(Name = "AdaptiveCardDataItem")]
    public partial class AdaptiveCardDataItem : AbstractOpenAPISchema, IEquatable<AdaptiveCardDataItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="AdaptiveCardDataItem" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Object.</param>
        public AdaptiveCardDataItem(Object actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="AdaptiveCardDataItem" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of AdaptiveCardWithThumbnail.</param>
        public AdaptiveCardDataItem(AdaptiveCardWithThumbnail actualInstance)
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
                if (value is Object)
                {
                    this._actualInstance = value;
                }
                else if (value is AdaptiveCardWithThumbnail)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: Object, AdaptiveCardWithThumbnail");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `Object`. If the actual instance is not `Object`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Object</returns>
        public Object GetObject()
        {
            return (Object)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `AdaptiveCardWithThumbnail`. If the actual instance is not `AdaptiveCardWithThumbnail`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of AdaptiveCardWithThumbnail</returns>
        public AdaptiveCardWithThumbnail GetAdaptiveCardWithThumbnail()
        {
            return (AdaptiveCardWithThumbnail)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AdaptiveCardDataItem {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, AdaptiveCardDataItem.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of AdaptiveCardDataItem
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of AdaptiveCardDataItem</returns>
        public static AdaptiveCardDataItem FromJson(string jsonString)
        {
            AdaptiveCardDataItem newAdaptiveCardDataItem = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newAdaptiveCardDataItem;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                var parsedValue = JsonConvert.DeserializeObject(jsonString);
                if (parsedValue is Object)
                {
                    newAdaptiveCardDataItem = new AdaptiveCardDataItem((Object)parsedValue);
                    matchedTypes.Add("Object");
                    match++;
                }
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Object: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(AdaptiveCardWithThumbnail).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<AdaptiveCardWithThumbnail>(
                    jsonString,
                    hasAdditionalProperties ? AdaptiveCardDataItem.AdditionalPropertiesSerializerSettings : AdaptiveCardDataItem.SerializerSettings
                );
                newAdaptiveCardDataItem = new AdaptiveCardDataItem(parsedValue);
                matchedTypes.Add("AdaptiveCardWithThumbnail");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into AdaptiveCardWithThumbnail: {1}", jsonString, exception.ToString()));
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
            return newAdaptiveCardDataItem;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as AdaptiveCardDataItem);
        }

        /// <summary>
        /// Returns true if AdaptiveCardDataItem instances are equal
        /// </summary>
        /// <param name="input">Instance of AdaptiveCardDataItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AdaptiveCardDataItem input)
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
    /// Custom JSON converter for AdaptiveCardDataItem
    /// </summary>
    public class AdaptiveCardDataItemJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(AdaptiveCardDataItem).GetMethod("ToJson").Invoke(value, null)));
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
                return AdaptiveCardDataItem.FromJson(JToken.Load(reader).ToString(Formatting.None));
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
