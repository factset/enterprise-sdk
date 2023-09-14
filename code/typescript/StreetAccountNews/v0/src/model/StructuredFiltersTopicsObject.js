/**
 * StreetAccount API
 * Collection of endpoints for retrieving StreetAccount headlines and filters
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import StructuredFiltersChildrenObject from './StructuredFiltersChildrenObject';

/**
 * The StructuredFiltersTopicsObject model module.
 * @module model/StructuredFiltersTopicsObject
 */
class StructuredFiltersTopicsObject {
    /**
     * Constructs a new <code>StructuredFiltersTopicsObject</code>.
     * @alias module:model/StructuredFiltersTopicsObject
     */
    constructor() { 
        
        StructuredFiltersTopicsObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StructuredFiltersTopicsObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StructuredFiltersTopicsObject} obj Optional instance to populate.
     * @return {module:model/StructuredFiltersTopicsObject} The populated <code>StructuredFiltersTopicsObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StructuredFiltersTopicsObject();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], ['String']);
            }
            if (data.hasOwnProperty('children')) {
                obj['children'] = ApiClient.convertToType(data['children'], [StructuredFiltersChildrenObject]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
StructuredFiltersTopicsObject.prototype['name'] = undefined;

/**
 * @member {Array.<String>} value
 */
StructuredFiltersTopicsObject.prototype['value'] = undefined;

/**
 * @member {Array.<module:model/StructuredFiltersChildrenObject>} children
 */
StructuredFiltersTopicsObject.prototype['children'] = undefined;






export default StructuredFiltersTopicsObject;
