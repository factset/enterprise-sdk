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
 * The CriteriaDetail model module.
 * @module model/CriteriaDetail
 */
class CriteriaDetail {
    /**
     * Constructs a new <code>CriteriaDetail</code>.
     * @alias module:model/CriteriaDetail
     */
    constructor() { 
        
        CriteriaDetail.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CriteriaDetail</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CriteriaDetail} obj Optional instance to populate.
     * @return {module:model/CriteriaDetail} The populated <code>CriteriaDetail</code> instance.
     */
    static constructFromObject(data, obj) {
        // openApiType:array format:
        if (Array.isArray(data)) return ApiClient.setValue(obj || new CriteriaDetail(), data);
        // openApiType:array format:
        if (Array.isArray(data)) return ApiClient.setValue(obj || new CriteriaDetail(), data);
        if (typeof data === 'string') return ApiClient.setValue(obj || new CriteriaDetail(), data);
    }


}






export default CriteriaDetail;

