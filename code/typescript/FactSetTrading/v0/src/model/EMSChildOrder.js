/**
 * EMS API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ParentId from './ParentId';
import TimeInForce from './TimeInForce';

/**
 * The EMSChildOrder model module.
 * @module model/EMSChildOrder
 */
class EMSChildOrder {
    /**
     * Constructs a new <code>EMSChildOrder</code>.
     * EMS Child Orders
     * @alias module:model/EMSChildOrder
     * @param parentId {module:model/ParentId} 
     * @param orderType {module:model/EMSChildOrder.OrderTypeEnum} Type of the order
     * @param orderQuantity {Number} Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order.
     * @param destination {String} Represents the designated venue or location to which an order is intended to be routed.
     */
    constructor(parentId, orderType, orderQuantity, destination) { 
        
        EMSChildOrder.initialize(this, parentId, orderType, orderQuantity, destination);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, parentId, orderType, orderQuantity, destination) { 
        obj['parentId'] = parentId;
        obj['orderType'] = orderType;
        obj['orderQuantity'] = orderQuantity;
        obj['destination'] = destination;
    }

    /**
     * Constructs a <code>EMSChildOrder</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/EMSChildOrder} obj Optional instance to populate.
     * @return {module:model/EMSChildOrder} The populated <code>EMSChildOrder</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EMSChildOrder();

            if (data.hasOwnProperty('parentId')) {
                obj['parentId'] = ParentId.constructFromObject(data['parentId']);
            }
            if (data.hasOwnProperty('side')) {
                obj['side'] = ApiClient.convertToType(data['side'], 'String');
            }
            if (data.hasOwnProperty('orderType')) {
                obj['orderType'] = ApiClient.convertToType(data['orderType'], 'String');
            }
            if (data.hasOwnProperty('orderQuantity')) {
                obj['orderQuantity'] = ApiClient.convertToType(data['orderQuantity'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('timeInForce')) {
                obj['timeInForce'] = TimeInForce.constructFromObject(data['timeInForce']);
            }
            if (data.hasOwnProperty('handlingInstructions')) {
                obj['handlingInstructions'] = ApiClient.convertToType(data['handlingInstructions'], 'String');
            }
            if (data.hasOwnProperty('exDestination')) {
                obj['exDestination'] = ApiClient.convertToType(data['exDestination'], 'String');
            }
            if (data.hasOwnProperty('destination')) {
                obj['destination'] = ApiClient.convertToType(data['destination'], 'String');
            }
            if (data.hasOwnProperty('stopPrice')) {
                obj['stopPrice'] = ApiClient.convertToType(data['stopPrice'], 'Number');
            }
            if (data.hasOwnProperty('maxFloor')) {
                obj['maxFloor'] = ApiClient.convertToType(data['maxFloor'], 'Number');
            }
            if (data.hasOwnProperty('minQuantity')) {
                obj['minQuantity'] = ApiClient.convertToType(data['minQuantity'], 'Number');
            }
            if (data.hasOwnProperty('settlementType')) {
                obj['settlementType'] = ApiClient.convertToType(data['settlementType'], 'String');
            }
            if (data.hasOwnProperty('settlementDate')) {
                obj['settlementDate'] = ApiClient.convertToType(data['settlementDate'], 'String');
            }
            if (data.hasOwnProperty('executionInstructions')) {
                obj['executionInstructions'] = ApiClient.convertToType(data['executionInstructions'], 'String');
            }
            if (data.hasOwnProperty('locateRequired')) {
                obj['locateRequired'] = ApiClient.convertToType(data['locateRequired'], 'Boolean');
            }
            if (data.hasOwnProperty('text')) {
                obj['text'] = ApiClient.convertToType(data['text'], 'String');
            }
            if (data.hasOwnProperty('profile')) {
                obj['profile'] = ApiClient.convertToType(data['profile'], 'String');
            }
            if (data.hasOwnProperty('userDefinedFields')) {
                obj['userDefinedFields'] = ApiClient.convertToType(data['userDefinedFields'], {'String': 'String'});
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ParentId} parentId
 */
EMSChildOrder.prototype['parentId'] = undefined;

/**
 * Side of the order.If the parent order side is 'buy', valid values are 'buy' or 'buyMinus'. If the parent order side is 'sell', valid values are 'sell' or 'sellPlus'
 * @member {module:model/EMSChildOrder.SideEnum} side
 */
EMSChildOrder.prototype['side'] = undefined;

/**
 * Type of the order
 * @member {module:model/EMSChildOrder.OrderTypeEnum} orderType
 */
EMSChildOrder.prototype['orderType'] = undefined;

/**
 * Number of shares/Quantity to be routed. Must be less than or equal to the orderQuantity of the parent order.
 * @member {Number} orderQuantity
 */
EMSChildOrder.prototype['orderQuantity'] = undefined;

/**
 * Order price per share.
 * @member {Number} price
 */
EMSChildOrder.prototype['price'] = undefined;

/**
 * @member {module:model/TimeInForce} timeInForce
 */
EMSChildOrder.prototype['timeInForce'] = undefined;

/**
 * Instructions for order handling on Broker trading floor.
 * @member {module:model/EMSChildOrder.HandlingInstructionsEnum} handlingInstructions
 */
EMSChildOrder.prototype['handlingInstructions'] = undefined;

/**
 * Execution destination as defined by institution when order is entered.
 * @member {String} exDestination
 * @default 'America Stock Exchange'
 */
EMSChildOrder.prototype['exDestination'] = 'America Stock Exchange';

/**
 * Represents the designated venue or location to which an order is intended to be routed.
 * @member {String} destination
 */
EMSChildOrder.prototype['destination'] = undefined;

/**
 * Stop-loss price to buy/sell stock at market.
 * @member {Number} stopPrice
 */
EMSChildOrder.prototype['stopPrice'] = undefined;

/**
 * Maximum number of shares within an order to be shown on the exchange floor at any given time.
 * @member {Number} maxFloor
 */
EMSChildOrder.prototype['maxFloor'] = undefined;

/**
 * Minimum quantity of an order to be executed.
 * @member {Number} minQuantity
 */
EMSChildOrder.prototype['minQuantity'] = undefined;

/**
 * Order settlement period
 * @member {module:model/EMSChildOrder.SettlementTypeEnum} settlementType
 */
EMSChildOrder.prototype['settlementType'] = undefined;

/**
 * Specific date of trade settlement in YYYYMMDD format.
 * @member {String} settlementDate
 */
EMSChildOrder.prototype['settlementDate'] = undefined;

/**
 * Instructions for order handling on exchange trading floor.
 * @member {module:model/EMSChildOrder.ExecutionInstructionsEnum} executionInstructions
 */
EMSChildOrder.prototype['executionInstructions'] = undefined;

/**
 * Indicates whether the broker is to locate the stock in conjunction with a short sell order.
 * @member {Boolean} locateRequired
 */
EMSChildOrder.prototype['locateRequired'] = undefined;

/**
 * Free format text string.
 * @member {String} text
 */
EMSChildOrder.prototype['text'] = undefined;

/**
 * A name given to broker algo
 * @member {String} profile
 */
EMSChildOrder.prototype['profile'] = undefined;

/**
 * User defined fields
 * @member {Object.<String, String>} userDefinedFields
 */
EMSChildOrder.prototype['userDefinedFields'] = undefined;





/**
 * Allowed values for the <code>side</code> property.
 * @enum {String}
 * @readonly
 */
EMSChildOrder['SideEnum'] = {

    /**
     * value: "buy"
     * @const
     */
    "buy": "buy",

    /**
     * value: "sell"
     * @const
     */
    "sell": "sell",

    /**
     * value: "buyMinus"
     * @const
     */
    "buyMinus": "buyMinus",

    /**
     * value: "sellPlus"
     * @const
     */
    "sellPlus": "sellPlus",

    /**
     * value: "sellShort"
     * @const
     */
    "sellShort": "sellShort",

    /**
     * value: "sellShortExempt"
     * @const
     */
    "sellShortExempt": "sellShortExempt"
};


/**
 * Allowed values for the <code>orderType</code> property.
 * @enum {String}
 * @readonly
 */
EMSChildOrder['OrderTypeEnum'] = {

    /**
     * value: "market"
     * @const
     */
    "market": "market",

    /**
     * value: "limit"
     * @const
     */
    "limit": "limit",

    /**
     * value: "stop"
     * @const
     */
    "stop": "stop",

    /**
     * value: "stopLimit"
     * @const
     */
    "stopLimit": "stopLimit",

    /**
     * value: "marketOnClose"
     * @const
     */
    "marketOnClose": "marketOnClose",

    /**
     * value: "limitOrBetter"
     * @const
     */
    "limitOrBetter": "limitOrBetter"
};


/**
 * Allowed values for the <code>handlingInstructions</code> property.
 * @enum {String}
 * @readonly
 */
EMSChildOrder['HandlingInstructionsEnum'] = {

    /**
     * value: "autoOrderPrivate"
     * @const
     */
    "autoOrderPrivate": "autoOrderPrivate",

    /**
     * value: "autoOrderPublic"
     * @const
     */
    "autoOrderPublic": "autoOrderPublic",

    /**
     * value: "bestExecution"
     * @const
     */
    "bestExecution": "bestExecution"
};


/**
 * Allowed values for the <code>settlementType</code> property.
 * @enum {String}
 * @readonly
 */
EMSChildOrder['SettlementTypeEnum'] = {

    /**
     * value: "regular"
     * @const
     */
    "regular": "regular",

    /**
     * value: "cash"
     * @const
     */
    "cash": "cash",

    /**
     * value: "nextDay"
     * @const
     */
    "nextDay": "nextDay",

    /**
     * value: "tPlus2"
     * @const
     */
    "tPlus2": "tPlus2",

    /**
     * value: "tPlus3"
     * @const
     */
    "tPlus3": "tPlus3",

    /**
     * value: "tPlus4"
     * @const
     */
    "tPlus4": "tPlus4",

    /**
     * value: "future"
     * @const
     */
    "future": "future",

    /**
     * value: "whenIssued"
     * @const
     */
    "whenIssued": "whenIssued",

    /**
     * value: "sellersOption"
     * @const
     */
    "sellersOption": "sellersOption",

    /**
     * value: "tPlus5"
     * @const
     */
    "tPlus5": "tPlus5"
};


/**
 * Allowed values for the <code>executionInstructions</code> property.
 * @enum {String}
 * @readonly
 */
EMSChildOrder['ExecutionInstructionsEnum'] = {

    /**
     * value: "notHeld"
     * @const
     */
    "notHeld": "notHeld",

    /**
     * value: "work"
     * @const
     */
    "work": "work",

    /**
     * value: "goAlong"
     * @const
     */
    "goAlong": "goAlong",

    /**
     * value: "overTheDay"
     * @const
     */
    "overTheDay": "overTheDay",

    /**
     * value: "held"
     * @const
     */
    "held": "held",

    /**
     * value: "participateDoNotInitiate"
     * @const
     */
    "participateDoNotInitiate": "participateDoNotInitiate",

    /**
     * value: "strictScale"
     * @const
     */
    "strictScale": "strictScale",

    /**
     * value: "tryToScale"
     * @const
     */
    "tryToScale": "tryToScale",

    /**
     * value: "stayOnBidSide"
     * @const
     */
    "stayOnBidSide": "stayOnBidSide",

    /**
     * value: "stayOnOfferSide"
     * @const
     */
    "stayOnOfferSide": "stayOnOfferSide",

    /**
     * value: "noCross"
     * @const
     */
    "noCross": "noCross",

    /**
     * value: "okToCross"
     * @const
     */
    "okToCross": "okToCross",

    /**
     * value: "callFirst"
     * @const
     */
    "callFirst": "callFirst",

    /**
     * value: "percentOfVolume"
     * @const
     */
    "percentOfVolume": "percentOfVolume",

    /**
     * value: "doNotIncrease"
     * @const
     */
    "doNotIncrease": "doNotIncrease",

    /**
     * value: "doNotReduce"
     * @const
     */
    "doNotReduce": "doNotReduce",

    /**
     * value: "allOrNone"
     * @const
     */
    "allOrNone": "allOrNone",

    /**
     * value: "reinstateOnSystemFailure"
     * @const
     */
    "reinstateOnSystemFailure": "reinstateOnSystemFailure",

    /**
     * value: "institutionsOnly"
     * @const
     */
    "institutionsOnly": "institutionsOnly",

    /**
     * value: "reinstateOnTradingHalt"
     * @const
     */
    "reinstateOnTradingHalt": "reinstateOnTradingHalt",

    /**
     * value: "cancelOnTradingHalt"
     * @const
     */
    "cancelOnTradingHalt": "cancelOnTradingHalt",

    /**
     * value: "lastPeg"
     * @const
     */
    "lastPeg": "lastPeg",

    /**
     * value: "midPricePeg"
     * @const
     */
    "midPricePeg": "midPricePeg",

    /**
     * value: "nonNegotiable"
     * @const
     */
    "nonNegotiable": "nonNegotiable",

    /**
     * value: "openingPeg"
     * @const
     */
    "openingPeg": "openingPeg",

    /**
     * value: "marketPeg"
     * @const
     */
    "marketPeg": "marketPeg",

    /**
     * value: "cancelOnSystemFailure"
     * @const
     */
    "cancelOnSystemFailure": "cancelOnSystemFailure",

    /**
     * value: "primaryPeg"
     * @const
     */
    "primaryPeg": "primaryPeg",

    /**
     * value: "suspend"
     * @const
     */
    "suspend": "suspend",

    /**
     * value: "fixedPegToLocalBestBid"
     * @const
     */
    "fixedPegToLocalBestBid": "fixedPegToLocalBestBid",

    /**
     * value: "customerDisplayInstruction"
     * @const
     */
    "customerDisplayInstruction": "customerDisplayInstruction",

    /**
     * value: "netting"
     * @const
     */
    "netting": "netting",

    /**
     * value: "pegToVWAP"
     * @const
     */
    "pegToVWAP": "pegToVWAP",

    /**
     * value: "tradeAlong"
     * @const
     */
    "tradeAlong": "tradeAlong",

    /**
     * value: "tryToStop"
     * @const
     */
    "tryToStop": "tryToStop",

    /**
     * value: "cancelIfNotBest"
     * @const
     */
    "cancelIfNotBest": "cancelIfNotBest",

    /**
     * value: "trailingStopPeg"
     * @const
     */
    "trailingStopPeg": "trailingStopPeg",

    /**
     * value: "strictLimit"
     * @const
     */
    "strictLimit": "strictLimit",

    /**
     * value: "ignorePriceValidityChecks"
     * @const
     */
    "ignorePriceValidityChecks": "ignorePriceValidityChecks",

    /**
     * value: "pegToLimitPrice"
     * @const
     */
    "pegToLimitPrice": "pegToLimitPrice",

    /**
     * value: "workToTargetStrategy"
     * @const
     */
    "workToTargetStrategy": "workToTargetStrategy",

    /**
     * value: "intermarketSweep"
     * @const
     */
    "intermarketSweep": "intermarketSweep",

    /**
     * value: "externalRoutingAllowed"
     * @const
     */
    "externalRoutingAllowed": "externalRoutingAllowed",

    /**
     * value: "externalRoutingNotAllowed"
     * @const
     */
    "externalRoutingNotAllowed": "externalRoutingNotAllowed",

    /**
     * value: "imbalanceOnly"
     * @const
     */
    "imbalanceOnly": "imbalanceOnly",

    /**
     * value: "singleExecutionRequestedForBlockTrade"
     * @const
     */
    "singleExecutionRequestedForBlockTrade": "singleExecutionRequestedForBlockTrade",

    /**
     * value: "bestExecution"
     * @const
     */
    "bestExecution": "bestExecution"
};



export default EMSChildOrder;
