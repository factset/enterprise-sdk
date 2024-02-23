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
import EMSChildOrder from './EMSChildOrder';

/**
 * The EMSChildOrders model module.
 * @module model/EMSChildOrders
 */
class EMSChildOrders {
    /**
     * Constructs a new <code>EMSChildOrders</code>.
     * @alias module:model/EMSChildOrders
     * @param childOrders {Array.<module:model/EMSChildOrder>} 
     */
    constructor(childOrders) { 
        
        EMSChildOrders.initialize(this, childOrders);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, childOrders) { 
        obj['childOrders'] = childOrders;
    }

    /**
     * Constructs a <code>EMSChildOrders</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EMSChildOrders} obj Optional instance to populate.
     * @return {module:model/EMSChildOrders} The populated <code>EMSChildOrders</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EMSChildOrders();

            if (data.hasOwnProperty('childOrders')) {
                obj['childOrders'] = ApiClient.convertToType(data['childOrders'], [EMSChildOrder]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/EMSChildOrder>} childOrders
 */
EMSChildOrders.prototype['childOrders'] = undefined;






export default EMSChildOrders;
