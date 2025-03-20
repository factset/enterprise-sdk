/**
 * Best Execution Analytics for Smarter Trading (BEAST) API
 * Enables clients to programmatically access the underlying data which powers the BEAST Liquidity Analytics (LA) and Transaction Cost Analysis (TCA) applications.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PriceTimeFill from './PriceTimeFill';

/**
 * The PriceTimeFillResponse model module.
 * @module model/PriceTimeFillResponse
 */
class PriceTimeFillResponse {
    /**
     * Constructs a new <code>PriceTimeFillResponse</code>.
     * The PriceTimeFill Response object
     * @alias module:model/PriceTimeFillResponse
     */
    constructor() { 
        
        PriceTimeFillResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PriceTimeFillResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PriceTimeFillResponse} obj Optional instance to populate.
     * @return {module:model/PriceTimeFillResponse} The populated <code>PriceTimeFillResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PriceTimeFillResponse();

            if (data.hasOwnProperty('priceTimeFills')) {
                obj['priceTimeFills'] = ApiClient.convertToType(data['priceTimeFills'], [PriceTimeFill]);
            }
        }
        return obj;
    }


}

/**
 * List of PriceTimeFill data
 * @member {Array.<module:model/PriceTimeFill>} priceTimeFills
 */
PriceTimeFillResponse.prototype['priceTimeFills'] = undefined;






export default PriceTimeFillResponse;

