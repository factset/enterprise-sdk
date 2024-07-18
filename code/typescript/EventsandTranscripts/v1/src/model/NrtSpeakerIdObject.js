/**
 * EVENTS AND TRANSCRIPTS API
 * <p>The Calendar Events API provides access to FactSet’s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
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
 * The NrtSpeakerIdObject model module.
 * @module model/NrtSpeakerIdObject
 */
class NrtSpeakerIdObject {
    /**
     * Constructs a new <code>NrtSpeakerIdObject</code>.
     * @alias module:model/NrtSpeakerIdObject
     */
    constructor() { 
        
        NrtSpeakerIdObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NrtSpeakerIdObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NrtSpeakerIdObject} obj Optional instance to populate.
     * @return {module:model/NrtSpeakerIdObject} The populated <code>NrtSpeakerIdObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NrtSpeakerIdObject();

            if (data.hasOwnProperty('audioSourceId')) {
                obj['audioSourceId'] = ApiClient.convertToType(data['audioSourceId'], 'Number');
            }
            if (data.hasOwnProperty('speakerStartOffset')) {
                obj['speakerStartOffset'] = ApiClient.convertToType(data['speakerStartOffset'], 'Number');
            }
            if (data.hasOwnProperty('speakerId')) {
                obj['speakerId'] = ApiClient.convertToType(data['speakerId'], 'String');
            }
            if (data.hasOwnProperty('confidenceScore')) {
                obj['confidenceScore'] = ApiClient.convertToType(data['confidenceScore'], 'Number');
            }
            if (data.hasOwnProperty('affiliationId')) {
                obj['affiliationId'] = ApiClient.convertToType(data['affiliationId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs.
 * @member {Number} audioSourceId
 */
NrtSpeakerIdObject.prototype['audioSourceId'] = undefined;

/**
 * The number of seconds into the call when a speaker starts / is speaking.
 * @member {Number} speakerStartOffset
 */
NrtSpeakerIdObject.prototype['speakerStartOffset'] = undefined;

/**
 * A unique identifier for a speaker. You can find speakerIds within [FactSet People API](https://developer.factset.com/api-catalog/factset-people-api). 
 * @member {String} speakerId
 */
NrtSpeakerIdObject.prototype['speakerId'] = undefined;

/**
 * The  Confidence score similarity for a particular speaker.  A score >= 0.49 while a speaker is speaking can be considered as a high confidence in the predicted speaker.  Only the speakerIDs with confidenceScore >= 0.49 are rendered in the result set.
 * @member {Number} confidenceScore
 */
NrtSpeakerIdObject.prototype['confidenceScore'] = undefined;

/**
 * The affiliationId represents the entity ID associated with the organization or company to which the speaker is affiliated.
 * @member {String} affiliationId
 */
NrtSpeakerIdObject.prototype['affiliationId'] = undefined;






export default NrtSpeakerIdObject;

