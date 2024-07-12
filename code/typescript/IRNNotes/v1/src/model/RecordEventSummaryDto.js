/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The RecordEventSummaryDto model module.
 * @module model/RecordEventSummaryDto
 */
class RecordEventSummaryDto {
    /**
     * Constructs a new <code>RecordEventSummaryDto</code>.
     * @alias module:model/RecordEventSummaryDto
     */
    constructor() { 
        
        RecordEventSummaryDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RecordEventSummaryDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RecordEventSummaryDto} obj Optional instance to populate.
     * @return {module:model/RecordEventSummaryDto} The populated <code>RecordEventSummaryDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecordEventSummaryDto();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
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
RecordEventSummaryDto.prototype['id'] = undefined;

/**
 * @member {String} type
 */
RecordEventSummaryDto.prototype['type'] = undefined;

/**
 * @member {String} createdAt
 */
RecordEventSummaryDto.prototype['createdAt'] = undefined;






export default RecordEventSummaryDto;

