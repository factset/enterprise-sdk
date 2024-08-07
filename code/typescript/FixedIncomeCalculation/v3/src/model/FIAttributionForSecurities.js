/**
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FIAttributionForSecurities model module.
 * @module model/FIAttributionForSecurities
 */
class FIAttributionForSecurities {
    /**
     * Constructs a new <code>FIAttributionForSecurities</code>.
     * @alias module:model/FIAttributionForSecurities
     */
    constructor() { 
        
        FIAttributionForSecurities.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FIAttributionForSecurities</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FIAttributionForSecurities} obj Optional instance to populate.
     * @return {module:model/FIAttributionForSecurities} The populated <code>FIAttributionForSecurities</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FIAttributionForSecurities();

            if (data.hasOwnProperty('startPrice')) {
                obj['startPrice'] = ApiClient.convertToType(data['startPrice'], 'Number');
            }
            if (data.hasOwnProperty('endPrice')) {
                obj['endPrice'] = ApiClient.convertToType(data['endPrice'], 'Number');
            }
            if (data.hasOwnProperty('startSpread')) {
                obj['startSpread'] = ApiClient.convertToType(data['startSpread'], 'Number');
            }
            if (data.hasOwnProperty('endSpread')) {
                obj['endSpread'] = ApiClient.convertToType(data['endSpread'], 'Number');
            }
            if (data.hasOwnProperty('pricingMethod')) {
                obj['pricingMethod'] = ApiClient.convertToType(data['pricingMethod'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Start Price
 * @member {Number} startPrice
 */
FIAttributionForSecurities.prototype['startPrice'] = undefined;

/**
 * End Price
 * @member {Number} endPrice
 */
FIAttributionForSecurities.prototype['endPrice'] = undefined;

/**
 * Start Spread
 * @member {Number} startSpread
 */
FIAttributionForSecurities.prototype['startSpread'] = undefined;

/**
 * End Spread
 * @member {Number} endSpread
 */
FIAttributionForSecurities.prototype['endSpread'] = undefined;

/**
 * Pricing Method
 * @member {module:model/FIAttributionForSecurities.PricingMethodEnum} pricingMethod
 */
FIAttributionForSecurities.prototype['pricingMethod'] = undefined;





/**
 * Allowed values for the <code>pricingMethod</code> property.
 * @enum {String}
 * @readonly
 */
FIAttributionForSecurities['PricingMethodEnum'] = {

    /**
     * value: "Inputted Price"
     * @const
     */
    "Inputted Price": "Inputted Price",

    /**
     * value: "Pricing Matrix"
     * @const
     */
    "Pricing Matrix": "Pricing Matrix",

    /**
     * value: "Actual Spread"
     * @const
     */
    "Actual Spread": "Actual Spread",

    /**
     * value: "OAS"
     * @const
     */
    "OAS": "OAS"
};



export default FIAttributionForSecurities;

