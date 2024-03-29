/**
 * EMS API
 * Allow clients to trade orders.
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
import EMSChildOrders from './EMSChildOrders';

/**
 * The EMSChildOrdersRoot model module.
 * @module model/EMSChildOrdersRoot
 */
class EMSChildOrdersRoot {
    /**
     * Constructs a new <code>EMSChildOrdersRoot</code>.
     * @alias module:model/EMSChildOrdersRoot
     */
    constructor() { 
        
        EMSChildOrdersRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EMSChildOrdersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EMSChildOrdersRoot} obj Optional instance to populate.
     * @return {module:model/EMSChildOrdersRoot} The populated <code>EMSChildOrdersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EMSChildOrdersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = EMSChildOrders.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/EMSChildOrders} data
 */
EMSChildOrdersRoot.prototype['data'] = undefined;






export default EMSChildOrdersRoot;

