/**
 * Issue Tracker API
 * This API is used to file issues
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
import IssueRequestData from './IssueRequestData';

/**
 * The IssueRequest model module.
 * @module model/IssueRequest
 */
class IssueRequest {
    /**
     * Constructs a new <code>IssueRequest</code>.
     * @alias module:model/IssueRequest
     */
    constructor() { 
        
        IssueRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>IssueRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IssueRequest} obj Optional instance to populate.
     * @return {module:model/IssueRequest} The populated <code>IssueRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IssueRequest();

            if (data.hasOwnProperty('data')) {
                obj['data'] = IssueRequestData.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/IssueRequestData} data
 */
IssueRequest.prototype['data'] = undefined;






export default IssueRequest;

