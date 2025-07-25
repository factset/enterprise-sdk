/**
 * FactSet Private Company API
 * FactSet Private Company API encompasses Private Company Financials and includes some Private Company non-periodic data. Additional Private Company firmographics can be found in the FactSet Entity API. <p><b>Rate limit is set to 10 requests per second and 10 concurrent requests per user</b>.</p> 
 *
 * The version of the OpenAPI document: 1.0.0
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
     * Metric Object
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
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
            if (data.hasOwnProperty('factor')) {
                obj['factor'] = ApiClient.convertToType(data['factor'], 'Number');
            }
            if (data.hasOwnProperty('sdfName')) {
                obj['sdfName'] = ApiClient.convertToType(data['sdfName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Data item to be used as `metrics` input in `/factset-private-company/v#/` endpoint.
 * @member {String} metric
 */
Metric.prototype['metric'] = undefined;

/**
 * Description of the metric.
 * @member {String} description
 */
Metric.prototype['description'] = undefined;

/**
 * Corresponding endpoint to input metric item. For example, metrics returning the category 'FINANCIALS' should be used in the `/financials` endpoint. The same follows data items falling in the category for NON_PERIODIC, which would be used in the `/non-periodic` endpoint.
 * @member {String} category
 */
Metric.prototype['category'] = undefined;

/**
 * The factor for the metric (e.g. 1000 = thousands).
 * @member {Number} factor
 */
Metric.prototype['factor'] = undefined;

/**
 * The name of the data item as it appears in the Standard Data Feed (SDF). A null value represents items available only in API.
 * @member {String} sdfName
 */
Metric.prototype['sdfName'] = undefined;






export default Metric;

