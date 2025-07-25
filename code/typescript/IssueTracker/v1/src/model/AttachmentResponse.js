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
import Attachment from './Attachment';

/**
 * The AttachmentResponse model module.
 * @module model/AttachmentResponse
 */
class AttachmentResponse {
    /**
     * Constructs a new <code>AttachmentResponse</code>.
     * @alias module:model/AttachmentResponse
     */
    constructor() { 
        
        AttachmentResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AttachmentResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AttachmentResponse} obj Optional instance to populate.
     * @return {module:model/AttachmentResponse} The populated <code>AttachmentResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AttachmentResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = Attachment.constructFromObject(data['data']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/Attachment} data
 */
AttachmentResponse.prototype['data'] = undefined;






export default AttachmentResponse;

