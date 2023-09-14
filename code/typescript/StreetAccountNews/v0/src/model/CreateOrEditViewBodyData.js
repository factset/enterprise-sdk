/**
 * StreetAccount API
 * Collection of endpoints for retrieving StreetAccount headlines and filters
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import CreateOrEditViewTickers from './CreateOrEditViewTickers';

/**
 * The CreateOrEditViewBodyData model module.
 * @module model/CreateOrEditViewBodyData
 */
class CreateOrEditViewBodyData {
    /**
     * Constructs a new <code>CreateOrEditViewBodyData</code>.
     * @alias module:model/CreateOrEditViewBodyData
     */
    constructor() { 
        
        CreateOrEditViewBodyData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateOrEditViewBodyData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateOrEditViewBodyData} obj Optional instance to populate.
     * @return {module:model/CreateOrEditViewBodyData} The populated <code>CreateOrEditViewBodyData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateOrEditViewBodyData();

            if (data.hasOwnProperty('tickers')) {
                obj['tickers'] = ApiClient.convertToType(data['tickers'], [CreateOrEditViewTickers]);
            }
            if (data.hasOwnProperty('categories')) {
                obj['categories'] = ApiClient.convertToType(data['categories'], ['String']);
            }
            if (data.hasOwnProperty('regions')) {
                obj['regions'] = ApiClient.convertToType(data['regions'], ['String']);
            }
            if (data.hasOwnProperty('topics')) {
                obj['topics'] = ApiClient.convertToType(data['topics'], ['String']);
            }
            if (data.hasOwnProperty('sectors')) {
                obj['sectors'] = ApiClient.convertToType(data['sectors'], ['String']);
            }
            if (data.hasOwnProperty('isPrimary')) {
                obj['isPrimary'] = ApiClient.convertToType(data['isPrimary'], 'Boolean');
            }
            if (data.hasOwnProperty('quickAlert')) {
                obj['quickAlert'] = ApiClient.convertToType(data['quickAlert'], 'Boolean');
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/CreateOrEditViewTickers>} tickers
 */
CreateOrEditViewBodyData.prototype['tickers'] = undefined;

/**
 * @member {Array.<String>} categories
 */
CreateOrEditViewBodyData.prototype['categories'] = undefined;

/**
 * @member {Array.<String>} regions
 */
CreateOrEditViewBodyData.prototype['regions'] = undefined;

/**
 * @member {Array.<String>} topics
 */
CreateOrEditViewBodyData.prototype['topics'] = undefined;

/**
 * @member {Array.<String>} sectors
 */
CreateOrEditViewBodyData.prototype['sectors'] = undefined;

/**
 * @member {Boolean} isPrimary
 */
CreateOrEditViewBodyData.prototype['isPrimary'] = undefined;

/**
 * @member {Boolean} quickAlert
 */
CreateOrEditViewBodyData.prototype['quickAlert'] = undefined;






export default CreateOrEditViewBodyData;
