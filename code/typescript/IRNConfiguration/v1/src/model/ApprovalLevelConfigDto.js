/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
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
 * The ApprovalLevelConfigDto model module.
 * @module model/ApprovalLevelConfigDto
 */
class ApprovalLevelConfigDto {
    /**
     * Constructs a new <code>ApprovalLevelConfigDto</code>.
     * @alias module:model/ApprovalLevelConfigDto
     */
    constructor() { 
        
        ApprovalLevelConfigDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ApprovalLevelConfigDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ApprovalLevelConfigDto} obj Optional instance to populate.
     * @return {module:model/ApprovalLevelConfigDto} The populated <code>ApprovalLevelConfigDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ApprovalLevelConfigDto();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('approverIds')) {
                obj['approverIds'] = ApiClient.convertToType(data['approverIds'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} name
 */
ApprovalLevelConfigDto.prototype['name'] = undefined;

/**
 * @member {Array.<String>} approverIds
 */
ApprovalLevelConfigDto.prototype['approverIds'] = undefined;






export default ApprovalLevelConfigDto;

