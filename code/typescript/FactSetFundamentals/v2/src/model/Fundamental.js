/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FundamentalValue from './FundamentalValue';

/**
 * The Fundamental model module.
 * @module model/Fundamental
 */
class Fundamental {
    /**
     * Constructs a new <code>Fundamental</code>.
     * FactSet Fundamentals Response item
     * @alias module:model/Fundamental
     * @param fiscalPeriod {Number} Fiscal Period indicator. Returns an integer representing the fiscal period for the requested item and periodicity. QUARTERLY CODE: 1-Fist Quarter; 2-Second Quarter; 3-Third Quarter; 4-Fourth Quarter. SEMI-CODE: 1-First Semi-annual Period; 2-Second Semi-annual Period.
     */
    constructor(fiscalPeriod) { 
        
        Fundamental.initialize(this, fiscalPeriod);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, fiscalPeriod) { 
        obj['fiscalPeriod'] = fiscalPeriod;
    }

    /**
     * Constructs a <code>Fundamental</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Fundamental} obj Optional instance to populate.
     * @return {module:model/Fundamental} The populated <code>Fundamental</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Fundamental();

            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('metric')) {
                obj['metric'] = ApiClient.convertToType(data['metric'], 'String');
            }
            if (data.hasOwnProperty('periodicity')) {
                obj['periodicity'] = ApiClient.convertToType(data['periodicity'], 'String');
            }
            if (data.hasOwnProperty('fiscalPeriod')) {
                obj['fiscalPeriod'] = ApiClient.convertToType(data['fiscalPeriod'], 'Number');
            }
            if (data.hasOwnProperty('fiscalYear')) {
                obj['fiscalYear'] = ApiClient.convertToType(data['fiscalYear'], 'Number');
            }
            if (data.hasOwnProperty('fiscalPeriodLength')) {
                obj['fiscalPeriodLength'] = ApiClient.convertToType(data['fiscalPeriodLength'], 'Number');
            }
            if (data.hasOwnProperty('fiscalEndDate')) {
                obj['fiscalEndDate'] = ApiClient.convertToType(data['fiscalEndDate'], 'Date');
            }
            if (data.hasOwnProperty('reportDate')) {
                obj['reportDate'] = ApiClient.convertToType(data['reportDate'], 'Date');
            }
            if (data.hasOwnProperty('epsReportDate')) {
                obj['epsReportDate'] = ApiClient.convertToType(data['epsReportDate'], 'Date');
            }
            if (data.hasOwnProperty('updateType')) {
                obj['updateType'] = ApiClient.convertToType(data['updateType'], 'String');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = FundamentalValue.constructFromObject(data['value']);
            }
        }
        return obj;
    }


}

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
Fundamental.prototype['requestId'] = undefined;

/**
 * FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
 * @member {String} fsymId
 */
Fundamental.prototype['fsymId'] = undefined;

/**
 * The requested `metric` input, representing the Fundamental Data Item. For a definition of the item please use the /fundamentals/v#/metrics endpoint.
 * @member {String} metric
 */
Fundamental.prototype['metric'] = undefined;

/**
 * Periodicity or frequency of the fiscal periods, where ANN = Annual Original, ANN_R = Annual Latest, QTR = Quarterly Original, QTR_R = Quarterly Latest, SEMI = Semi-Annual Original, SEMI_R = Semi-Annual Latest, LTM = Last Twelve Months Original, LTM_R = Last Twelve Months Latest, LTMSG = Last Twelve Months Global, [OA17959](https://my.apps.factset.com/oa/pages/17959), LTM_SEMI = Last Twelve Months - Semi-Annual Data and YTD = Year-to-date. Please note that the coverage for SEMI_R and LTM_R may be limited as fewer companies report with these periodicities.
 * @member {module:model/Fundamental.PeriodicityEnum} periodicity
 */
Fundamental.prototype['periodicity'] = undefined;

/**
 * Fiscal Period indicator. Returns an integer representing the fiscal period for the requested item and periodicity. QUARTERLY CODE: 1-Fist Quarter; 2-Second Quarter; 3-Third Quarter; 4-Fourth Quarter. SEMI-CODE: 1-First Semi-annual Period; 2-Second Semi-annual Period.
 * @member {Number} fiscalPeriod
 */
Fundamental.prototype['fiscalPeriod'] = undefined;

/**
 * Fiscal year of the reported period in YYYY format.
 * @member {Number} fiscalYear
 */
Fundamental.prototype['fiscalYear'] = undefined;

/**
 * Length of the fiscal period in days.
 * @member {Number} fiscalPeriodLength
 */
Fundamental.prototype['fiscalPeriodLength'] = undefined;

/**
 * The normalized data the fiscal period ended.
 * @member {Date} fiscalEndDate
 */
Fundamental.prototype['fiscalEndDate'] = undefined;

/**
 * The date the reported fiscal period ended.
 * @member {Date} reportDate
 */
Fundamental.prototype['reportDate'] = undefined;

/**
 * The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. Unavailable data returned as 0001-01-01.
 * @member {Date} epsReportDate
 */
Fundamental.prototype['epsReportDate'] = undefined;

/**
 * Update Type: Preliminary - The period is updated from a report that usually contains limited or only key information., Final - The period is updated from a report where detailed information is available in financial statements including the notes to the line items.
 * @member {module:model/Fundamental.UpdateTypeEnum} updateType
 */
Fundamental.prototype['updateType'] = undefined;

/**
 * Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
Fundamental.prototype['currency'] = undefined;

/**
 * @member {module:model/FundamentalValue} value
 */
Fundamental.prototype['value'] = undefined;





/**
 * Allowed values for the <code>periodicity</code> property.
 * @enum {String}
 * @readonly
 */
Fundamental['PeriodicityEnum'] = {

    /**
     * value: "ANN"
     * @const
     */
    "ANN": "ANN",

    /**
     * value: "ANN_R"
     * @const
     */
    "ANN_R": "ANN_R",

    /**
     * value: "QTR"
     * @const
     */
    "QTR": "QTR",

    /**
     * value: "QTR_R"
     * @const
     */
    "QTR_R": "QTR_R",

    /**
     * value: "SEMI"
     * @const
     */
    "SEMI": "SEMI",

    /**
     * value: "SEMI_R"
     * @const
     */
    "SEMI_R": "SEMI_R",

    /**
     * value: "CAL"
     * @const
     */
    "CAL": "CAL",

    /**
     * value: "LTM"
     * @const
     */
    "LTM": "LTM",

    /**
     * value: "LTM_R"
     * @const
     */
    "LTM_R": "LTM_R",

    /**
     * value: "LTMSG"
     * @const
     */
    "LTMSG": "LTMSG",

    /**
     * value: "LTM_SEMI"
     * @const
     */
    "LTM_SEMI": "LTM_SEMI",

    /**
     * value: "YTD"
     * @const
     */
    "YTD": "YTD"
};


/**
 * Allowed values for the <code>updateType</code> property.
 * @enum {String}
 * @readonly
 */
Fundamental['UpdateTypeEnum'] = {

    /**
     * value: "Preliminary"
     * @const
     */
    "Preliminary": "Preliminary",

    /**
     * value: "Final"
     * @const
     */
    "Final": "Final"
};



export default Fundamental;

