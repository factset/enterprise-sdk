/**
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
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
import StructuredFiltersChildrenObjectCategories from './StructuredFiltersChildrenObjectCategories';

/**
 * The StructuredFiltersCategoriesObject model module.
 * @module model/StructuredFiltersCategoriesObject
 */
class StructuredFiltersCategoriesObject {
    /**
     * Constructs a new <code>StructuredFiltersCategoriesObject</code>.
     * Elements of structured filters categories.
     * @alias module:model/StructuredFiltersCategoriesObject
     */
    constructor() { 
        
        StructuredFiltersCategoriesObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StructuredFiltersCategoriesObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StructuredFiltersCategoriesObject} obj Optional instance to populate.
     * @return {module:model/StructuredFiltersCategoriesObject} The populated <code>StructuredFiltersCategoriesObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StructuredFiltersCategoriesObject();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], ['String']);
            }
            if (data.hasOwnProperty('children')) {
                obj['children'] = ApiClient.convertToType(data['children'], [StructuredFiltersChildrenObjectCategories]);
            }
        }
        return obj;
    }


}

/**
 * The name of the category.
 * @member {String} name
 */
StructuredFiltersCategoriesObject.prototype['name'] = undefined;

/**
 * @member {Array.<String>} value
 */
StructuredFiltersCategoriesObject.prototype['value'] = undefined;

/**
 * An array of children objects.
 * @member {Array.<module:model/StructuredFiltersChildrenObjectCategories>} children
 */
StructuredFiltersCategoriesObject.prototype['children'] = undefined;






export default StructuredFiltersCategoriesObject;

