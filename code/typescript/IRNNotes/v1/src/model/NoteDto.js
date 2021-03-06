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
import CustomFieldValueDto from './CustomFieldValueDto';
import RelatedRecordsDto from './RelatedRecordsDto';

/**
 * The NoteDto model module.
 * @module model/NoteDto
 */
class NoteDto {
    /**
     * Constructs a new <code>NoteDto</code>.
     * @alias module:model/NoteDto
     */
    constructor() { 
        
        NoteDto.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NoteDto</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NoteDto} obj Optional instance to populate.
     * @return {module:model/NoteDto} The populated <code>NoteDto</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NoteDto();

            if (data.hasOwnProperty('Id')) {
                obj['Id'] = ApiClient.convertToType(data['Id'], 'String');
            }
            if (data.hasOwnProperty('Date')) {
                obj['Date'] = ApiClient.convertToType(data['Date'], 'String');
            }
            if (data.hasOwnProperty('CreatedAt')) {
                obj['CreatedAt'] = ApiClient.convertToType(data['CreatedAt'], 'String');
            }
            if (data.hasOwnProperty('AuthorId')) {
                obj['AuthorId'] = ApiClient.convertToType(data['AuthorId'], 'String');
            }
            if (data.hasOwnProperty('ContributorId')) {
                obj['ContributorId'] = ApiClient.convertToType(data['ContributorId'], 'String');
            }
            if (data.hasOwnProperty('Title')) {
                obj['Title'] = ApiClient.convertToType(data['Title'], 'String');
            }
            if (data.hasOwnProperty('Identifier')) {
                obj['Identifier'] = ApiClient.convertToType(data['Identifier'], 'String');
            }
            if (data.hasOwnProperty('RelatedSymbols')) {
                obj['RelatedSymbols'] = ApiClient.convertToType(data['RelatedSymbols'], ['String']);
            }
            if (data.hasOwnProperty('SubjectId')) {
                obj['SubjectId'] = ApiClient.convertToType(data['SubjectId'], 'String');
            }
            if (data.hasOwnProperty('RecommendationId')) {
                obj['RecommendationId'] = ApiClient.convertToType(data['RecommendationId'], 'String');
            }
            if (data.hasOwnProperty('SentimentId')) {
                obj['SentimentId'] = ApiClient.convertToType(data['SentimentId'], 'String');
            }
            if (data.hasOwnProperty('Source')) {
                obj['Source'] = ApiClient.convertToType(data['Source'], 'String');
            }
            if (data.hasOwnProperty('Link')) {
                obj['Link'] = ApiClient.convertToType(data['Link'], 'String');
            }
            if (data.hasOwnProperty('Body')) {
                obj['Body'] = ApiClient.convertToType(data['Body'], 'String');
            }
            if (data.hasOwnProperty('IsPersonal')) {
                obj['IsPersonal'] = ApiClient.convertToType(data['IsPersonal'], 'Boolean');
            }
            if (data.hasOwnProperty('State')) {
                obj['State'] = ApiClient.convertToType(data['State'], 'String');
            }
            if (data.hasOwnProperty('ApprovalStatus')) {
                obj['ApprovalStatus'] = ApiClient.convertToType(data['ApprovalStatus'], 'String');
            }
            if (data.hasOwnProperty('AverageRating')) {
                obj['AverageRating'] = ApiClient.convertToType(data['AverageRating'], 'Number');
            }
            if (data.hasOwnProperty('RelatedRecords')) {
                obj['RelatedRecords'] = RelatedRecordsDto.constructFromObject(data['RelatedRecords']);
            }
            if (data.hasOwnProperty('RelatedContacts')) {
                obj['RelatedContacts'] = ApiClient.convertToType(data['RelatedContacts'], ['String']);
            }
            if (data.hasOwnProperty('CustomFields')) {
                obj['CustomFields'] = ApiClient.convertToType(data['CustomFields'], [CustomFieldValueDto]);
            }
        }
        return obj;
    }


}

/**
 * @member {String} Id
 */
NoteDto.prototype['Id'] = undefined;

/**
 * @member {String} Date
 */
NoteDto.prototype['Date'] = undefined;

/**
 * @member {String} CreatedAt
 */
NoteDto.prototype['CreatedAt'] = undefined;

/**
 * @member {String} AuthorId
 */
NoteDto.prototype['AuthorId'] = undefined;

/**
 * @member {String} ContributorId
 */
NoteDto.prototype['ContributorId'] = undefined;

/**
 * @member {String} Title
 */
NoteDto.prototype['Title'] = undefined;

/**
 * @member {String} Identifier
 */
NoteDto.prototype['Identifier'] = undefined;

/**
 * @member {Array.<String>} RelatedSymbols
 */
NoteDto.prototype['RelatedSymbols'] = undefined;

/**
 * @member {String} SubjectId
 */
NoteDto.prototype['SubjectId'] = undefined;

/**
 * @member {String} RecommendationId
 */
NoteDto.prototype['RecommendationId'] = undefined;

/**
 * @member {String} SentimentId
 */
NoteDto.prototype['SentimentId'] = undefined;

/**
 * @member {String} Source
 */
NoteDto.prototype['Source'] = undefined;

/**
 * @member {String} Link
 */
NoteDto.prototype['Link'] = undefined;

/**
 * @member {String} Body
 */
NoteDto.prototype['Body'] = undefined;

/**
 * @member {Boolean} IsPersonal
 */
NoteDto.prototype['IsPersonal'] = undefined;

/**
 * @member {String} State
 */
NoteDto.prototype['State'] = undefined;

/**
 * @member {String} ApprovalStatus
 */
NoteDto.prototype['ApprovalStatus'] = undefined;

/**
 * @member {Number} AverageRating
 */
NoteDto.prototype['AverageRating'] = undefined;

/**
 * @member {module:model/RelatedRecordsDto} RelatedRecords
 */
NoteDto.prototype['RelatedRecords'] = undefined;

/**
 * @member {Array.<String>} RelatedContacts
 */
NoteDto.prototype['RelatedContacts'] = undefined;

/**
 * @member {Array.<module:model/CustomFieldValueDto>} CustomFields
 */
NoteDto.prototype['CustomFields'] = undefined;






export default NoteDto;

