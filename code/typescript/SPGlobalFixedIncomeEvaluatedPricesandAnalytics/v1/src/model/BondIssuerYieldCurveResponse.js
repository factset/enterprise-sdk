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
import BondIssuerYieldCurve from './BondIssuerYieldCurve';

/**
 * The BondIssuerYieldCurveResponse model module.
 * @module model/BondIssuerYieldCurveResponse
 */
class BondIssuerYieldCurveResponse {
    /**
     * Constructs a new <code>BondIssuerYieldCurveResponse</code>.
     * Array of Bond Issuer Yield Curve Response Objects
     * @alias module:model/BondIssuerYieldCurveResponse
     */
    constructor() { 
        
        BondIssuerYieldCurveResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BondIssuerYieldCurveResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BondIssuerYieldCurveResponse} obj Optional instance to populate.
     * @return {module:model/BondIssuerYieldCurveResponse} The populated <code>BondIssuerYieldCurveResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BondIssuerYieldCurveResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [BondIssuerYieldCurve]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/BondIssuerYieldCurve>} data
 */
BondIssuerYieldCurveResponse.prototype['data'] = undefined;






export default BondIssuerYieldCurveResponse;

