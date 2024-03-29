/**
 * FactSet Estimates
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import Frequency from './Frequency';
import Periodicity from './Periodicity';

/**
 * The FixedConsensusRequest model module.
 * @module model/FixedConsensusRequest
 */
class FixedConsensusRequest {
    /**
     * Constructs a new <code>FixedConsensusRequest</code>.
     * Request object for requesting fixed consensus estimates.
     * @alias module:model/FixedConsensusRequest
     * @param ids {Array.<String>} The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
     * @param metrics {Array.<String>} Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
     */
    constructor(ids, metrics) { 
        
        FixedConsensusRequest.initialize(this, ids, metrics);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ids, metrics) { 
        obj['ids'] = ids;
        obj['metrics'] = metrics;
    }

    /**
     * Constructs a <code>FixedConsensusRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/FixedConsensusRequest} obj Optional instance to populate.
     * @return {module:model/FixedConsensusRequest} The populated <code>FixedConsensusRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new FixedConsensusRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
            }
            if (data.hasOwnProperty('metrics')) {
                obj['metrics'] = ApiClient.convertToType(data['metrics'], ['String']);
            }
            if (data.hasOwnProperty('startDate')) {
                obj['startDate'] = ApiClient.convertToType(data['startDate'], 'String');
            }
            if (data.hasOwnProperty('endDate')) {
                obj['endDate'] = ApiClient.convertToType(data['endDate'], 'String');
            }
            if (data.hasOwnProperty('frequency')) {
                obj['frequency'] = Frequency.constructFromObject(data['frequency']);
            }
            if (data.hasOwnProperty('fiscalPeriodStart')) {
                obj['fiscalPeriodStart'] = ApiClient.convertToType(data['fiscalPeriodStart'], 'String');
            }
            if (data.hasOwnProperty('fiscalPeriodEnd')) {
                obj['fiscalPeriodEnd'] = ApiClient.convertToType(data['fiscalPeriodEnd'], 'String');
            }
            if (data.hasOwnProperty('periodicity')) {
                obj['periodicity'] = Periodicity.constructFromObject(data['periodicity']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
 * @member {Array.<String>} ids
 */
FixedConsensusRequest.prototype['ids'] = undefined;

/**
 * Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
 * @member {Array.<String>} metrics
 */
FixedConsensusRequest.prototype['metrics'] = undefined;

/**
 * The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. 
 * @member {String} startDate
 */
FixedConsensusRequest.prototype['startDate'] = undefined;

/**
 * The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} endDate
 */
FixedConsensusRequest.prototype['endDate'] = undefined;

/**
 * @member {module:model/Frequency} frequency
 */
FixedConsensusRequest.prototype['frequency'] = undefined;

/**
 * Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) 
 * @member {String} fiscalPeriodStart
 */
FixedConsensusRequest.prototype['fiscalPeriodStart'] = undefined;

/**
 * Fiscal period end expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Month-end** - MM/YYYY (e.g., 11/2019)   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Semiannual Period-end** - YYYY/FSA (e.g., 2019/1S, 2019/2S)   * **Fiscal Year-end** - YYYY (e.g. 2019) 
 * @member {String} fiscalPeriodEnd
 */
FixedConsensusRequest.prototype['fiscalPeriodEnd'] = undefined;

/**
 * @member {module:model/Periodicity} periodicity
 */
FixedConsensusRequest.prototype['periodicity'] = undefined;

/**
 * Currency code for adjusting the data. Use input as 'ESTIMATE' for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
FixedConsensusRequest.prototype['currency'] = undefined;






export default FixedConsensusRequest;

