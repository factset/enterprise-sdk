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

/**
 * The CancelInboundOrder model module.
 * @module model/CancelInboundOrder
 */
class CancelInboundOrder {
    /**
     * Constructs a new <code>CancelInboundOrder</code>.
     * Cancel Inbound Order
     * @alias module:model/CancelInboundOrder
     * @param originalClientOrderId {String} Unique identifier of the original order, generated in Create.
     */
    constructor(originalClientOrderId) { 
        
        CancelInboundOrder.initialize(this, originalClientOrderId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, originalClientOrderId) { 
        obj['originalClientOrderId'] = originalClientOrderId;
    }

    /**
     * Constructs a <code>CancelInboundOrder</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CancelInboundOrder} obj Optional instance to populate.
     * @return {module:model/CancelInboundOrder} The populated <code>CancelInboundOrder</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CancelInboundOrder();

            if (data.hasOwnProperty('originalClientOrderId')) {
                obj['originalClientOrderId'] = ApiClient.convertToType(data['originalClientOrderId'], 'String');
            }
            if (data.hasOwnProperty('inboundDestination')) {
                obj['inboundDestination'] = ApiClient.convertToType(data['inboundDestination'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Unique identifier of the original order, generated in Create.
 * @member {String} originalClientOrderId
 */
CancelInboundOrder.prototype['originalClientOrderId'] = undefined;

/**
 * To facilitate integration with translators that transform orders into a format compatible with the internal order routing and execution infrastructure.
 * @member {String} inboundDestination
 */
CancelInboundOrder.prototype['inboundDestination'] = undefined;






export default CancelInboundOrder;

