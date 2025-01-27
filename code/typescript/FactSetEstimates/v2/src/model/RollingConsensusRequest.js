/**
 * FactSet Estimates
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **Actuals** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
 *
 * The version of the OpenAPI document: 2.6.0
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
 * The RollingConsensusRequest model module.
 * @module model/RollingConsensusRequest
 */
class RollingConsensusRequest {
    /**
     * Constructs a new <code>RollingConsensusRequest</code>.
     * Request object for requesting rolling consensus estimates.
     * @alias module:model/RollingConsensusRequest
     * @param ids {Array.<String>} The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
     * @param metrics {Array.<String>} Requested metrics. Use the `/metrics` endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
     */
    constructor(ids, metrics) { 
        
        RollingConsensusRequest.initialize(this, ids, metrics);
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
     * Constructs a <code>RollingConsensusRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RollingConsensusRequest} obj Optional instance to populate.
     * @return {module:model/RollingConsensusRequest} The populated <code>RollingConsensusRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RollingConsensusRequest();

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
            if (data.hasOwnProperty('relativeFiscalStart')) {
                obj['relativeFiscalStart'] = ApiClient.convertToType(data['relativeFiscalStart'], 'Number');
            }
            if (data.hasOwnProperty('relativeFiscalEnd')) {
                obj['relativeFiscalEnd'] = ApiClient.convertToType(data['relativeFiscalEnd'], 'Number');
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
RollingConsensusRequest.prototype['ids'] = undefined;

/**
 * Requested metrics. Use the `/metrics` endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
 * @member {Array.<String>} metrics
 */
RollingConsensusRequest.prototype['metrics'] = undefined;

/**
 * The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. 
 * @member {String} startDate
 */
RollingConsensusRequest.prototype['startDate'] = undefined;

/**
 * The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
 * @member {String} endDate
 */
RollingConsensusRequest.prototype['endDate'] = undefined;

/**
 * @member {module:model/Frequency} frequency
 */
RollingConsensusRequest.prototype['frequency'] = undefined;

/**
 * Relative fiscal period, expressed as an integer, used to filter results.
 * @member {Number} relativeFiscalStart
 */
RollingConsensusRequest.prototype['relativeFiscalStart'] = undefined;

/**
 * Relative fiscal period, expressed as an integer, used to filter results.
 * @member {Number} relativeFiscalEnd
 */
RollingConsensusRequest.prototype['relativeFiscalEnd'] = undefined;

/**
 * @member {module:model/Periodicity} periodicity
 */
RollingConsensusRequest.prototype['periodicity'] = undefined;

/**
 * Currency code for adjusting the data. Use input as 'ESTIMATE' for values in Estimate currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
RollingConsensusRequest.prototype['currency'] = undefined;






export default RollingConsensusRequest;

