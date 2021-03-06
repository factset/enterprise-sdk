/**
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
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
 * The InlineResponse4042 model module.
 * @module model/InlineResponse4042
 * @version 0.9.0
 */
class InlineResponse4042 {
    /**
     * Constructs a new <code>InlineResponse4042</code>.
     * @alias module:model/InlineResponse4042
     */
    constructor() { 
        
        InlineResponse4042.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse4042</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse4042} obj Optional instance to populate.
     * @return {module:model/InlineResponse4042} The populated <code>InlineResponse4042</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse4042();

            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [Object]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<Object>} errors
 */
InlineResponse4042.prototype['errors'] = undefined;






export default InlineResponse4042;

