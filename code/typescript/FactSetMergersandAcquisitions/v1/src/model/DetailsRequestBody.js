/**
 * FACTSET MERGERS AND ACQUISITIONS API
 * The FactSet Mergers and Acquisitions API provides access to key transactions and pricing metrics on over 60,000 globally traded deals. Reference a Global Universe of Mergers and Acquisitions (M&A) transactions where the target of the deal is a Publicly traded Company. Review premiums, multiples and fundamental data to gather insights on deals and create predictive models based on different deal characteristics.    Monetary values returned by this API are converted and represented in USD.    This API is allows a limit of 10 requests per second and a maximum of 10 concurrent requests. 
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
 * The DetailsRequestBody model module.
 * @module model/DetailsRequestBody
 */
class DetailsRequestBody {
    /**
     * Constructs a new <code>DetailsRequestBody</code>.
     * Details Request Body
     * @alias module:model/DetailsRequestBody
     * @param dealIds {Array.<String>} The requested list of deal identifiers. Maximum of 100 IDs are supported. 
     */
    constructor(dealIds) { 
        
        DetailsRequestBody.initialize(this, dealIds);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, dealIds) { 
        obj['dealIds'] = dealIds;
    }

    /**
     * Constructs a <code>DetailsRequestBody</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DetailsRequestBody} obj Optional instance to populate.
     * @return {module:model/DetailsRequestBody} The populated <code>DetailsRequestBody</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DetailsRequestBody();

            if (data.hasOwnProperty('dealIds')) {
                obj['dealIds'] = ApiClient.convertToType(data['dealIds'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * The requested list of deal identifiers. Maximum of 100 IDs are supported. 
 * @member {Array.<String>} dealIds
 */
DetailsRequestBody.prototype['dealIds'] = undefined;






export default DetailsRequestBody;

