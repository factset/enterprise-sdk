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
import InlineResponse20079DataCurrency from './InlineResponse20079DataCurrency';
import InlineResponse20079DataMarket from './InlineResponse20079DataMarket';
import InlineResponse20079DataValueUnit from './InlineResponse20079DataValueUnit';
import InlineResponse20081DataAsk from './InlineResponse20081DataAsk';
import InlineResponse20081DataBid from './InlineResponse20081DataBid';

/**
 * The InlineResponse20081Data model module.
 * @module model/InlineResponse20081Data
 */
class InlineResponse20081Data {
    /**
     * Constructs a new <code>InlineResponse20081Data</code>.
     * Bid and ask prices for the notation.
     * @alias module:model/InlineResponse20081Data
     */
    constructor() { 
        
        InlineResponse20081Data.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse20081Data</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse20081Data} obj Optional instance to populate.
     * @return {module:model/InlineResponse20081Data} The populated <code>InlineResponse20081Data</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse20081Data();

            if (data.hasOwnProperty('valueUnit')) {
                obj['valueUnit'] = InlineResponse20079DataValueUnit.constructFromObject(data['valueUnit']);
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = InlineResponse20079DataCurrency.constructFromObject(data['currency']);
            }
            if (data.hasOwnProperty('market')) {
                obj['market'] = InlineResponse20079DataMarket.constructFromObject(data['market']);
            }
            if (data.hasOwnProperty('quality')) {
                obj['quality'] = ApiClient.convertToType(data['quality'], 'String');
            }
            if (data.hasOwnProperty('bid')) {
                obj['bid'] = InlineResponse20081DataBid.constructFromObject(data['bid']);
            }
            if (data.hasOwnProperty('ask')) {
                obj['ask'] = InlineResponse20081DataAsk.constructFromObject(data['ask']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse20079DataValueUnit} valueUnit
 */
InlineResponse20081Data.prototype['valueUnit'] = undefined;

/**
 * @member {module:model/InlineResponse20079DataCurrency} currency
 */
InlineResponse20081Data.prototype['currency'] = undefined;

/**
 * @member {module:model/InlineResponse20079DataMarket} market
 */
InlineResponse20081Data.prototype['market'] = undefined;

/**
 * Quality of the price.
 * @member {module:model/InlineResponse20081Data.QualityEnum} quality
 */
InlineResponse20081Data.prototype['quality'] = undefined;

/**
 * @member {module:model/InlineResponse20081DataBid} bid
 */
InlineResponse20081Data.prototype['bid'] = undefined;

/**
 * @member {module:model/InlineResponse20081DataAsk} ask
 */
InlineResponse20081Data.prototype['ask'] = undefined;





/**
 * Allowed values for the <code>quality</code> property.
 * @enum {String}
 * @readonly
 */
InlineResponse20081Data['QualityEnum'] = {

    /**
     * value: "RLT"
     * @const
     */
    "RLT": "RLT",

    /**
     * value: "DLY"
     * @const
     */
    "DLY": "DLY",

    /**
     * value: "EOD"
     * @const
     */
    "EOD": "EOD"
};



export default InlineResponse20081Data;

