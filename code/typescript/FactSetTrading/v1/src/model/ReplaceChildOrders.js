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
import ReplaceChildOrder from './ReplaceChildOrder';

/**
 * The ReplaceChildOrders model module.
 * @module model/ReplaceChildOrders
 */
class ReplaceChildOrders {
    /**
     * Constructs a new <code>ReplaceChildOrders</code>.
     * @alias module:model/ReplaceChildOrders
     * @param childOrders {Array.<module:model/ReplaceChildOrder>} 
     */
    constructor(childOrders) { 
        
        ReplaceChildOrders.initialize(this, childOrders);
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
     * Constructs a <code>ReplaceChildOrders</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReplaceChildOrders} obj Optional instance to populate.
     * @return {module:model/ReplaceChildOrders} The populated <code>ReplaceChildOrders</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReplaceChildOrders();

            if (data.hasOwnProperty('childOrders')) {
                obj['childOrders'] = ApiClient.convertToType(data['childOrders'], [ReplaceChildOrder]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/ReplaceChildOrder>} childOrders
 */
ReplaceChildOrders.prototype['childOrders'] = undefined;






export default ReplaceChildOrders;

