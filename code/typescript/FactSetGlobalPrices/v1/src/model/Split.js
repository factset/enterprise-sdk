/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Split model module.
 * @module model/Split
 */
class Split {
    /**
     * Constructs a new <code>Split</code>.
     * @alias module:model/Split
     */
    constructor() { 
        
        Split.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Split</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Split} obj Optional instance to populate.
     * @return {module:model/Split} The populated <code>Split</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Split();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('eventId')) {
                obj['eventId'] = ApiClient.convertToType(data['eventId'], 'String');
            }
            if (data.hasOwnProperty('eventTypeCode')) {
                obj['eventTypeCode'] = ApiClient.convertToType(data['eventTypeCode'], 'String');
            }
            if (data.hasOwnProperty('eventTypeDesc')) {
                obj['eventTypeDesc'] = ApiClient.convertToType(data['eventTypeDesc'], 'String');
            }
            if (data.hasOwnProperty('announcementDate')) {
                obj['announcementDate'] = ApiClient.convertToType(data['announcementDate'], 'String');
            }
            if (data.hasOwnProperty('recordDate')) {
                obj['recordDate'] = ApiClient.convertToType(data['recordDate'], 'String');
            }
            if (data.hasOwnProperty('payDate')) {
                obj['payDate'] = ApiClient.convertToType(data['payDate'], 'String');
            }
            if (data.hasOwnProperty('effectiveDate')) {
                obj['effectiveDate'] = ApiClient.convertToType(data['effectiveDate'], 'String');
            }
            if (data.hasOwnProperty('adjFactor')) {
                obj['adjFactor'] = ApiClient.convertToType(data['adjFactor'], 'Number');
            }
            if (data.hasOwnProperty('adjFactorCombined')) {
                obj['adjFactorCombined'] = ApiClient.convertToType(data['adjFactorCombined'], 'Number');
            }
            if (data.hasOwnProperty('distOldTerm')) {
                obj['distOldTerm'] = ApiClient.convertToType(data['distOldTerm'], 'Number');
            }
            if (data.hasOwnProperty('distNewTerm')) {
                obj['distNewTerm'] = ApiClient.convertToType(data['distNewTerm'], 'Number');
            }
            if (data.hasOwnProperty('distInstFsymId')) {
                obj['distInstFsymId'] = ApiClient.convertToType(data['distInstFsymId'], 'String');
            }
            if (data.hasOwnProperty('shortDesc')) {
                obj['shortDesc'] = ApiClient.convertToType(data['shortDesc'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
 * @member {String} fsymId
 */
Split.prototype['fsymId'] = undefined;

/**
 * FactSet identifier that uniquely identifies the Event.
 * @member {String} eventId
 */
Split.prototype['eventId'] = undefined;

/**
 * Character code that denotes the type of Event.
 * @member {module:model/Split.EventTypeCodeEnum} eventTypeCode
 */
Split.prototype['eventTypeCode'] = undefined;

/**
 * Corporate Actions Event type description.
 * @member {String} eventTypeDesc
 */
Split.prototype['eventTypeDesc'] = undefined;

/**
 * Date Event was announced in YYYY-MM-DD format.
 * @member {String} announcementDate
 */
Split.prototype['announcementDate'] = undefined;

/**
 * Date of Record for distribution in YYYY-MM-DD format.
 * @member {String} recordDate
 */
Split.prototype['recordDate'] = undefined;

/**
 * Date of Payment for distribution in YYYY-MM-DD format.
 * @member {String} payDate
 */
Split.prototype['payDate'] = undefined;

/**
 * Effective Date or Ex-Date of distribution in YYYY-MM-DD format.
 * @member {String} effectiveDate
 */
Split.prototype['effectiveDate'] = undefined;

/**
 * Factor for adjusting price and shares. A 2-for-1 split returns .50, the number you would multiply the stock price by to adjust for the split. 
 * @member {Number} adjFactor
 */
Split.prototype['adjFactor'] = undefined;

/**
 * Combined adjustment factor for all distribution events on that day.
 * @member {Number} adjFactorCombined
 */
Split.prototype['adjFactorCombined'] = undefined;

/**
 * Component of distribution ratio -  Number of shares held.
 * @member {Number} distOldTerm
 */
Split.prototype['distOldTerm'] = undefined;

/**
 * Component of distribution ratio -  Number of shares received.
 * @member {Number} distNewTerm
 */
Split.prototype['distNewTerm'] = undefined;

/**
 * Parent Spin-Off for a company
 * @member {String} distInstFsymId
 */
Split.prototype['distInstFsymId'] = undefined;

/**
 * Textual description identifying the event.
 * @member {String} shortDesc
 */
Split.prototype['shortDesc'] = undefined;

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
Split.prototype['requestId'] = undefined;





/**
 * Allowed values for the <code>eventTypeCode</code> property.
 * @enum {String}
 * @readonly
 */
Split['EventTypeCodeEnum'] = {

    /**
     * value: "FSP"
     * @const
     */
    "FSP": "FSP",

    /**
     * value: "RSP"
     * @const
     */
    "RSP": "RSP",

    /**
     * value: "SPL"
     * @const
     */
    "SPL": "SPL"
};



export default Split;

