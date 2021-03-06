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

/**
 * The InlineResponse20059DataInstrument model module.
 * @module model/InlineResponse20059DataInstrument
 */
class InlineResponse20059DataInstrument {
    /**
     * Constructs a new <code>InlineResponse20059DataInstrument</code>.
     * Details regarding the exchange rate instrument.
     * @alias module:model/InlineResponse20059DataInstrument
     */
    constructor() { 
        
        InlineResponse20059DataInstrument.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20059DataInstrument</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20059DataInstrument} obj Optional instance to populate.
     * @return {module:model/InlineResponse20059DataInstrument} The populated <code>InlineResponse20059DataInstrument</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20059DataInstrument();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('shortName')) {
                obj['shortName'] = ApiClient.convertToType(data['shortName'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Identifier of the instrument.
 * @member {String} id
 */
InlineResponse20059DataInstrument.prototype['id'] = undefined;

/**
 * Name of the instrument.
 * @member {String} name
 */
InlineResponse20059DataInstrument.prototype['name'] = undefined;

/**
 * Short name of the instrument.
 * @member {String} shortName
 */
InlineResponse20059DataInstrument.prototype['shortName'] = undefined;






export default InlineResponse20059DataInstrument;

