/**
 * ID Lookup API
 * The Factset Identifier Lookup API provides the ability to search for various identifier types based on keyword. The API returns tickers, entity names and other identifiers that Factset supports. In addition, the API offers filters that allows users to refine the results. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The IncludeExcludeObject model module.
 * @module model/IncludeExcludeObject
 */
class IncludeExcludeObject {
    /**
     * Constructs a new <code>IncludeExcludeObject</code>.
     * Filters securities based on asset classes and other fields depending on the asset classes. 
     * @alias module:model/IncludeExcludeObject
     */
    constructor() { 
        
        IncludeExcludeObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>IncludeExcludeObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IncludeExcludeObject} obj Optional instance to populate.
     * @return {module:model/IncludeExcludeObject} The populated <code>IncludeExcludeObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IncludeExcludeObject();

            if (data.hasOwnProperty('field')) {
                obj['field'] = ApiClient.convertToType(data['field'], 'String');
            }
            if (data.hasOwnProperty('entity')) {
                obj['entity'] = ApiClient.convertToType(data['entity'], 'String');
            }
            if (data.hasOwnProperty('values')) {
                obj['values'] = ApiClient.convertToType(data['values'], [Object]);
            }
        }
        return obj;
    }


}

/**
 * String containing the field name to filter on. Each asset class has its own set of field (i.e. “equity_type”, “is_primary”, “region”,etc) 
 * @member {String} field
 */
IncludeExcludeObject.prototype['field'] = undefined;

/**
 * String containing the asset class for the filter to be applied on. If not included or left empty, it will apply the filter against all asset classes 
 * @member {String} entity
 */
IncludeExcludeObject.prototype['entity'] = undefined;

/**
 * Values you wish to filter on, as a comma-separated list. The values within this list are tied by an OR operation. 
 * @member {Array.<Object>} values
 */
IncludeExcludeObject.prototype['values'] = undefined;






export default IncludeExcludeObject;

