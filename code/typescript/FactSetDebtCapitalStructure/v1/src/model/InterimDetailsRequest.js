/**
 * FactSet Debt Capital Structure API
 * The FactSet Debt Capital Structure API offers insights into public and private company debt financing for 69,000+ entities globally. Analyze at the individual-instrument level through summary and detailed information of the debt structure with history available back through 2006. Instrument types covered include Revolving Credit, Term Loans, Notes, and Bonds.   **How to Programmatically Download API Specification file:**  Please use the below link to download the FactSet Debt Capital Structure API Specification file in .yaml. You must be authorized for this API to extract. This specification can then be used for Codegen to create your own SDKs. You can also access by selecting the \"Download Spec\" button to the right of the version below.  [https://api.factset.com/content/factset-dcs/v1/spec/swagger.yaml](https://api.factset.com/content/factset-dcs/v1/spec/swagger.yaml)  This API is rate-limited to 10 requests per second and 10 concurrent requests per user. 
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
import InterimDetailsRequestBody from './InterimDetailsRequestBody';

/**
 * The InterimDetailsRequest model module.
 * @module model/InterimDetailsRequest
 */
class InterimDetailsRequest {
    /**
     * Constructs a new <code>InterimDetailsRequest</code>.
     * Interim Details Request
     * @alias module:model/InterimDetailsRequest
     * @param data {module:model/InterimDetailsRequestBody} 
     */
    constructor(data) { 
        
        InterimDetailsRequest.initialize(this, data);
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
     * Constructs a <code>InterimDetailsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InterimDetailsRequest} obj Optional instance to populate.
     * @return {module:model/InterimDetailsRequest} The populated <code>InterimDetailsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InterimDetailsRequest();

            if (data.hasOwnProperty('data')) {
                obj['data'] = InterimDetailsRequestBody.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InterimDetailsRequestBody} data
 */
InterimDetailsRequest.prototype['data'] = undefined;






export default InterimDetailsRequest;

