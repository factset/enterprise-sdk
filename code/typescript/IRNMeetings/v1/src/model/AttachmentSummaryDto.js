/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
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

/**
 * The AttachmentSummaryDto model module.
 * @module model/AttachmentSummaryDto
 */
class AttachmentSummaryDto {
    /**
     * Constructs a new <code>AttachmentSummaryDto</code>.
     * @alias module:model/AttachmentSummaryDto
     */
    constructor() { 
        
        AttachmentSummaryDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AttachmentSummaryDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AttachmentSummaryDto} obj Optional instance to populate.
     * @return {module:model/AttachmentSummaryDto} The populated <code>AttachmentSummaryDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AttachmentSummaryDto();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('fileName')) {
                obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
            }
            if (data.hasOwnProperty('mimeType')) {
                obj['mimeType'] = ApiClient.convertToType(data['mimeType'], 'String');
            }
            if (data.hasOwnProperty('size')) {
                obj['size'] = ApiClient.convertToType(data['size'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
AttachmentSummaryDto.prototype['id'] = undefined;

/**
 * @member {String} fileName
 */
AttachmentSummaryDto.prototype['fileName'] = undefined;

/**
 * @member {String} mimeType
 */
AttachmentSummaryDto.prototype['mimeType'] = undefined;

/**
 * @member {Number} size
 */
AttachmentSummaryDto.prototype['size'] = undefined;






export default AttachmentSummaryDto;

