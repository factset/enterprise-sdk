/**
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.16.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ColumnStatistic from './ColumnStatistic';

/**
 * The ColumnStatisticRoot model module.
 * @module model/ColumnStatisticRoot
 */
class ColumnStatisticRoot {
    /**
     * Constructs a new <code>ColumnStatisticRoot</code>.
     * @alias module:model/ColumnStatisticRoot
     * @param data {Object.<String, module:model/ColumnStatistic>} 
     */
    constructor(data) { 
        
        ColumnStatisticRoot.initialize(this, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data) { 
        obj['data'] = data;
    }

    /**
     * Constructs a <code>ColumnStatisticRoot</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ColumnStatisticRoot} obj Optional instance to populate.
     * @return {module:model/ColumnStatisticRoot} The populated <code>ColumnStatisticRoot</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ColumnStatisticRoot();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], {'String': ColumnStatistic});
            }
            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ApiClient.convertToType(data['meta'], Object);
            }
        }
        return obj;
    }


}

/**
 * @member {Object.<String, module:model/ColumnStatistic>} data
 */
ColumnStatisticRoot.prototype['data'] = undefined;

/**
 * @member {Object} meta
 */
ColumnStatisticRoot.prototype['meta'] = undefined;






export default ColumnStatisticRoot;

