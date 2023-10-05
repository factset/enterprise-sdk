/*
 * OFDB API
 *
 * OFDB API
 *
 * The version of the OpenAPI document: 2.1.0
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
using OpenAPIDateConverter = FactSet.SDK.OFDB.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OFDB.Model
{
    /// <summary>
    /// BulkDeleteArrayItem
    /// </summary>
    [JsonConverter(typeof(BulkDeleteArrayItemJsonConverter))]
    [DataContract(Name = "BulkDeleteArrayItem")]
    public partial class BulkDeleteArrayItem : AbstractOpenAPISchema, IEquatable<BulkDeleteArrayItem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BulkDeleteArrayItem" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Dictionary&lt;string, BulkDeleteArrayItemNested&gt;.</param>
        public BulkDeleteArrayItem(Dictionary<string, BulkDeleteArrayItemNested> actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="BulkDeleteArrayItem" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of List&lt;string&gt;.</param>
        public BulkDeleteArrayItem(List<string> actualInstance)
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
                if (value is Dictionary<string, BulkDeleteArrayItemNested>)
                {
                    this._actualInstance = value;
                }
                else if (value is List<string>)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: Dictionary<string, BulkDeleteArrayItemNested>, List<string>");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `Dictionary&lt;string, BulkDeleteArrayItemNested&gt;`. If the actual instance is not `Dictionary&lt;string, BulkDeleteArrayItemNested&gt;`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Dictionary&lt;string, BulkDeleteArrayItemNested&gt;</returns>
        public Dictionary<string, BulkDeleteArrayItemNested> GetDictionaryBulkDeleteArrayItemNested()
        {
            return (Dictionary<string, BulkDeleteArrayItemNested>)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `List&lt;string&gt;`. If the actual instance is not `List&lt;string&gt;`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of List&lt;string&gt;</returns>
        public List<string> GetListString()
        {
            return (List<string>)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class BulkDeleteArrayItem {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, BulkDeleteArrayItem.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of BulkDeleteArrayItem
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of BulkDeleteArrayItem</returns>
        public static BulkDeleteArrayItem FromJson(string jsonString)
        {
            BulkDeleteArrayItem newBulkDeleteArrayItem = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newBulkDeleteArrayItem;
            }

            try
            {
                var hasAdditionalProperties = !(typeof(Dictionary<string, BulkDeleteArrayItemNested>).GetProperty("AdditionalProperties") is null);
                newBulkDeleteArrayItem = new BulkDeleteArrayItem(JsonConvert.DeserializeObject<Dictionary<string, BulkDeleteArrayItemNested>>(
                    jsonString, 
                    hasAdditionalProperties ? BulkDeleteArrayItem.AdditionalPropertiesSerializerSettings : BulkDeleteArrayItem.SerializerSettings
                )); 
                // deserialization is considered successful at this point if no exception has been thrown.
                return newBulkDeleteArrayItem;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Dictionary<string, BulkDeleteArrayItemNested>: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(List<string>).GetProperty("AdditionalProperties") is null);
                newBulkDeleteArrayItem = new BulkDeleteArrayItem(JsonConvert.DeserializeObject<List<string>>(
                    jsonString, 
                    hasAdditionalProperties ? BulkDeleteArrayItem.AdditionalPropertiesSerializerSettings : BulkDeleteArrayItem.SerializerSettings
                )); 
                // deserialization is considered successful at this point if no exception has been thrown.
                return newBulkDeleteArrayItem;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into List<string>: {1}", jsonString, exception.ToString()));
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
            return this.Equals(input as BulkDeleteArrayItem);
        }

        /// <summary>
        /// Returns true if BulkDeleteArrayItem instances are equal
        /// </summary>
        /// <param name="input">Instance of BulkDeleteArrayItem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BulkDeleteArrayItem input)
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
    /// Custom JSON converter for BulkDeleteArrayItem
    /// </summary>
    public class BulkDeleteArrayItemJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(BulkDeleteArrayItem).GetMethod("ToJson").Invoke(value, null)));
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
                return BulkDeleteArrayItem.FromJson(JObject.Load(reader).ToString(Formatting.None));
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