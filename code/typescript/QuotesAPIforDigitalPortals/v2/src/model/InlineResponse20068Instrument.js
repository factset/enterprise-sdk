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
import InlineResponse20036Fsym from './InlineResponse20036Fsym';

/**
 * The InlineResponse20068Instrument model module.
 * @module model/InlineResponse20068Instrument
 */
class InlineResponse20068Instrument {
    /**
     * Constructs a new <code>InlineResponse20068Instrument</code>.
     * Instrument referenced by the notation.
     * @alias module:model/InlineResponse20068Instrument
     */
    constructor() { 
        
        InlineResponse20068Instrument.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20068Instrument</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20068Instrument} obj Optional instance to populate.
     * @return {module:model/InlineResponse20068Instrument} The populated <code>InlineResponse20068Instrument</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20068Instrument();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse20036Fsym.constructFromObject(data['fsym']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the instrument.
 * @member {String} id
 */
InlineResponse20068Instrument.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse20036Fsym} fsym
 */
InlineResponse20068Instrument.prototype['fsym'] = undefined;






export default InlineResponse20068Instrument;

