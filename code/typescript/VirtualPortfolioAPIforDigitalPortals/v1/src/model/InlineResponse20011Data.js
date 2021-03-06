/**
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse20011Notation from './InlineResponse20011Notation';

/**
 * The InlineResponse20011Data model module.
 * @module model/InlineResponse20011Data
 */
class InlineResponse20011Data {
    /**
     * Constructs a new <code>InlineResponse20011Data</code>.
     * @alias module:model/InlineResponse20011Data
     */
    constructor() { 
        
        InlineResponse20011Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20011Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20011Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20011Data} The populated <code>InlineResponse20011Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20011Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('notation')) {
                obj['notation'] = InlineResponse20011Notation.constructFromObject(data['notation']);
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the position.
 * @member {Number} id
 */
InlineResponse20011Data.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse20011Notation} notation
 */
InlineResponse20011Data.prototype['notation'] = undefined;

/**
 * Personal note for the watchlist position.
 * @member {String} comment
 */
InlineResponse20011Data.prototype['comment'] = undefined;






export default InlineResponse20011Data;

