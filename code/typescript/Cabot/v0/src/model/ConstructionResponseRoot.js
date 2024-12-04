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
import ConstructionResponseOptions from './ConstructionResponseOptions';

/**
 * The ConstructionResponseRoot model module.
 * @module model/ConstructionResponseRoot
 */
class ConstructionResponseRoot {
    /**
     * Constructs a new <code>ConstructionResponseRoot</code>.
     * @alias module:model/ConstructionResponseRoot
     */
    constructor() { 
        
        ConstructionResponseRoot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ConstructionResponseRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConstructionResponseRoot} obj Optional instance to populate.
     * @return {module:model/ConstructionResponseRoot} The populated <code>ConstructionResponseRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConstructionResponseRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ConstructionResponseOptions.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConstructionResponseOptions} data
 */
ConstructionResponseRoot.prototype['data'] = undefined;






export default ConstructionResponseRoot;

