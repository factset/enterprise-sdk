/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The InlineResponse20083DataAsks model module.
 * @module model/InlineResponse20083DataAsks
 */
class InlineResponse20083DataAsks {
    /**
     * Constructs a new <code>InlineResponse20083DataAsks</code>.
     * @alias module:model/InlineResponse20083DataAsks
     */
    constructor() { 
        
        InlineResponse20083DataAsks.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20083DataAsks</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20083DataAsks} obj Optional instance to populate.
     * @return {module:model/InlineResponse20083DataAsks} The populated <code>InlineResponse20083DataAsks</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20083DataAsks();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('numberOrders')) {
                obj['numberOrders'] = ApiClient.convertToType(data['numberOrders'], 'Number');
            }
            if (data.hasOwnProperty('volume')) {
                obj['volume'] = ApiClient.convertToType(data['volume'], 'Number');
            }
            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Order type.
 * @member {Number} type
 */
InlineResponse20083DataAsks.prototype['type'] = undefined;

/**
 * Price value. The value is 0 if the attribute `type` is 1 (market order). See attribute `valueUnit` in endpoint `/prices/get` for the unit of the price value\".
 * @member {Number} price
 */
InlineResponse20083DataAsks.prototype['price'] = undefined;

/**
 * Number of orders for the price level.
 * @member {Number} numberOrders
 */
InlineResponse20083DataAsks.prototype['numberOrders'] = undefined;

/**
 * Summarized volume for the price level.
 * @member {Number} volume
 */
InlineResponse20083DataAsks.prototype['volume'] = undefined;

/**
 * Date and time of the latest change.
 * @member {String} time
 */
InlineResponse20083DataAsks.prototype['time'] = undefined;






export default InlineResponse20083DataAsks;

