/**
 * Events and Transcripts API
 * <p>The Calendar Events API provides access to FactSetâ€™s Event Calendar data alongside business logic that allows users to replicate views and functionality consistent with the experience provided by the Workstation. This API provides the ability to pull Event Calendar data based on specific filters.</p> <p>Events Audio API provides access to historical as well as the latest audio recordings of various company events covered by FactSet. The events include, but are not limited to: earnings calls, conferences, and investor days. This API also provides relevant metadata such as timestamps and identifiers around each audio file.</p> <p>The  Near Real-time Transcripts API enables access to Near Real-time Transcripts provided by CallStreet to time-sensitive clients. This API also provides the relevant speaker metadata along with their confidence scores. This data caters to quant clients interested in building machine learning models. Clients can leverage this API to perform sentiment analysis through natural language processing or machine learning. It can also be used to complement analysis using FactSet's transcripts service.</p> <p>Transcripts API provides conference call transcripts for companies' publicly held conference calls and a wealth of information regarding upcoming corporate events, such as conference call date and time, phone number and password, type of conference call, and important company investor relations contact information.</p> 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import DocumentResult from './DocumentResult';
import InvalidIdErrorData from './InvalidIdErrorData';
import TranscriptsByIdsResponse from './TranscriptsByIdsResponse';

/**
 * The TranscriptsResponseData model module.
 * @module model/TranscriptsResponseData
 */
class TranscriptsResponseData {
    /**
     * Constructs a new <code>TranscriptsResponseData</code>.
     * @alias module:model/TranscriptsResponseData
     * @implements module:model/TranscriptsByIdsResponse
     * @implements module:model/DocumentResult
     * @param requestId {String} The requested identifier associated with this group of documents.
     * @param storyDateTime {Date} Refers to either the date and time of the story, when it is available in workstation (in the specified timeZone) or the date and time FactSet received it from the vendor.
     */
    constructor(requestId, storyDateTime) { 
        TranscriptsByIdsResponse.initialize(this, requestId);DocumentResult.initialize(this, storyDateTime);
        TranscriptsResponseData.initialize(this, requestId, storyDateTime);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, requestId, storyDateTime) { 
        obj['requestId'] = requestId;
        obj['storyDateTime'] = storyDateTime;
    }

