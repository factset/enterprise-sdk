/**
 * Event Calendar API
 * Retrieves events for companies
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
import CompanyEventRequestData from './CompanyEventRequestData';

/**
 * The CompanyEventRequest model module.
 * @module model/CompanyEventRequest
 */
class CompanyEventRequest {
    /**
     * Constructs a new <code>CompanyEventRequest</code>.
     * @alias module:model/CompanyEventRequest
     */
    constructor() { 
        
        CompanyEventRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CompanyEventRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CompanyEventRequest} obj Optional instance to populate.
     * @return {module:model/CompanyEventRequest} The populated <code>CompanyEventRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CompanyEventRequest();

            if (data.hasOwnProperty('data')) {
                obj['data'] = CompanyEventRequestData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CompanyEventRequestData} data
 */
CompanyEventRequest.prototype['data'] = undefined;






export default CompanyEventRequest;

