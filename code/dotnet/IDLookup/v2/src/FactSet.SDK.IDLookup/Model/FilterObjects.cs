/*
 * ID Lookup API
 *
 * The ID Lookup API is a fuzzy search service that allows users to resolve symbols but are unable to find them elsewhere. The ID Lookup API allows users to search for entities in a wide variety of ways including, but not limited to, tickers, CUSIPs, URLs, a company’s brands, names and descriptions. The API does not require a complete query and will return different lists of results with each additional character, which enables users to iterate and adjust queries to return the desired results. Each search query returns a list of suggestions that can include every entity type offered by the API based on a matching and ranking algorithm.   The API response returns multiple different symbols that map to both internal FactSet identifiers like security or entity IDs as well as external identifiers like exchange tickers, Morningstar symbols and ISINs. This gives users flexibility in mapping identifiers across the FactSet universe.
 *
 * The version of the OpenAPI document: 2.0.0
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
using OpenAPIDateConverter = FactSet.SDK.IDLookup.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IDLookup.Model
{
    /// <summary>
    /// Response object for a lookup request
    /// </summary>
    [DataContract(Name = "filterObjects")]
    public partial class FilterObjects : IEquatable<FilterObjects>, IValidatableObject
    {
        /// <summary>
        /// Type of dataset.
        /// </summary>
        /// <value>Type of dataset.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DatasetEnum
        {
            /// <summary>
            /// Enum Equities for value: equities
            /// </summary>
            [EnumMember(Value = "equities")]
            Equities = 1,

            /// <summary>
            /// Enum BankLoans for value: bankLoans
            /// </summary>
            [EnumMember(Value = "bankLoans")]
            BankLoans = 2,

            /// <summary>
            /// Enum Commodities for value: commodities
            /// </summary>
            [EnumMember(Value = "commodities")]
            Commodities = 3,

            /// <summary>
            /// Enum CepBonds for value: cepBonds
            /// </summary>
            [EnumMember(Value = "cepBonds")]
            CepBonds = 4,

            /// <summary>
            /// Enum Countries for value: countries
            /// </summary>
            [EnumMember(Value = "countries")]
            Countries = 5,

            /// <summary>
            /// Enum Deals for value: deals
            /// </summary>
            [EnumMember(Value = "deals")]
            Deals = 6,

            /// <summary>
            /// Enum EconomicReports for value: economicReports
            /// </summary>
            [EnumMember(Value = "economicReports")]
            EconomicReports = 7,

            /// <summary>
            /// Enum EconomicSeries for value: economicSeries
            /// </summary>
            [EnumMember(Value = "economicSeries")]
            EconomicSeries = 8,

            /// <summary>
            /// Enum EquitiesRealTime for value: equitiesRealTime
            /// </summary>
            [EnumMember(Value = "equitiesRealTime")]
            EquitiesRealTime = 9,

            /// <summary>
            /// Enum ExchangeRatesRealTime for value: exchangeRatesRealTime
            /// </summary>
            [EnumMember(Value = "exchangeRatesRealTime")]
            ExchangeRatesRealTime = 10,

            /// <summary>
            /// Enum Etfs for value: etfs
            /// </summary>
            [EnumMember(Value = "etfs")]
            Etfs = 11,

            /// <summary>
            /// Enum EtfsRealTime for value: etfsRealTime
            /// </summary>
            [EnumMember(Value = "etfsRealTime")]
            EtfsRealTime = 12,

            /// <summary>
            /// Enum Bonds for value: bonds
            /// </summary>
            [EnumMember(Value = "bonds")]
            Bonds = 13,

            /// <summary>
            /// Enum Forex for value: forex
            /// </summary>
            [EnumMember(Value = "forex")]
            Forex = 14,

            /// <summary>
            /// Enum Futures for value: futures
            /// </summary>
            [EnumMember(Value = "futures")]
            Futures = 15,

            /// <summary>
            /// Enum Indices for value: indices
            /// </summary>
            [EnumMember(Value = "indices")]
            Indices = 16,

            /// <summary>
            /// Enum IndicesRealTime for value: indicesRealTime
            /// </summary>
            [EnumMember(Value = "indicesRealTime")]
            IndicesRealTime = 17,

            /// <summary>
            /// Enum Industries for value: industries
            /// </summary>
            [EnumMember(Value = "industries")]
            Industries = 18,

            /// <summary>
            /// Enum MarkitLoans for value: markitLoans
            /// </summary>
            [EnumMember(Value = "markitLoans")]
            MarkitLoans = 19,

            /// <summary>
            /// Enum MutualFunds for value: mutualFunds
            /// </summary>
            [EnumMember(Value = "mutualFunds")]
            MutualFunds = 20,

            /// <summary>
            /// Enum MutualFundsRealTime for value: mutualFundsRealTime
            /// </summary>
            [EnumMember(Value = "mutualFundsRealTime")]
            MutualFundsRealTime = 21,

            /// <summary>
            /// Enum OwnershipHolders for value: ownershipHolders
            /// </summary>
            [EnumMember(Value = "ownershipHolders")]
            OwnershipHolders = 22,

            /// <summary>
            /// Enum People for value: people
            /// </summary>
            [EnumMember(Value = "people")]
            People = 23,

            /// <summary>
            /// Enum PrivateCompanies for value: privateCompanies
            /// </summary>
            [EnumMember(Value = "privateCompanies")]
            PrivateCompanies = 24,

            /// <summary>
            /// Enum PevcFirms for value: pevcFirms
            /// </summary>
            [EnumMember(Value = "pevcFirms")]
            PevcFirms = 25,

            /// <summary>
            /// Enum PevcFunds for value: pevcFunds
            /// </summary>
            [EnumMember(Value = "pevcFunds")]
            PevcFunds = 26,

            /// <summary>
            /// Enum Regions for value: regions
            /// </summary>
            [EnumMember(Value = "regions")]
            Regions = 27,

            /// <summary>
            /// Enum Yields for value: yields
            /// </summary>
            [EnumMember(Value = "yields")]
            Yields = 28,

            /// <summary>
            /// Enum Options for value: options
            /// </summary>
            [EnumMember(Value = "options")]
            Options = 29

        }


        /// <summary>
        /// Type of dataset.
        /// </summary>
        /// <value>Type of dataset.</value>
        [DataMember(Name = "dataset", IsRequired = true, EmitDefaultValue = false)]
        public DatasetEnum Dataset { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="FilterObjects" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FilterObjects() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FilterObjects" /> class.
        /// </summary>
        /// <param name="dataset">Type of dataset. (required).</param>
        /// <param name="filters">filters.</param>
        public FilterObjects(DatasetEnum dataset,Filters filters = default(Filters))
        {
            this.Dataset = dataset;
            this.Filters = filters;
        }

        /// <summary>
        /// Gets or Sets Filters
        /// </summary>
        [DataMember(Name = "filters", EmitDefaultValue = false)]
        public Filters Filters { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FilterObjects {\n");
            sb.Append("  Dataset: ").Append(Dataset).Append("\n");
            sb.Append("  Filters: ").Append(Filters).Append("\n");
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
            return this.Equals(input as FilterObjects);
        }

        /// <summary>
        /// Returns true if FilterObjects instances are equal
        /// </summary>
        /// <param name="input">Instance of FilterObjects to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FilterObjects input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Dataset == input.Dataset ||
                    this.Dataset.Equals(input.Dataset)
                ) && 
                (
                    this.Filters == input.Filters ||
                    (this.Filters != null &&
                    this.Filters.Equals(input.Filters))
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
                hashCode = (hashCode * 59) + this.Dataset.GetHashCode();
                if (this.Filters != null)
                {
                    hashCode = (hashCode * 59) + this.Filters.GetHashCode();
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
