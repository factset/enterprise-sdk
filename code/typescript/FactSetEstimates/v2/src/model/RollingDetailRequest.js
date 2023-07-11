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
import PeriodicityDetail from './PeriodicityDetail';

/**
 * The RollingDetailRequest model module.
 * @module model/RollingDetailRequest
 */
class RollingDetailRequest {
    /**
     * Constructs a new <code>RollingDetailRequest</code>.
     * Request object for requesting rolling detail estimates.
     * @alias module:model/RollingDetailRequest
     * @param ids {Array.<String>} The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
     * @param metrics {Array.<String>} Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
     */
    constructor(ids, metrics) { 
        
        RollingDetailRequest.initialize(this, ids, metrics);
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
     * Constructs a <code>RollingDetailRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RollingDetailRequest} obj Optional instance to populate.
     * @return {module:model/RollingDetailRequest} The populated <code>RollingDetailRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RollingDetailRequest();

            if (data.hasOwnProperty('ids')) {
                obj['ids'] = ApiClient.convertToType(data['ids'], ['String']);
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
            if (data.hasOwnProperty('includeAll')) {
                obj['includeAll'] = ApiClient.convertToType(data['includeAll'], 'Boolean');
            }
            if (data.hasOwnProperty('relativeFiscalStart')) {
                obj['relativeFiscalStart'] = ApiClient.convertToType(data['relativeFiscalStart'], 'Number');
            }
            if (data.hasOwnProperty('relativeFiscalEnd')) {
                obj['relativeFiscalEnd'] = ApiClient.convertToType(data['relativeFiscalEnd'], 'Number');
            }
            if (data.hasOwnProperty('periodicity')) {
                obj['periodicity'] = PeriodicityDetail.constructFromObject(data['periodicity']);
            }
            if (data.hasOwnProperty('metrics')) {
                obj['metrics'] = ApiClient.convertToType(data['metrics'], ['String']);
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
RollingDetailRequest.prototype['ids'] = undefined;

/**
 * The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. 
 * @member {String} startDate
 */
RollingDetailRequest.prototype['startDate'] = undefined;

/**
 * The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} endDate
 */
RollingDetailRequest.prototype['endDate'] = undefined;

/**
 * @member {module:model/Frequency} frequency
 */
RollingDetailRequest.prototype['frequency'] = undefined;

/**
 * Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** = Returns all the brokers included and excluded in the consensus   * **FALSE** = Returns only the broker details included in the consensus 
 * @member {Boolean} includeAll
 * @default false
 */
RollingDetailRequest.prototype['includeAll'] = false;

/**
 * Relative fiscal period, expressed as an integer, used to filter results.
 * @member {Number} relativeFiscalStart
 */
RollingDetailRequest.prototype['relativeFiscalStart'] = undefined;

/**
 * Relative fiscal period, expressed as an integer, used to filter results.
 * @member {Number} relativeFiscalEnd
 */
RollingDetailRequest.prototype['relativeFiscalEnd'] = undefined;

/**
 * @member {module:model/PeriodicityDetail} periodicity
 */
RollingDetailRequest.prototype['periodicity'] = undefined;

/**
 * Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
 * @member {Array.<String>} metrics
 */
RollingDetailRequest.prototype['metrics'] = undefined;

/**
 * Currency code for adjusting the data. Use input as 'ESTIMATE' for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
RollingDetailRequest.prototype['currency'] = undefined;






export default RollingDetailRequest;

