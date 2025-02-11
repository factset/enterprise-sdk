/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import StructuredFiltersChildrenObjectSectors from './StructuredFiltersChildrenObjectSectors';

/**
 * The StructuredFiltersSectorsObject model module.
 * @module model/StructuredFiltersSectorsObject
 */
class StructuredFiltersSectorsObject {
    /**
     * Constructs a new <code>StructuredFiltersSectorsObject</code>.
     * Elements of structured filters sectors object.
     * @alias module:model/StructuredFiltersSectorsObject
     */
    constructor() { 
        
        StructuredFiltersSectorsObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StructuredFiltersSectorsObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StructuredFiltersSectorsObject} obj Optional instance to populate.
     * @return {module:model/StructuredFiltersSectorsObject} The populated <code>StructuredFiltersSectorsObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StructuredFiltersSectorsObject();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('expanded')) {
                obj['expanded'] = ApiClient.convertToType(data['expanded'], 'Boolean');
            }
            if (data.hasOwnProperty('children')) {
                obj['children'] = ApiClient.convertToType(data['children'], [StructuredFiltersChildrenObjectSectors]);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * The name of the sector
 * @member {String} name
 */
StructuredFiltersSectorsObject.prototype['name'] = undefined;

/**
 * It returns the boolean value.
 * @member {Boolean} expanded
 */
StructuredFiltersSectorsObject.prototype['expanded'] = undefined;

/**
 * An array of child objects representing sectors.
 * @member {Array.<module:model/StructuredFiltersChildrenObjectSectors>} children
 */
StructuredFiltersSectorsObject.prototype['children'] = undefined;

/**
 * @member {Array.<Number>} value
 */
StructuredFiltersSectorsObject.prototype['value'] = undefined;






export default StructuredFiltersSectorsObject;

