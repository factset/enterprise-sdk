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
import InlineResponse20031DataSystem from './InlineResponse20031DataSystem';
import InlineResponse20033DataCategories from './InlineResponse20033DataCategories';
import InlineResponse20033DataParent from './InlineResponse20033DataParent';

/**
 * The InlineResponse20033Data model module.
 * @module model/InlineResponse20033Data
 */
class InlineResponse20033Data {
    /**
     * Constructs a new <code>InlineResponse20033Data</code>.
     * List of the categories.
     * @alias module:model/InlineResponse20033Data
     */
    constructor() { 
        
        InlineResponse20033Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20033Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20033Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20033Data} The populated <code>InlineResponse20033Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20033Data();

            if (data.hasOwnProperty('system')) {
                obj['system'] = InlineResponse20031DataSystem.constructFromObject(data['system']);
            }
            if (data.hasOwnProperty('parent')) {
                obj['parent'] = InlineResponse20033DataParent.constructFromObject(data['parent']);
            }
            if (data.hasOwnProperty('categories')) {
                obj['categories'] = ApiClient.convertToType(data['categories'], [InlineResponse20033DataCategories]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20031DataSystem} system
 */
InlineResponse20033Data.prototype['system'] = undefined;

/**
 * @member {module:model/InlineResponse20033DataParent} parent
 */
InlineResponse20033Data.prototype['parent'] = undefined;

/**
 * List of categories.
 * @member {Array.<module:model/InlineResponse20033DataCategories>} categories
 */
InlineResponse20033Data.prototype['categories'] = undefined;






export default InlineResponse20033Data;

