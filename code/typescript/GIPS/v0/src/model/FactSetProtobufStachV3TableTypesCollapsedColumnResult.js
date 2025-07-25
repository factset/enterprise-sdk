/**
 * GIPS API
 * Allow clients to use GIPS through APIs.
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The FactSetProtobufStachV3TableTypesCollapsedColumnResult model module.
 * @module model/FactSetProtobufStachV3TableTypesCollapsedColumnResult
 */
class FactSetProtobufStachV3TableTypesCollapsedColumnResult {
    /**
     * Constructs a new <code>FactSetProtobufStachV3TableTypesCollapsedColumnResult</code>.
     * @alias module:model/FactSetProtobufStachV3TableTypesCollapsedColumnResult
     */
    constructor() { 
        
        FactSetProtobufStachV3TableTypesCollapsedColumnResult.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FactSetProtobufStachV3TableTypesCollapsedColumnResult</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FactSetProtobufStachV3TableTypesCollapsedColumnResult} obj Optional instance to populate.
     * @return {module:model/FactSetProtobufStachV3TableTypesCollapsedColumnResult} The populated <code>FactSetProtobufStachV3TableTypesCollapsedColumnResult</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FactSetProtobufStachV3TableTypesCollapsedColumnResult();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('by')) {
                obj['by'] = ApiClient.convertToType(data['by'], ['String']);
            }
            if (data.hasOwnProperty('headers')) {
                obj['headers'] = ApiClient.convertToType(data['headers'], {'String': 'String'});
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
FactSetProtobufStachV3TableTypesCollapsedColumnResult.prototype['name'] = undefined;

/**
 * @member {Array.<String>} by
 */
FactSetProtobufStachV3TableTypesCollapsedColumnResult.prototype['by'] = undefined;

/**
 * @member {Object.<String, String>} headers
 */
FactSetProtobufStachV3TableTypesCollapsedColumnResult.prototype['headers'] = undefined;






export default FactSetProtobufStachV3TableTypesCollapsedColumnResult;

