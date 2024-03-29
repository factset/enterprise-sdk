/**
 * S&P Global Fixed Income Evaluated Prices & Analytics API
 * Gain access to evaluated pricing and analytics data for Corporate Bonds, Municipal Bonds and Asset Backed Securities provided by S&P Global (formerly IHS Markit) .  Data returned through multiple endpoints like prices, spread, yield, yield curve, sensitivity, coupon information, securities metadata and details specific to the Asset Backed Securities. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The AbsDetails model module.
 * @module model/AbsDetails
 */
class AbsDetails {
    /**
     * Constructs a new <code>AbsDetails</code>.
     * @alias module:model/AbsDetails
     */
    constructor() { 
        
        AbsDetails.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AbsDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AbsDetails} obj Optional instance to populate.
     * @return {module:model/AbsDetails} The populated <code>AbsDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AbsDetails();

            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('cdr')) {
                obj['cdr'] = ApiClient.convertToType(data['cdr'], 'String');
            }
            if (data.hasOwnProperty('cpr')) {
                obj['cpr'] = ApiClient.convertToType(data['cpr'], 'Number');
            }
            if (data.hasOwnProperty('factor')) {
                obj['factor'] = ApiClient.convertToType(data['factor'], 'Number');
            }
            if (data.hasOwnProperty('estimatedFactor')) {
                obj['estimatedFactor'] = ApiClient.convertToType(data['estimatedFactor'], 'Number');
            }
            if (data.hasOwnProperty('bidPricePreFactor')) {
                obj['bidPricePreFactor'] = ApiClient.convertToType(data['bidPricePreFactor'], 'Number');
            }
            if (data.hasOwnProperty('midPricePreFactor')) {
                obj['midPricePreFactor'] = ApiClient.convertToType(data['midPricePreFactor'], 'Number');
            }
            if (data.hasOwnProperty('askPricePreFactor')) {
                obj['askPricePreFactor'] = ApiClient.convertToType(data['askPricePreFactor'], 'Number');
            }
            if (data.hasOwnProperty('CPREstimatePreFactor')) {
                obj['CPREstimatePreFactor'] = ApiClient.convertToType(data['CPREstimatePreFactor'], 'Number');
            }
            if (data.hasOwnProperty('liquidity')) {
                obj['liquidity'] = ApiClient.convertToType(data['liquidity'], 'Number');
            }
            if (data.hasOwnProperty('payUp')) {
                obj['payUp'] = ApiClient.convertToType(data['payUp'], 'Number');
            }
            if (data.hasOwnProperty('payUpDescription')) {
                obj['payUpDescription'] = ApiClient.convertToType(data['payUpDescription'], 'String');
            }
            if (data.hasOwnProperty('prePayRate')) {
                obj['prePayRate'] = ApiClient.convertToType(data['prePayRate'], 'Number');
            }
            if (data.hasOwnProperty('prePayType')) {
                obj['prePayType'] = ApiClient.convertToType(data['prePayType'], 'String');
            }
            if (data.hasOwnProperty('severity')) {
                obj['severity'] = ApiClient.convertToType(data['severity'], 'Number');
            }
            if (data.hasOwnProperty('wal')) {
                obj['wal'] = ApiClient.convertToType(data['wal'], 'Number');
            }
            if (data.hasOwnProperty('WALPrincipal')) {
                obj['WALPrincipal'] = ApiClient.convertToType(data['WALPrincipal'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
AbsDetails.prototype['requestId'] = undefined;

/**
 * FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
 * @member {String} fsymId
 */
AbsDetails.prototype['fsymId'] = undefined;

/**
 * The date on which the price is calculated.
 * @member {Date} date
 */
AbsDetails.prototype['date'] = undefined;

/**
 * A vector of conditional default rate assumption used in the evaluated price of the instrument. CDR represents the percentage of outstanding principal balances in the pool that are in default.
 * @member {String} cdr
 */
AbsDetails.prototype['cdr'] = undefined;

/**
 * Returns the flat CPR that would equate to the same weighted average life (WAL) projection for Agency CMOs as the base case CPR vector
 * @member {Number} cpr
 */
AbsDetails.prototype['cpr'] = undefined;

/**
 * The representation of the amount of the principal of an amortizing bond that has been paid out or written down since issuance, expressed as a percentage of the original total principal
 * @member {Number} factor
 */
AbsDetails.prototype['factor'] = undefined;

/**
 * The projected agency pool factor between factor date and the day the actual factor is reported to investors (only applicable for agency passthrough securities).
 * @member {Number} estimatedFactor
 */
AbsDetails.prototype['estimatedFactor'] = undefined;

/**
 * Returns the agency pool bid price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.
 * @member {Number} bidPricePreFactor
 */
AbsDetails.prototype['bidPricePreFactor'] = undefined;

/**
 * Returns the agency pool mid price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.
 * @member {Number} midPricePreFactor
 */
AbsDetails.prototype['midPricePreFactor'] = undefined;

/**
 * Returns the agency pool ask price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.
 * @member {Number} askPricePreFactor
 */
AbsDetails.prototype['askPricePreFactor'] = undefined;

/**
 * Returns the agency pool CPR estimate that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.
 * @member {Number} CPREstimatePreFactor
 */
AbsDetails.prototype['CPREstimatePreFactor'] = undefined;

/**
 * Returns the market liquidity score.
 * @member {Number} liquidity
 */
AbsDetails.prototype['liquidity'] = undefined;

/**
 * Returns the number of ticks, in 32nds format, above the TBA price.
 * @member {Number} payUp
 */
AbsDetails.prototype['payUp'] = undefined;

/**
 * Returns the specified pool characteristics being used to drive the pay-up.
 * @member {String} payUpDescription
 */
AbsDetails.prototype['payUpDescription'] = undefined;

/**
 * 'Returns a vector of values of speed used in the evaluated price of the instrument. It is the estimated rate at which borrowers pays off the obligations that underlies an instrument.
 * @member {Number} prePayRate
 */
AbsDetails.prototype['prePayRate'] = undefined;

/**
 * Returns the type of prepayment speed used in the evaluated price of the instrument.
 * @member {String} prePayType
 */
AbsDetails.prototype['prePayType'] = undefined;

/**
 * Returns a vector of Loss Severity assumption used in evaluated price of the instrument. It is the percentage of the principal applied to the defaulted loan balance.
 * @member {Number} severity
 */
AbsDetails.prototype['severity'] = undefined;

/**
 * Returns the Weighted Average Life of the instrument.
 * @member {Number} wal
 */
AbsDetails.prototype['wal'] = undefined;

/**
 * Returns the Weighted Average Life of the instrument.
 * @member {Number} WALPrincipal
 */
AbsDetails.prototype['WALPrincipal'] = undefined;






export default AbsDetails;

