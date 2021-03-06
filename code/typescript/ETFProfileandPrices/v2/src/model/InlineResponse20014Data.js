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
import InlineResponse20014DataCounterParty from './InlineResponse20014DataCounterParty';
import InlineResponse20014DataGearing from './InlineResponse20014DataGearing';
import InlineResponse20014DataHedge from './InlineResponse20014DataHedge';
import InlineResponse20014DataServiceProvider from './InlineResponse20014DataServiceProvider';

/**
 * The InlineResponse20014Data model module.
 * @module model/InlineResponse20014Data
 */
class InlineResponse20014Data {
    /**
     * Constructs a new <code>InlineResponse20014Data</code>.
     * Characteristics.
     * @alias module:model/InlineResponse20014Data
     */
    constructor() { 
        
        InlineResponse20014Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20014Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20014Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20014Data} The populated <code>InlineResponse20014Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20014Data();

            if (data.hasOwnProperty('gearing')) {
                obj['gearing'] = InlineResponse20014DataGearing.constructFromObject(data['gearing']);
            }
            if (data.hasOwnProperty('hedge')) {
                obj['hedge'] = InlineResponse20014DataHedge.constructFromObject(data['hedge']);
            }
            if (data.hasOwnProperty('counterParty')) {
                obj['counterParty'] = InlineResponse20014DataCounterParty.constructFromObject(data['counterParty']);
            }
            if (data.hasOwnProperty('serviceProvider')) {
                obj['serviceProvider'] = InlineResponse20014DataServiceProvider.constructFromObject(data['serviceProvider']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20014DataGearing} gearing
 */
InlineResponse20014Data.prototype['gearing'] = undefined;

/**
 * @member {module:model/InlineResponse20014DataHedge} hedge
 */
InlineResponse20014Data.prototype['hedge'] = undefined;

/**
 * @member {module:model/InlineResponse20014DataCounterParty} counterParty
 */
InlineResponse20014Data.prototype['counterParty'] = undefined;

/**
 * @member {module:model/InlineResponse20014DataServiceProvider} serviceProvider
 */
InlineResponse20014Data.prototype['serviceProvider'] = undefined;






export default InlineResponse20014Data;

