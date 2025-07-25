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
import FilterTopicResponseData from './FilterTopicResponseData';

/**
 * The FilterTopicResponse model module.
 * @module model/FilterTopicResponse
 */
class FilterTopicResponse {
    /**
     * Constructs a new <code>FilterTopicResponse</code>.
     * Filters Topic Object
     * @alias module:model/FilterTopicResponse
     */
    constructor() { 
        
        FilterTopicResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>FilterTopicResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FilterTopicResponse} obj Optional instance to populate.
     * @return {module:model/FilterTopicResponse} The populated <code>FilterTopicResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FilterTopicResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = FilterTopicResponseData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/FilterTopicResponseData} data
 */
FilterTopicResponse.prototype['data'] = undefined;






export default FilterTopicResponse;

