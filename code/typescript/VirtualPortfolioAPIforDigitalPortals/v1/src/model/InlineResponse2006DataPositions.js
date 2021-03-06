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
import InlineResponse2006DataCurrency from './InlineResponse2006DataCurrency';
import InlineResponse2006DataInstrument from './InlineResponse2006DataInstrument';
import InlineResponse2006DataNotation from './InlineResponse2006DataNotation';
import InlineResponse2006DataProfitLoss from './InlineResponse2006DataProfitLoss';
import InlineResponse2006DataPurchase from './InlineResponse2006DataPurchase';
import InlineResponse2006DataShares from './InlineResponse2006DataShares';

/**
 * The InlineResponse2006DataPositions model module.
 * @module model/InlineResponse2006DataPositions
 */
class InlineResponse2006DataPositions {
    /**
     * Constructs a new <code>InlineResponse2006DataPositions</code>.
     * @alias module:model/InlineResponse2006DataPositions
     */
    constructor() { 
        
        InlineResponse2006DataPositions.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2006DataPositions</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006DataPositions} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006DataPositions} The populated <code>InlineResponse2006DataPositions</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006DataPositions();

            if (data.hasOwnProperty('instrument')) {
                obj['instrument'] = InlineResponse2006DataInstrument.constructFromObject(data['instrument']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = InlineResponse2006DataCurrency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('notation')) {
                obj['notation'] = InlineResponse2006DataNotation.constructFromObject(data['notation']);
            }
            if (data.hasOwnProperty('shares')) {
                obj['shares'] = InlineResponse2006DataShares.constructFromObject(data['shares']);
            }
            if (data.hasOwnProperty('purchase')) {
                obj['purchase'] = InlineResponse2006DataPurchase.constructFromObject(data['purchase']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'Number');
            }
            if (data.hasOwnProperty('profitLoss')) {
                obj['profitLoss'] = InlineResponse2006DataProfitLoss.constructFromObject(data['profitLoss']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2006DataInstrument} instrument
 */
InlineResponse2006DataPositions.prototype['instrument'] = undefined;

/**
 * @member {module:model/InlineResponse2006DataCurrency} currency
 */
InlineResponse2006DataPositions.prototype['currency'] = undefined;

/**
 * @member {module:model/InlineResponse2006DataNotation} notation
 */
InlineResponse2006DataPositions.prototype['notation'] = undefined;

/**
 * @member {module:model/InlineResponse2006DataShares} shares
 */
InlineResponse2006DataPositions.prototype['shares'] = undefined;

/**
 * @member {module:model/InlineResponse2006DataPurchase} purchase
 */
InlineResponse2006DataPositions.prototype['purchase'] = undefined;

/**
 * Current value of the position.
 * @member {Number} value
 */
InlineResponse2006DataPositions.prototype['value'] = undefined;

/**
 * @member {module:model/InlineResponse2006DataProfitLoss} profitLoss
 */
InlineResponse2006DataPositions.prototype['profitLoss'] = undefined;






export default InlineResponse2006DataPositions;

