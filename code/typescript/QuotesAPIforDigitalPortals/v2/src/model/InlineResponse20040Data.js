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
import InlineResponse20039DataType from './InlineResponse20039DataType';

/**
 * The InlineResponse20040Data model module.
 * @module model/InlineResponse20040Data
 */
class InlineResponse20040Data {
    /**
     * Constructs a new <code>InlineResponse20040Data</code>.
     * @alias module:model/InlineResponse20040Data
     */
    constructor() { 
        
        InlineResponse20040Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20040Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20040Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20040Data} The populated <code>InlineResponse20040Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20040Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = InlineResponse20039DataType.constructFromObject(data['type']);
            }
            if (data.hasOwnProperty('numberOfLevels')) {
                obj['numberOfLevels'] = ApiClient.convertToType(data['numberOfLevels'], 'Number');
            }
            if (data.hasOwnProperty('firstLevelWithLeafCategories')) {
                obj['firstLevelWithLeafCategories'] = ApiClient.convertToType(data['firstLevelWithLeafCategories'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the category system.
 * @member {Number} id
 */
InlineResponse20040Data.prototype['id'] = undefined;

/**
 * Name of the category system.
 * @member {String} name
 */
InlineResponse20040Data.prototype['name'] = undefined;

/**
 * @member {module:model/InlineResponse20039DataType} type
 */
InlineResponse20040Data.prototype['type'] = undefined;

/**
 * Number of levels of the category system.
 * @member {Number} numberOfLevels
 */
InlineResponse20040Data.prototype['numberOfLevels'] = undefined;

/**
 * Number of the least detailed level of the category system that has leaf categories.
 * @member {Number} firstLevelWithLeafCategories
 */
InlineResponse20040Data.prototype['firstLevelWithLeafCategories'] = undefined;






export default InlineResponse20040Data;

