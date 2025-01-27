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

/**
 * The Metric model module.
 * @module model/Metric
 */
class Metric {
    /**
     * Constructs a new <code>Metric</code>.
     * @alias module:model/Metric
     */
    constructor() { 
        
        Metric.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Metric</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Metric} obj Optional instance to populate.
     * @return {module:model/Metric} The populated <code>Metric</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Metric();

            if (data.hasOwnProperty('metric')) {
                obj['metric'] = ApiClient.convertToType(data['metric'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('subcategory')) {
                obj['subcategory'] = ApiClient.convertToType(data['subcategory'], 'String');
            }
            if (data.hasOwnProperty('OAurl')) {
                obj['OAurl'] = ApiClient.convertToType(data['OAurl'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Metric identifier to be used as `metrics` input in the FactSet Estimate endpoints.
 * @member {String} metric
 */
Metric.prototype['metric'] = undefined;

/**
 * Plain text name of the metric.
 * @member {String} name
 */
Metric.prototype['name'] = undefined;

/**
 * Primary Category of metric item, such as, FINANCIAL_STATEMENT or INDUSTRY_METRIC
 * @member {String} category
 */
Metric.prototype['category'] = undefined;

/**
 * Sub-category of metric items, such as the INCOME_STATEMENT or AIRLINES.
 * @member {String} subcategory
 */
Metric.prototype['subcategory'] = undefined;

/**
 * The Online Assistant Page URL, used to lookup the definition and methodology of the requested item.
 * @member {String} OAurl
 */
Metric.prototype['OAurl'] = undefined;






export default Metric;

