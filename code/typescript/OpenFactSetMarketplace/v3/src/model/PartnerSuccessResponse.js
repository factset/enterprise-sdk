/**
 * Open:FactSet Marketplace API
 * This API provides read-only access to marketplace products and partners.
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Partner from './Partner';

/**
 * The PartnerSuccessResponse model module.
 * @module model/PartnerSuccessResponse
 */
class PartnerSuccessResponse {
    /**
     * Constructs a new <code>PartnerSuccessResponse</code>.
     * A success response for getting a partner
     * @alias module:model/PartnerSuccessResponse
     * @param data {module:model/Partner} 
     */
    constructor(data) { 
        
        PartnerSuccessResponse.initialize(this, data);
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
     * Constructs a <code>PartnerSuccessResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PartnerSuccessResponse} obj Optional instance to populate.
     * @return {module:model/PartnerSuccessResponse} The populated <code>PartnerSuccessResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PartnerSuccessResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = Partner.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Partner} data
 */
PartnerSuccessResponse.prototype['data'] = undefined;






export default PartnerSuccessResponse;

