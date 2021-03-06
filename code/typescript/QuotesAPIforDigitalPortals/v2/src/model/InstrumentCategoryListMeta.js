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
 * The InstrumentCategoryListMeta model module.
 * @module model/InstrumentCategoryListMeta
 */
class InstrumentCategoryListMeta {
    /**
     * Constructs a new <code>InstrumentCategoryListMeta</code>.
     * The meta member contains the meta information of the request.
     * @alias module:model/InstrumentCategoryListMeta
     */
    constructor() { 
        
        InstrumentCategoryListMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InstrumentCategoryListMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InstrumentCategoryListMeta} obj Optional instance to populate.
     * @return {module:model/InstrumentCategoryListMeta} The populated <code>InstrumentCategoryListMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InstrumentCategoryListMeta();

            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ApiClient.convertToType(data['attributes'], ['String']);
            }
            if (data.hasOwnProperty('language')) {
                obj['language'] = ApiClient.convertToType(data['language'], 'String');
            }
            if (data.hasOwnProperty('sort')) {
                obj['sort'] = ApiClient.convertToType(data['sort'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * Limit the attributes returned in the response to the specified set.
 * @member {Array.<String>} attributes
 */
InstrumentCategoryListMeta.prototype['attributes'] = undefined;

/**
 * ISO 639-1 code of the language.
 * @member {String} language
 */
InstrumentCategoryListMeta.prototype['language'] = undefined;

/**
 * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
 * @member {Array.<module:model/InstrumentCategoryListMeta.SortEnum>} sort
 */
InstrumentCategoryListMeta.prototype['sort'] = undefined;





/**
 * Allowed values for the <code>sort</code> property.
 * @enum {String}
 * @readonly
 */
InstrumentCategoryListMeta['SortEnum'] = {

    /**
     * value: "dataset.id"
     * @const
     */
    "dataset.id": "dataset.id",

    /**
     * value: "-dataset.id"
     * @const
     */
    "-dataset.id": "-dataset.id",

    /**
     * value: "dataset.name"
     * @const
     */
    "dataset.name": "dataset.name",

    /**
     * value: "-dataset.name"
     * @const
     */
    "-dataset.name": "-dataset.name"
};



export default InstrumentCategoryListMeta;

