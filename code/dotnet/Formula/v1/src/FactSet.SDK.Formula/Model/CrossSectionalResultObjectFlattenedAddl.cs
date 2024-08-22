/*
 * FactSet Formula API
 *
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
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
using OpenAPIDateConverter = FactSet.SDK.Formula.Client.OpenAPIDateConverter;
using System.Reflection;

namespace FactSet.SDK.Formula.Model
{
    /// <summary>
    /// The Key in the Key-Value pair will be the formula. If the &#x60;displayName&#x60; parameter is used, then the Key will be displayName specified for that formula. The Value in the Key-Value pair will be the result of the formula for that \&quot;row\&quot;. 
    /// </summary>
    [JsonConverter(typeof(CrossSectionalResultObjectFlattenedAddlJsonConverter))]
    [DataContract(Name = "cross_sectional_result_object_flattened_addl")]
    public partial class CrossSectionalResultObjectFlattenedAddl : AbstractOpenAPISchema, IEquatable<CrossSectionalResultObjectFlattenedAddl>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CrossSectionalResultObjectFlattenedAddl" /> class.
        /// </summary>
        public CrossSectionalResultObjectFlattenedAddl()
        {
            this.IsNullable = true;
            this.SchemaType= "oneOf";
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CrossSectionalResultObjectFlattenedAddl" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of string.</param>
        public CrossSectionalResultObjectFlattenedAddl(string actualInstance)
        {
            this.IsNullable = true;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CrossSectionalResultObjectFlattenedAddl" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of double?.</param>
        public CrossSectionalResultObjectFlattenedAddl(double? actualInstance)
        {
            this.IsNullable = true;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CrossSectionalResultObjectFlattenedAddl" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of int?.</param>
        public CrossSectionalResultObjectFlattenedAddl(int? actualInstance)
        {
            this.IsNullable = true;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance;
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
                if (value is string)
                {
                    this._actualInstance = value;
                }
                else if (value is double?)
                {
                    this._actualInstance = value;
                }
                else if (value is int?)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: string, double?, int?");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `string`. If the actual instance is not `string`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of string</returns>
        public string GetString()
        {
            return (string)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `double?`. If the actual instance is not `double?`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of double?</returns>
        public double? GetDouble()
        {
            return (double?)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `int?`. If the actual instance is not `int?`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of int?</returns>
        public int? GetInteger()
        {
            return (int?)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CrossSectionalResultObjectFlattenedAddl {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, CrossSectionalResultObjectFlattenedAddl.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of CrossSectionalResultObjectFlattenedAddl
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of CrossSectionalResultObjectFlattenedAddl</returns>
        public static CrossSectionalResultObjectFlattenedAddl FromJson(string jsonString)
        {
            CrossSectionalResultObjectFlattenedAddl newCrossSectionalResultObjectFlattenedAddl = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newCrossSectionalResultObjectFlattenedAddl;
            }
            int match = 0;
            List<string> matchedTypes = new List<string>();

            try
            {
                var parsedValue = JsonConvert.DeserializeObject(jsonString);
                if (parsedValue is string)
                {
                    newCrossSectionalResultObjectFlattenedAddl = new CrossSectionalResultObjectFlattenedAddl((string)parsedValue);
                    matchedTypes.Add("string");
                    match++;
                }
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into string: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var parsedValue = JsonConvert.DeserializeObject(jsonString);
                if (parsedValue is double?)
                {
                    newCrossSectionalResultObjectFlattenedAddl = new CrossSectionalResultObjectFlattenedAddl((double?)parsedValue);
                    matchedTypes.Add("double?");
                    match++;
                }
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into double?: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var parsedValue = JsonConvert.DeserializeObject(jsonString);
                if (parsedValue is int? || parsedValue is long)
                {
                    newCrossSectionalResultObjectFlattenedAddl = new CrossSectionalResultObjectFlattenedAddl((int?)(long)parsedValue);
                    matchedTypes.Add("int?");
                    match++;
                }
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into int?: {1}", jsonString, exception.ToString()));
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
            return newCrossSectionalResultObjectFlattenedAddl;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as CrossSectionalResultObjectFlattenedAddl);
        }

        /// <summary>
        /// Returns true if CrossSectionalResultObjectFlattenedAddl instances are equal
        /// </summary>
        /// <param name="input">Instance of CrossSectionalResultObjectFlattenedAddl to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CrossSectionalResultObjectFlattenedAddl input)
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
    /// Custom JSON converter for CrossSectionalResultObjectFlattenedAddl
    /// </summary>
    public class CrossSectionalResultObjectFlattenedAddlJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(CrossSectionalResultObjectFlattenedAddl).GetMethod("ToJson").Invoke(value, null)));
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
                return CrossSectionalResultObjectFlattenedAddl.FromJson(JToken.Load(reader).ToString(Formatting.None));
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
