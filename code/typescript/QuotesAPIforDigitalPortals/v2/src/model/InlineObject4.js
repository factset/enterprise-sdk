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
import BasicMicOperatingListData from './BasicMicOperatingListData';
import BasicMicOperatingListMeta from './BasicMicOperatingListMeta';

/**
 * The InlineObject4 model module.
 * @module model/InlineObject4
 */
class InlineObject4 {
    /**
     * Constructs a new <code>InlineObject4</code>.
     * @alias module:model/InlineObject4
     */
    constructor() { 
        
        InlineObject4.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineObject4</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject4} obj Optional instance to populate.
     * @return {module:model/InlineObject4} The populated <code>InlineObject4</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject4();

            if (data.hasOwnProperty('data')) {
                obj['data'] = BasicMicOperatingListData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = BasicMicOperatingListMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/BasicMicOperatingListData} data
 */
InlineObject4.prototype['data'] = undefined;

/**
 * @member {module:model/BasicMicOperatingListMeta} meta
 */
InlineObject4.prototype['meta'] = undefined;






export default InlineObject4;

