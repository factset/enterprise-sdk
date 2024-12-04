/*
 * StreetAccount News API
 *
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.   **StreetAccount Historical Stories:**  These endpoints provide access to historical StreetAccount (SA) news. The API delivers SA stories in XML format based on user-specified date input parameters. Output files are securely available to users through a URL. This API has three endpoints: Create, Status, and Get.  Please note that this API only supports adhoc requests for historical files and does not support real-time files. If real-time push is required, consider using other methods such as SFTP, QNT account, or Azure Storage. Both historical and real-time Street Account news can be delivered via SFTP, QNT account, or Azure Storage.  The files delivered contain both metadata and content body, eliminating the need for multiple requests through multiple services to retrieve all the information.
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
using OpenAPIDateConverter = FactSet.SDK.StreetAccountNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StreetAccountNews.Model
{
    /// <summary>
    /// create-files request body elements
    /// </summary>
    [DataContract(Name = "createFilesRequestObject")]
    public partial class CreateFilesRequestObject : IEquatable<CreateFilesRequestObject>, IValidatableObject
    {
        /// <summary>
        /// Defines Category
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum CategoryEnum
        {
            /// <summary>
            /// Enum CompanyNewsAll for value: companyNewsAll
            /// </summary>
            [EnumMember(Value = "companyNewsAll")]
            CompanyNewsAll = 1,

            /// <summary>
            /// Enum CompanyNewsNA for value: companyNewsNA
            /// </summary>
            [EnumMember(Value = "companyNewsNA")]
            CompanyNewsNA = 2,

            /// <summary>
            /// Enum CompanyNewsEU for value: companyNewsEU
            /// </summary>
            [EnumMember(Value = "companyNewsEU")]
            CompanyNewsEU = 3,

            /// <summary>
            /// Enum CompanyNewsAPAC for value: companyNewsAPAC
            /// </summary>
            [EnumMember(Value = "companyNewsAPAC")]
            CompanyNewsAPAC = 4,

            /// <summary>
            /// Enum CompanyNewsESG for value: companyNewsESG
            /// </summary>
            [EnumMember(Value = "companyNewsESG")]
            CompanyNewsESG = 5,

            /// <summary>
            /// Enum MacroTtnAll for value: macroTtnAll
            /// </summary>
            [EnumMember(Value = "macroTtnAll")]
            MacroTtnAll = 6,

            /// <summary>
            /// Enum MacroTtnNA for value: macroTtnNA
            /// </summary>
            [EnumMember(Value = "macroTtnNA")]
            MacroTtnNA = 7,

            /// <summary>
            /// Enum MacroTtnEU for value: macroTtnEU
            /// </summary>
            [EnumMember(Value = "macroTtnEU")]
            MacroTtnEU = 8,

            /// <summary>
            /// Enum MacroTtnAPAC for value: macroTtnAPAC
            /// </summary>
            [EnumMember(Value = "macroTtnAPAC")]
            MacroTtnAPAC = 9,

            /// <summary>
            /// Enum MacroTtnESG for value: macroTtnESG
            /// </summary>
            [EnumMember(Value = "macroTtnESG")]
            MacroTtnESG = 10,

            /// <summary>
            /// Enum All for value: all
            /// </summary>
            [EnumMember(Value = "all")]
            All = 11,

            /// <summary>
            /// Enum MacroTtnBanking for value: macroTtnBanking
            /// </summary>
            [EnumMember(Value = "macroTtnBanking")]
            MacroTtnBanking = 12,

            /// <summary>
            /// Enum MacroTtnConsumer for value: macroTtnConsumer
            /// </summary>
            [EnumMember(Value = "macroTtnConsumer")]
            MacroTtnConsumer = 13,

            /// <summary>
            /// Enum MacroTtnEnergy for value: macroTtnEnergy
            /// </summary>
            [EnumMember(Value = "macroTtnEnergy")]
            MacroTtnEnergy = 14,

            /// <summary>
            /// Enum MacroTtnHealthcare for value: macroTtnHealthcare
            /// </summary>
            [EnumMember(Value = "macroTtnHealthcare")]
            MacroTtnHealthcare = 15,

            /// <summary>
            /// Enum MacroTtnIndustrials for value: macroTtnIndustrials
            /// </summary>
            [EnumMember(Value = "macroTtnIndustrials")]
            MacroTtnIndustrials = 16,

            /// <summary>
            /// Enum MacroTtnInsurance for value: macroTtnInsurance
            /// </summary>
            [EnumMember(Value = "macroTtnInsurance")]
            MacroTtnInsurance = 17,

            /// <summary>
            /// Enum MacroTtnMedia for value: macroTtnMedia
            /// </summary>
            [EnumMember(Value = "macroTtnMedia")]
            MacroTtnMedia = 18,

            /// <summary>
            /// Enum MacroTtnMetals for value: macroTtnMetals
            /// </summary>
            [EnumMember(Value = "macroTtnMetals")]
            MacroTtnMetals = 19,

            /// <summary>
            /// Enum MacroTtnPower for value: macroTtnPower
            /// </summary>
            [EnumMember(Value = "macroTtnPower")]
            MacroTtnPower = 20,

            /// <summary>
            /// Enum MacroTtnRealEstate for value: macroTtnRealEstate
            /// </summary>
            [EnumMember(Value = "macroTtnRealEstate")]
            MacroTtnRealEstate = 21,

            /// <summary>
            /// Enum MacroTtnTech for value: macroTtnTech
            /// </summary>
            [EnumMember(Value = "macroTtnTech")]
            MacroTtnTech = 22,

            /// <summary>
            /// Enum MacroTtnAllSectors for value: macroTtnAllSectors
            /// </summary>
            [EnumMember(Value = "macroTtnAllSectors")]
            MacroTtnAllSectors = 23

        }



        /// <summary>
        /// Each category corresponds to AT LEAST 1 output file. Depending on the date range provided, each category can produce any number of output files. If multiple files are created for one category, the files themselves have no specific order.   * companyNewsAll &#x3D; Company News - All Regions * companyNewsNA &#x3D; Company News - North America Region * companyNewsEU &#x3D; Company News -EU Region * companyNewsAPAC &#x3D; Company News - APAC Region * companyNewsESG &#x3D; Company News - ESG * macroTtnAll &#x3D; Macro and Today&#39;s Top News - All Regions * macroTtnNA &#x3D; Macro and Today&#39;s Top News - North America Region * macroTtnEU &#x3D; Macro and Today&#39;s Top News - EU Region * macroTtnAPAC &#x3D; Macro and Today&#39;s Top News - APAC  Region * macroTtnESG &#x3D; Macro and Today&#39;s Top News - ESG * all &#x3D; Content bundle includes \&quot;Company News - All Regions\&quot;, \&quot;Company News - ESG\&quot;, \&quot;Macro and Today&#39;s Top News - All Regions\&quot;, and \&quot;Macro and Today&#39;s Top News - ESG\&quot; * macroTtnBanking &#x3D; Macro and Today&#39;s Top News -Banking * macroTtnConsumer &#x3D; Macro and Today&#39;s Top News - Consumer * macroTtnEnergy &#x3D; Macro and Today&#39;s Top News - Energy * macroTtnHealthcare &#x3D; Macro and Today&#39;s Top News - Healthcare * macroTtnIndustrials &#x3D; Macro and Today&#39;s Top News - Industrials * macroTtnInsurance &#x3D; Macro and Today&#39;s Top News - Insurance * macroTtnMedia &#x3D;  Macro and Today&#39;s Top News - Media &amp; Telecom * macroTtnMetals &#x3D; Macro and Today&#39;s Top News - Metals &amp; Mining * macroTtnPower &#x3D; Macro and Today&#39;s Top News - Power &amp; Utilities * macroTtnRealEstate &#x3D; Macro and Today&#39;s Top News - Real Estate * macroTtnTech &#x3D; Macro and Today&#39;s Top News -Technology * macroTtnAllSectors &#x3D; Macro and Today&#39;s Top News - All Sectors
        /// </summary>
        /// <value>Each category corresponds to AT LEAST 1 output file. Depending on the date range provided, each category can produce any number of output files. If multiple files are created for one category, the files themselves have no specific order.   * companyNewsAll &#x3D; Company News - All Regions * companyNewsNA &#x3D; Company News - North America Region * companyNewsEU &#x3D; Company News -EU Region * companyNewsAPAC &#x3D; Company News - APAC Region * companyNewsESG &#x3D; Company News - ESG * macroTtnAll &#x3D; Macro and Today&#39;s Top News - All Regions * macroTtnNA &#x3D; Macro and Today&#39;s Top News - North America Region * macroTtnEU &#x3D; Macro and Today&#39;s Top News - EU Region * macroTtnAPAC &#x3D; Macro and Today&#39;s Top News - APAC  Region * macroTtnESG &#x3D; Macro and Today&#39;s Top News - ESG * all &#x3D; Content bundle includes \&quot;Company News - All Regions\&quot;, \&quot;Company News - ESG\&quot;, \&quot;Macro and Today&#39;s Top News - All Regions\&quot;, and \&quot;Macro and Today&#39;s Top News - ESG\&quot; * macroTtnBanking &#x3D; Macro and Today&#39;s Top News -Banking * macroTtnConsumer &#x3D; Macro and Today&#39;s Top News - Consumer * macroTtnEnergy &#x3D; Macro and Today&#39;s Top News - Energy * macroTtnHealthcare &#x3D; Macro and Today&#39;s Top News - Healthcare * macroTtnIndustrials &#x3D; Macro and Today&#39;s Top News - Industrials * macroTtnInsurance &#x3D; Macro and Today&#39;s Top News - Insurance * macroTtnMedia &#x3D;  Macro and Today&#39;s Top News - Media &amp; Telecom * macroTtnMetals &#x3D; Macro and Today&#39;s Top News - Metals &amp; Mining * macroTtnPower &#x3D; Macro and Today&#39;s Top News - Power &amp; Utilities * macroTtnRealEstate &#x3D; Macro and Today&#39;s Top News - Real Estate * macroTtnTech &#x3D; Macro and Today&#39;s Top News -Technology * macroTtnAllSectors &#x3D; Macro and Today&#39;s Top News - All Sectors</value>
        [DataMember(Name = "category", IsRequired = true, EmitDefaultValue = false)]
        public List<CategoryEnum> Category { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateFilesRequestObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateFilesRequestObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateFilesRequestObject" /> class.
        /// </summary>
        /// <param name="dateTimeRange">dateTimeRange (required).</param>
        /// <param name="identifiers">Returns files for specified CUSIP, SEDOL, ISIN, Entity Identifier, Ticker and Regional Ticker. If this parameter is not specified, it will return all the files that covered under specified category..</param>
        /// <param name="category">Each category corresponds to AT LEAST 1 output file. Depending on the date range provided, each category can produce any number of output files. If multiple files are created for one category, the files themselves have no specific order.   * companyNewsAll &#x3D; Company News - All Regions * companyNewsNA &#x3D; Company News - North America Region * companyNewsEU &#x3D; Company News -EU Region * companyNewsAPAC &#x3D; Company News - APAC Region * companyNewsESG &#x3D; Company News - ESG * macroTtnAll &#x3D; Macro and Today&#39;s Top News - All Regions * macroTtnNA &#x3D; Macro and Today&#39;s Top News - North America Region * macroTtnEU &#x3D; Macro and Today&#39;s Top News - EU Region * macroTtnAPAC &#x3D; Macro and Today&#39;s Top News - APAC  Region * macroTtnESG &#x3D; Macro and Today&#39;s Top News - ESG * all &#x3D; Content bundle includes \&quot;Company News - All Regions\&quot;, \&quot;Company News - ESG\&quot;, \&quot;Macro and Today&#39;s Top News - All Regions\&quot;, and \&quot;Macro and Today&#39;s Top News - ESG\&quot; * macroTtnBanking &#x3D; Macro and Today&#39;s Top News -Banking * macroTtnConsumer &#x3D; Macro and Today&#39;s Top News - Consumer * macroTtnEnergy &#x3D; Macro and Today&#39;s Top News - Energy * macroTtnHealthcare &#x3D; Macro and Today&#39;s Top News - Healthcare * macroTtnIndustrials &#x3D; Macro and Today&#39;s Top News - Industrials * macroTtnInsurance &#x3D; Macro and Today&#39;s Top News - Insurance * macroTtnMedia &#x3D;  Macro and Today&#39;s Top News - Media &amp; Telecom * macroTtnMetals &#x3D; Macro and Today&#39;s Top News - Metals &amp; Mining * macroTtnPower &#x3D; Macro and Today&#39;s Top News - Power &amp; Utilities * macroTtnRealEstate &#x3D; Macro and Today&#39;s Top News - Real Estate * macroTtnTech &#x3D; Macro and Today&#39;s Top News -Technology * macroTtnAllSectors &#x3D; Macro and Today&#39;s Top News - All Sectors (required).</param>
        public CreateFilesRequestObject(DateTimeRangeObject dateTimeRange, List<CategoryEnum> category,List<string> identifiers = default(List<string>))
        {
            // to ensure "dateTimeRange" is required (not null)
            if (dateTimeRange == null) {
                throw new ArgumentNullException("dateTimeRange is a required property for CreateFilesRequestObject and cannot be null");
            }
            this.DateTimeRange = dateTimeRange;
            // to ensure "category" is required (not null)
            if (category == null) {
                throw new ArgumentNullException("category is a required property for CreateFilesRequestObject and cannot be null");
            }
            this.Category = category;
            this.Identifiers = identifiers;
        }

        /// <summary>
        /// Gets or Sets DateTimeRange
        /// </summary>
        [DataMember(Name = "dateTimeRange", IsRequired = true, EmitDefaultValue = false)]
        public DateTimeRangeObject DateTimeRange { get; set; }

        /// <summary>
        /// Returns files for specified CUSIP, SEDOL, ISIN, Entity Identifier, Ticker and Regional Ticker. If this parameter is not specified, it will return all the files that covered under specified category.
        /// </summary>
        /// <value>Returns files for specified CUSIP, SEDOL, ISIN, Entity Identifier, Ticker and Regional Ticker. If this parameter is not specified, it will return all the files that covered under specified category.</value>
        [DataMember(Name = "identifiers", EmitDefaultValue = false)]
        public List<string> Identifiers { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateFilesRequestObject {\n");
            sb.Append("  DateTimeRange: ").Append(DateTimeRange).Append("\n");
            sb.Append("  Identifiers: ").Append(Identifiers).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
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
            return this.Equals(input as CreateFilesRequestObject);
        }

        /// <summary>
        /// Returns true if CreateFilesRequestObject instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateFilesRequestObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateFilesRequestObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.DateTimeRange == input.DateTimeRange ||
                    (this.DateTimeRange != null &&
                    this.DateTimeRange.Equals(input.DateTimeRange))
                ) && 
                (
                    this.Identifiers == input.Identifiers ||
                    this.Identifiers != null &&
                    input.Identifiers != null &&
                    this.Identifiers.SequenceEqual(input.Identifiers)
                ) && 
                (
                    this.Category == input.Category ||
                    this.Category.SequenceEqual(input.Category)
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
                if (this.DateTimeRange != null)
                {
                    hashCode = (hashCode * 59) + this.DateTimeRange.GetHashCode();
                }
                if (this.Identifiers != null)
                {
                    hashCode = (hashCode * 59) + this.Identifiers.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Category.GetHashCode();
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
