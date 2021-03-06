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

/**
 * The InstrumentCategoryListDataFilterDataset model module.
 * @module model/InstrumentCategoryListDataFilterDataset
 */
class InstrumentCategoryListDataFilterDataset {
    /**
     * Constructs a new <code>InstrumentCategoryListDataFilterDataset</code>.
     * Filter the categories to only return values assigned by a dataset. See endpoint &#x60;/category/dataset/list&#x60; for valid values.
     * @alias module:model/InstrumentCategoryListDataFilterDataset
     */
    constructor() { 
        
        InstrumentCategoryListDataFilterDataset.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InstrumentCategoryListDataFilterDataset</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InstrumentCategoryListDataFilterDataset} obj Optional instance to populate.
     * @return {module:model/InstrumentCategoryListDataFilterDataset} The populated <code>InstrumentCategoryListDataFilterDataset</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InstrumentCategoryListDataFilterDataset();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Identifier of a category dataset.
 * @member {Number} id
 */
InstrumentCategoryListDataFilterDataset.prototype['id'] = undefined;






export default InstrumentCategoryListDataFilterDataset;

