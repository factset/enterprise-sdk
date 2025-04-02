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
 * The CorporateAction model module.
 * @module model/CorporateAction
 */
class CorporateAction {
    /**
     * Constructs a new <code>CorporateAction</code>.
     * @alias module:model/CorporateAction
     * @extends Object
     */
    constructor() { 
        
        CorporateAction.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CorporateAction</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CorporateAction} obj Optional instance to populate.
     * @return {module:model/CorporateAction} The populated <code>CorporateAction</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CorporateAction();

            ApiClient.constructFromObject(data, obj, 'Object');
            

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
            if (data.hasOwnProperty('divTypeCode')) {
                obj['divTypeCode'] = ApiClient.convertToType(data['divTypeCode'], 'String');
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
CorporateAction.prototype['fsymId'] = undefined;

/**
 * FactSet identifier that uniquely identifies the Event.
 * @member {String} eventId
 */
CorporateAction.prototype['eventId'] = undefined;

/**
 * Corporate Actions Event type code, possible values: [ DVC, DVCD, DRP, DVS, DVSS, BNS, BNSS, SPO, DSR, FSP, RSP, SPL ]
 * @member {String} eventTypeCode
 */
CorporateAction.prototype['eventTypeCode'] = undefined;

/**
 * Corporate Actions Event type description.
 * @member {String} eventTypeDesc
 */
CorporateAction.prototype['eventTypeDesc'] = undefined;

/**
 * Dividend Type Code. For code descriptions, visit [Online Assistant Page #8764] (https://oa.apps.factset.com/pages/8764). 
 * @member {String} divTypeCode
 */
CorporateAction.prototype['divTypeCode'] = undefined;

/**
 * Date Event was announced in YYYY-MM-DD format.
 * @member {String} announcementDate
 */
CorporateAction.prototype['announcementDate'] = undefined;

/**
 * Date of Record for distribution in YYYY-MM-DD format.
 * @member {String} recordDate
 */
CorporateAction.prototype['recordDate'] = undefined;

/**
 * Date of Payment for distribution in YYYY-MM-DD format.
 * @member {String} payDate
 */
CorporateAction.prototype['payDate'] = undefined;

/**
 * Effective Date or Ex-Date of distribution in YYYY-MM-DD format.
 * @member {String} effectiveDate
 */
CorporateAction.prototype['effectiveDate'] = undefined;

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
CorporateAction.prototype['requestId'] = undefined;






export default CorporateAction;

