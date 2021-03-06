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
import BasicBackgroundTextTypeListMeta from './BasicBackgroundTextTypeListMeta';
import InstrumentCrossReferenceListByISINData from './InstrumentCrossReferenceListByISINData';

/**
 * The InlineObject13 model module.
 * @module model/InlineObject13
 */
class InlineObject13 {
    /**
     * Constructs a new <code>InlineObject13</code>.
     * @alias module:model/InlineObject13
     * @param data {module:model/InstrumentCrossReferenceListByISINData} 
     */
    constructor(data) { 
        
        InlineObject13.initialize(this, data);
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
     * Constructs a <code>InlineObject13</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineObject13} obj Optional instance to populate.
     * @return {module:model/InlineObject13} The populated <code>InlineObject13</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineObject13();

            if (data.hasOwnProperty('data')) {
                obj['data'] = InstrumentCrossReferenceListByISINData.constructFromObject(data['data']);
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = BasicBackgroundTextTypeListMeta.constructFromObject(data['meta']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InstrumentCrossReferenceListByISINData} data
 */
InlineObject13.prototype['data'] = undefined;

/**
 * @member {module:model/BasicBackgroundTextTypeListMeta} meta
 */
InlineObject13.prototype['meta'] = undefined;






export default InlineObject13;

