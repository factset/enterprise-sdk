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
import RecordChangeDto from './RecordChangeDto';

/**
 * The MeetingEventDto model module.
 * @module model/MeetingEventDto
 */
class MeetingEventDto {
    /**
     * Constructs a new <code>MeetingEventDto</code>.
     * @alias module:model/MeetingEventDto
     */
    constructor() { 
        
        MeetingEventDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MeetingEventDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MeetingEventDto} obj Optional instance to populate.
     * @return {module:model/MeetingEventDto} The populated <code>MeetingEventDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MeetingEventDto();

            if (data.hasOwnProperty('createdAt')) {
                obj['createdAt'] = ApiClient.convertToType(data['createdAt'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('user')) {
                obj['user'] = ApiClient.convertToType(data['user'], 'String');
            }
            if (data.hasOwnProperty('changeList')) {
                obj['changeList'] = ApiClient.convertToType(data['changeList'], [RecordChangeDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} createdAt
 */
MeetingEventDto.prototype['createdAt'] = undefined;

/**
 * @member {String} type
 */
MeetingEventDto.prototype['type'] = undefined;

/**
 * @member {String} user
 */
MeetingEventDto.prototype['user'] = undefined;

/**
 * @member {Array.<module:model/RecordChangeDto>} changeList
 */
MeetingEventDto.prototype['changeList'] = undefined;






export default MeetingEventDto;

