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
import InlineResponse20027Data from './InlineResponse20027Data';
import InlineResponse200Meta from './InlineResponse200Meta';

/**
 * The InlineResponse20027 model module.
 * @module model/InlineResponse20027
 */
class InlineResponse20027 {
    /**
     * Constructs a new <code>InlineResponse20027</code>.
     * @alias module:model/InlineResponse20027
     */
    constructor() { 
        
        InlineResponse20027.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20027</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20027} obj Optional instance to populate.
     * @return {module:model/InlineResponse20027} The populated <code>InlineResponse20027</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20027();

            if (data.hasOwnProperty('data')) {
                obj['data'] = InlineResponse20027Data.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InlineResponse200Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20027Data} data
 */
InlineResponse20027.prototype['data'] = undefined;

/**
 * @member {module:model/InlineResponse200Meta} meta
 */
InlineResponse20027.prototype['meta'] = undefined;






export default InlineResponse20027;

