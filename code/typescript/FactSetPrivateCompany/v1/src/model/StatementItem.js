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
 * The StatementItem model module.
 * @module model/StatementItem
 */
class StatementItem {
    /**
     * Constructs a new <code>StatementItem</code>.
     * Financial Statement objects
     * @alias module:model/StatementItem
     */
    constructor() { 
        
        StatementItem.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>StatementItem</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/StatementItem} obj Optional instance to populate.
     * @return {module:model/StatementItem} The populated <code>StatementItem</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new StatementItem();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('metricName')) {
                obj['metricName'] = ApiClient.convertToType(data['metricName'], 'String');
            }
            if (data.hasOwnProperty('displayLevel')) {
                obj['displayLevel'] = ApiClient.convertToType(data['displayLevel'], 'String');
            }
            if (data.hasOwnProperty('displayOrder')) {
                obj['displayOrder'] = ApiClient.convertToType(data['displayOrder'], 'Number');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], ['Number']);
            }
        }
        return obj;
    }


}

/**
 * Name of the metric
 * @member {String} name
 */
StatementItem.prototype['name'] = undefined;

/**
 * FactSet Private Company metric representing the corresponding financial metric
 * @member {String} metricName
 */
StatementItem.prototype['metricName'] = undefined;

/**
 * Describes the level of displaying the item
 * @member {String} displayLevel
 */
StatementItem.prototype['displayLevel'] = undefined;

/**
 * Describes the order of displaying the item
 * @member {Number} displayOrder
 */
StatementItem.prototype['displayOrder'] = undefined;

/**
 * Array of values for the data metrics requested. Values correspond to the reportDate and fiscalYear based on their index (array position).
 * @member {Array.<Number>} value
 */
StatementItem.prototype['value'] = undefined;






export default StatementItem;

