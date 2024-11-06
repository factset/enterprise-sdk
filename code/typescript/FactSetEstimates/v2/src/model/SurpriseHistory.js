/**
 * FactSet Estimates
 * With global coverage since 1999, the FactSet Estimates API provides you with comprehensive estimates and statistics on a wide variety of financial statement items as well as industry-specific metrics. The universe is comprised of over 19,000 active companies across 90+ countries with the following types of data included:   - **Consensus** - **Detail** - **Ratings** - **Surprise** - **Segments** - **New Estimates and Ratings Reports Endpoints**  For clients seeking  curated and relevant financial data, the FactSet Estimates API now includes Estimates and Ratings Reports endpoints. These powerful endpoints are designed for easy integration and consumption, delivering a wide array of financial metrics, estimates, and critical statistics in a highly accessible format suitable for both mobile and web applications.   Whether you are an analyst, investor, or financial professional, the Estimates and Ratings Reports endpoints offer detailed and actionable financial insights that can support thorough analyses and strategic decision-making processes.   The Estimates and Ratings Reports endpoints are especially valuable for B2B2C  applications, empowering financial services firms, investment companies, and corporate finance teams to:   - **Elevate Client Engagement:** Enrich user experiences in client-facing applications with comprehensive and up-to-date financial metrics.  - **Build Custom Reporting Tools:** Create tailored dashboards and analytics tools that provide deep insights and foster better financial understanding.  By adopting the FactSet Estimates API with its enriched Estimates and Ratings Reports endpoints, businesses can streamline their financial data integration process, improve operational efficiency, and deliver superior financial insights to their clients and end-users.     <p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p>  **Download API Specification**        To programmatically download the FactSet Estimates API Specification file in .yaml format, utilize the link below. You must be authorized for this API to extract the specification. This specification can then be used for Codegen to create your own SDKs. You can also access it by selecting the \"Download Spec\" button beside the version information.      [https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml](https://api.factset.com/content/factset-estimates/v2/spec/swagger.yaml) 
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

/**
 * The SurpriseHistory model module.
 * @module model/SurpriseHistory
 */
class SurpriseHistory {
    /**
     * Constructs a new <code>SurpriseHistory</code>.
     * @alias module:model/SurpriseHistory
     */
    constructor() { 
        
        SurpriseHistory.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SurpriseHistory</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SurpriseHistory} obj Optional instance to populate.
     * @return {module:model/SurpriseHistory} The populated <code>SurpriseHistory</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SurpriseHistory();

            if (data.hasOwnProperty('endDate')) {
                obj['endDate'] = ApiClient.convertToType(data['endDate'], 'Date');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('high')) {
                obj['high'] = ApiClient.convertToType(data['high'], 'Number');
            }
            if (data.hasOwnProperty('low')) {
                obj['low'] = ApiClient.convertToType(data['low'], 'Number');
            }
            if (data.hasOwnProperty('up')) {
                obj['up'] = ApiClient.convertToType(data['up'], 'Number');
            }
            if (data.hasOwnProperty('down')) {
                obj['down'] = ApiClient.convertToType(data['down'], 'Number');
            }
            if (data.hasOwnProperty('analystCount')) {
                obj['analystCount'] = ApiClient.convertToType(data['analystCount'], 'Number');
            }
            if (data.hasOwnProperty('mean')) {
                obj['mean'] = ApiClient.convertToType(data['mean'], 'Number');
            }
            if (data.hasOwnProperty('median')) {
                obj['median'] = ApiClient.convertToType(data['median'], 'Number');
            }
            if (data.hasOwnProperty('standardDeviation')) {
                obj['standardDeviation'] = ApiClient.convertToType(data['standardDeviation'], 'Number');
            }
            if (data.hasOwnProperty('actual')) {
                obj['actual'] = ApiClient.convertToType(data['actual'], 'Number');
            }
            if (data.hasOwnProperty('surprisePercent')) {
                obj['surprisePercent'] = ApiClient.convertToType(data['surprisePercent'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * Fiscal period end date for which the consensus estimate is being forecasted.
 * @member {Date} endDate
 */
SurpriseHistory.prototype['endDate'] = undefined;

/**
 * Currency used for calculations, majority currency in which the analysts are contributing their estimates. For a list of supported ISO currency codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
 * @member {String} currency
 */
SurpriseHistory.prototype['currency'] = undefined;

/**
 * The highest estimate provided by the analysts for the specified period.
 * @member {Number} high
 */
SurpriseHistory.prototype['high'] = undefined;

/**
 * The lowest estimate provided by the analysts for the specified period.
 * @member {Number} low
 */
SurpriseHistory.prototype['low'] = undefined;

/**
 * Number of estimates revised upwards.
 * @member {Number} up
 */
SurpriseHistory.prototype['up'] = undefined;

/**
 * Number of estimates revised downwards.
 * @member {Number} down
 */
SurpriseHistory.prototype['down'] = undefined;

/**
 * The number of analysts who provided estimates for the given period.
 * @member {Number} analystCount
 */
SurpriseHistory.prototype['analystCount'] = undefined;

/**
 * The average of all estimates provided by the analysts for the specified period.
 * @member {Number} mean
 */
SurpriseHistory.prototype['mean'] = undefined;

/**
 * The median of all estimates provided by the analysts for the specified period.
 * @member {Number} median
 */
SurpriseHistory.prototype['median'] = undefined;

/**
 * Measure of the dispersion of estimates around the consensus value.
 * @member {Number} standardDeviation
 */
SurpriseHistory.prototype['standardDeviation'] = undefined;

/**
 * @member {Number} actual
 */
SurpriseHistory.prototype['actual'] = undefined;

/**
 * Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).
 * @member {Number} surprisePercent
 */
SurpriseHistory.prototype['surprisePercent'] = undefined;






export default SurpriseHistory;

