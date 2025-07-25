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

/**
 * The NrtCallsResponseData model module.
 * @module model/NrtCallsResponseData
 */
class NrtCallsResponseData {
    /**
     * Constructs a new <code>NrtCallsResponseData</code>.
     * @alias module:model/NrtCallsResponseData
     */
    constructor() { 
        
        NrtCallsResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NrtCallsResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/NrtCallsResponseData} obj Optional instance to populate.
     * @return {module:model/NrtCallsResponseData} The populated <code>NrtCallsResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NrtCallsResponseData();

            if (data.hasOwnProperty('reportId')) {
                obj['reportId'] = ApiClient.convertToType(data['reportId'], 'Number');
            }
            if (data.hasOwnProperty('audioSource')) {
                obj['audioSource'] = ApiClient.convertToType(data['audioSource'], 'String');
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
            if (data.hasOwnProperty('eventType')) {
                obj['eventType'] = ApiClient.convertToType(data['eventType'], 'String');
            }
            if (data.hasOwnProperty('eventTitle')) {
                obj['eventTitle'] = ApiClient.convertToType(data['eventTitle'], 'String');
            }
            if (data.hasOwnProperty('callStatus')) {
                obj['callStatus'] = ApiClient.convertToType(data['callStatus'], 'String');
            }
            if (data.hasOwnProperty('recordingStartTime')) {
                obj['recordingStartTime'] = ApiClient.convertToType(data['recordingStartTime'], 'Date');
            }
            if (data.hasOwnProperty('eventDatetime')) {
                obj['eventDatetime'] = ApiClient.convertToType(data['eventDatetime'], 'Date');
            }
        }
        return obj;
    }


}

/**
 * The unique ID for an event.
 * @member {Number} reportId
 */
NrtCallsResponseData.prototype['reportId'] = undefined;

/**
 * Identifier for the source of how the event is recorded. - PhoneReplay: Event is recorded through phone playback. - Webcast: Event is recorded through online broadcast.
 * @member {module:model/NrtCallsResponseData.AudioSourceEnum} audioSource
 */
NrtCallsResponseData.prototype['audioSource'] = undefined;

/**
 * Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in - P or webcast - W). One reportId can have multiple audiosourceIDs.
 * @member {Number} audioSourceId
 */
NrtCallsResponseData.prototype['audioSourceId'] = undefined;

/**
 * Ticker-region identifier for the company hosting the event.
 * @member {String} ticker
 */
NrtCallsResponseData.prototype['ticker'] = undefined;

/**
 * Factset entity level identifier for the company hosting the event.
 * @member {String} entityId
 */
NrtCallsResponseData.prototype['entityId'] = undefined;

/**
 * Refers to the various event types covered by FactSet CallStreet:  * EarningsCall: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * EarningsRelease: Official statements or press releases that publish a company's financial results for a specific period, highlighting profit and loss metrics.  * SalesRevenueCall: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * SalesRevenueRelease: Press releases that disclose the latest sales and revenue data, detailing the financial performance of sales operations over a given timeframe.  * Guidance: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * Conference: An event where individuals gather to discuss and share ideas on common interests, often including various formats such as panel discussions, workshops, and keynote presentations.  * Presentation:  A structured delivery of information to an audience, typically within a conference setting, using formats like lectures, seminars, or webinars to convey specific topics or findings.  * Analyst, Investor & Shareholder Meeting: Gatherings hosted by companies for analysts, investors, and shareholders to discuss strategic updates, financial health, and corporate developments.  * Special Situation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates.
 * @member {module:model/NrtCallsResponseData.EventTypeEnum} eventType
 */
NrtCallsResponseData.prototype['eventType'] = undefined;

/**
 * Title of the Event.
 * @member {String} eventTitle
 */
NrtCallsResponseData.prototype['eventTitle'] = undefined;

/**
 * Status of the call i.e. Ended, InProgress, EndedWithoutNotification, or IssueAtSource.  * InProgress - the call is in progress. * Ended - the call has ended. * EndedWithoutNotification - the call has technically ended and can be considered as ended but is missing a notification from the upstream systems. * IssueAtSource - the call has ended with no snippet data due to a possible issue at the source.
 * @member {module:model/NrtCallsResponseData.CallStatusEnum} callStatus
 */
NrtCallsResponseData.prototype['callStatus'] = undefined;

/**
 * The UTC timestamp of when the recording started.
 * @member {Date} recordingStartTime
 */
NrtCallsResponseData.prototype['recordingStartTime'] = undefined;

/**
 * The official UTC timestamp of the start of the event.
 * @member {Date} eventDatetime
 */
NrtCallsResponseData.prototype['eventDatetime'] = undefined;





/**
 * Allowed values for the <code>audioSource</code> property.
 * @enum {String}
 * @readonly
 */
NrtCallsResponseData['AudioSourceEnum'] = {

    /**
     * value: "PhoneReplay"
     * @const
     */
    "PhoneReplay": "PhoneReplay",

    /**
     * value: "Webcast"
     * @const
     */
    "Webcast": "Webcast"
};


/**
 * Allowed values for the <code>eventType</code> property.
 * @enum {String}
 * @readonly
 */
NrtCallsResponseData['EventTypeEnum'] = {

    /**
     * value: "AnalystsInvestorsShareholdersMeeting"
     * @const
     */
    "AnalystsInvestorsShareholdersMeeting": "AnalystsInvestorsShareholdersMeeting",

    /**
     * value: "EarningsCall"
     * @const
     */
    "EarningsCall": "EarningsCall",

    /**
     * value: "EarningsRelease"
     * @const
     */
    "EarningsRelease": "EarningsRelease",

    /**
     * value: "Guidance"
     * @const
     */
    "Guidance": "Guidance",

    /**
     * value: "SalesRevenueCall"
     * @const
     */
    "SalesRevenueCall": "SalesRevenueCall",

    /**
     * value: "SalesRevenueRelease"
     * @const
     */
    "SalesRevenueRelease": "SalesRevenueRelease",

    /**
     * value: "SpecialSituation"
     * @const
     */
    "SpecialSituation": "SpecialSituation",

    /**
     * value: "Conference"
     * @const
     */
    "Conference": "Conference",

    /**
     * value: "Presentation"
     * @const
     */
    "Presentation": "Presentation"
};


/**
 * Allowed values for the <code>callStatus</code> property.
 * @enum {String}
 * @readonly
 */
NrtCallsResponseData['CallStatusEnum'] = {

    /**
     * value: "InProgress"
     * @const
     */
    "InProgress": "InProgress",

    /**
     * value: "Ended"
     * @const
     */
    "Ended": "Ended",

    /**
     * value: "EndedWithoutNotification"
     * @const
     */
    "EndedWithoutNotification": "EndedWithoutNotification",

    /**
     * value: "IssueAtSource"
     * @const
     */
    "IssueAtSource": "IssueAtSource"
};



export default NrtCallsResponseData;

