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

namespace FactSet.SDK.FactSetSearchAnswers.Model
{
    /// <summary>
    /// InstrumentID
    /// </summary>
    [DataContract(Name = "InstrumentID")]
    public partial class InstrumentID : IEquatable<InstrumentID>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InstrumentID" /> class.
        /// </summary>
        /// <param name="bBG">bBG.</param>
        /// <param name="cUSIP">cUSIP.</param>
        /// <param name="fDSID">fDSID.</param>
        /// <param name="fDSTICKERREGION">fDSTICKERREGION.</param>
        /// <param name="fDSTICKEREXCHANGE">fDSTICKEREXCHANGE.</param>
        /// <param name="fIGI">fIGI.</param>
        /// <param name="iSIN">iSIN.</param>
        /// <param name="pERMID">pERMID.</param>
        /// <param name="rIC">rIC.</param>
        /// <param name="sEDOL">sEDOL.</param>
        /// <param name="ticker">ticker.</param>
        public InstrumentID(string bBG = default(string), string cUSIP = default(string), string fDSID = default(string), string fDSTICKERREGION = default(string), string fDSTICKEREXCHANGE = default(string), string fIGI = default(string), string iSIN = default(string), string pERMID = default(string), string rIC = default(string), string sEDOL = default(string), string ticker = default(string))
        {
            this.BBG = bBG;
            this.CUSIP = cUSIP;
            this.FDS_ID = fDSID;
            this.FDS_TICKER_REGION = fDSTICKERREGION;
            this.FDS_TICKER_EXCHANGE = fDSTICKEREXCHANGE;
            this.FIGI = fIGI;
            this.ISIN = iSIN;
            this.PERMID = pERMID;
            this.RIC = rIC;
            this.SEDOL = sEDOL;
            this.Ticker = ticker;
        }

        /// <summary>
        /// Gets or Sets BBG
        /// </summary>
        [DataMember(Name = "BBG", EmitDefaultValue = false)]
        public string BBG { get; set; }

        /// <summary>
        /// Gets or Sets CUSIP
        /// </summary>
        [DataMember(Name = "CUSIP", EmitDefaultValue = false)]
        public string CUSIP { get; set; }

        /// <summary>
        /// Gets or Sets FDS_ID
        /// </summary>
        [DataMember(Name = "FDS_ID", EmitDefaultValue = false)]
        public string FDS_ID { get; set; }

        /// <summary>
        /// Gets or Sets FDS_TICKER_REGION
        /// </summary>
        [DataMember(Name = "FDS_TICKER_REGION", EmitDefaultValue = false)]
        public string FDS_TICKER_REGION { get; set; }

        /// <summary>
        /// Gets or Sets FDS_TICKER_EXCHANGE
        /// </summary>
        [DataMember(Name = "FDS_TICKER_EXCHANGE", EmitDefaultValue = false)]
        public string FDS_TICKER_EXCHANGE { get; set; }

        /// <summary>
        /// Gets or Sets FIGI
        /// </summary>
        [DataMember(Name = "FIGI", EmitDefaultValue = false)]
        public string FIGI { get; set; }

        /// <summary>
        /// Gets or Sets ISIN
        /// </summary>
        [DataMember(Name = "ISIN", EmitDefaultValue = false)]
        public string ISIN { get; set; }

        /// <summary>
        /// Gets or Sets PERMID
        /// </summary>
        [DataMember(Name = "PERMID", EmitDefaultValue = false)]
        public string PERMID { get; set; }

        /// <summary>
        /// Gets or Sets RIC
        /// </summary>
        [DataMember(Name = "RIC", EmitDefaultValue = false)]
        public string RIC { get; set; }

        /// <summary>
        /// Gets or Sets SEDOL
        /// </summary>
        [DataMember(Name = "SEDOL", EmitDefaultValue = false)]
        public string SEDOL { get; set; }

