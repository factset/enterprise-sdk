/**
 * Chart Generation Service
 * This is a service for generating charts in a node environment that were created using web charting and get back images in form of `PNGs` and `JPEGs` as response.
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ChartInput from './ChartInput';

/**
 * The ChartList model module.
 * @module model/ChartList
 */
class ChartList {
    /**
     * Constructs a new <code>ChartList</code>.
     * @alias module:model/ChartList
     */
    constructor() { 
        
        ChartList.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ChartList</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChartList} obj Optional instance to populate.
     * @return {module:model/ChartList} The populated <code>ChartList</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChartList();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('tags')) {
                obj['tags'] = ApiClient.convertToType(data['tags'], ['String']);
            }
            if (data.hasOwnProperty('inputs')) {
                obj['inputs'] = ApiClient.convertToType(data['inputs'], [ChartInput]);
            }
        }
        return obj;
    }


}

/**
 * Name of the chart
 * @member {String} name
 */
ChartList.prototype['name'] = undefined;

/**
 * A short description about the chart and its contents
 * @member {String} description
 */
ChartList.prototype['description'] = undefined;

/**
 * A list of tags to classify the chart. This is being done so that users can easily group them if required.
 * @member {Array.<String>} tags
 */
ChartList.prototype['tags'] = undefined;

/**
 * List of additional inputs for the chart
 * @member {Array.<module:model/ChartInput>} inputs
 */
ChartList.prototype['inputs'] = undefined;






export default ChartList;

