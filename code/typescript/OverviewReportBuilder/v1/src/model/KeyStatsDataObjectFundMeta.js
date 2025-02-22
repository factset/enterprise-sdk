/**
 * FactSet Overview Report Builder API
 * Get relevant industry-specific data for high level analysis of public and private companies
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import KeyStatsDataObjectEntityMetaSources from './KeyStatsDataObjectEntityMetaSources';
import KeyStatsDataObjectFundMetaAsOfDate from './KeyStatsDataObjectFundMetaAsOfDate';

/**
 * The KeyStatsDataObjectFundMeta model module.
 * @module model/KeyStatsDataObjectFundMeta
 */
class KeyStatsDataObjectFundMeta {
    /**
     * Constructs a new <code>KeyStatsDataObjectFundMeta</code>.
     * @alias module:model/KeyStatsDataObjectFundMeta
     */
    constructor() { 
        
        KeyStatsDataObjectFundMeta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>KeyStatsDataObjectFundMeta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeyStatsDataObjectFundMeta} obj Optional instance to populate.
     * @return {module:model/KeyStatsDataObjectFundMeta} The populated <code>KeyStatsDataObjectFundMeta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeyStatsDataObjectFundMeta();

            if (data.hasOwnProperty('asOfDate')) {
                obj['asOfDate'] = KeyStatsDataObjectFundMetaAsOfDate.constructFromObject(data['asOfDate']);
            }
            if (data.hasOwnProperty('sources')) {
                obj['sources'] = KeyStatsDataObjectEntityMetaSources.constructFromObject(data['sources']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/KeyStatsDataObjectFundMetaAsOfDate} asOfDate
 */
KeyStatsDataObjectFundMeta.prototype['asOfDate'] = undefined;

/**
 * @member {module:model/KeyStatsDataObjectEntityMetaSources} sources
 */
KeyStatsDataObjectFundMeta.prototype['sources'] = undefined;






export default KeyStatsDataObjectFundMeta;

