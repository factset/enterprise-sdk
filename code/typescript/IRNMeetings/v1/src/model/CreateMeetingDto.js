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
import CreateBodyDto from './CreateBodyDto';
import CreateCustomFieldValueDto from './CreateCustomFieldValueDto';
import ReferenceAttendeeDto from './ReferenceAttendeeDto';
import RelatedRecordsDto from './RelatedRecordsDto';
import UserSerialDto from './UserSerialDto';

/**
 * The CreateMeetingDto model module.
 * @module model/CreateMeetingDto
 */
class CreateMeetingDto {
    /**
     * Constructs a new <code>CreateMeetingDto</code>.
     * @alias module:model/CreateMeetingDto
     * @param author {module:model/UserSerialDto} 
     * @param start {String} 
     * @param end {String} 
     */
    constructor(author, start, end) { 
        
        CreateMeetingDto.initialize(this, author, start, end);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, author, start, end) { 
        obj['author'] = author;
        obj['start'] = start;
        obj['end'] = end;
    }

    /**
     * Constructs a <code>CreateMeetingDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateMeetingDto} obj Optional instance to populate.
     * @return {module:model/CreateMeetingDto} The populated <code>CreateMeetingDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateMeetingDto();

            if (data.hasOwnProperty('author')) {
                obj['author'] = UserSerialDto.constructFromObject(data['author']);
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('identifier')) {
                obj['identifier'] = ApiClient.convertToType(data['identifier'], 'String');
            }
            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'String');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'String');
            }
            if (data.hasOwnProperty('locations')) {
                obj['locations'] = ApiClient.convertToType(data['locations'], ['String']);
            }
            if (data.hasOwnProperty('organizer')) {
                obj['organizer'] = ApiClient.convertToType(data['organizer'], 'String');
            }
            if (data.hasOwnProperty('organizerId')) {
                obj['organizerId'] = ApiClient.convertToType(data['organizerId'], 'String');
            }
            if (data.hasOwnProperty('attendees')) {
                obj['attendees'] = ApiClient.convertToType(data['attendees'], [ReferenceAttendeeDto]);
            }
            if (data.hasOwnProperty('alertAttendees')) {
                obj['alertAttendees'] = ApiClient.convertToType(data['alertAttendees'], 'Boolean');
            }
            if (data.hasOwnProperty('alertAuthor')) {
                obj['alertAuthor'] = ApiClient.convertToType(data['alertAuthor'], 'Boolean');
            }
            if (data.hasOwnProperty('relatedRecords')) {
                obj['relatedRecords'] = RelatedRecordsDto.constructFromObject(data['relatedRecords']);
            }
            if (data.hasOwnProperty('relatedContacts')) {
                obj['relatedContacts'] = ApiClient.convertToType(data['relatedContacts'], ['String']);
            }
            if (data.hasOwnProperty('relatedSymbols')) {
                obj['relatedSymbols'] = ApiClient.convertToType(data['relatedSymbols'], ['String']);
            }
            if (data.hasOwnProperty('body')) {
                obj['body'] = CreateBodyDto.constructFromObject(data['body']);
            }
            if (data.hasOwnProperty('customFieldValues')) {
                obj['customFieldValues'] = ApiClient.convertToType(data['customFieldValues'], [CreateCustomFieldValueDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/UserSerialDto} author
 */
CreateMeetingDto.prototype['author'] = undefined;

/**
 * @member {String} title
 */
CreateMeetingDto.prototype['title'] = undefined;

/**
 * @member {String} identifier
 */
CreateMeetingDto.prototype['identifier'] = undefined;

/**
 * @member {String} start
 */
CreateMeetingDto.prototype['start'] = undefined;

/**
 * @member {String} end
 */
CreateMeetingDto.prototype['end'] = undefined;

/**
 * @member {Array.<String>} locations
 */
CreateMeetingDto.prototype['locations'] = undefined;

/**
 * @member {String} organizer
 */
CreateMeetingDto.prototype['organizer'] = undefined;

/**
 * @member {String} organizerId
 */
CreateMeetingDto.prototype['organizerId'] = undefined;

/**
 * @member {Array.<module:model/ReferenceAttendeeDto>} attendees
 */
CreateMeetingDto.prototype['attendees'] = undefined;

/**
 * @member {Boolean} alertAttendees
 * @default false
 */
CreateMeetingDto.prototype['alertAttendees'] = false;

/**
 * @member {Boolean} alertAuthor
 * @default false
 */
CreateMeetingDto.prototype['alertAuthor'] = false;

/**
 * @member {module:model/RelatedRecordsDto} relatedRecords
 */
CreateMeetingDto.prototype['relatedRecords'] = undefined;

/**
 * @member {Array.<String>} relatedContacts
 */
CreateMeetingDto.prototype['relatedContacts'] = undefined;

/**
 * @member {Array.<String>} relatedSymbols
 */
CreateMeetingDto.prototype['relatedSymbols'] = undefined;

/**
 * @member {module:model/CreateBodyDto} body
 */
CreateMeetingDto.prototype['body'] = undefined;

/**
 * @member {Array.<module:model/CreateCustomFieldValueDto>} customFieldValues
 */
CreateMeetingDto.prototype['customFieldValues'] = undefined;






export default CreateMeetingDto;

