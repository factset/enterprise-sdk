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

/**
 * The InlineResponse2003Sensitivities model module.
 * @module model/InlineResponse2003Sensitivities
 */
class InlineResponse2003Sensitivities {
    /**
     * Constructs a new <code>InlineResponse2003Sensitivities</code>.
     * Price sensitivities of the debt instrument with respect to the prevailing market interest rate.
     * @alias module:model/InlineResponse2003Sensitivities
     */
    constructor() { 
        
        InlineResponse2003Sensitivities.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2003Sensitivities</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2003Sensitivities} obj Optional instance to populate.
     * @return {module:model/InlineResponse2003Sensitivities} The populated <code>InlineResponse2003Sensitivities</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2003Sensitivities();

            if (data.hasOwnProperty('basePointValue')) {
                obj['basePointValue'] = ApiClient.convertToType(data['basePointValue'], 'Number');
            }
            if (data.hasOwnProperty('modifiedDuration')) {
                obj['modifiedDuration'] = ApiClient.convertToType(data['modifiedDuration'], 'Number');
            }
            if (data.hasOwnProperty('elasticity')) {
                obj['elasticity'] = ApiClient.convertToType(data['elasticity'], 'Number');
            }
            if (data.hasOwnProperty('convexity')) {
                obj['convexity'] = ApiClient.convertToType(data['convexity'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Base point value, which is the change of the debt instrument's price for a one base point change (nominally, not relatively) of the prevailing market interest rate. One base point is equivalent to 0.01 percent (1/100 of a percent). The unit of the base point value is the value unit of the notation (see attribute `valueUnit`), thus the values are not comparable if notations with different value units are among the results.
 * @member {Number} basePointValue
 */
InlineResponse2003Sensitivities.prototype['basePointValue'] = undefined;

/**
 * Modified duration, which is the percentage change of the debt instrument's price for a one percent change (nominally, not relatively) of the prevailing market interest rate.
 * @member {Number} modifiedDuration
 */
InlineResponse2003Sensitivities.prototype['modifiedDuration'] = undefined;

/**
 * Yield elasticity, which is the ratio of the percentage change of the debt instrument's price for a one percent change (relatively, not nominally) of the prevailing market interest rate.
 * @member {Number} elasticity
 */
InlineResponse2003Sensitivities.prototype['elasticity'] = undefined;

/**
 * Convexity, which is a measure for the change of the modified duration as the prevailing market interest rate changes.
 * @member {Number} convexity
 */
InlineResponse2003Sensitivities.prototype['convexity'] = undefined;






export default InlineResponse2003Sensitivities;

