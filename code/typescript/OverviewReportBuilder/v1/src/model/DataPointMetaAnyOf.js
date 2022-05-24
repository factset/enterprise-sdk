/**
 * FactSet Overview Report Builder API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
 * The DataPointMetaAnyOf model module.
 * @module model/DataPointMetaAnyOf
 * @version 0.20.0
 */
class DataPointMetaAnyOf {
    /**
     * Constructs a new <code>DataPointMetaAnyOf</code>.
     * @alias module:model/DataPointMetaAnyOf
     */
    constructor() { 
        
        DataPointMetaAnyOf.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DataPointMetaAnyOf</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DataPointMetaAnyOf} obj Optional instance to populate.
     * @return {module:model/DataPointMetaAnyOf} The populated <code>DataPointMetaAnyOf</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DataPointMetaAnyOf();

            if (data.hasOwnProperty('currencyCode')) {
                obj['currencyCode'] = ApiClient.convertToType(data['currencyCode'], 'String');
            }
            if (data.hasOwnProperty('currencySymbol')) {
                obj['currencySymbol'] = ApiClient.convertToType(data['currencySymbol'], 'String');
            }
            if (data.hasOwnProperty('scale')) {
                obj['scale'] = ApiClient.convertToType(data['scale'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Code for data currency
 * @member {String} currencyCode
 */
DataPointMetaAnyOf.prototype['currencyCode'] = undefined;

/**
 * Symbol for data currency
 * @member {String} currencySymbol
 */
DataPointMetaAnyOf.prototype['currencySymbol'] = undefined;

/**
 * Integer power of 10 to which numbers have been scaled. For example: 6 implies millions. Default is 0. 
 * @member {Number} scale
 */
DataPointMetaAnyOf.prototype['scale'] = undefined;






export default DataPointMetaAnyOf;
