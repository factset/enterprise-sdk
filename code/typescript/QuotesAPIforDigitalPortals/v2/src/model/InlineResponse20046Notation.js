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
import InlineResponse20046NotationInstrument from './InlineResponse20046NotationInstrument';

/**
 * The InlineResponse20046Notation model module.
 * @module model/InlineResponse20046Notation
 */
class InlineResponse20046Notation {
    /**
     * Constructs a new <code>InlineResponse20046Notation</code>.
     * Notation data of a benchmark.
     * @alias module:model/InlineResponse20046Notation
     */
    constructor() { 
        
        InlineResponse20046Notation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20046Notation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20046Notation} obj Optional instance to populate.
     * @return {module:model/InlineResponse20046Notation} The populated <code>InlineResponse20046Notation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20046Notation();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('instrument')) {
                obj['instrument'] = InlineResponse20046NotationInstrument.constructFromObject(data['instrument']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the notation.
 * @member {String} id
 */
InlineResponse20046Notation.prototype['id'] = undefined;

/**
 * @member {module:model/InlineResponse20046NotationInstrument} instrument
 */
InlineResponse20046Notation.prototype['instrument'] = undefined;






export default InlineResponse20046Notation;

