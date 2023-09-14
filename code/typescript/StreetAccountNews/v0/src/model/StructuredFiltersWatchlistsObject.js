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

/**
 * The StructuredFiltersWatchlistsObject model module.
 * @module model/StructuredFiltersWatchlistsObject
 */
class StructuredFiltersWatchlistsObject {
    /**
     * Constructs a new <code>StructuredFiltersWatchlistsObject</code>.
     * @alias module:model/StructuredFiltersWatchlistsObject
     */
    constructor() { 
        
        StructuredFiltersWatchlistsObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StructuredFiltersWatchlistsObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StructuredFiltersWatchlistsObject} obj Optional instance to populate.
     * @return {module:model/StructuredFiltersWatchlistsObject} The populated <code>StructuredFiltersWatchlistsObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StructuredFiltersWatchlistsObject();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
StructuredFiltersWatchlistsObject.prototype['name'] = undefined;

/**
 * @member {String} type
 */
StructuredFiltersWatchlistsObject.prototype['type'] = undefined;

/**
 * @member {String} value
 */
StructuredFiltersWatchlistsObject.prototype['value'] = undefined;






export default StructuredFiltersWatchlistsObject;
