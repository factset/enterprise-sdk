/*
 * FactSet Terms & Conditions API
 *
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTermsandConditions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTermsandConditions.Model
{
    /// <summary>
    /// Coupon History for a Fixed Income security.
    /// </summary>
    [DataContract(Name = "couponHistory")]
    public partial class CouponHistory : IEquatable<CouponHistory>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CouponHistory" /> class.
        /// </summary>
        /// <param name="requestId">Security identifier used in the request..</param>
        /// <param name="fsymId">FactSet Permanent Security Identifier..</param>
        /// <param name="date">Coupon Accrual Date.</param>
        /// <param name="couponBasketFlag">Coupon Basket Flag.</param>
        /// <param name="couponEffPmtDate">Effective Payment Date.</param>
        /// <param name="couponFormula">Coupon Formula.</param>
        /// <param name="couponInitResetDate">First Coupon Reset Date.</param>
        /// <param name="couponResetFreq">Coupon Reset Frequency.</param>
        /// <param name="couponLink">Coupon Link.</param>
        /// <param name="couponMargin">Margin.</param>
        /// <param name="couponMinFloatRate">Coupon Minimum-Floating Rate.</param>
        /// <param name="couponStructSubCode">Coupon Structure Sub Code.</param>
        /// <param name="couponTypeStruct">Coupon Type.</param>
        /// <param name="couponVarPmtFlag">Variable Coupon Payments.</param>
        /// <param name="underlyingIndex">Underlying Index.</param>
        public CouponHistory(string requestId = default(string), string fsymId = default(string), DateTime date = default(DateTime), bool couponBasketFlag = default(bool), DateTime couponEffPmtDate = default(DateTime), string couponFormula = default(string), DateTime couponInitResetDate = default(DateTime), string couponResetFreq = default(string), string couponLink = default(string), double couponMargin = default(double), double couponMinFloatRate = default(double), string couponStructSubCode = default(string), string couponTypeStruct = default(string), bool couponVarPmtFlag = default(bool), string underlyingIndex = default(string))
        {
            this.RequestId = requestId;
            this.FsymId = fsymId;
            this.Date = date;
            this.CouponBasketFlag = couponBasketFlag;
            this.CouponEffPmtDate = couponEffPmtDate;
            this.CouponFormula = couponFormula;
            this.CouponInitResetDate = couponInitResetDate;
            this.CouponResetFreq = couponResetFreq;
            this.CouponLink = couponLink;
            this.CouponMargin = couponMargin;
            this.CouponMinFloatRate = couponMinFloatRate;
            this.CouponStructSubCode = couponStructSubCode;
            this.CouponTypeStruct = couponTypeStruct;
            this.CouponVarPmtFlag = couponVarPmtFlag;
            this.UnderlyingIndex = underlyingIndex;
        }

        /// <summary>
        /// Security identifier used in the request.
        /// </summary>
        /// <value>Security identifier used in the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// FactSet Permanent Security Identifier.
        /// </summary>
        /// <value>FactSet Permanent Security Identifier.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// Coupon Accrual Date
        /// </summary>
        /// <value>Coupon Accrual Date</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// Coupon Basket Flag
        /// </summary>
        /// <value>Coupon Basket Flag</value>
        [DataMember(Name = "couponBasketFlag", EmitDefaultValue = true)]
        public bool CouponBasketFlag { get; set; }

        /// <summary>
        /// Effective Payment Date
        /// </summary>
        /// <value>Effective Payment Date</value>
        [DataMember(Name = "couponEffPmtDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime CouponEffPmtDate { get; set; }

        /// <summary>
        /// Coupon Formula
        /// </summary>
        /// <value>Coupon Formula</value>
        [DataMember(Name = "couponFormula", EmitDefaultValue = false)]
        public string CouponFormula { get; set; }

        /// <summary>
        /// First Coupon Reset Date
        /// </summary>
        /// <value>First Coupon Reset Date</value>
        [DataMember(Name = "couponInitResetDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime CouponInitResetDate { get; set; }

        /// <summary>
        /// Coupon Reset Frequency
        /// </summary>
        /// <value>Coupon Reset Frequency</value>
        [DataMember(Name = "couponResetFreq", EmitDefaultValue = false)]
        public string CouponResetFreq { get; set; }

        /// <summary>
        /// Coupon Link
        /// </summary>
        /// <value>Coupon Link</value>
        [DataMember(Name = "couponLink", EmitDefaultValue = false)]
        public string CouponLink { get; set; }

        /// <summary>
        /// Margin
        /// </summary>
        /// <value>Margin</value>
        [DataMember(Name = "couponMargin", EmitDefaultValue = false)]
        public double CouponMargin { get; set; }

        /// <summary>
        /// Coupon Minimum-Floating Rate
        /// </summary>
        /// <value>Coupon Minimum-Floating Rate</value>
        [DataMember(Name = "couponMinFloatRate", EmitDefaultValue = false)]
        public double CouponMinFloatRate { get; set; }

        /// <summary>
        /// Coupon Structure Sub Code
        /// </summary>
        /// <value>Coupon Structure Sub Code</value>
        [DataMember(Name = "couponStructSubCode", EmitDefaultValue = false)]
        public string CouponStructSubCode { get; set; }

        /// <summary>
        /// Coupon Type
        /// </summary>
        /// <value>Coupon Type</value>
        [DataMember(Name = "couponTypeStruct", EmitDefaultValue = false)]
        public string CouponTypeStruct { get; set; }

        /// <summary>
        /// Variable Coupon Payments
        /// </summary>
        /// <value>Variable Coupon Payments</value>
        [DataMember(Name = "couponVarPmtFlag", EmitDefaultValue = true)]
        public bool CouponVarPmtFlag { get; set; }

        /// <summary>
        /// Underlying Index
        /// </summary>
        /// <value>Underlying Index</value>
        [DataMember(Name = "underlyingIndex", EmitDefaultValue = false)]
        public string UnderlyingIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CouponHistory {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  CouponBasketFlag: ").Append(CouponBasketFlag).Append("\n");
            sb.Append("  CouponEffPmtDate: ").Append(CouponEffPmtDate).Append("\n");
            sb.Append("  CouponFormula: ").Append(CouponFormula).Append("\n");
            sb.Append("  CouponInitResetDate: ").Append(CouponInitResetDate).Append("\n");
            sb.Append("  CouponResetFreq: ").Append(CouponResetFreq).Append("\n");
            sb.Append("  CouponLink: ").Append(CouponLink).Append("\n");
            sb.Append("  CouponMargin: ").Append(CouponMargin).Append("\n");
            sb.Append("  CouponMinFloatRate: ").Append(CouponMinFloatRate).Append("\n");
            sb.Append("  CouponStructSubCode: ").Append(CouponStructSubCode).Append("\n");
            sb.Append("  CouponTypeStruct: ").Append(CouponTypeStruct).Append("\n");
            sb.Append("  CouponVarPmtFlag: ").Append(CouponVarPmtFlag).Append("\n");
            sb.Append("  UnderlyingIndex: ").Append(UnderlyingIndex).Append("\n");
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
            return this.Equals(input as CouponHistory);
        }

        /// <summary>
        /// Returns true if CouponHistory instances are equal
        /// </summary>
        /// <param name="input">Instance of CouponHistory to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CouponHistory input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.CouponBasketFlag == input.CouponBasketFlag ||
                    this.CouponBasketFlag.Equals(input.CouponBasketFlag)
                ) && 
                (
                    this.CouponEffPmtDate == input.CouponEffPmtDate ||
                    (this.CouponEffPmtDate != null &&
                    this.CouponEffPmtDate.Equals(input.CouponEffPmtDate))
                ) && 
                (
                    this.CouponFormula == input.CouponFormula ||
                    (this.CouponFormula != null &&
                    this.CouponFormula.Equals(input.CouponFormula))
                ) && 
                (
                    this.CouponInitResetDate == input.CouponInitResetDate ||
                    (this.CouponInitResetDate != null &&
                    this.CouponInitResetDate.Equals(input.CouponInitResetDate))
                ) && 
                (
                    this.CouponResetFreq == input.CouponResetFreq ||
                    (this.CouponResetFreq != null &&
                    this.CouponResetFreq.Equals(input.CouponResetFreq))
                ) && 
                (
                    this.CouponLink == input.CouponLink ||
                    (this.CouponLink != null &&
                    this.CouponLink.Equals(input.CouponLink))
                ) && 
                (
                    this.CouponMargin == input.CouponMargin ||
                    this.CouponMargin.Equals(input.CouponMargin)
                ) && 
                (
                    this.CouponMinFloatRate == input.CouponMinFloatRate ||
                    this.CouponMinFloatRate.Equals(input.CouponMinFloatRate)
                ) && 
                (
                    this.CouponStructSubCode == input.CouponStructSubCode ||
                    (this.CouponStructSubCode != null &&
                    this.CouponStructSubCode.Equals(input.CouponStructSubCode))
                ) && 
                (
                    this.CouponTypeStruct == input.CouponTypeStruct ||
                    (this.CouponTypeStruct != null &&
                    this.CouponTypeStruct.Equals(input.CouponTypeStruct))
                ) && 
                (
                    this.CouponVarPmtFlag == input.CouponVarPmtFlag ||
                    this.CouponVarPmtFlag.Equals(input.CouponVarPmtFlag)
                ) && 
                (
                    this.UnderlyingIndex == input.UnderlyingIndex ||
                    (this.UnderlyingIndex != null &&
                    this.UnderlyingIndex.Equals(input.UnderlyingIndex))
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
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
                }
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.CouponBasketFlag.GetHashCode();
                if (this.CouponEffPmtDate != null)
                {
                    hashCode = (hashCode * 59) + this.CouponEffPmtDate.GetHashCode();
                }
                if (this.CouponFormula != null)
                {
                    hashCode = (hashCode * 59) + this.CouponFormula.GetHashCode();
                }
                if (this.CouponInitResetDate != null)
                {
                    hashCode = (hashCode * 59) + this.CouponInitResetDate.GetHashCode();
                }
                if (this.CouponResetFreq != null)
                {
                    hashCode = (hashCode * 59) + this.CouponResetFreq.GetHashCode();
                }
                if (this.CouponLink != null)
                {
                    hashCode = (hashCode * 59) + this.CouponLink.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.CouponMargin.GetHashCode();
                hashCode = (hashCode * 59) + this.CouponMinFloatRate.GetHashCode();
                if (this.CouponStructSubCode != null)
                {
                    hashCode = (hashCode * 59) + this.CouponStructSubCode.GetHashCode();
                }
                if (this.CouponTypeStruct != null)
                {
                    hashCode = (hashCode * 59) + this.CouponTypeStruct.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.CouponVarPmtFlag.GetHashCode();
                if (this.UnderlyingIndex != null)
                {
                    hashCode = (hashCode * 59) + this.UnderlyingIndex.GetHashCode();
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
