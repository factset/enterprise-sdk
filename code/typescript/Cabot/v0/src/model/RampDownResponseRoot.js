/**
 * Cabot Models API
 * Cabot Models API
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import RampDownResponseOptions from './RampDownResponseOptions';

/**
 * The RampDownResponseRoot model module.
 * @module model/RampDownResponseRoot
 */
class RampDownResponseRoot {
    /**
     * Constructs a new <code>RampDownResponseRoot</code>.
     * @alias module:model/RampDownResponseRoot
     */
    constructor() { 
        
        RampDownResponseRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RampDownResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RampDownResponseRoot} obj Optional instance to populate.
     * @return {module:model/RampDownResponseRoot} The populated <code>RampDownResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RampDownResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = RampDownResponseOptions.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/RampDownResponseOptions} data
 */
RampDownResponseRoot.prototype['data'] = undefined;






export default RampDownResponseRoot;

