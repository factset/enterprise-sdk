/**
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The SharesOutstandingResponseObject model module.
 * @module model/SharesOutstandingResponseObject
 */
class SharesOutstandingResponseObject {
    /**
     * Constructs a new <code>SharesOutstandingResponseObject</code>.
     * @alias module:model/SharesOutstandingResponseObject
     */
    constructor() { 
        
        SharesOutstandingResponseObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SharesOutstandingResponseObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SharesOutstandingResponseObject} obj Optional instance to populate.
     * @return {module:model/SharesOutstandingResponseObject} The populated <code>SharesOutstandingResponseObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SharesOutstandingResponseObject();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('documentId')) {
                obj['documentId'] = ApiClient.convertToType(data['documentId'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('reportDate')) {
                obj['reportDate'] = ApiClient.convertToType(data['reportDate'], 'Date');
            }
            if (data.hasOwnProperty('publicationDate')) {
                obj['publicationDate'] = ApiClient.convertToType(data['publicationDate'], 'Date');
            }
            if (data.hasOwnProperty('fiscalYear')) {
                obj['fiscalYear'] = ApiClient.convertToType(data['fiscalYear'], 'Number');
            }
            if (data.hasOwnProperty('reportingPeriodDescription')) {
                obj['reportingPeriodDescription'] = ApiClient.convertToType(data['reportingPeriodDescription'], 'String');
            }
            if (data.hasOwnProperty('reportingPeriod')) {
                obj['reportingPeriod'] = ApiClient.convertToType(data['reportingPeriod'], 'Number');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('adrDescription')) {
                obj['adrDescription'] = ApiClient.convertToType(data['adrDescription'], 'String');
            }
            if (data.hasOwnProperty('adrRatio')) {
                obj['adrRatio'] = ApiClient.convertToType(data['adrRatio'], 'Number');
            }
            if (data.hasOwnProperty('adrFsymId')) {
                obj['adrFsymId'] = ApiClient.convertToType(data['adrFsymId'], 'String');
            }
            if (data.hasOwnProperty('totalOutstanding')) {
                obj['totalOutstanding'] = ApiClient.convertToType(data['totalOutstanding'], 'Number');
            }
            if (data.hasOwnProperty('adrTotalOutstanding')) {
                obj['adrTotalOutstanding'] = ApiClient.convertToType(data['adrTotalOutstanding'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Security-level FactSet Permanent Identifier associated with the identifier.
 * @member {String} fsymId
 */
SharesOutstandingResponseObject.prototype['fsymId'] = undefined;

/**
 * Date of the record in YYYY-MM-DD format.
 * @member {Date} date
 */
SharesOutstandingResponseObject.prototype['date'] = undefined;

/**
 * Unique Identifier for each document or filing which contains the outstanding shares position.
 * @member {String} documentId
 */
SharesOutstandingResponseObject.prototype['documentId'] = undefined;

/**
 * FactSet Security Permanent Identifier that was used for the request.
 * @member {String} requestId
 */
SharesOutstandingResponseObject.prototype['requestId'] = undefined;

/**
 * Reporting date of the position.
 * @member {Date} reportDate
 */
SharesOutstandingResponseObject.prototype['reportDate'] = undefined;

/**
 * Exact date that results have been communicated to the market.
 * @member {Date} publicationDate
 */
SharesOutstandingResponseObject.prototype['publicationDate'] = undefined;

/**
 * The company's fiscal year corresponding to the report.
 * @member {Number} fiscalYear
 */
SharesOutstandingResponseObject.prototype['fiscalYear'] = undefined;

/**
 * Textual description of the reporting period.
 * @member {String} reportingPeriodDescription
 */
SharesOutstandingResponseObject.prototype['reportingPeriodDescription'] = undefined;

/**
 * Code representing the unique reporting period. Options are as follows: - 1 - 1st Quarter - 2 - 2nd Quarter - 3 - 3rd Quarter - 4 - 4th Quarter - 6 - Mid-Year 
 * @member {Number} reportingPeriod
 */
SharesOutstandingResponseObject.prototype['reportingPeriod'] = undefined;

/**
 * Different stock types based on the rights and benefits from ownership.
 * @member {String} description
 */
SharesOutstandingResponseObject.prototype['description'] = undefined;

/**
 * Different stock types based on the rights and benefits from ownership for the ADR.
 * @member {String} adrDescription
 */
SharesOutstandingResponseObject.prototype['adrDescription'] = undefined;

/**
 * Number of common or ordinary shares that are equivalent to one American Depositary Receipt (ADR).
 * @member {Number} adrRatio
 */
SharesOutstandingResponseObject.prototype['adrRatio'] = undefined;

/**
 * Unique FactSet generated identifier assigned to a security, representing the ADR security.
 * @member {String} adrFsymId
 */
SharesOutstandingResponseObject.prototype['adrFsymId'] = undefined;

/**
 * Number of shares outstanding as of `date`.
 * @member {Number} totalOutstanding
 */
SharesOutstandingResponseObject.prototype['totalOutstanding'] = undefined;

/**
 * Number of shares outstanding for the ADR as of `date`.
 * @member {Number} adrTotalOutstanding
 */
SharesOutstandingResponseObject.prototype['adrTotalOutstanding'] = undefined;






export default SharesOutstandingResponseObject;
