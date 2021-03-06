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
import InlineResponse20038DataCategories from './InlineResponse20038DataCategories';
import InlineResponse20047Dataset from './InlineResponse20047Dataset';

/**
 * The InlineResponse20047Data model module.
 * @module model/InlineResponse20047Data
 */
class InlineResponse20047Data {
    /**
     * Constructs a new <code>InlineResponse20047Data</code>.
     * @alias module:model/InlineResponse20047Data
     */
    constructor() { 
        
        InlineResponse20047Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20047Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20047Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20047Data} The populated <code>InlineResponse20047Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20047Data();

            if (data.hasOwnProperty('dataset')) {
                obj['dataset'] = InlineResponse20047Dataset.constructFromObject(data['dataset']);
            }
            if (data.hasOwnProperty('categories')) {
                obj['categories'] = ApiClient.convertToType(data['categories'], [InlineResponse20038DataCategories]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20047Dataset} dataset
 */
InlineResponse20047Data.prototype['dataset'] = undefined;

/**
 * List of categories covering the full path (without gaps) from the most coarse granularity to the most detailed.
 * @member {Array.<module:model/InlineResponse20038DataCategories>} categories
 */
InlineResponse20047Data.prototype['categories'] = undefined;






export default InlineResponse20047Data;

