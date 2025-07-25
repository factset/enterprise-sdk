/**
 * Issue Tracker API
 * This API is used to file issues
 *
 * The version of the OpenAPI document: 1.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import UpdateIssueRequestData from './UpdateIssueRequestData';

/**
 * The UpdateIssueRequest model module.
 * @module model/UpdateIssueRequest
 */
class UpdateIssueRequest {
    /**
     * Constructs a new <code>UpdateIssueRequest</code>.
     * Request object for update severity or subject of Issue
     * @alias module:model/UpdateIssueRequest
     */
    constructor() { 
        
        UpdateIssueRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateIssueRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateIssueRequest} obj Optional instance to populate.
     * @return {module:model/UpdateIssueRequest} The populated <code>UpdateIssueRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateIssueRequest();

            if (data.hasOwnProperty('data')) {
                obj['data'] = UpdateIssueRequestData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/UpdateIssueRequestData} data
 */
UpdateIssueRequest.prototype['data'] = undefined;






export default UpdateIssueRequest;

