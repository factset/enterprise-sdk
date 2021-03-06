/*
 * FactSet Search Answers API
 *
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: FactSearch.Team@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.FactSetSearchAnswers.Client.OpenAPIDateConverter;
using System.Reflection;

namespace FactSet.SDK.FactSetSearchAnswers.Model
{
    /// <summary>
    /// TemplateData
    /// </summary>
    [JsonConverter(typeof(TemplateDataJsonConverter))]
    [DataContract(Name = "TemplateData")]
    public partial class TemplateData : AbstractOpenAPISchema, IEquatable<TemplateData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of LinkTextBlockTemplate.</param>
        public TemplateData(LinkTextBlockTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of TextBlockFootingTemplate.</param>
        public TemplateData(TextBlockFootingTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of PercentChangeLabelTemplate.</param>
        public TemplateData(PercentChangeLabelTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ValueChangeDateLabelTemplate.</param>
        public TemplateData(ValueChangeDateLabelTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of RankedTableTemplate.</param>
        public TemplateData(RankedTableTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of TableTemplate.</param>
        public TemplateData(TableTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of TableTableTemplate.</param>
        public TemplateData(TableTableTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ValueLabelTemplate.</param>
        public TemplateData(ValueLabelTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ValueLabelDateTemplate.</param>
        public TemplateData(ValueLabelDateTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ColoredValueLabelDateTemplate.</param>
        public TemplateData(ColoredValueLabelDateTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ValueLabelDateTextBlockTemplate.</param>
        public TemplateData(ValueLabelDateTextBlockTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of ValueLabelDateDataPairListTemplate.</param>
        public TemplateData(ValueLabelDateDataPairListTemplate actualInstance)
        {
            this.IsNullable = false;
            this.SchemaType= "oneOf";
            this.ActualInstance = actualInstance ?? throw new ArgumentException("Invalid instance found. Must not be null.");
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TemplateData" /> class
        /// </summary>
        /// <param name="actualInstance">An instance of LabelValueChangeLabelValueChangeTemplate.</param>
        public TemplateData(LabelValueChangeLabelValueChangeTemplate actualInstance)
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
                if (value is LinkTextBlockTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is TextBlockFootingTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is PercentChangeLabelTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is ValueChangeDateLabelTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is RankedTableTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is TableTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is TableTableTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is ValueLabelTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is ValueLabelDateTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is ColoredValueLabelDateTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is ValueLabelDateTextBlockTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is ValueLabelDateDataPairListTemplate)
                {
                    this._actualInstance = value;
                }
                else if (value is LabelValueChangeLabelValueChangeTemplate)
                {
                    this._actualInstance = value;
                }
                else
                {
                    throw new ArgumentException("Invalid instance found. Must be the following types: LinkTextBlockTemplate, TextBlockFootingTemplate, PercentChangeLabelTemplate, ValueChangeDateLabelTemplate, RankedTableTemplate, TableTemplate, TableTableTemplate, ValueLabelTemplate, ValueLabelDateTemplate, ColoredValueLabelDateTemplate, ValueLabelDateTextBlockTemplate, ValueLabelDateDataPairListTemplate, LabelValueChangeLabelValueChangeTemplate");
                }
            }
        }

        /// <summary>
        /// Get the actual instance of `LinkTextBlockTemplate`. If the actual instance is not `LinkTextBlockTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of LinkTextBlockTemplate</returns>
        public LinkTextBlockTemplate GetLinkTextBlockTemplate()
        {
            return (LinkTextBlockTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `TextBlockFootingTemplate`. If the actual instance is not `TextBlockFootingTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of TextBlockFootingTemplate</returns>
        public TextBlockFootingTemplate GetTextBlockFootingTemplate()
        {
            return (TextBlockFootingTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `PercentChangeLabelTemplate`. If the actual instance is not `PercentChangeLabelTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of PercentChangeLabelTemplate</returns>
        public PercentChangeLabelTemplate GetPercentChangeLabelTemplate()
        {
            return (PercentChangeLabelTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `ValueChangeDateLabelTemplate`. If the actual instance is not `ValueChangeDateLabelTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ValueChangeDateLabelTemplate</returns>
        public ValueChangeDateLabelTemplate GetValueChangeDateLabelTemplate()
        {
            return (ValueChangeDateLabelTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `RankedTableTemplate`. If the actual instance is not `RankedTableTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of RankedTableTemplate</returns>
        public RankedTableTemplate GetRankedTableTemplate()
        {
            return (RankedTableTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `TableTemplate`. If the actual instance is not `TableTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of TableTemplate</returns>
        public TableTemplate GetTableTemplate()
        {
            return (TableTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `TableTableTemplate`. If the actual instance is not `TableTableTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of TableTableTemplate</returns>
        public TableTableTemplate GetTableTableTemplate()
        {
            return (TableTableTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `ValueLabelTemplate`. If the actual instance is not `ValueLabelTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ValueLabelTemplate</returns>
        public ValueLabelTemplate GetValueLabelTemplate()
        {
            return (ValueLabelTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `ValueLabelDateTemplate`. If the actual instance is not `ValueLabelDateTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ValueLabelDateTemplate</returns>
        public ValueLabelDateTemplate GetValueLabelDateTemplate()
        {
            return (ValueLabelDateTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `ColoredValueLabelDateTemplate`. If the actual instance is not `ColoredValueLabelDateTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ColoredValueLabelDateTemplate</returns>
        public ColoredValueLabelDateTemplate GetColoredValueLabelDateTemplate()
        {
            return (ColoredValueLabelDateTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `ValueLabelDateTextBlockTemplate`. If the actual instance is not `ValueLabelDateTextBlockTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ValueLabelDateTextBlockTemplate</returns>
        public ValueLabelDateTextBlockTemplate GetValueLabelDateTextBlockTemplate()
        {
            return (ValueLabelDateTextBlockTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `ValueLabelDateDataPairListTemplate`. If the actual instance is not `ValueLabelDateDataPairListTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of ValueLabelDateDataPairListTemplate</returns>
        public ValueLabelDateDataPairListTemplate GetValueLabelDateDataPairListTemplate()
        {
            return (ValueLabelDateDataPairListTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Get the actual instance of `LabelValueChangeLabelValueChangeTemplate`. If the actual instance is not `LabelValueChangeLabelValueChangeTemplate`,
        /// the InvalidClassException will be thrown
        /// </summary>
        /// <returns>An instance of LabelValueChangeLabelValueChangeTemplate</returns>
        public LabelValueChangeLabelValueChangeTemplate GetLabelValueChangeLabelValueChangeTemplate()
        {
            return (LabelValueChangeLabelValueChangeTemplate)this.ActualInstance;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class TemplateData {\n");
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
            return JsonConvert.SerializeObject(this.ActualInstance, TemplateData.SerializerSettings);
        }

        /// <summary>
        /// Converts the JSON string into an instance of TemplateData
        /// </summary>
        /// <param name="jsonString">JSON string</param>
        /// <returns>An instance of TemplateData</returns>
        public static TemplateData FromJson(string jsonString)
        {
            TemplateData newTemplateData = null;

            if (string.IsNullOrEmpty(jsonString))
            {
                return newTemplateData;
            }

            try
            {
                var discriminatorObj = JObject.Parse(jsonString)["template"];
                string discriminatorValue =  discriminatorObj == null ?string.Empty :discriminatorObj.ToString();
                switch (discriminatorValue)
                {
                    case "ColoredValueLabelDateTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<ColoredValueLabelDateTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "LabelValueChangeLabelValueChangeTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<LabelValueChangeLabelValueChangeTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "LinkTextBlockTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<LinkTextBlockTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "PercentChangeLabelTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<PercentChangeLabelTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "RankedTableTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<RankedTableTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "TableTableTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<TableTableTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "TableTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<TableTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "TextBlockFootingTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<TextBlockFootingTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "ValueChangeDateLabelTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<ValueChangeDateLabelTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "ValueLabelDateDataPairListTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<ValueLabelDateDataPairListTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "ValueLabelDateTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<ValueLabelDateTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "ValueLabelDateTextBlockTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<ValueLabelDateTextBlockTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    case "ValueLabelTemplate":
                        newTemplateData = new TemplateData(JsonConvert.DeserializeObject<ValueLabelTemplate>(jsonString, TemplateData.AdditionalPropertiesSerializerSettings));
                        return newTemplateData;
                    default:
                        System.Diagnostics.Debug.WriteLine(string.Format("Failed to lookup discriminator value `{0}` for TemplateData. Possible values: ColoredValueLabelDateTemplate LabelValueChangeLabelValueChangeTemplate LinkTextBlockTemplate PercentChangeLabelTemplate RankedTableTemplate TableTableTemplate TableTemplate TextBlockFootingTemplate ValueChangeDateLabelTemplate ValueLabelDateDataPairListTemplate ValueLabelDateTemplate ValueLabelDateTextBlockTemplate ValueLabelTemplate", discriminatorValue));
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
                var hasAdditionalProperties = !(typeof(LinkTextBlockTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<LinkTextBlockTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("LinkTextBlockTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into LinkTextBlockTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(TextBlockFootingTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<TextBlockFootingTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("TextBlockFootingTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into TextBlockFootingTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(PercentChangeLabelTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<PercentChangeLabelTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("PercentChangeLabelTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into PercentChangeLabelTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(ValueChangeDateLabelTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<ValueChangeDateLabelTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("ValueChangeDateLabelTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ValueChangeDateLabelTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(RankedTableTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<RankedTableTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("RankedTableTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into RankedTableTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(TableTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<TableTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("TableTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into TableTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(TableTableTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<TableTableTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("TableTableTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into TableTableTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(ValueLabelTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<ValueLabelTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("ValueLabelTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ValueLabelTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(ValueLabelDateTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<ValueLabelDateTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("ValueLabelDateTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ValueLabelDateTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(ColoredValueLabelDateTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<ColoredValueLabelDateTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("ColoredValueLabelDateTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ColoredValueLabelDateTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(ValueLabelDateTextBlockTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<ValueLabelDateTextBlockTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("ValueLabelDateTextBlockTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ValueLabelDateTextBlockTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(ValueLabelDateDataPairListTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<ValueLabelDateDataPairListTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("ValueLabelDateDataPairListTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into ValueLabelDateDataPairListTemplate: {1}", jsonString, exception.ToString()));
            }

            try
            {
                var hasAdditionalProperties = !(typeof(LabelValueChangeLabelValueChangeTemplate).GetProperty("AdditionalProperties") is null);
                var parsedValue = JsonConvert.DeserializeObject<LabelValueChangeLabelValueChangeTemplate>(
                    jsonString,
                    hasAdditionalProperties ? TemplateData.AdditionalPropertiesSerializerSettings : TemplateData.SerializerSettings
                );
                newTemplateData = new TemplateData(parsedValue);
                matchedTypes.Add("LabelValueChangeLabelValueChangeTemplate");
                match++;
            }
            catch (Exception exception)
            {
                // deserialization failed, try the next one
                System.Diagnostics.Debug.WriteLine(string.Format("Failed to deserialize `{0}` into LabelValueChangeLabelValueChangeTemplate: {1}", jsonString, exception.ToString()));
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
            return newTemplateData;
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as TemplateData);
        }

        /// <summary>
        /// Returns true if TemplateData instances are equal
        /// </summary>
        /// <param name="input">Instance of TemplateData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TemplateData input)
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
    /// Custom JSON converter for TemplateData
    /// </summary>
    public class TemplateDataJsonConverter : JsonConverter
    {
        /// <summary>
        /// To write the JSON string
        /// </summary>
        /// <param name="writer">JSON writer</param>
        /// <param name="value">Object to be converted into a JSON string</param>
        /// <param name="serializer">JSON Serializer</param>
        public override void WriteJson(JsonWriter writer, object value, JsonSerializer serializer)
        {
            writer.WriteRawValue((string)(typeof(TemplateData).GetMethod("ToJson").Invoke(value, null)));
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
                return TemplateData.FromJson(JToken.Load(reader).ToString(Formatting.None));
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
