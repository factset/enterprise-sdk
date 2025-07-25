/**
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective.<p>This API is rate-limited to 10 requests per second and 10 concurrent requests per user.</p> 
 *
 * The version of the OpenAPI document: 2.4.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Item model module.
 * @module model/Item
 */
class Item {
    /**
     * Constructs a new <code>Item</code>.
     * @alias module:model/Item
     */
    constructor() { 
        
        Item.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Item</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Item} obj Optional instance to populate.
     * @return {module:model/Item} The populated <code>Item</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Item();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('ffCode')) {
                obj['ffCode'] = ApiClient.convertToType(data['ffCode'], 'String');
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
Item.prototype['name'] = undefined;

/**
 * FactSet Fundamental code representing the corresponding financial metric
 * @member {String} ffCode
 */
Item.prototype['ffCode'] = undefined;

/**
 * Describes the level of displaying the item
 * @member {String} displayLevel
 */
Item.prototype['displayLevel'] = undefined;

/**
 * Describes the order of displaying the item
 * @member {Number} displayOrder
 */
Item.prototype['displayOrder'] = undefined;

/**
 * @member {Array.<Number>} value
 */
Item.prototype['value'] = undefined;






export default Item;

