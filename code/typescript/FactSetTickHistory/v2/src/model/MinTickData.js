/**
 * Tick History
 * Tick History provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 2.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import FilesOne from './FilesOne';

/**
 * The MinTickData model module.
 * @module model/MinTickData
 */
class MinTickData {
    /**
     * Constructs a new <code>MinTickData</code>.
     *  Returns Tick History Response.
     * @alias module:model/MinTickData
     */
    constructor() { 
        
        MinTickData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MinTickData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MinTickData} obj Optional instance to populate.
     * @return {module:model/MinTickData} The populated <code>MinTickData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MinTickData();

            if (data.hasOwnProperty('requestTimestamp')) {
                obj['requestTimestamp'] = ApiClient.convertToType(data['requestTimestamp'], 'Date');
            }
            if (data.hasOwnProperty('updateTimestamp')) {
                obj['updateTimestamp'] = ApiClient.convertToType(data['updateTimestamp'], 'Date');
            }
            if (data.hasOwnProperty('listOfFiles')) {
                obj['listOfFiles'] = ApiClient.convertToType(data['listOfFiles'], [FilesOne]);
            }
        }
        return obj;
    }


}

/**
 * Timestamp of when request was made
 * @member {Date} requestTimestamp
 */
MinTickData.prototype['requestTimestamp'] = undefined;

/**
 * Timestamp when the file was last updated
 * @member {Date} updateTimestamp
 */
MinTickData.prototype['updateTimestamp'] = undefined;

/**
 * Contains list of Files
 * @member {Array.<module:model/FilesOne>} listOfFiles
 */
MinTickData.prototype['listOfFiles'] = undefined;






export default MinTickData;

