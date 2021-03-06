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
import InlineResponse20066DataMarket from './InlineResponse20066DataMarket';
import InlineResponse20066DataValueUnit from './InlineResponse20066DataValueUnit';
import InlineResponse20067Fsym from './InlineResponse20067Fsym';
import InlineResponse20068Instrument from './InlineResponse20068Instrument';

/**
 * The InlineResponse20068Data model module.
 * @module model/InlineResponse20068Data
 */
class InlineResponse20068Data {
    /**
     * Constructs a new <code>InlineResponse20068Data</code>.
     * @alias module:model/InlineResponse20068Data
     */
    constructor() { 
        
        InlineResponse20068Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20068Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20068Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20068Data} The populated <code>InlineResponse20068Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20068Data();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('active')) {
                obj['active'] = ApiClient.convertToType(data['active'], 'Boolean');
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = InlineResponse20066DataMarket.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = InlineResponse20066DataValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('fsym')) {
                obj['fsym'] = InlineResponse20067Fsym.constructFromObject(data['fsym']);
            }
            if (data.hasOwnProperty('instrument')) {
                obj['instrument'] = InlineResponse20068Instrument.constructFromObject(data['instrument']);
            }
        }
        return obj;
    }


}

/**
 * Identifier of the notation.
 * @member {String} id
 */
InlineResponse20068Data.prototype['id'] = undefined;

/**
 * Indicates whether the notation is active.
 * @member {Boolean} active
 */
InlineResponse20068Data.prototype['active'] = undefined;

/**
 * @member {module:model/InlineResponse20066DataMarket} market
 */
InlineResponse20068Data.prototype['market'] = undefined;

/**
 * @member {module:model/InlineResponse20066DataValueUnit} valueUnit
 */
InlineResponse20068Data.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/InlineResponse20067Fsym} fsym
 */
InlineResponse20068Data.prototype['fsym'] = undefined;

/**
 * @member {module:model/InlineResponse20068Instrument} instrument
 */
InlineResponse20068Data.prototype['instrument'] = undefined;






export default InlineResponse20068Data;

