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

