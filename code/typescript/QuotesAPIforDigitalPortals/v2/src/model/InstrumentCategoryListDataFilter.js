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
import InstrumentCategoryListDataFilterDataset from './InstrumentCategoryListDataFilterDataset';

/**
 * The InstrumentCategoryListDataFilter model module.
 * @module model/InstrumentCategoryListDataFilter
 */
class InstrumentCategoryListDataFilter {
    /**
     * Constructs a new <code>InstrumentCategoryListDataFilter</code>.
     * Criteria that filter the items in the response list; only items that match all of the criteria are returned.
     * @alias module:model/InstrumentCategoryListDataFilter
     */
    constructor() { 
        
        InstrumentCategoryListDataFilter.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InstrumentCategoryListDataFilter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InstrumentCategoryListDataFilter} obj Optional instance to populate.
     * @return {module:model/InstrumentCategoryListDataFilter} The populated <code>InstrumentCategoryListDataFilter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InstrumentCategoryListDataFilter();

            if (data.hasOwnProperty('dataset')) {
                obj['dataset'] = InstrumentCategoryListDataFilterDataset.constructFromObject(data['dataset']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InstrumentCategoryListDataFilterDataset} dataset
 */
InstrumentCategoryListDataFilter.prototype['dataset'] = undefined;






export default InstrumentCategoryListDataFilter;

