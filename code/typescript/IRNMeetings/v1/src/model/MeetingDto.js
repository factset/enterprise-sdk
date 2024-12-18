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
import RelatedRecordsDto from './RelatedRecordsDto';

/**
 * The MeetingDto model module.
 * @module model/MeetingDto
 */
class MeetingDto {
    /**
     * Constructs a new <code>MeetingDto</code>.
     * @alias module:model/MeetingDto
     */
    constructor() { 
        
        MeetingDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MeetingDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MeetingDto} obj Optional instance to populate.
     * @return {module:model/MeetingDto} The populated <code>MeetingDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MeetingDto();

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
            if (data.hasOwnProperty('body')) {
                obj['body'] = ApiClient.convertToType(data['body'], 'String');
            }
            if (data.hasOwnProperty('averageRating')) {
                obj['averageRating'] = ApiClient.convertToType(data['averageRating'], 'Number');
            }
            if (data.hasOwnProperty('alertAttendees')) {
                obj['alertAttendees'] = ApiClient.convertToType(data['alertAttendees'], 'Boolean');
            }
            if (data.hasOwnProperty('alertAuthor')) {
                obj['alertAuthor'] = ApiClient.convertToType(data['alertAuthor'], 'Boolean');
            }
            if (data.hasOwnProperty('locations')) {
                obj['locations'] = ApiClient.convertToType(data['locations'], [LocationDto]);
            }
            if (data.hasOwnProperty('attendees')) {
                obj['attendees'] = ApiClient.convertToType(data['attendees'], [AttendeeDto]);
            }
            if (data.hasOwnProperty('customFields')) {
                obj['customFields'] = ApiClient.convertToType(data['customFields'], [CustomFieldValueDto]);
            }
            if (data.hasOwnProperty('relatedSymbols')) {
                obj['relatedSymbols'] = ApiClient.convertToType(data['relatedSymbols'], ['String']);
            }
            if (data.hasOwnProperty('relatedRecords')) {
                obj['relatedRecords'] = RelatedRecordsDto.constructFromObject(data['relatedRecords']);
            }
            if (data.hasOwnProperty('relatedContacts')) {
                obj['relatedContacts'] = ApiClient.convertToType(data['relatedContacts'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
MeetingDto.prototype['id'] = undefined;

/**
 * @member {String} start
 */
MeetingDto.prototype['start'] = undefined;

/**
 * @member {String} end
 */
MeetingDto.prototype['end'] = undefined;

/**
 * @member {String} createdAt
 */
MeetingDto.prototype['createdAt'] = undefined;

/**
 * @member {String} authorId
 */
MeetingDto.prototype['authorId'] = undefined;

/**
 * @member {String} title
 */
MeetingDto.prototype['title'] = undefined;

/**
 * @member {String} identifier
 */
MeetingDto.prototype['identifier'] = undefined;

/**
 * @member {String} organizer
 */
MeetingDto.prototype['organizer'] = undefined;

/**
 * @member {String} organizerId
 */
MeetingDto.prototype['organizerId'] = undefined;

/**
 * @member {String} body
 */
MeetingDto.prototype['body'] = undefined;

/**
 * @member {Number} averageRating
 */
MeetingDto.prototype['averageRating'] = undefined;

/**
 * @member {Boolean} alertAttendees
 */
MeetingDto.prototype['alertAttendees'] = undefined;

/**
 * @member {Boolean} alertAuthor
 */
MeetingDto.prototype['alertAuthor'] = undefined;

/**
 * @member {Array.<module:model/LocationDto>} locations
 */
MeetingDto.prototype['locations'] = undefined;

/**
 * @member {Array.<module:model/AttendeeDto>} attendees
 */
MeetingDto.prototype['attendees'] = undefined;

/**
 * @member {Array.<module:model/CustomFieldValueDto>} customFields
 */
MeetingDto.prototype['customFields'] = undefined;

/**
 * @member {Array.<String>} relatedSymbols
 */
MeetingDto.prototype['relatedSymbols'] = undefined;

/**
 * @member {module:model/RelatedRecordsDto} relatedRecords
 */
MeetingDto.prototype['relatedRecords'] = undefined;

/**
 * @member {Array.<String>} relatedContacts
 */
MeetingDto.prototype['relatedContacts'] = undefined;






export default MeetingDto;

