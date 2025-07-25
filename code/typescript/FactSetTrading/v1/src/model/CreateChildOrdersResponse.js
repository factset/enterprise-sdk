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
import CreateChildOrderInfo from './CreateChildOrderInfo';
import CreateChildOrderRejectInfo from './CreateChildOrderRejectInfo';

/**
 * The CreateChildOrdersResponse model module.
 * @module model/CreateChildOrdersResponse
 */
class CreateChildOrdersResponse {
    /**
     * Constructs a new <code>CreateChildOrdersResponse</code>.
     * @alias module:model/CreateChildOrdersResponse
     */
    constructor() { 
        
        CreateChildOrdersResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateChildOrdersResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateChildOrdersResponse} obj Optional instance to populate.
     * @return {module:model/CreateChildOrdersResponse} The populated <code>CreateChildOrdersResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateChildOrdersResponse();

            if (data.hasOwnProperty('accepted')) {
                obj['accepted'] = ApiClient.convertToType(data['accepted'], {'String': CreateChildOrderInfo});
            }
            if (data.hasOwnProperty('rejected')) {
                obj['rejected'] = ApiClient.convertToType(data['rejected'], {'String': CreateChildOrderRejectInfo});
            }
        }
        return obj;
    }


}

/**
 * Accepted Orders. Key is the clientOrderId of the request.
 * @member {Object.<String, module:model/CreateChildOrderInfo>} accepted
 */
CreateChildOrdersResponse.prototype['accepted'] = undefined;

/**
 * Rejected Orders. Key is the clientOrderId of the request.
 * @member {Object.<String, module:model/CreateChildOrderRejectInfo>} rejected
 */
CreateChildOrdersResponse.prototype['rejected'] = undefined;






export default CreateChildOrdersResponse;

