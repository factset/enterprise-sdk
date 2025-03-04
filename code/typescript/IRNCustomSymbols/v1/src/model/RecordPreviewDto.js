/**
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The RecordPreviewDto model module.
 * @module model/RecordPreviewDto
 */
class RecordPreviewDto {
    /**
     * Constructs a new <code>RecordPreviewDto</code>.
     * @alias module:model/RecordPreviewDto
     */
    constructor() { 
        
        RecordPreviewDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RecordPreviewDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RecordPreviewDto} obj Optional instance to populate.
     * @return {module:model/RecordPreviewDto} The populated <code>RecordPreviewDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RecordPreviewDto();

            if (data.hasOwnProperty('noteGuid')) {
                obj['noteGuid'] = ApiClient.convertToType(data['noteGuid'], 'String');
            }
            if (data.hasOwnProperty('meetingGuid')) {
                obj['meetingGuid'] = ApiClient.convertToType(data['meetingGuid'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('subjectName')) {
                obj['subjectName'] = ApiClient.convertToType(data['subjectName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} noteGuid
 */
RecordPreviewDto.prototype['noteGuid'] = undefined;

/**
 * @member {String} meetingGuid
 */
RecordPreviewDto.prototype['meetingGuid'] = undefined;

/**
 * @member {String} title
 */
RecordPreviewDto.prototype['title'] = undefined;

/**
 * @member {Date} date
 */
RecordPreviewDto.prototype['date'] = undefined;

/**
 * @member {String} subjectName
 */
RecordPreviewDto.prototype['subjectName'] = undefined;






export default RecordPreviewDto;

