/**
 * News API
 *  The FactSet News API provides access to FactSet’s news alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to create views and pull news headlines based on specific filters. There are the filters available for News:  * Watchlists/Indices/Tickers * Sources * Company Filters * Market Topics * Countries * Regions      
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The StructuredFiltersCountriesObject model module.
 * @module model/StructuredFiltersCountriesObject
 */
class StructuredFiltersCountriesObject {
    /**
     * Constructs a new <code>StructuredFiltersCountriesObject</code>.
     * @alias module:model/StructuredFiltersCountriesObject
     * @param name {String} The name of the country.
     * @param value {Array.<String>} The values associated with the country.
     */
    constructor(name, value) { 
        
        StructuredFiltersCountriesObject.initialize(this, name, value);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, value) { 
        obj['name'] = name;
        obj['value'] = value;
    }

    /**
     * Constructs a <code>StructuredFiltersCountriesObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StructuredFiltersCountriesObject} obj Optional instance to populate.
     * @return {module:model/StructuredFiltersCountriesObject} The populated <code>StructuredFiltersCountriesObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StructuredFiltersCountriesObject();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * The name of the country.
 * @member {String} name
 */
StructuredFiltersCountriesObject.prototype['name'] = undefined;

/**
 * The values associated with the country.
 * @member {Array.<String>} value
 */
StructuredFiltersCountriesObject.prototype['value'] = undefined;






export default StructuredFiltersCountriesObject;

