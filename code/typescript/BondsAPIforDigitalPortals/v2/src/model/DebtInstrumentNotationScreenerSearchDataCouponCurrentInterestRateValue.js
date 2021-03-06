/**
 * Bonds API For Digital Portals
 * Search for fixed income instruments, using a criteria-based screener. The API provides also fundamental data and key figures, basic interest rate information and derived coupon lists.  Available search criteria include:  * validation: filter for only active listings, by price quality and latest/previous available price dates * traded markets: filter and indicate a market priority for the validation * important dates in and features of the life cycle of the fixed income instruments * filter by issuer, its country of registration and the issued volume * coupon data: occurrence and frequency of coupon payments, current interest rate range * yield and yield to maturity range, spread * Macaulay duration * sensitivity ranges: base point value, modified duration, elasticity, convexity * cash flow for all transactions over a certain time range: sum or average * country-specific attributes: for Germany: is eligible for trustees        The key figures are calculated using delayed prices with an additional delay of 10 minutes after an update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum from './DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum';
import DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum from './DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum';

/**
 * The DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue model module.
 * @module model/DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue
 */
class DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue {
    /**
     * Constructs a new <code>DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue</code>.
     * Value range for the interest rate of the current coupon period; annualized if the payment frequency is not \&quot;annually\&quot;. Not available for debt instruments with a current interest rate type other than \&quot;fixed rate\&quot; (&#x60;id&#x3D;2&#x60;) or \&quot;step/reset\&quot; (&#x60;id&#x3D;5&#x60;).
     * @alias module:model/DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue
     */
    constructor() { 
        
        DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue} obj Optional instance to populate.
     * @return {module:model/DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue} The populated <code>DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue();

            if (data.hasOwnProperty('minimum')) {
                obj['minimum'] = DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum.constructFromObject(data['minimum']);
            }
            if (data.hasOwnProperty('maximum')) {
                obj['maximum'] = DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum.constructFromObject(data['maximum']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum} minimum
 */
DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue.prototype['minimum'] = undefined;

/**
 * @member {module:model/DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum} maximum
 */
DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue.prototype['maximum'] = undefined;






export default DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValue;

