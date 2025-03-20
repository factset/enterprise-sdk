/**
 * FactSet Mergers and Acquisitions API
 * The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests. 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import DetailsRequestBody from './DetailsRequestBody';

/**
 * The DetailsRequest model module.
 * @module model/DetailsRequest
 */
class DetailsRequest {
    /**
     * Constructs a new <code>DetailsRequest</code>.
     * Details Request
     * @alias module:model/DetailsRequest
     * @param data {module:model/DetailsRequestBody} 
     */
    constructor(data) { 
        
        DetailsRequest.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>DetailsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DetailsRequest} obj Optional instance to populate.
     * @return {module:model/DetailsRequest} The populated <code>DetailsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DetailsRequest();

            if (data.hasOwnProperty('data')) {
                obj['data'] = DetailsRequestBody.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/DetailsRequestBody} data
 */
DetailsRequest.prototype['data'] = undefined;






export default DetailsRequest;

