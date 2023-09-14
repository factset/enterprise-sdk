/**
 * Natural Language Processing API
 * APIs that leverage Natural Language Processing to help extract meaningful data from unstructured text
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ThemesParameters from './ThemesParameters';

/**
 * The ThemesParametersRoot model module.
 * @module model/ThemesParametersRoot
 */
class ThemesParametersRoot {
    /**
     * Constructs a new <code>ThemesParametersRoot</code>.
     * Schema that envelopes the &#x60;ThemesParameters&#x60; and include additional &#x60;meta&#x60; (if available).
     * @alias module:model/ThemesParametersRoot
     * @param data {module:model/ThemesParameters} 
     */
    constructor(data) { 
        
        ThemesParametersRoot.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>ThemesParametersRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ThemesParametersRoot} obj Optional instance to populate.
     * @return {module:model/ThemesParametersRoot} The populated <code>ThemesParametersRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ThemesParametersRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ThemesParameters.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ThemesParameters} data
 */
ThemesParametersRoot.prototype['data'] = undefined;

/**
 * Any associated metadata
 * @member {Object} meta
 */
ThemesParametersRoot.prototype['meta'] = undefined;






export default ThemesParametersRoot;
