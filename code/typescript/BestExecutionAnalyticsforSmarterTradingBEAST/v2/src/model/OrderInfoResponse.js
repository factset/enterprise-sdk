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
import Order from './Order';

/**
 * The OrderInfoResponse model module.
 * @module model/OrderInfoResponse
 */
class OrderInfoResponse {
    /**
     * Constructs a new <code>OrderInfoResponse</code>.
     * The Order Info Response object
     * @alias module:model/OrderInfoResponse
     */
    constructor() { 
        
        OrderInfoResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrderInfoResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrderInfoResponse} obj Optional instance to populate.
     * @return {module:model/OrderInfoResponse} The populated <code>OrderInfoResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrderInfoResponse();

            if (data.hasOwnProperty('order')) {
                obj['order'] = Order.constructFromObject(data['order']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Order} order
 */
OrderInfoResponse.prototype['order'] = undefined;






export default OrderInfoResponse;

