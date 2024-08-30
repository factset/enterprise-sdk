/**
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
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
 * The DistCurrent model module.
 * @module model/DistCurrent
 */
class DistCurrent {
    /**
     * Constructs a new <code>DistCurrent</code>.
     * @alias module:model/DistCurrent
     */
    constructor() { 
        
        DistCurrent.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>DistCurrent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DistCurrent} obj Optional instance to populate.
     * @return {module:model/DistCurrent} The populated <code>DistCurrent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DistCurrent();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('totalDistributions')) {
                obj['totalDistributions'] = ApiClient.convertToType(data['totalDistributions'], 'Number');
            }
            if (data.hasOwnProperty('returnOfCapital')) {
                obj['returnOfCapital'] = ApiClient.convertToType(data['returnOfCapital'], 'Number');
            }
            if (data.hasOwnProperty('qualifiedDividends')) {
                obj['qualifiedDividends'] = ApiClient.convertToType(data['qualifiedDividends'], 'Number');
            }
            if (data.hasOwnProperty('nonQalifiedDividends')) {
                obj['nonQalifiedDividends'] = ApiClient.convertToType(data['nonQalifiedDividends'], 'Number');
            }
            if (data.hasOwnProperty('dailyAccruedDividends')) {
                obj['dailyAccruedDividends'] = ApiClient.convertToType(data['dailyAccruedDividends'], 'Number');
            }
            if (data.hasOwnProperty('stCapitalGains')) {
                obj['stCapitalGains'] = ApiClient.convertToType(data['stCapitalGains'], 'Number');
            }
            if (data.hasOwnProperty('ltCapitalGains')) {
                obj['ltCapitalGains'] = ApiClient.convertToType(data['ltCapitalGains'], 'Number');
            }
            if (data.hasOwnProperty('indicatedAnnualDividend')) {
                obj['indicatedAnnualDividend'] = ApiClient.convertToType(data['indicatedAnnualDividend'], 'Number');
            }
            if (data.hasOwnProperty('distFrequency')) {
                obj['distFrequency'] = ApiClient.convertToType(data['distFrequency'], 'String');
            }
            if (data.hasOwnProperty('ltmDistYield')) {
                obj['ltmDistYield'] = ApiClient.convertToType(data['ltmDistYield'], 'Number');
            }
            if (data.hasOwnProperty('firstDistDate')) {
                obj['firstDistDate'] = ApiClient.convertToType(data['firstDistDate'], 'Date');
            }
            if (data.hasOwnProperty('sevenDayNetSecYield')) {
                obj['sevenDayNetSecYield'] = ApiClient.convertToType(data['sevenDayNetSecYield'], 'Number');
            }
            if (data.hasOwnProperty('sevenDayGrossSecYield')) {
                obj['sevenDayGrossSecYield'] = ApiClient.convertToType(data['sevenDayGrossSecYield'], 'Number');
            }
            if (data.hasOwnProperty('thirtyDayNetSecYield')) {
                obj['thirtyDayNetSecYield'] = ApiClient.convertToType(data['thirtyDayNetSecYield'], 'Number');
            }
            if (data.hasOwnProperty('thirtyDayGrossSecYield')) {
                obj['thirtyDayGrossSecYield'] = ApiClient.convertToType(data['thirtyDayGrossSecYield'], 'Number');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
        }
        return obj;
    }


}

/**
 * FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
 * @member {String} fsymId
 */
DistCurrent.prototype['fsymId'] = undefined;

/**
 * The date of the distribution in YYYY-MM-DD format.
 * @member {Date} date
 */
DistCurrent.prototype['date'] = undefined;

/**
 * ISO Currency
 * @member {String} currency
 */
DistCurrent.prototype['currency'] = undefined;

/**
 * Total Distributions.
 * @member {Number} totalDistributions
 */
DistCurrent.prototype['totalDistributions'] = undefined;

/**
 * Return on Capital.
 * @member {Number} returnOfCapital
 */
DistCurrent.prototype['returnOfCapital'] = undefined;

/**
 * Qualified Dividends.
 * @member {Number} qualifiedDividends
 */
DistCurrent.prototype['qualifiedDividends'] = undefined;

/**
 * Non-Qualified Dividends.
 * @member {Number} nonQalifiedDividends
 */
DistCurrent.prototype['nonQalifiedDividends'] = undefined;

/**
 * Daily Accrued Dividends.
 * @member {Number} dailyAccruedDividends
 */
DistCurrent.prototype['dailyAccruedDividends'] = undefined;

/**
 * Short-Term Capital Gains.
 * @member {Number} stCapitalGains
 */
DistCurrent.prototype['stCapitalGains'] = undefined;

/**
 * Long-Term Capital Gains.
 * @member {Number} ltCapitalGains
 */
DistCurrent.prototype['ltCapitalGains'] = undefined;

/**
 * Indicated annual dividend.
 * @member {Number} indicatedAnnualDividend
 */
DistCurrent.prototype['indicatedAnnualDividend'] = undefined;

/**
 * Distribution frequency.
 * @member {String} distFrequency
 */
DistCurrent.prototype['distFrequency'] = undefined;

/**
 * Distribution yield for the last twelve months.
 * @member {Number} ltmDistYield
 */
DistCurrent.prototype['ltmDistYield'] = undefined;

/**
 * The date of the funds first distribution in YYYY-MM-DD format.
 * @member {Date} firstDistDate
 */
DistCurrent.prototype['firstDistDate'] = undefined;

/**
 * Net SEC yield for the last seven days.
 * @member {Number} sevenDayNetSecYield
 */
DistCurrent.prototype['sevenDayNetSecYield'] = undefined;

/**
 * Gross SEC yield for the last seven days.
 * @member {Number} sevenDayGrossSecYield
 */
DistCurrent.prototype['sevenDayGrossSecYield'] = undefined;

/**
 * Net SEC yield for the thirty thirty days.
 * @member {Number} thirtyDayNetSecYield
 */
DistCurrent.prototype['thirtyDayNetSecYield'] = undefined;

/**
 * Gross SEC yield for the last thirty days.
 * @member {Number} thirtyDayGrossSecYield
 */
DistCurrent.prototype['thirtyDayGrossSecYield'] = undefined;

/**
 * The requested Id sent as input.
 * @member {String} requestId
 */
DistCurrent.prototype['requestId'] = undefined;






export default DistCurrent;

