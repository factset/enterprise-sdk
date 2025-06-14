/**
 * Trading API
 * Allow clients to trade orders.
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
import CancelChildOrders from './CancelChildOrders';

/**
 * The CancelChildOrdersRoot model module.
 * @module model/CancelChildOrdersRoot
 */
class CancelChildOrdersRoot {
    /**
     * Constructs a new <code>CancelChildOrdersRoot</code>.
     * @alias module:model/CancelChildOrdersRoot
     */
    constructor() { 
        
        CancelChildOrdersRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CancelChildOrdersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CancelChildOrdersRoot} obj Optional instance to populate.
     * @return {module:model/CancelChildOrdersRoot} The populated <code>CancelChildOrdersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CancelChildOrdersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = CancelChildOrders.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CancelChildOrders} data
 */
CancelChildOrdersRoot.prototype['data'] = undefined;






export default CancelChildOrdersRoot;

