/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The RelatedRecordsDto model module.
 * @module model/RelatedRecordsDto
 */
class RelatedRecordsDto {
    /**
     * Constructs a new <code>RelatedRecordsDto</code>.
     * @alias module:model/RelatedRecordsDto
     */
    constructor() { 
        
        RelatedRecordsDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RelatedRecordsDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RelatedRecordsDto} obj Optional instance to populate.
     * @return {module:model/RelatedRecordsDto} The populated <code>RelatedRecordsDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RelatedRecordsDto();

            if (data.hasOwnProperty('NoteIds')) {
                obj['NoteIds'] = ApiClient.convertToType(data['NoteIds'], ['String']);
            }
            if (data.hasOwnProperty('MeetingIds')) {
                obj['MeetingIds'] = ApiClient.convertToType(data['MeetingIds'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} NoteIds
 */
RelatedRecordsDto.prototype['NoteIds'] = undefined;

/**
 * @member {Array.<String>} MeetingIds
 */
RelatedRecordsDto.prototype['MeetingIds'] = undefined;






export default RelatedRecordsDto;

