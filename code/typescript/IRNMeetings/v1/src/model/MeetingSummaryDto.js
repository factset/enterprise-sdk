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
import AttendeeDto from './AttendeeDto';
import CustomFieldValueDto from './CustomFieldValueDto';
import LocationDto from './LocationDto';

/**
 * The MeetingSummaryDto model module.
 * @module model/MeetingSummaryDto
 */
class MeetingSummaryDto {
    /**
     * Constructs a new <code>MeetingSummaryDto</code>.
     * @alias module:model/MeetingSummaryDto
     */
    constructor() { 
        
        MeetingSummaryDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MeetingSummaryDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MeetingSummaryDto} obj Optional instance to populate.
     * @return {module:model/MeetingSummaryDto} The populated <code>MeetingSummaryDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MeetingSummaryDto();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'String');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'String');
            }
            if (data.hasOwnProperty('createdAt')) {
                obj['createdAt'] = ApiClient.convertToType(data['createdAt'], 'String');
            }
            if (data.hasOwnProperty('authorId')) {
                obj['authorId'] = ApiClient.convertToType(data['authorId'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = ApiClient.convertToType(data['identifier'], 'String');
            }
            if (data.hasOwnProperty('organizer')) {
                obj['organizer'] = ApiClient.convertToType(data['organizer'], 'String');
            }
            if (data.hasOwnProperty('organizerId')) {
                obj['organizerId'] = ApiClient.convertToType(data['organizerId'], 'String');
            }
            if (data.hasOwnProperty('attachmentIds')) {
                obj['attachmentIds'] = ApiClient.convertToType(data['attachmentIds'], ['String']);
            }
            if (data.hasOwnProperty('relatedSymbols')) {
                obj['relatedSymbols'] = ApiClient.convertToType(data['relatedSymbols'], ['String']);
            }
            if (data.hasOwnProperty('locations')) {
                obj['locations'] = ApiClient.convertToType(data['locations'], [LocationDto]);
            }
            if (data.hasOwnProperty('attendees')) {
                obj['attendees'] = ApiClient.convertToType(data['attendees'], [AttendeeDto]);
            }
            if (data.hasOwnProperty('customFieldValues')) {
                obj['customFieldValues'] = ApiClient.convertToType(data['customFieldValues'], [CustomFieldValueDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
MeetingSummaryDto.prototype['id'] = undefined;

/**
 * @member {String} start
 */
MeetingSummaryDto.prototype['start'] = undefined;

/**
 * @member {String} end
 */
MeetingSummaryDto.prototype['end'] = undefined;

/**
 * @member {String} createdAt
 */
MeetingSummaryDto.prototype['createdAt'] = undefined;

/**
 * @member {String} authorId
 */
MeetingSummaryDto.prototype['authorId'] = undefined;

/**
 * @member {String} title
 */
MeetingSummaryDto.prototype['title'] = undefined;

/**
 * @member {String} identifier
 */
MeetingSummaryDto.prototype['identifier'] = undefined;

/**
 * @member {String} organizer
 */
MeetingSummaryDto.prototype['organizer'] = undefined;

/**
 * @member {String} organizerId
 */
MeetingSummaryDto.prototype['organizerId'] = undefined;

/**
 * @member {Array.<String>} attachmentIds
 */
MeetingSummaryDto.prototype['attachmentIds'] = undefined;

/**
 * @member {Array.<String>} relatedSymbols
 */
MeetingSummaryDto.prototype['relatedSymbols'] = undefined;

/**
 * @member {Array.<module:model/LocationDto>} locations
 */
MeetingSummaryDto.prototype['locations'] = undefined;

/**
 * @member {Array.<module:model/AttendeeDto>} attendees
 */
MeetingSummaryDto.prototype['attendees'] = undefined;

/**
 * @member {Array.<module:model/CustomFieldValueDto>} customFieldValues
 */
MeetingSummaryDto.prototype['customFieldValues'] = undefined;






export default MeetingSummaryDto;

