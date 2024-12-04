/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import BuyContextModelAnalytics from './BuyContextModelAnalytics';

/**
 * The BuyContextResponseOptions model module.
 * @module model/BuyContextResponseOptions
 */
class BuyContextResponseOptions {
    /**
     * Constructs a new <code>BuyContextResponseOptions</code>.
     * @alias module:model/BuyContextResponseOptions
     */
    constructor() { 
        
        BuyContextResponseOptions.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BuyContextResponseOptions</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BuyContextResponseOptions} obj Optional instance to populate.
     * @return {module:model/BuyContextResponseOptions} The populated <code>BuyContextResponseOptions</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BuyContextResponseOptions();

            if (data.hasOwnProperty('buyContextValues')) {
                obj['buyContextValues'] = BuyContextModelAnalytics.constructFromObject(data['buyContextValues']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/BuyContextModelAnalytics} buyContextValues
 */
BuyContextResponseOptions.prototype['buyContextValues'] = undefined;






export default BuyContextResponseOptions;

