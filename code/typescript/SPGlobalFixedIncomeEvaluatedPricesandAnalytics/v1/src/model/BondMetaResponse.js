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
import BondMeta from './BondMeta';

/**
 * The BondMetaResponse model module.
 * @module model/BondMetaResponse
 */
class BondMetaResponse {
    /**
     * Constructs a new <code>BondMetaResponse</code>.
     * Array of Bond Meta Response Objects
     * @alias module:model/BondMetaResponse
     */
    constructor() { 
        
        BondMetaResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BondMetaResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BondMetaResponse} obj Optional instance to populate.
     * @return {module:model/BondMetaResponse} The populated <code>BondMetaResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BondMetaResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [BondMeta]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/BondMeta>} data
 */
BondMetaResponse.prototype['data'] = undefined;






export default BondMetaResponse;

