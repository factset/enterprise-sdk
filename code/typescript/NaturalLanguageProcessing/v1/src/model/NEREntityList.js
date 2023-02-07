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
import NEREntity from './NEREntity';

/**
 * The NEREntityList model module.
 * @module model/NEREntityList
 */
class NEREntityList {
    /**
     * Constructs a new <code>NEREntityList</code>.
     * @alias module:model/NEREntityList
     */
    constructor() { 
        
        NEREntityList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NEREntityList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NEREntityList} obj Optional instance to populate.
     * @return {module:model/NEREntityList} The populated <code>NEREntityList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NEREntityList();

            if (data.hasOwnProperty('entities')) {
                obj['entities'] = ApiClient.convertToType(data['entities'], [NEREntity]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/NEREntity>} entities
 */
NEREntityList.prototype['entities'] = undefined;






export default NEREntityList;