        /// <summary>
        /// Gets or Sets Ticker
        /// </summary>
        [DataMember(Name = "ticker", EmitDefaultValue = false)]
        public string Ticker { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InstrumentID {\n");
            sb.Append("  BBG: ").Append(BBG).Append("\n");
            sb.Append("  CUSIP: ").Append(CUSIP).Append("\n");
            sb.Append("  FDS_ID: ").Append(FDS_ID).Append("\n");
            sb.Append("  FDS_TICKER_REGION: ").Append(FDS_TICKER_REGION).Append("\n");
            sb.Append("  FDS_TICKER_EXCHANGE: ").Append(FDS_TICKER_EXCHANGE).Append("\n");
            sb.Append("  FIGI: ").Append(FIGI).Append("\n");
            sb.Append("  ISIN: ").Append(ISIN).Append("\n");
            sb.Append("  PERMID: ").Append(PERMID).Append("\n");
            sb.Append("  RIC: ").Append(RIC).Append("\n");
            sb.Append("  SEDOL: ").Append(SEDOL).Append("\n");
            sb.Append("  Ticker: ").Append(Ticker).Append("\n");
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
            return this.Equals(input as InstrumentID);
        }

        /// <summary>
        /// Returns true if InstrumentID instances are equal
        /// </summary>
        /// <param name="input">Instance of InstrumentID to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InstrumentID input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BBG == input.BBG ||
                    (this.BBG != null &&
                    this.BBG.Equals(input.BBG))
                ) && 
                (
                    this.CUSIP == input.CUSIP ||
                    (this.CUSIP != null &&
                    this.CUSIP.Equals(input.CUSIP))
                ) && 
                (
                    this.FDS_ID == input.FDS_ID ||
                    (this.FDS_ID != null &&
                    this.FDS_ID.Equals(input.FDS_ID))
                ) && 
                (
                    this.FDS_TICKER_REGION == input.FDS_TICKER_REGION ||
                    (this.FDS_TICKER_REGION != null &&
                    this.FDS_TICKER_REGION.Equals(input.FDS_TICKER_REGION))
                ) && 
                (
                    this.FDS_TICKER_EXCHANGE == input.FDS_TICKER_EXCHANGE ||
                    (this.FDS_TICKER_EXCHANGE != null &&
                    this.FDS_TICKER_EXCHANGE.Equals(input.FDS_TICKER_EXCHANGE))
                ) && 
                (
                    this.FIGI == input.FIGI ||
                    (this.FIGI != null &&
                    this.FIGI.Equals(input.FIGI))
                ) && 
                (
                    this.ISIN == input.ISIN ||
                    (this.ISIN != null &&
                    this.ISIN.Equals(input.ISIN))
                ) && 
                (
                    this.PERMID == input.PERMID ||
                    (this.PERMID != null &&
                    this.PERMID.Equals(input.PERMID))
                ) && 
                (
                    this.RIC == input.RIC ||
                    (this.RIC != null &&
                    this.RIC.Equals(input.RIC))
                ) && 
                (
                    this.SEDOL == input.SEDOL ||
                    (this.SEDOL != null &&
                    this.SEDOL.Equals(input.SEDOL))
                ) && 
                (
                    this.Ticker == input.Ticker ||
                    (this.Ticker != null &&
                    this.Ticker.Equals(input.Ticker))
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
                if (this.BBG != null)
                {
                    hashCode = (hashCode * 59) + this.BBG.GetHashCode();
                }
                if (this.CUSIP != null)
                {
                    hashCode = (hashCode * 59) + this.CUSIP.GetHashCode();
                }
                if (this.FDS_ID != null)
                {
                    hashCode = (hashCode * 59) + this.FDS_ID.GetHashCode();
                }
                if (this.FDS_TICKER_REGION != null)
                {
                    hashCode = (hashCode * 59) + this.FDS_TICKER_REGION.GetHashCode();
                }
                if (this.FDS_TICKER_EXCHANGE != null)
                {
                    hashCode = (hashCode * 59) + this.FDS_TICKER_EXCHANGE.GetHashCode();
                }
                if (this.FIGI != null)
                {
                    hashCode = (hashCode * 59) + this.FIGI.GetHashCode();
                }
                if (this.ISIN != null)
                {
                    hashCode = (hashCode * 59) + this.ISIN.GetHashCode();
                }
                if (this.PERMID != null)
                {
                    hashCode = (hashCode * 59) + this.PERMID.GetHashCode();
                }
                if (this.RIC != null)
                {
                    hashCode = (hashCode * 59) + this.RIC.GetHashCode();
                }
                if (this.SEDOL != null)
                {
                    hashCode = (hashCode * 59) + this.SEDOL.GetHashCode();
                }
                if (this.Ticker != null)
                {
                    hashCode = (hashCode * 59) + this.Ticker.GetHashCode();
                }
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
