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
import FlattenedFilters from './FlattenedFilters';
import StructuredFilters from './StructuredFilters';

/**
 * The FilterResponseData model module.
 * @module model/FilterResponseData
 */
class FilterResponseData {
    /**
     * Constructs a new <code>FilterResponseData</code>.
     * @alias module:model/FilterResponseData
     */
    constructor() { 
        
        FilterResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FilterResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FilterResponseData} obj Optional instance to populate.
     * @return {module:model/FilterResponseData} The populated <code>FilterResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FilterResponseData();

            if (data.hasOwnProperty('structured')) {
                obj['structured'] = StructuredFilters.constructFromObject(data['structured']);
            }
            if (data.hasOwnProperty('flattened')) {
                obj['flattened'] = FlattenedFilters.constructFromObject(data['flattened']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/StructuredFilters} structured
 */
FilterResponseData.prototype['structured'] = undefined;

/**
 * @member {module:model/FlattenedFilters} flattened
 */
FilterResponseData.prototype['flattened'] = undefined;






export default FilterResponseData;

