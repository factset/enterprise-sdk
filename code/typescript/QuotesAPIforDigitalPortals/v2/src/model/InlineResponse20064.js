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
import InlineResponse20064Data from './InlineResponse20064Data';
import InlineResponse200Meta from './InlineResponse200Meta';

/**
 * The InlineResponse20064 model module.
 * @module model/InlineResponse20064
 */
class InlineResponse20064 {
    /**
     * Constructs a new <code>InlineResponse20064</code>.
     * @alias module:model/InlineResponse20064
     */
    constructor() { 
        
        InlineResponse20064.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20064</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20064} obj Optional instance to populate.
     * @return {module:model/InlineResponse20064} The populated <code>InlineResponse20064</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20064();

            if (data.hasOwnProperty('data')) {
                obj['data'] = InlineResponse20064Data.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = InlineResponse200Meta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20064Data} data
 */
InlineResponse20064.prototype['data'] = undefined;

/**
 * @member {module:model/InlineResponse200Meta} meta
 */
InlineResponse20064.prototype['meta'] = undefined;






export default InlineResponse20064;

