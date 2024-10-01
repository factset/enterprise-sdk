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
 * The SubcommentSummaryDto model module.
 * @module model/SubcommentSummaryDto
 */
class SubcommentSummaryDto {
    /**
     * Constructs a new <code>SubcommentSummaryDto</code>.
     * @alias module:model/SubcommentSummaryDto
     */
    constructor() { 
        
        SubcommentSummaryDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SubcommentSummaryDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SubcommentSummaryDto} obj Optional instance to populate.
     * @return {module:model/SubcommentSummaryDto} The populated <code>SubcommentSummaryDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SubcommentSummaryDto();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('userId')) {
                obj['userId'] = ApiClient.convertToType(data['userId'], 'String');
            }
            if (data.hasOwnProperty('createdAt')) {
                obj['createdAt'] = ApiClient.convertToType(data['createdAt'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
SubcommentSummaryDto.prototype['id'] = undefined;

/**
 * @member {String} userId
 */
SubcommentSummaryDto.prototype['userId'] = undefined;

/**
 * @member {String} createdAt
 */
SubcommentSummaryDto.prototype['createdAt'] = undefined;






export default SubcommentSummaryDto;

