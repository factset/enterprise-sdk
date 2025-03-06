/**
 * EVENTS AND TRANSCRIPTS API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p>  
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The EventsAudioDailyObjectOne model module.
 * @module model/EventsAudioDailyObjectOne
 */
class EventsAudioDailyObjectOne {
    /**
     * Constructs a new <code>EventsAudioDailyObjectOne</code>.
     * @alias module:model/EventsAudioDailyObjectOne
     */
    constructor() { 
        
        EventsAudioDailyObjectOne.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>EventsAudioDailyObjectOne</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EventsAudioDailyObjectOne} obj Optional instance to populate.
     * @return {module:model/EventsAudioDailyObjectOne} The populated <code>EventsAudioDailyObjectOne</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EventsAudioDailyObjectOne();

            if (data.hasOwnProperty('reportId')) {
                obj['reportId'] = ApiClient.convertToType(data['reportId'], 'Number');
            }
            if (data.hasOwnProperty('fileName')) {
                obj['fileName'] = ApiClient.convertToType(data['fileName'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('fileSize')) {
                obj['fileSize'] = ApiClient.convertToType(data['fileSize'], 'Number');
            }
            if (data.hasOwnProperty('audioSourceId')) {
                obj['audioSourceId'] = ApiClient.convertToType(data['audioSourceId'], 'Number');
            }
            if (data.hasOwnProperty('ticker')) {
                obj['ticker'] = ApiClient.convertToType(data['ticker'], 'String');
            }
            if (data.hasOwnProperty('entityId')) {
                obj['entityId'] = ApiClient.convertToType(data['entityId'], 'String');
            }
            if (data.hasOwnProperty('sourceCode')) {
                obj['sourceCode'] = ApiClient.convertToType(data['sourceCode'], 'String');
            }
            if (data.hasOwnProperty('trimmed')) {
                obj['trimmed'] = ApiClient.convertToType(data['trimmed'], 'Boolean');
            }
            if (data.hasOwnProperty('durationSecs')) {
                obj['durationSecs'] = ApiClient.convertToType(data['durationSecs'], 'Number');
            }
            if (data.hasOwnProperty('startOffsetSeconds')) {
                obj['startOffsetSeconds'] = ApiClient.convertToType(data['startOffsetSeconds'], 'Number');
            }
            if (data.hasOwnProperty('endOffsetSeconds')) {
                obj['endOffsetSeconds'] = ApiClient.convertToType(data['endOffsetSeconds'], 'Number');
            }
            if (data.hasOwnProperty('startTime')) {
                obj['startTime'] = ApiClient.convertToType(data['startTime'], 'String');
            }
            if (data.hasOwnProperty('endTime')) {
                obj['endTime'] = ApiClient.convertToType(data['endTime'], 'String');
            }
            if (data.hasOwnProperty('uploadTime')) {
                obj['uploadTime'] = ApiClient.convertToType(data['uploadTime'], 'String');
            }
            if (data.hasOwnProperty('sampleRate')) {
                obj['sampleRate'] = ApiClient.convertToType(data['sampleRate'], 'Number');
            }
            if (data.hasOwnProperty('bitrate')) {
                obj['bitrate'] = ApiClient.convertToType(data['bitrate'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables.
 * @member {Number} reportId
 */
EventsAudioDailyObjectOne.prototype['reportId'] = undefined;

/**
 * The filename of the audio file.
 * @member {String} fileName
 */
EventsAudioDailyObjectOne.prototype['fileName'] = undefined;

/**
 * A pre-signed URL that allows downloading the audio file, expiring after 24 hours.
 * @member {String} url
 */
EventsAudioDailyObjectOne.prototype['url'] = undefined;

/**
 * Size of the Audio file, in bytes.
 * @member {Number} fileSize
 */
EventsAudioDailyObjectOne.prototype['fileSize'] = undefined;

/**
 * Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null.
 * @member {Number} audioSourceId
 */
EventsAudioDailyObjectOne.prototype['audioSourceId'] = undefined;

/**
 * Ticker-region identifier for the company hosting the event.
 * @member {String} ticker
 */
EventsAudioDailyObjectOne.prototype['ticker'] = undefined;

/**
 * FactSet entity level identifier for the company hosting the event.
 * @member {String} entityId
 */
EventsAudioDailyObjectOne.prototype['entityId'] = undefined;

/**
 * This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay
 * @member {module:model/EventsAudioDailyObjectOne.SourceCodeEnum} sourceCode
 */
EventsAudioDailyObjectOne.prototype['sourceCode'] = undefined;

/**
 *  The trimmed attribute indicates whether the audio is the trimmed version. If `sourceCode` is set to vendor, this attribute will always be true.    
 * @member {Boolean} trimmed
 */
EventsAudioDailyObjectOne.prototype['trimmed'] = undefined;

/**
 * Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds.
 * @member {Number} durationSecs
 */
EventsAudioDailyObjectOne.prototype['durationSecs'] = undefined;

/**
 * The delta in seconds between start of audio file to when FactSet marks the beginning of the call.
 * @member {Number} startOffsetSeconds
 */
EventsAudioDailyObjectOne.prototype['startOffsetSeconds'] = undefined;

/**
 * The delta in seconds between startTime to when FactSet marks the end of the call.
 * @member {Number} endOffsetSeconds
 */
EventsAudioDailyObjectOne.prototype['endOffsetSeconds'] = undefined;

/**
 * The official timestamp when FactSet begins the recording.
 * @member {String} startTime
 */
EventsAudioDailyObjectOne.prototype['startTime'] = undefined;

/**
 * The official timestamp when FactSet ends the recording.
 * @member {String} endTime
 */
EventsAudioDailyObjectOne.prototype['endTime'] = undefined;

/**
 * The official timestamp when FactSet publishes the audio file externally.
 * @member {String} uploadTime
 */
EventsAudioDailyObjectOne.prototype['uploadTime'] = undefined;

/**
 * The number of samples of audio carried per second in Kbps.
 * @member {Number} sampleRate
 */
EventsAudioDailyObjectOne.prototype['sampleRate'] = undefined;

/**
 * The total number of bits of information stored per second of sound in Kbps.
 * @member {Number} bitrate
 */
EventsAudioDailyObjectOne.prototype['bitrate'] = undefined;





/**
 * Allowed values for the <code>sourceCode</code> property.
 * @enum {String}
 * @readonly
 */
EventsAudioDailyObjectOne['SourceCodeEnum'] = {

    /**
     * value: "Webcast"
     * @const
     */
    "Webcast": "Webcast",

    /**
     * value: "Vendor"
     * @const
     */
    "Vendor": "Vendor",

    /**
     * value: "WebcastReplay"
     * @const
     */
    "WebcastReplay": "WebcastReplay",

    /**
     * value: "Flash"
     * @const
     */
    "Flash": "Flash",

    /**
     * value: "Replay"
     * @const
     */
    "Replay": "Replay",

    /**
     * value: "Phone"
     * @const
     */
    "Phone": "Phone"
};



export default EventsAudioDailyObjectOne;

