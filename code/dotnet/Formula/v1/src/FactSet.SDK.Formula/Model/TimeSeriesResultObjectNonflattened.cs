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
using JsonSubTypes;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.Formula.Client.OpenAPIDateConverter;
using System.Reflection;

namespace FactSet.SDK.Formula.Model
{
    /// <summary>
    /// TimeSeriesResultObjectNonflattened
    /// </summary>
    [JsonConverter(typeof(TimeSeriesResultObjectNonflattenedJsonConverter))]
    [DataContract(Name = "time_series_result_object_nonflattened")]
    public partial class TimeSeriesResultObjectNonflattened : AbstractOpenAPISchema, IEquatable<TimeSeriesResultObjectNonflattened>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TimeSeriesResultObjectNonflattened" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of TimeSeriesResultObjectNonflattenedScalar.</param>
        public TimeSeriesResultObjectNonflattened(TimeSeriesResultObjectNonflattenedScalar actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TimeSeriesResultObjectNonflattened" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of TimeSeriesResultObjectNonflattenedArray.</param>
        public TimeSeriesResultObjectNonflattened(TimeSeriesResultObjectNonflattenedArray actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TimeSeriesResultObjectNonflattened" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of TimeSeriesResultObjectNonflattenedMatrix.</param>
        public TimeSeriesResultObjectNonflattened(TimeSeriesResultObjectNonflattenedMatrix actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TimeSeriesResultObjectNonflattened" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of TimeSeriesResultObjectNonflattenedTimeseriesObject.</param>
        public TimeSeriesResultObjectNonflattened(TimeSeriesResultObjectNonflattenedTimeseriesObject actualInstance)
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
                if (value is TimeSeriesResultObjectNonflattenedScalar)
                {
                    this._actualInstance = value;
                }
                else if (value is TimeSeriesResultObjectNonflattenedArray)
                {
                    this._actualInstance = value;
                }
                else if (value is TimeSeriesResultObjectNonflattenedMatrix)
                {
                    this._actualInstance = value;
                }
                else if (value is TimeSeriesResultObjectNonflattenedTimeseriesObject)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: TimeSeriesResultObjectNonflattenedScalar, TimeSeriesResultObjectNonflattenedArray, TimeSeriesResultObjectNonflattenedMatrix, TimeSeriesResultObjectNonflattenedTimeseriesObject");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `TimeSeriesResultObjectNonflattenedScalar`. If the actual instance is not `TimeSeriesResultObjectNonflattenedScalar`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of TimeSeriesResultObjectNonflattenedScalar</returns>
        public TimeSeriesResultObjectNonflattenedScalar GetTimeSeriesResultObjectNonflattenedScalar()
        {
            return (TimeSeriesResultObjectNonflattenedScalar)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `TimeSeriesResultObjectNonflattenedArray`. If the actual instance is not `TimeSeriesResultObjectNonflattenedArray`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of TimeSeriesResultObjectNonflattenedArray</returns>
        public TimeSeriesResultObjectNonflattenedArray GetTimeSeriesResultObjectNonflattenedArray()
        {
            return (TimeSeriesResultObjectNonflattenedArray)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `TimeSeriesResultObjectNonflattenedMatrix`. If the actual instance is not `TimeSeriesResultObjectNonflattenedMatrix`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of TimeSeriesResultObjectNonflattenedMatrix</returns>
        public TimeSeriesResultObjectNonflattenedMatrix GetTimeSeriesResultObjectNonflattenedMatrix()
        {
            return (TimeSeriesResultObjectNonflattenedMatrix)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `TimeSeriesResultObjectNonflattenedTimeseriesObject`. If the actual instance is not `TimeSeriesResultObjectNonflattenedTimeseriesObject`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of TimeSeriesResultObjectNonflattenedTimeseriesObject</returns>
        public TimeSeriesResultObjectNonflattenedTimeseriesObject GetTimeSeriesResultObjectNonflattenedTimeseriesObject()
        {
            return (TimeSeriesResultObjectNonflattenedTimeseriesObject)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TimeSeriesResultObjectNonflattened {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, TimeSeriesResultObjectNonflattened.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of TimeSeriesResultObjectNonflattened
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of TimeSeriesResultObjectNonflattened</returns>
        public static TimeSeriesResultObjectNonflattened FromJson(string jsonString)
        {
            TimeSeriesResultObjectNonflattened newTimeSeriesResultObjectNonflattened = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newTimeSeriesResultObjectNonflattened;
            }

            try
            {
                var discriminatorObj = JObject.Parse(jsonString)["objectType"];
                string discriminatorValue =  discriminatorObj == null ?string.Empty :discriminatorObj.ToString();
                switch (discriminatorValue)
                {
                    case "ARRAY":
                        newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedArray>(jsonString, TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings));
                        return newTimeSeriesResultObjectNonflattened;
                    case "MATRIX":
                        newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedMatrix>(jsonString, TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings));
                        return newTimeSeriesResultObjectNonflattened;
                    case "SCALAR":
                        newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedScalar>(jsonString, TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings));
                        return newTimeSeriesResultObjectNonflattened;
                    case "TIMESERIES":
                        newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedTimeseriesObject>(jsonString, TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings));
                        return newTimeSeriesResultObjectNonflattened;
                    case "time_series_result_object_nonflattened_array":
                        newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedArray>(jsonString, TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings));
                        return newTimeSeriesResultObjectNonflattened;
                    case "time_series_result_object_nonflattened_matrix":
                        newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedMatrix>(jsonString, TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings));
                        return newTimeSeriesResultObjectNonflattened;
                    case "time_series_result_object_nonflattened_scalar":
                        newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedScalar>(jsonString, TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings));
                        return newTimeSeriesResultObjectNonflattened;
                    case "time_series_result_object_nonflattened_timeseries_object":
                        newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedTimeseriesObject>(jsonString, TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings));
                        return newTimeSeriesResultObjectNonflattened;
                    default:
                        System.Diagnostics.Debug.WriteLine(string.Format("Failed to lookup discriminator value `{0}` for TimeSeriesResultObjectNonflattened. Possible values: ARRAY MATRIX SCALAR TIMESERIES time_series_result_object_nonflattened_array time_series_result_object_nonflattened_matrix time_series_result_object_nonflattened_scalar time_series_result_object_nonflattened_timeseries_object", discriminatorValue));
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
                var hasAdditionalProperties = !(typeof(TimeSeriesResultObjectNonflattenedScalar).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedScalar>(
                    jsonString,
                    hasAdditionalProperties ? TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings : TimeSeriesResultObjectNonflattened.SerializerSettings
                );
                newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(parsedValue);
                matchedTypes.Add("TimeSeriesResultObjectNonflattenedScalar");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into TimeSeriesResultObjectNonflattenedScalar: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(TimeSeriesResultObjectNonflattenedArray).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedArray>(
                    jsonString,
                    hasAdditionalProperties ? TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings : TimeSeriesResultObjectNonflattened.SerializerSettings
                );
                newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(parsedValue);
                matchedTypes.Add("TimeSeriesResultObjectNonflattenedArray");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into TimeSeriesResultObjectNonflattenedArray: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(TimeSeriesResultObjectNonflattenedMatrix).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedMatrix>(
                    jsonString,
                    hasAdditionalProperties ? TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings : TimeSeriesResultObjectNonflattened.SerializerSettings
                );
                newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(parsedValue);
                matchedTypes.Add("TimeSeriesResultObjectNonflattenedMatrix");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into TimeSeriesResultObjectNonflattenedMatrix: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(TimeSeriesResultObjectNonflattenedTimeseriesObject).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<TimeSeriesResultObjectNonflattenedTimeseriesObject>(
                    jsonString,
                    hasAdditionalProperties ? TimeSeriesResultObjectNonflattened.AdditionalPropertiesSerializerSettings : TimeSeriesResultObjectNonflattened.SerializerSettings
                );
                newTimeSeriesResultObjectNonflattened = new TimeSeriesResultObjectNonflattened(parsedValue);
                matchedTypes.Add("TimeSeriesResultObjectNonflattenedTimeseriesObject");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into TimeSeriesResultObjectNonflattenedTimeseriesObject: {1}", jsonString, exception.ToString()));
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
            return newTimeSeriesResultObjectNonflattened;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as TimeSeriesResultObjectNonflattened);
        }

        /// <summary>
        /// Returns true if TimeSeriesResultObjectNonflattened instances are equal
        /// </summary>
        /// <param name="input">Instance of TimeSeriesResultObjectNonflattened to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TimeSeriesResultObjectNonflattened input)
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
    /// Custom JSON converter for TimeSeriesResultObjectNonflattened
    /// </summary>
    public class TimeSeriesResultObjectNonflattenedJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(TimeSeriesResultObjectNonflattened).GetMethod("ToJson").Invoke(value, null)));
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
                return TimeSeriesResultObjectNonflattened.FromJson(JToken.Load(reader).ToString(Formatting.None));
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
