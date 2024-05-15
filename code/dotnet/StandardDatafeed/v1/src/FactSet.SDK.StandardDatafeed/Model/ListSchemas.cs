/*
 * SDF Download API
 *
 * The Standard DataFeed (SDF) Download API provides an alternative method for users to request and retrieve SDF packages (schemas & bundles). This service is not a direct replacement and does not have 100% feature parity with the Loader Application. This API provides an alternative for users who are unable to utilize the Loader application due to following reasons:   - Inability to install 3rd party executables due to Corporate Security policies     - Inability to utilize the Loader application due to limitations or restrictions with the environment used to consume Standard Datafeed   - Clients who are utilizing existing delivery method like FTP, who may want to use a more secured & modern solution     This API allows users to retrieve maximum of latest 30 days of data     Additional parameters are available to filter requests to get the exact files users are looking for.    QFL data is delivered through Content API & Bulk Data API (SDF API)  - Content API : Provides direct access to FactSet-hosted QFL data.  Suitable for interactive, ad hoc QFL requests.  Constraints on large extracts.  Costs are based on consumption, i.e. more calls can result in more costs.  - Bulk Data API : Provides access to download locations of zip files for client download. Suitable for production processes within a client environment. Cost is based on the use case and fixed unless scope changes (same as other SDFs).
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: teammustang@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.StandardDatafeed.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StandardDatafeed.Model
{
    /// <summary>
    /// List Of Schemas
    /// </summary>
    [JsonConverter(typeof(ListSchemasJsonConverter))]
    [DataContract(Name = "ListSchemas")]
    public partial class ListSchemas : AbstractOpenAPISchema, IEquatable<ListSchemas>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ListSchemas" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of Dictionary&lt;string, List&lt;string&gt;&gt;.</param>
        public ListSchemas(Dictionary<string, List<string>> actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "anyOf";
            this.ActualInstance = actualInstance;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="ListSchemas" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of SchemaDetails.</param>
        public ListSchemas(SchemaDetails actualInstance)
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
                if (value is Dictionary<string, List<string>>)
                {
                    this._actualInstance = value;
                }
                else if (value is SchemaDetails)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: Dictionary<string, List<string>>, SchemaDetails");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `Dictionary&lt;string, List&lt;string&gt;&gt;`. If the actual instance is not `Dictionary&lt;string, List&lt;string&gt;&gt;`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of Dictionary&lt;string, List&lt;string&gt;&gt;</returns>
        public Dictionary<string, List<string>> GetDictionaryListString()
        {
            return (Dictionary<string, List<string>>)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `SchemaDetails`. If the actual instance is not `SchemaDetails`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of SchemaDetails</returns>
        public SchemaDetails GetSchemaDetails()
        {
            return (SchemaDetails)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ListSchemas {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, ListSchemas.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of ListSchemas
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of ListSchemas</returns>
        public static ListSchemas FromJson(string jsonString)
        {
            ListSchemas newListSchemas = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newListSchemas;
            }

            try
            {
                var hasAdditionalProperties = !(typeof(Dictionary<string, List<string>>).GetProperty("AdditionalProperties") is null);
                newListSchemas = new ListSchemas(JsonConvert.DeserializeObject<Dictionary<string, List<string>>>(
                    jsonString,
                    hasAdditionalProperties ? ListSchemas.AdditionalPropertiesSerializerSettings : ListSchemas.SerializerSettings
                ));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newListSchemas;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into Dictionary<string, List<string>>: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(SchemaDetails).GetProperty("AdditionalProperties") is null);
                newListSchemas = new ListSchemas(JsonConvert.DeserializeObject<SchemaDetails>(
                    jsonString,
                    hasAdditionalProperties ? ListSchemas.AdditionalPropertiesSerializerSettings : ListSchemas.SerializerSettings
                ));
                // deserialization is considered successful at this point if no exception has been thrown.
                return newListSchemas;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into SchemaDetails: {1}", jsonString, exception.ToString()));
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
            return this.Equals(input as ListSchemas);
        }

        /// <summary>
        /// Returns true if ListSchemas instances are equal
        /// </summary>
        /// <param name="input">Instance of ListSchemas to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ListSchemas input)
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
    /// Custom JSON converter for ListSchemas
    /// </summary>
    public class ListSchemasJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(ListSchemas).GetMethod("ToJson").Invoke(value, null)));
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
                return ListSchemas.FromJson(JToken.Load(reader).ToString(Formatting.None));
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
