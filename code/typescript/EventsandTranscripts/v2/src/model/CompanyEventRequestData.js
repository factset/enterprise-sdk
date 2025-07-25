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
import CompanyEventRequestDataDateTime from './CompanyEventRequestDataDateTime';
import CompanyEventRequestDataUniverse from './CompanyEventRequestDataUniverse';

/**
 * The CompanyEventRequestData model module.
 * @module model/CompanyEventRequestData
 */
class CompanyEventRequestData {
    /**
     * Constructs a new <code>CompanyEventRequestData</code>.
     * @alias module:model/CompanyEventRequestData
     */
    constructor() { 
        
        CompanyEventRequestData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CompanyEventRequestData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CompanyEventRequestData} obj Optional instance to populate.
     * @return {module:model/CompanyEventRequestData} The populated <code>CompanyEventRequestData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CompanyEventRequestData();

            if (data.hasOwnProperty('dateTime')) {
                obj['dateTime'] = CompanyEventRequestDataDateTime.constructFromObject(data['dateTime']);
            }
            if (data.hasOwnProperty('universe')) {
                obj['universe'] = CompanyEventRequestDataUniverse.constructFromObject(data['universe']);
            }
            if (data.hasOwnProperty('eventTypes')) {
                obj['eventTypes'] = ApiClient.convertToType(data['eventTypes'], ['String']);
            }
            if (data.hasOwnProperty('lastModifiedWithin')) {
                obj['lastModifiedWithin'] = ApiClient.convertToType(data['lastModifiedWithin'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/CompanyEventRequestDataDateTime} dateTime
 */
CompanyEventRequestData.prototype['dateTime'] = undefined;

/**
 * @member {module:model/CompanyEventRequestDataUniverse} universe
 */
CompanyEventRequestData.prototype['universe'] = undefined;

/**
 * Refers to the various event types returned in the response:  * Earnings: Regular quarterly calls where companies provide insights into their latest earnings, sharing details on their financial performance, including revenue, profits, and earnings per share.  * SalesRevenueCall: Conference calls focused on discussing comprehensive sales activity and revenue figures, typically held monthly or quarterly.  * GuidanceCall: Calls where companies offer estimated financial information about future earnings or outline business outlooks before official earnings are released.  * AnalystsInvestorsMeeting: A company-hosted gathering for analysts and investors to discuss strategic updates and financial health.  * ShareholdersMeeting: A meeting where shareholders convene to discuss corporate developments and vote on important matters.  * SpecialSituation: Conference calls addressing situations that do not fit into standard categories, often concerning mergers, acquisitions, joint ventures, or significant business updates.  * Conference: An event where individuals gather to discuss and share ideas on common interests, often including various formats such as panel discussions, workshops, and keynote presentations.  * ConfirmedEarningsRelease: Officially announced date when a company will publish its actual earnings results.  * ProjectedEarningsRelease:  Scheduled release date of a company’s estimated or forecasted earnings before actual results.  * SalesRevenueRelease: Disclosure of a company’s revenue figures, usually as part of earnings or performance updates.  * Split: Corporate action that multiplies share count and reduces share price proportionally, without affecting market cap.  * Dividend: Cash or stock distribution paid to shareholders, reflecting a share of company profits.
 * @member {Array.<module:model/CompanyEventRequestData.EventTypesEnum>} eventTypes
 */
CompanyEventRequestData.prototype['eventTypes'] = undefined;

/**
 * The duration within which the events were last modified.  **Note 1:** When using `lastModifiedWithin`, the endpoint will return events that have been modified within the specified interval in the recent past as well as those anticipated in the near future—within a span of 45 days.  **Note 2:** If both `dateTime` and `lastModifiedWithin` are provided in the same request, the API will return an error. 
 * @member {module:model/CompanyEventRequestData.LastModifiedWithinEnum} lastModifiedWithin
 */
CompanyEventRequestData.prototype['lastModifiedWithin'] = undefined;





/**
 * Allowed values for the <code>eventTypes</code> property.
 * @enum {String}
 * @readonly
 */
CompanyEventRequestData['EventTypesEnum'] = {

    /**
     * value: "Earnings"
     * @const
     */
    "Earnings": "Earnings",

    /**
     * value: "SalesRevenueCall"
     * @const
     */
    "SalesRevenueCall": "SalesRevenueCall",

    /**
     * value: "GuidanceCall"
     * @const
     */
    "GuidanceCall": "GuidanceCall",

    /**
     * value: "AnalystsInvestorsMeeting"
     * @const
     */
    "AnalystsInvestorsMeeting": "AnalystsInvestorsMeeting",

    /**
     * value: "ShareholdersMeeting"
     * @const
     */
    "ShareholdersMeeting": "ShareholdersMeeting",

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
     * value: "ConfirmedEarningsRelease"
     * @const
     */
    "ConfirmedEarningsRelease": "ConfirmedEarningsRelease",

    /**
     * value: "ProjectedEarningsRelease"
     * @const
     */
    "ProjectedEarningsRelease": "ProjectedEarningsRelease",

    /**
     * value: "SalesRevenueRelease"
     * @const
     */
    "SalesRevenueRelease": "SalesRevenueRelease",

    /**
     * value: "Split"
     * @const
     */
    "Split": "Split",

    /**
     * value: "Dividend"
     * @const
     */
    "Dividend": "Dividend"
};


/**
 * Allowed values for the <code>lastModifiedWithin</code> property.
 * @enum {String}
 * @readonly
 */
CompanyEventRequestData['LastModifiedWithinEnum'] = {

    /**
     * value: "SixHours"
     * @const
     */
    "SixHours": "SixHours",

    /**
     * value: "TwelveHours"
     * @const
     */
    "TwelveHours": "TwelveHours",

    /**
     * value: "Today"
     * @const
     */
    "Today": "Today",

    /**
     * value: "TwoDays"
     * @const
     */
    "TwoDays": "TwoDays",

    /**
     * value: "OneWeek"
     * @const
     */
    "OneWeek": "OneWeek",

    /**
     * value: "OneMonth"
     * @const
     */
    "OneMonth": "OneMonth"
};



export default CompanyEventRequestData;

