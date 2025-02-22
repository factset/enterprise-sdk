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
 * The SubjectSummaryDto model module.
 * @module model/SubjectSummaryDto
 */
class SubjectSummaryDto {
    /**
     * Constructs a new <code>SubjectSummaryDto</code>.
     * @alias module:model/SubjectSummaryDto
     */
    constructor() { 
        
        SubjectSummaryDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SubjectSummaryDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SubjectSummaryDto} obj Optional instance to populate.
     * @return {module:model/SubjectSummaryDto} The populated <code>SubjectSummaryDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SubjectSummaryDto();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('identifierType')) {
                obj['identifierType'] = ApiClient.convertToType(data['identifierType'], 'String');
            }
            if (data.hasOwnProperty('identifierTypes')) {
                obj['identifierTypes'] = ApiClient.convertToType(data['identifierTypes'], ['String']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('isHidden')) {
                obj['isHidden'] = ApiClient.convertToType(data['isHidden'], 'Boolean');
            }
            if (data.hasOwnProperty('customFieldIds')) {
                obj['customFieldIds'] = ApiClient.convertToType(data['customFieldIds'], ['String']);
            }
            if (data.hasOwnProperty('noteLengthLimit')) {
                obj['noteLengthLimit'] = ApiClient.convertToType(data['noteLengthLimit'], 'Number');
            }
            if (data.hasOwnProperty('layoutId')) {
                obj['layoutId'] = ApiClient.convertToType(data['layoutId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
SubjectSummaryDto.prototype['id'] = undefined;

/**
 * @member {String} name
 */
SubjectSummaryDto.prototype['name'] = undefined;

/**
 * @member {String} code
 */
SubjectSummaryDto.prototype['code'] = undefined;

/**
 * @member {String} identifierType
 */
SubjectSummaryDto.prototype['identifierType'] = undefined;

/**
 * @member {Array.<String>} identifierTypes
 */
SubjectSummaryDto.prototype['identifierTypes'] = undefined;

/**
 * @member {String} type
 */
SubjectSummaryDto.prototype['type'] = undefined;

/**
 * @member {Boolean} isHidden
 */
SubjectSummaryDto.prototype['isHidden'] = undefined;

/**
 * @member {Array.<String>} customFieldIds
 */
SubjectSummaryDto.prototype['customFieldIds'] = undefined;

/**
 * @member {Number} noteLengthLimit
 */
SubjectSummaryDto.prototype['noteLengthLimit'] = undefined;

/**
 * @member {String} layoutId
 */
SubjectSummaryDto.prototype['layoutId'] = undefined;






export default SubjectSummaryDto;

