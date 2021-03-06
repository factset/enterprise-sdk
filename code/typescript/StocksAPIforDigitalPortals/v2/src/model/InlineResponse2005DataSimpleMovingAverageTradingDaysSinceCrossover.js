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
import InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50 from './InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50';
import InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 from './InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200';

/**
 * The InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover model module.
 * @module model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover
 */
class InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover {
    /**
     * Constructs a new <code>InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover</code>.
     * Value ranges of the number of trading days since a simple moving average crossed another one. All SMAs are calculated with EOD prices, thus the value 0 for the number of days means the crossover occurred on the most recent trading day for which such prices are available.
     * @alias module:model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover
     */
    constructor() { 
        
        InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover} obj Optional instance to populate.
     * @return {module:model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover} The populated <code>InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover();

            if (data.hasOwnProperty('sma20vs50')) {
                obj['sma20vs50'] = InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50.constructFromObject(data['sma20vs50']);
            }
            if (data.hasOwnProperty('sma50vs200')) {
                obj['sma50vs200'] = InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.constructFromObject(data['sma50vs200']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50} sma20vs50
 */
InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover.prototype['sma20vs50'] = undefined;

/**
 * @member {module:model/InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200} sma50vs200
 */
InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover.prototype['sma50vs200'] = undefined;






export default InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover;

