/*
 * Tick History
 *
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.4.1
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTickHistory.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTickHistory.Model
{
    /// <summary>
    /// Level1 request body elements
    /// </summary>
    [DataContract(Name = "Level1RequestBody")]
    public partial class Level1RequestBody : IEquatable<Level1RequestBody>, IValidatableObject
    {
        /// <summary>
        /// Defines Fields
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum FieldsEnum
        {
            /// <summary>
            /// Enum TICKER for value: TICKER
            /// </summary>
            [EnumMember(Value = "TICKER")]
            TICKER = 1,

            /// <summary>
            /// Enum ISOCODE for value: ISO_CODE
            /// </summary>
            [EnumMember(Value = "ISO_CODE")]
            ISOCODE = 2,

            /// <summary>
            /// Enum DATE for value: DATE
            /// </summary>
            [EnumMember(Value = "DATE")]
            DATE = 3,

            /// <summary>
            /// Enum TIME for value: TIME
            /// </summary>
            [EnumMember(Value = "TIME")]
            TIME = 4,

            /// <summary>
            /// Enum MSGTYPE for value: MSG_TYPE
            /// </summary>
            [EnumMember(Value = "MSG_TYPE")]
            MSGTYPE = 5,

            /// <summary>
            /// Enum SEQUENCE for value: SEQUENCE
            /// </summary>
            [EnumMember(Value = "SEQUENCE")]
            SEQUENCE = 6,

            /// <summary>
            /// Enum PRODUCT for value: PRODUCT
            /// </summary>
            [EnumMember(Value = "PRODUCT")]
            PRODUCT = 7,

            /// <summary>
            /// Enum BID for value: BID
            /// </summary>
            [EnumMember(Value = "BID")]
            BID = 8,

            /// <summary>
            /// Enum BIDTIME for value: BID_TIME
            /// </summary>
            [EnumMember(Value = "BID_TIME")]
            BIDTIME = 9,

            /// <summary>
            /// Enum BIDVOL for value: BID_VOL
            /// </summary>
            [EnumMember(Value = "BID_VOL")]
            BIDVOL = 10,

            /// <summary>
            /// Enum BIDEXCH for value: BID_EXCH
            /// </summary>
            [EnumMember(Value = "BID_EXCH")]
            BIDEXCH = 11,

            /// <summary>
            /// Enum ASK for value: ASK
            /// </summary>
            [EnumMember(Value = "ASK")]
            ASK = 12,

            /// <summary>
            /// Enum ASKTIME for value: ASK_TIME
            /// </summary>
            [EnumMember(Value = "ASK_TIME")]
            ASKTIME = 13,

            /// <summary>
            /// Enum ASKVOL for value: ASK_VOL
            /// </summary>
            [EnumMember(Value = "ASK_VOL")]
            ASKVOL = 14,

            /// <summary>
            /// Enum ASKEXCH for value: ASK_EXCH
            /// </summary>
            [EnumMember(Value = "ASK_EXCH")]
            ASKEXCH = 15,

            /// <summary>
            /// Enum LASTPRICE for value: LAST_PRICE
            /// </summary>
            [EnumMember(Value = "LAST_PRICE")]
            LASTPRICE = 16,

            /// <summary>
            /// Enum LASTDATE for value: LAST_DATE
            /// </summary>
            [EnumMember(Value = "LAST_DATE")]
            LASTDATE = 17,

            /// <summary>
            /// Enum LASTTIME for value: LAST_TIME
            /// </summary>
            [EnumMember(Value = "LAST_TIME")]
            LASTTIME = 18,

            /// <summary>
            /// Enum LASTVOL for value: LAST_VOL
            /// </summary>
            [EnumMember(Value = "LAST_VOL")]
            LASTVOL = 19,

            /// <summary>
            /// Enum LASTEXCH for value: LAST_EXCH
            /// </summary>
            [EnumMember(Value = "LAST_EXCH")]
            LASTEXCH = 20,

            /// <summary>
            /// Enum MID for value: MID
            /// </summary>
            [EnumMember(Value = "MID")]
            MID = 21,

            /// <summary>
            /// Enum MIDTIME for value: MID_TIME
            /// </summary>
            [EnumMember(Value = "MID_TIME")]
            MIDTIME = 22,

            /// <summary>
            /// Enum CVOL for value: CVOL
            /// </summary>
            [EnumMember(Value = "CVOL")]
            CVOL = 23,

            /// <summary>
            /// Enum CCVOL for value: CCVOL
            /// </summary>
            [EnumMember(Value = "CCVOL")]
            CCVOL = 24,

            /// <summary>
            /// Enum VWAP for value: VWAP
            /// </summary>
            [EnumMember(Value = "VWAP")]
            VWAP = 25,

            /// <summary>
            /// Enum YIELDPRICE for value: YIELD_PRICE
            /// </summary>
            [EnumMember(Value = "YIELD_PRICE")]
            YIELDPRICE = 26,

            /// <summary>
            /// Enum BENCHMARKYIELD for value: BENCHMARK_YIELD
            /// </summary>
            [EnumMember(Value = "BENCHMARK_YIELD")]
            BENCHMARKYIELD = 27,

            /// <summary>
            /// Enum BENCHMARKSPREAD for value: BENCHMARK_SPREAD
            /// </summary>
            [EnumMember(Value = "BENCHMARK_SPREAD")]
            BENCHMARKSPREAD = 28,

            /// <summary>
            /// Enum CURRENTYIELD for value: CURRENT_YIELD
            /// </summary>
            [EnumMember(Value = "CURRENT_YIELD")]
            CURRENTYIELD = 29,

            /// <summary>
            /// Enum TRADECONDITION for value: TRADE_CONDITION
            /// </summary>
            [EnumMember(Value = "TRADE_CONDITION")]
            TRADECONDITION = 30,

            /// <summary>
            /// Enum REPORTINGSIDE for value: REPORTING_SIDE
            /// </summary>
            [EnumMember(Value = "REPORTING_SIDE")]
            REPORTINGSIDE = 31,

            /// <summary>
            /// Enum ASKYIELD for value: ASK_YIELD
            /// </summary>
            [EnumMember(Value = "ASK_YIELD")]
            ASKYIELD = 32,

            /// <summary>
            /// Enum BIDYIELD for value: BID_YIELD
            /// </summary>
            [EnumMember(Value = "BID_YIELD")]
            BIDYIELD = 33,

            /// <summary>
            /// Enum VENUE for value: VENUE
            /// </summary>
            [EnumMember(Value = "VENUE")]
            VENUE = 34,

            /// <summary>
            /// Enum BUYID for value: BUY_ID
            /// </summary>
            [EnumMember(Value = "BUY_ID")]
            BUYID = 35,

            /// <summary>
            /// Enum MIDYIELD for value: MID_YIELD
            /// </summary>
            [EnumMember(Value = "MID_YIELD")]
            MIDYIELD = 36,

            /// <summary>
            /// Enum ORDERCODE for value: ORDER_CODE
            /// </summary>
            [EnumMember(Value = "ORDER_CODE")]
            ORDERCODE = 37,

            /// <summary>
            /// Enum SELLID for value: SELL_ID
            /// </summary>
            [EnumMember(Value = "SELL_ID")]
            SELLID = 38,

            /// <summary>
            /// Enum TRADEDPRICE for value: TRADED_PRICE
            /// </summary>
            [EnumMember(Value = "TRADED_PRICE")]
            TRADEDPRICE = 39,

            /// <summary>
            /// Enum TRADEDVOL for value: TRADED_VOL
            /// </summary>
            [EnumMember(Value = "TRADED_VOL")]
            TRADEDVOL = 40,

            /// <summary>
            /// Enum TRADEDCONDITION for value: TRADED_CONDITION
            /// </summary>
            [EnumMember(Value = "TRADED_CONDITION")]
            TRADEDCONDITION = 41,

            /// <summary>
            /// Enum TRADEDYIELD for value: TRADED_YIELD
            /// </summary>
            [EnumMember(Value = "TRADED_YIELD")]
            TRADEDYIELD = 42,

            /// <summary>
            /// Enum ORIGSEQUENCE for value: ORIG_SEQUENCE
            /// </summary>
            [EnumMember(Value = "ORIG_SEQUENCE")]
            ORIGSEQUENCE = 43,

            /// <summary>
            /// Enum SECURITYTYPE for value: SECURITY_TYPE
            /// </summary>
            [EnumMember(Value = "SECURITY_TYPE")]
            SECURITYTYPE = 44,

            /// <summary>
            /// Enum SECURITYSTATUS for value: SECURITY_STATUS
            /// </summary>
            [EnumMember(Value = "SECURITY_STATUS")]
            SECURITYSTATUS = 45,

            /// <summary>
            /// Enum MSGBITMASK for value: MSG_BITMASK
            /// </summary>
            [EnumMember(Value = "MSG_BITMASK")]
            MSGBITMASK = 46,

            /// <summary>
            /// Enum ORDERNUM for value: ORDER_NUM
            /// </summary>
            [EnumMember(Value = "ORDER_NUM")]
            ORDERNUM = 47,

            /// <summary>
            /// Enum ISO for value: ISO
            /// </summary>
            [EnumMember(Value = "ISO")]
            ISO = 48

        }



        /// <summary>
        /// Fields for which data is requested 
        /// </summary>
        /// <value>Fields for which data is requested </value>
        [DataMember(Name = "fields", EmitDefaultValue = false)]
        public List<FieldsEnum> Fields { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Level1RequestBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Level1RequestBody() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Level1RequestBody" /> class.
        /// </summary>
        /// <param name="tickers">The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.    (required).</param>
        /// <param name="factsetExchangeCode">FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;.  (required).</param>
        /// <param name="dateTimeRange">dateTimeRange (required).</param>
        /// <param name="fields">Fields for which data is requested .</param>
        /// <param name="single">&lt;p&gt; This parameter only works for smaller date/time requests where the file size is upto 128MB.&lt;/P&gt; single&#x3D;true  Returns data in a single file. single&#x3D;false Returns data in multiple files. &lt;p&gt; Note: If parameter is not used it take default value as false and returns data in multiple files.&lt;/p&gt;  (default to false).</param>
        public Level1RequestBody(List<string> tickers, string factsetExchangeCode, DateTimePeriod dateTimeRange,List<FieldsEnum> fields = default(List<FieldsEnum>), bool single = false)
        {
            // to ensure "tickers" is required (not null)
            if (tickers == null) {
                throw new ArgumentNullException("tickers is a required property for Level1RequestBody and cannot be null");
            }
            this.Tickers = tickers;
            // to ensure "factsetExchangeCode" is required (not null)
            if (factsetExchangeCode == null) {
                throw new ArgumentNullException("factsetExchangeCode is a required property for Level1RequestBody and cannot be null");
            }
            this.FactsetExchangeCode = factsetExchangeCode;
            // to ensure "dateTimeRange" is required (not null)
            if (dateTimeRange == null) {
                throw new ArgumentNullException("dateTimeRange is a required property for Level1RequestBody and cannot be null");
            }
            this.DateTimeRange = dateTimeRange;
            this.Fields = fields;
            this.Single = single;
        }

        /// <summary>
        /// The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.   
        /// </summary>
        /// <value>The requested list of one or more tickers. &lt;p&gt; NOTE: Maximum 500 tickers per request.&lt;/p&gt;.   </value>
        [DataMember(Name = "tickers", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Tickers { get; set; }

        /// <summary>
        /// FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;. 
        /// </summary>
        /// <value>FactSet specific regional or composite exchange code and last exchange code. &lt;p&gt; NOTE:Does not support multiple factsetExchangeCodes&lt;/p&gt;. </value>
        [DataMember(Name = "factsetExchangeCode", IsRequired = true, EmitDefaultValue = false)]
        public string FactsetExchangeCode { get; set; }

        /// <summary>
        /// Gets or Sets DateTimeRange
        /// </summary>
        [DataMember(Name = "dateTimeRange", IsRequired = true, EmitDefaultValue = false)]
        public DateTimePeriod DateTimeRange { get; set; }

        /// <summary>
        /// &lt;p&gt; This parameter only works for smaller date/time requests where the file size is upto 128MB.&lt;/P&gt; single&#x3D;true  Returns data in a single file. single&#x3D;false Returns data in multiple files. &lt;p&gt; Note: If parameter is not used it take default value as false and returns data in multiple files.&lt;/p&gt; 
        /// </summary>
        /// <value>&lt;p&gt; This parameter only works for smaller date/time requests where the file size is upto 128MB.&lt;/P&gt; single&#x3D;true  Returns data in a single file. single&#x3D;false Returns data in multiple files. &lt;p&gt; Note: If parameter is not used it take default value as false and returns data in multiple files.&lt;/p&gt; </value>
        [DataMember(Name = "single", EmitDefaultValue = true)]
        public bool Single { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Level1RequestBody {\n");
            sb.Append("  Tickers: ").Append(Tickers).Append("\n");
            sb.Append("  FactsetExchangeCode: ").Append(FactsetExchangeCode).Append("\n");
            sb.Append("  DateTimeRange: ").Append(DateTimeRange).Append("\n");
            sb.Append("  Fields: ").Append(Fields).Append("\n");
            sb.Append("  Single: ").Append(Single).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Level1RequestBody);
        }

        /// <summary>
        /// Returns true if Level1RequestBody instances are equal
        /// </summary>
        /// <param name="input">Instance of Level1RequestBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Level1RequestBody input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Tickers == input.Tickers ||
                    this.Tickers != null &&
                    input.Tickers != null &&
                    this.Tickers.SequenceEqual(input.Tickers)
                ) && 
                (
                    this.FactsetExchangeCode == input.FactsetExchangeCode ||
                    (this.FactsetExchangeCode != null &&
                    this.FactsetExchangeCode.Equals(input.FactsetExchangeCode))
                ) && 
                (
                    this.DateTimeRange == input.DateTimeRange ||
                    (this.DateTimeRange != null &&
                    this.DateTimeRange.Equals(input.DateTimeRange))
                ) && 
                (
                    this.Fields == input.Fields ||
                    this.Fields.SequenceEqual(input.Fields)
                ) && 
                (
                    this.Single == input.Single ||
                    this.Single.Equals(input.Single)
                );
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
                if (this.Tickers != null)
                {
                    hashCode = (hashCode * 59) + this.Tickers.GetHashCode();
                }
                if (this.FactsetExchangeCode != null)
                {
                    hashCode = (hashCode * 59) + this.FactsetExchangeCode.GetHashCode();
                }
                if (this.DateTimeRange != null)
                {
                    hashCode = (hashCode * 59) + this.DateTimeRange.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Fields.GetHashCode();
                hashCode = (hashCode * 59) + this.Single.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
