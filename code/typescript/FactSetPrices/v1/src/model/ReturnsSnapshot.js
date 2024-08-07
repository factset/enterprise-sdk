/**
 * FactSet Prices API
 * Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p><p><b>Rate limit is set to 25 requests per second</b>.</p> 
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ReturnsSnapshot model module.
 * @module model/ReturnsSnapshot
 */
class ReturnsSnapshot {
    /**
     * Constructs a new <code>ReturnsSnapshot</code>.
     * @alias module:model/ReturnsSnapshot
     */
    constructor() { 
        
        ReturnsSnapshot.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ReturnsSnapshot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ReturnsSnapshot} obj Optional instance to populate.
     * @return {module:model/ReturnsSnapshot} The populated <code>ReturnsSnapshot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ReturnsSnapshot();

            if (data.hasOwnProperty('fsymId')) {
                obj['fsymId'] = ApiClient.convertToType(data['fsymId'], 'String');
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'Date');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('requestId')) {
                obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
            }
            if (data.hasOwnProperty('oneDay')) {
                obj['oneDay'] = ApiClient.convertToType(data['oneDay'], 'Number');
            }
            if (data.hasOwnProperty('oneMonth')) {
                obj['oneMonth'] = ApiClient.convertToType(data['oneMonth'], 'Number');
            }
            if (data.hasOwnProperty('threeMonth')) {
                obj['threeMonth'] = ApiClient.convertToType(data['threeMonth'], 'Number');
            }
            if (data.hasOwnProperty('sixMonth')) {
                obj['sixMonth'] = ApiClient.convertToType(data['sixMonth'], 'Number');
            }
            if (data.hasOwnProperty('nineMonth')) {
                obj['nineMonth'] = ApiClient.convertToType(data['nineMonth'], 'Number');
            }
            if (data.hasOwnProperty('oneYear')) {
                obj['oneYear'] = ApiClient.convertToType(data['oneYear'], 'Number');
            }
            if (data.hasOwnProperty('quarterToDate')) {
                obj['quarterToDate'] = ApiClient.convertToType(data['quarterToDate'], 'Number');
            }
            if (data.hasOwnProperty('weekToDate')) {
                obj['weekToDate'] = ApiClient.convertToType(data['weekToDate'], 'Number');
            }
            if (data.hasOwnProperty('monthToDate')) {
                obj['monthToDate'] = ApiClient.convertToType(data['monthToDate'], 'Number');
            }
            if (data.hasOwnProperty('yearToDate')) {
                obj['yearToDate'] = ApiClient.convertToType(data['yearToDate'], 'Number');
            }
            if (data.hasOwnProperty('twoYearAnnualized')) {
                obj['twoYearAnnualized'] = ApiClient.convertToType(data['twoYearAnnualized'], 'Number');
            }
            if (data.hasOwnProperty('threeYearAnnualized')) {
                obj['threeYearAnnualized'] = ApiClient.convertToType(data['threeYearAnnualized'], 'Number');
            }
            if (data.hasOwnProperty('fiveYearAnnualized')) {
                obj['fiveYearAnnualized'] = ApiClient.convertToType(data['fiveYearAnnualized'], 'Number');
            }
            if (data.hasOwnProperty('tenYearAnnualized')) {
                obj['tenYearAnnualized'] = ApiClient.convertToType(data['tenYearAnnualized'], 'Number');
            }
            if (data.hasOwnProperty('twentyYearAnnualized')) {
                obj['twentyYearAnnualized'] = ApiClient.convertToType(data['twentyYearAnnualized'], 'Number');
            }
            if (data.hasOwnProperty('thirtyYearAnnualized')) {
                obj['thirtyYearAnnualized'] = ApiClient.convertToType(data['thirtyYearAnnualized'], 'Number');
            }
            if (data.hasOwnProperty('ipoToDateAnnualized')) {
                obj['ipoToDateAnnualized'] = ApiClient.convertToType(data['ipoToDateAnnualized'], 'Number');
            }
            if (data.hasOwnProperty('dividendAdjust')) {
                obj['dividendAdjust'] = ApiClient.convertToType(data['dividendAdjust'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
 * @member {String} fsymId
 */
ReturnsSnapshot.prototype['fsymId'] = undefined;

/**
 * Specific reference date for the period expressed in YYYY-MM-DD format.
 * @member {Date} date
 */
ReturnsSnapshot.prototype['date'] = undefined;

/**
 * Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
ReturnsSnapshot.prototype['currency'] = undefined;

/**
 * Identifier that was used for the request.
 * @member {String} requestId
 */
ReturnsSnapshot.prototype['requestId'] = undefined;

/**
 * Returns the price performance of the security for the previous one day from the given date.
 * @member {Number} oneDay
 */
ReturnsSnapshot.prototype['oneDay'] = undefined;

/**
 * Returns the price performance of the security for the past one month.
 * @member {Number} oneMonth
 */
ReturnsSnapshot.prototype['oneMonth'] = undefined;

/**
 * Returns the price performance of the security for the past three months.
 * @member {Number} threeMonth
 */
ReturnsSnapshot.prototype['threeMonth'] = undefined;

/**
 * Returns the price performance of the security for the past six months.
 * @member {Number} sixMonth
 */
ReturnsSnapshot.prototype['sixMonth'] = undefined;

/**
 * Returns the price performance of the security for the past nine months.
 * @member {Number} nineMonth
 */
ReturnsSnapshot.prototype['nineMonth'] = undefined;

/**
 * Returns the price performance of the security for the past one year.
 * @member {Number} oneYear
 */
ReturnsSnapshot.prototype['oneYear'] = undefined;

/**
 * Returns the price performance of the security from the previous calendar quarter end to the given date.
 * @member {Number} quarterToDate
 */
ReturnsSnapshot.prototype['quarterToDate'] = undefined;

/**
 * Returns the price performance of the security from the previous week (usually Friday) to the given date.
 * @member {Number} weekToDate
 */
ReturnsSnapshot.prototype['weekToDate'] = undefined;

/**
 * Returns the price performance of the security from the previous month-end to the given date.
 * @member {Number} monthToDate
 */
ReturnsSnapshot.prototype['monthToDate'] = undefined;

/**
 * Returns the price performance of the security from the previous calendar year-end to the given date.
 * @member {Number} yearToDate
 */
ReturnsSnapshot.prototype['yearToDate'] = undefined;

/**
 * Returns the annualized compound total return for two years.
 * @member {Number} twoYearAnnualized
 */
ReturnsSnapshot.prototype['twoYearAnnualized'] = undefined;

/**
 * Returns the annualized compound total return for three years.
 * @member {Number} threeYearAnnualized
 */
ReturnsSnapshot.prototype['threeYearAnnualized'] = undefined;

/**
 * Returns the annualized compound total return for five years.
 * @member {Number} fiveYearAnnualized
 */
ReturnsSnapshot.prototype['fiveYearAnnualized'] = undefined;

/**
 * Returns the annualized compound total return for ten years.
 * @member {Number} tenYearAnnualized
 */
ReturnsSnapshot.prototype['tenYearAnnualized'] = undefined;

/**
 * Returns the annualized compound total return for twenty years.
 * @member {Number} twentyYearAnnualized
 */
ReturnsSnapshot.prototype['twentyYearAnnualized'] = undefined;

/**
 * Returns the annualized compound total return for thirty years.
 * @member {Number} thirtyYearAnnualized
 */
ReturnsSnapshot.prototype['thirtyYearAnnualized'] = undefined;

/**
 * Returns the annualized compound total return from the ipo date. The calculation uses the closing price as of the IPO date, and not the IPO price itself.
 * @member {Number} ipoToDateAnnualized
 */
ReturnsSnapshot.prototype['ipoToDateAnnualized'] = undefined;

/**
 * Controls the dividend reinvestment for the returns calculation. Dividends will be reinvested on the date the dividends go ex (when the dividends belong to the seller rather than the buyer). Visit [OA 8748](https://my.apps.factset.com/oa/pages/8748) for calculation methodology.   * **PRICE** = Price Change - Dividends Excluded.   * **EXDATE** = Simple Return - Dividends Received on exdate but not reinvested. Dividends accumulated throughout the specified period are added to the price at the end of the period.   * **EXDATE_C** = Compound Return - Dividends reinvested on exdate. Dividends accumulated throughout the specified period are used to buy more shares of stock in the company. 
 * @member {String} dividendAdjust
 */
ReturnsSnapshot.prototype['dividendAdjust'] = undefined;






export default ReturnsSnapshot;

