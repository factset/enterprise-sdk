/**
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import LocationResource from './LocationResource';

/**
 * The LocationResourceList model module.
 * @module model/LocationResourceList
 */
class LocationResourceList {
    /**
     * Constructs a new <code>LocationResourceList</code>.
     * @alias module:model/LocationResourceList
     */
    constructor() { 
        
        LocationResourceList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>LocationResourceList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LocationResourceList} obj Optional instance to populate.
     * @return {module:model/LocationResourceList} The populated <code>LocationResourceList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LocationResourceList();

            if (data.hasOwnProperty('schemas')) {
                obj['schemas'] = ApiClient.convertToType(data['schemas'], ['String']);
            }
            if (data.hasOwnProperty('totalResults')) {
                obj['totalResults'] = ApiClient.convertToType(data['totalResults'], 'Number');
            }
            if (data.hasOwnProperty('Resources')) {
                obj['Resources'] = ApiClient.convertToType(data['Resources'], [LocationResource]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} schemas
 */
LocationResourceList.prototype['schemas'] = undefined;

/**
 * @member {Number} totalResults
 */
LocationResourceList.prototype['totalResults'] = undefined;

/**
 * @member {Array.<module:model/LocationResource>} Resources
 */
LocationResourceList.prototype['Resources'] = undefined;






export default LocationResourceList;

