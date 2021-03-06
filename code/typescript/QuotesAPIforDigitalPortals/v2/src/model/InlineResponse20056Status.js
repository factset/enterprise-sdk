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
 * The InlineResponse20056Status model module.
 * @module model/InlineResponse20056Status
 */
class InlineResponse20056Status {
    /**
     * Constructs a new <code>InlineResponse20056Status</code>.
     * Error status for the requested identifier
     * @alias module:model/InlineResponse20056Status
     */
    constructor() { 
        
        InlineResponse20056Status.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20056Status</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20056Status} obj Optional instance to populate.
     * @return {module:model/InlineResponse20056Status} The populated <code>InlineResponse20056Status</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20056Status();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = ApiClient.convertToType(data['identifier'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Code of the error condition.
 * @member {module:model/InlineResponse20056Status.CodeEnum} code
 */
InlineResponse20056Status.prototype['code'] = undefined;

/**
 * Provided identifier.
 * @member {String} identifier
 */
InlineResponse20056Status.prototype['identifier'] = undefined;





/**
 * Allowed values for the <code>code</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20056Status['CodeEnum'] = {

    /**
     * value: "none"
     * @const
     */
    "none": "none",

    /**
     * value: "parameter"
     * @const
     */
    "parameter": "parameter",

    /**
     * value: "entitlement"
     * @const
     */
    "entitlement": "entitlement"
};



export default InlineResponse20056Status;