    /**
     * Constructs a <code>TranscriptsResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TranscriptsResponseData} obj Optional instance to populate.
     * @return {module:model/TranscriptsResponseData} The populated <code>TranscriptsResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        switch (data['transcriptResponseType']) {
            case 'documentResult':
              return DocumentResult.constructFromObject(data, obj);
            case 'transcriptById':
              return TranscriptsByIdsResponse.constructFromObject(data, obj);
        }
        return obj;
    }


}

/**
 * Returns the Transcripts data based on provided Dates, Text and Times.
 * @member {module:model/TranscriptsResponseData.TranscriptResponseTypeEnum} transcriptResponseType
 */
TranscriptsResponseData.prototype['transcriptResponseType'] = undefined;

/**
 * The requested identifier associated with this group of documents.
 * @member {String} requestId
 */
TranscriptsResponseData.prototype['requestId'] = undefined;

/**
 * Contains list of documents
 * @member {Array.<module:model/DocumentResult>} documents
 */
TranscriptsResponseData.prototype['documents'] = undefined;

/**
 * @member {module:model/InvalidIdErrorData} error
 */
TranscriptsResponseData.prototype['error'] = undefined;

/**
 * Used to distinguish the corrected reports. As such, one `reportId` can have many `versionIds`.
 * @member {String} versionId
 */
TranscriptsResponseData.prototype['versionId'] = undefined;

/**
 * Refers to the main companies a particular document pertains to.
 * @member {Array.<String>} primaryIds
 */
TranscriptsResponseData.prototype['primaryIds'] = undefined;

/**
 * Refers to all companies mentioned in the document. 
 * @member {Array.<String>} allIds
 */
TranscriptsResponseData.prototype['allIds'] = undefined;

/**
 * This is a unique identifier for a specific transcript (audio or video) returned.
 * @member {String} reportId
 */
TranscriptsResponseData.prototype['reportId'] = undefined;

/**
 * ID of the conference call.
 * @member {String} eventId
 */
TranscriptsResponseData.prototype['eventId'] = undefined;

/**
 * The date when the event took place. Formatted as 'YYYY-MM-DD'.
 * @member {Date} eventDate
 */
TranscriptsResponseData.prototype['eventDate'] = undefined;

/**
 * Specifies the type of transcript.  * NearRealTime: The initial transcripts available soon after an event, providing quick access to the latest information.  * Raw: Raw verbatim transcripts of conference calls available within hours after the completion of the call.  * Corrected: Verbatim transcripts that have been reviewed and corrected by industry-focused financial professionals. Our editors re-listen to the entire call audio and confirm and research all the terms and numbers in the call.
 * @member {module:model/TranscriptsResponseData.TranscriptTypeEnum} transcriptType
 */
TranscriptsResponseData.prototype['transcriptType'] = undefined;

/**
 * Headline of the story.
 * @member {String} headline
 */
TranscriptsResponseData.prototype['headline'] = undefined;

/**
 * Refers to either the date and time of the story, when it is available in workstation (in the specified timeZone) or the date and time FactSet received it from the vendor.
 * @member {Date} storyDateTime
 */
TranscriptsResponseData.prototype['storyDateTime'] = undefined;

/**
 * It is the time when transcript is created (in the specified timeZone).
 * @member {Date} uploadDateTime
 */
TranscriptsResponseData.prototype['uploadDateTime'] = undefined;

/**
 * Specifies the type of event:  * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * Guidance: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * Analyst, Investor & Shareholder Meeting: Gatherings hosted by companies for analysts, investors, and shareholders to discuss strategic updates, financial health, and corporate developments.  * ConferencePresentation: A structured delivery of information within a conference setting, where individuals gather to discuss shared interests through formats such as keynote speeches, panel discussions, workshops, seminars, or webinars.  * SalesRevenue: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates.
 * @member {module:model/TranscriptsResponseData.EventTypeEnum} eventType
 */
TranscriptsResponseData.prototype['eventType'] = undefined;

/**
 * Categories are Country, Industry, and Subject codes. This is a list retrieved from `/meta/categories`
 * @member {Array.<String>} categories
 */
TranscriptsResponseData.prototype['categories'] = undefined;

/**
 * This is the URL for downloading the document with an expiration duration of 24 hours.        
 * @member {String} transcriptsUrl
 */
TranscriptsResponseData.prototype['transcriptsUrl'] = undefined;


// Implement TranscriptsByIdsResponse interface:
/**
 * The data being returned in the search response based on the requested IDs.
 * @member {module:model/TranscriptsByIdsResponse.TranscriptResponseTypeEnum} transcriptResponseType
 */
TranscriptsByIdsResponse.prototype['transcriptResponseType'] = undefined;
/**
 * The requested identifier associated with this group of documents.
 * @member {String} requestId
 */
TranscriptsByIdsResponse.prototype['requestId'] = undefined;
/**
 * Contains list of documents
 * @member {Array.<module:model/DocumentResult>} documents
 */
TranscriptsByIdsResponse.prototype['documents'] = undefined;
/**
 * @member {module:model/InvalidIdErrorData} error
 */
TranscriptsByIdsResponse.prototype['error'] = undefined;
// Implement DocumentResult interface:
/**
 * Returns the Transcripts data based on provided Dates, Text and Times.
 * @member {module:model/DocumentResult.TranscriptResponseTypeEnum} transcriptResponseType
 */
DocumentResult.prototype['transcriptResponseType'] = undefined;
/**
 * Used to distinguish the corrected reports. As such, one `reportId` can have many `versionIds`.
 * @member {String} versionId
 */
DocumentResult.prototype['versionId'] = undefined;
/**
 * Refers to the main companies a particular document pertains to.
 * @member {Array.<String>} primaryIds
 */
DocumentResult.prototype['primaryIds'] = undefined;
/**
 * Refers to all companies mentioned in the document. 
 * @member {Array.<String>} allIds
 */
DocumentResult.prototype['allIds'] = undefined;
/**
 * This is a unique identifier for a specific transcript (audio or video) returned.
 * @member {String} reportId
 */
DocumentResult.prototype['reportId'] = undefined;
/**
 * ID of the conference call.
 * @member {String} eventId
 */
DocumentResult.prototype['eventId'] = undefined;
/**
 * The date when the event took place. Formatted as 'YYYY-MM-DD'.
 * @member {Date} eventDate
 */
DocumentResult.prototype['eventDate'] = undefined;
/**
 * Specifies the type of transcript.  * NearRealTime: The initial transcripts available soon after an event, providing quick access to the latest information.  * Raw: Raw verbatim transcripts of conference calls available within hours after the completion of the call.  * Corrected: Verbatim transcripts that have been reviewed and corrected by industry-focused financial professionals. Our editors re-listen to the entire call audio and confirm and research all the terms and numbers in the call.
 * @member {module:model/DocumentResult.TranscriptTypeEnum} transcriptType
 */
DocumentResult.prototype['transcriptType'] = undefined;
/**
 * Headline of the story.
 * @member {String} headline
 */
DocumentResult.prototype['headline'] = undefined;
/**
 * Refers to either the date and time of the story, when it is available in workstation (in the specified timeZone) or the date and time FactSet received it from the vendor.
 * @member {Date} storyDateTime
 */
DocumentResult.prototype['storyDateTime'] = undefined;
/**
 * It is the time when transcript is created (in the specified timeZone).
 * @member {Date} uploadDateTime
 */
DocumentResult.prototype['uploadDateTime'] = undefined;
/**
 * Specifies the type of event:  * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * Guidance: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * Analyst, Investor & Shareholder Meeting: Gatherings hosted by companies for analysts, investors, and shareholders to discuss strategic updates, financial health, and corporate developments.  * ConferencePresentation: A structured delivery of information within a conference setting, where individuals gather to discuss shared interests through formats such as keynote speeches, panel discussions, workshops, seminars, or webinars.  * SalesRevenue: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates.
 * @member {module:model/DocumentResult.EventTypeEnum} eventType
 */
DocumentResult.prototype['eventType'] = undefined;
/**
 * Categories are Country, Industry, and Subject codes. This is a list retrieved from `/meta/categories`
 * @member {Array.<String>} categories
 */
DocumentResult.prototype['categories'] = undefined;
/**
 * This is the URL for downloading the document with an expiration duration of 24 hours.        
 * @member {String} transcriptsUrl
 */
DocumentResult.prototype['transcriptsUrl'] = undefined;



/**
 * Allowed values for the <code>transcriptResponseType</code> property.
 * @enum {String}
 * @readonly
 */
TranscriptsResponseData['TranscriptResponseTypeEnum'] = {

    /**
     * value: "documentResult"
     * @const
     */
    "documentResult": "documentResult"
};


/**
 * Allowed values for the <code>transcriptType</code> property.
 * @enum {String}
 * @readonly
 */
TranscriptsResponseData['TranscriptTypeEnum'] = {

    /**
     * value: "NearRealTime"
     * @const
     */
    "NearRealTime": "NearRealTime",

    /**
     * value: "Raw"
     * @const
     */
    "Raw": "Raw",

    /**
     * value: "Corrected"
     * @const
     */
    "Corrected": "Corrected"
};


/**
 * Allowed values for the <code>eventType</code> property.
 * @enum {String}
 * @readonly
 */
TranscriptsResponseData['EventTypeEnum'] = {

    /**
     * value: "Earnings"
     * @const
     */
    "Earnings": "Earnings",

    /**
     * value: "Guidance"
     * @const
     */
    "Guidance": "Guidance",

    /**
     * value: "AnalystsShareholdersMeeting"
     * @const
     */
    "AnalystsShareholdersMeeting": "AnalystsShareholdersMeeting",

    /**
     * value: "ConferencePresentation"
     * @const
     */
    "ConferencePresentation": "ConferencePresentation",

    /**
     * value: "SalesRevenue"
     * @const
     */
    "SalesRevenue": "SalesRevenue",

    /**
     * value: "SpecialSituation"
     * @const
     */
    "SpecialSituation": "SpecialSituation",

    /**
     * value: "SalesRevenueRelease"
     * @const
     */
    "SalesRevenueRelease": "SalesRevenueRelease"
};



export default TranscriptsResponseData;

