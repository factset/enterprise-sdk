/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import BuyContextResponseOptions from './BuyContextResponseOptions';

/**
 * The BuyContextResponseRoot model module.
 * @module model/BuyContextResponseRoot
 */
class BuyContextResponseRoot {
    /**
     * Constructs a new <code>BuyContextResponseRoot</code>.
     * @alias module:model/BuyContextResponseRoot
     */
    constructor() { 
        
        BuyContextResponseRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BuyContextResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BuyContextResponseRoot} obj Optional instance to populate.
     * @return {module:model/BuyContextResponseRoot} The populated <code>BuyContextResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BuyContextResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = BuyContextResponseOptions.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/BuyContextResponseOptions} data
 */
BuyContextResponseRoot.prototype['data'] = undefined;






export default BuyContextResponseRoot;

