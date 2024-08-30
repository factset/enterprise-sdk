/**
 * dsotm API
 * Allow clients to send transactions data to FactSet.
 *
 * The version of the OpenAPI document: 1.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import AdditionalField from './AdditionalField';

/**
 * The Execution model module.
 * @module model/Execution
 */
class Execution {
    /**
     * Constructs a new <code>Execution</code>.
     * Execution transaction attributes
     * @alias module:model/Execution
     * @param tradeDate {String} Trade date which is in the format YYYY-MM-DD
     * @param transactionId {String} Unique Id of the execution
     * @param transactionStatus {module:model/Execution.TransactionStatusEnum} Status of the Execution
     * @param net {Number} Cash value of the transaction, net of brokerage costs
     * @param settlementDate {String} Settlement date in YYYY-MM-DD format
     * @param settlementCurrency {String} The iso currency code of the Settlement Value
     * @param settlementValue {Number} Cash value of the transaction in settlement currency
     * @param account {String} Path of the account
     * @param symbol {String} Symbol corresponding to the traded instrument
     * @param instrumentName {String} Name or description of the traded instrument
     * @param side {module:model/Execution.SideEnum} Side of the order
     * @param unitType {module:model/Execution.UnitTypeEnum} Unit type of the order. Indicates if the trade is driven by quantity or value
     * @param quantity {Number} Quantity of the instrument traded
     * @param gross {Number} Cash value of the transaction
     * @param currency {String} The iso currency code of cash valued fields, Net Amount and Gross Amount
     */
    constructor(tradeDate, transactionId, transactionStatus, net, settlementDate, settlementCurrency, settlementValue, account, symbol, instrumentName, side, unitType, quantity, gross, currency) { 
        
        Execution.initialize(this, tradeDate, transactionId, transactionStatus, net, settlementDate, settlementCurrency, settlementValue, account, symbol, instrumentName, side, unitType, quantity, gross, currency);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, tradeDate, transactionId, transactionStatus, net, settlementDate, settlementCurrency, settlementValue, account, symbol, instrumentName, side, unitType, quantity, gross, currency) { 
        obj['tradeDate'] = tradeDate;
        obj['transactionId'] = transactionId;
        obj['transactionStatus'] = transactionStatus;
        obj['net'] = net;
        obj['settlementDate'] = settlementDate;
        obj['settlementCurrency'] = settlementCurrency;
        obj['settlementValue'] = settlementValue;
        obj['account'] = account;
        obj['symbol'] = symbol;
        obj['instrumentName'] = instrumentName;
        obj['side'] = side;
        obj['unitType'] = unitType;
        obj['quantity'] = quantity;
        obj['gross'] = gross;
        obj['currency'] = currency;
    }

    /**
     * Constructs a <code>Execution</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Execution} obj Optional instance to populate.
     * @return {module:model/Execution} The populated <code>Execution</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Execution();

            if (data.hasOwnProperty('tradeDate')) {
                obj['tradeDate'] = ApiClient.convertToType(data['tradeDate'], 'String');
            }
            if (data.hasOwnProperty('transactionId')) {
                obj['transactionId'] = ApiClient.convertToType(data['transactionId'], 'String');
            }
            if (data.hasOwnProperty('parentId')) {
                obj['parentId'] = ApiClient.convertToType(data['parentId'], 'String');
            }
            if (data.hasOwnProperty('orderId')) {
                obj['orderId'] = ApiClient.convertToType(data['orderId'], 'String');
            }
            if (data.hasOwnProperty('transactionStatus')) {
                obj['transactionStatus'] = ApiClient.convertToType(data['transactionStatus'], 'String');
            }
            if (data.hasOwnProperty('net')) {
                obj['net'] = ApiClient.convertToType(data['net'], 'Number');
            }
            if (data.hasOwnProperty('settlementDate')) {
                obj['settlementDate'] = ApiClient.convertToType(data['settlementDate'], 'String');
            }
            if (data.hasOwnProperty('settlementCurrency')) {
                obj['settlementCurrency'] = ApiClient.convertToType(data['settlementCurrency'], 'String');
            }
            if (data.hasOwnProperty('settlementValue')) {
                obj['settlementValue'] = ApiClient.convertToType(data['settlementValue'], 'Number');
            }
            if (data.hasOwnProperty('foreignExchangeRate')) {
                obj['foreignExchangeRate'] = ApiClient.convertToType(data['foreignExchangeRate'], 'Number');
            }
            if (data.hasOwnProperty('broker')) {
                obj['broker'] = ApiClient.convertToType(data['broker'], 'String');
            }
            if (data.hasOwnProperty('custodian')) {
                obj['custodian'] = ApiClient.convertToType(data['custodian'], 'String');
            }
            if (data.hasOwnProperty('accruedInterest')) {
                obj['accruedInterest'] = ApiClient.convertToType(data['accruedInterest'], 'Number');
            }
            if (data.hasOwnProperty('commission')) {
                obj['commission'] = ApiClient.convertToType(data['commission'], 'Number');
            }
            if (data.hasOwnProperty('clearingCommission')) {
                obj['clearingCommission'] = ApiClient.convertToType(data['clearingCommission'], 'Number');
            }
            if (data.hasOwnProperty('localTax')) {
                obj['localTax'] = ApiClient.convertToType(data['localTax'], 'Number');
            }
            if (data.hasOwnProperty('localFee')) {
                obj['localFee'] = ApiClient.convertToType(data['localFee'], 'Number');
            }
            if (data.hasOwnProperty('brokerFee')) {
                obj['brokerFee'] = ApiClient.convertToType(data['brokerFee'], 'Number');
            }
            if (data.hasOwnProperty('exchangeFee')) {
                obj['exchangeFee'] = ApiClient.convertToType(data['exchangeFee'], 'Number');
            }
            if (data.hasOwnProperty('miscellaneousFee')) {
                obj['miscellaneousFee'] = ApiClient.convertToType(data['miscellaneousFee'], 'Number');
            }
            if (data.hasOwnProperty('account')) {
                obj['account'] = ApiClient.convertToType(data['account'], 'String');
            }
            if (data.hasOwnProperty('symbol')) {
                obj['symbol'] = ApiClient.convertToType(data['symbol'], 'String');
            }
            if (data.hasOwnProperty('instrumentName')) {
                obj['instrumentName'] = ApiClient.convertToType(data['instrumentName'], 'String');
            }
            if (data.hasOwnProperty('side')) {
                obj['side'] = ApiClient.convertToType(data['side'], 'String');
            }
            if (data.hasOwnProperty('unitType')) {
                obj['unitType'] = ApiClient.convertToType(data['unitType'], 'String');
            }
            if (data.hasOwnProperty('transactionLeaves')) {
                obj['transactionLeaves'] = ApiClient.convertToType(data['transactionLeaves'], 'Number');
            }
            if (data.hasOwnProperty('quantity')) {
                obj['quantity'] = ApiClient.convertToType(data['quantity'], 'Number');
            }
            if (data.hasOwnProperty('gross')) {
                obj['gross'] = ApiClient.convertToType(data['gross'], 'Number');
            }
            if (data.hasOwnProperty('price')) {
                obj['price'] = ApiClient.convertToType(data['price'], 'Number');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'String');
            }
            if (data.hasOwnProperty('complianceStatus')) {
                obj['complianceStatus'] = ApiClient.convertToType(data['complianceStatus'], 'String');
            }
            if (data.hasOwnProperty('addedDateTime')) {
                obj['addedDateTime'] = ApiClient.convertToType(data['addedDateTime'], 'String');
            }
            if (data.hasOwnProperty('updatedDateTime')) {
                obj['updatedDateTime'] = ApiClient.convertToType(data['updatedDateTime'], 'String');
            }
            if (data.hasOwnProperty('additionalFields')) {
                obj['additionalFields'] = ApiClient.convertToType(data['additionalFields'], [AdditionalField]);
            }
        }
        return obj;
    }


}

/**
 * Trade date which is in the format YYYY-MM-DD
 * @member {String} tradeDate
 */
Execution.prototype['tradeDate'] = undefined;

/**
 * Unique Id of the execution
 * @member {String} transactionId
 */
Execution.prototype['transactionId'] = undefined;

/**
 * transactionId of the placement which spawned this execution
 * @member {String} parentId
 */
Execution.prototype['parentId'] = undefined;

/**
 * orderId of the order related to this execution
 * @member {String} orderId
 */
Execution.prototype['orderId'] = undefined;

/**
 * Status of the Execution
 * @member {module:model/Execution.TransactionStatusEnum} transactionStatus
 */
Execution.prototype['transactionStatus'] = undefined;

/**
 * Cash value of the transaction, net of brokerage costs
 * @member {Number} net
 */
Execution.prototype['net'] = undefined;

/**
 * Settlement date in YYYY-MM-DD format
 * @member {String} settlementDate
 */
Execution.prototype['settlementDate'] = undefined;

/**
 * The iso currency code of the Settlement Value
 * @member {String} settlementCurrency
 */
Execution.prototype['settlementCurrency'] = undefined;

/**
 * Cash value of the transaction in settlement currency
 * @member {Number} settlementValue
 */
Execution.prototype['settlementValue'] = undefined;

/**
 * FX rate to convert the net, gross fields to reporting currency
 * @member {Number} foreignExchangeRate
 */
Execution.prototype['foreignExchangeRate'] = undefined;

/**
 * Execution broker id
 * @member {String} broker
 */
Execution.prototype['broker'] = undefined;

/**
 * Execution custodian Id
 * @member {String} custodian
 */
Execution.prototype['custodian'] = undefined;

/**
 * Execution accrued interest
 * @member {Number} accruedInterest
 */
Execution.prototype['accruedInterest'] = undefined;

/**
 * Execution commission value
 * @member {Number} commission
 */
Execution.prototype['commission'] = undefined;

/**
 * Execution clearing commission value
 * @member {Number} clearingCommission
 */
Execution.prototype['clearingCommission'] = undefined;

/**
 * Execution local tax value
 * @member {Number} localTax
 */
Execution.prototype['localTax'] = undefined;

/**
 * Execution local fee value
 * @member {Number} localFee
 */
Execution.prototype['localFee'] = undefined;

/**
 * Execution broker fee value
 * @member {Number} brokerFee
 */
Execution.prototype['brokerFee'] = undefined;

/**
 * Execution exchange fee value
 * @member {Number} exchangeFee
 */
Execution.prototype['exchangeFee'] = undefined;

/**
 * Execution miscellaneous fee value
 * @member {Number} miscellaneousFee
 */
Execution.prototype['miscellaneousFee'] = undefined;

/**
 * Path of the account
 * @member {String} account
 */
Execution.prototype['account'] = undefined;

/**
 * Symbol corresponding to the traded instrument
 * @member {String} symbol
 */
Execution.prototype['symbol'] = undefined;

/**
 * Name or description of the traded instrument
 * @member {String} instrumentName
 */
Execution.prototype['instrumentName'] = undefined;

/**
 * Side of the order
 * @member {module:model/Execution.SideEnum} side
 */
Execution.prototype['side'] = undefined;

/**
 * Unit type of the order. Indicates if the trade is driven by quantity or value
 * @member {module:model/Execution.UnitTypeEnum} unitType
 */
Execution.prototype['unitType'] = undefined;

/**
 * Shares that have been ordered and not executed
 * @member {Number} transactionLeaves
 */
Execution.prototype['transactionLeaves'] = undefined;

/**
 * Quantity of the instrument traded
 * @member {Number} quantity
 */
Execution.prototype['quantity'] = undefined;

/**
 * Cash value of the transaction
 * @member {Number} gross
 */
Execution.prototype['gross'] = undefined;

/**
 * The transaction price
 * @member {Number} price
 */
Execution.prototype['price'] = undefined;

/**
 * The iso currency code of cash valued fields, Net Amount and Gross Amount
 * @member {String} currency
 */
Execution.prototype['currency'] = undefined;

/**
 * Compliance check status
 * @member {module:model/Execution.ComplianceStatusEnum} complianceStatus
 */
Execution.prototype['complianceStatus'] = undefined;

/**
 * Date and time expressed in UTC when the transaction was first added in the format YYYY-MM-DDTHH:MM:SS.FFF
 * @member {String} addedDateTime
 */
Execution.prototype['addedDateTime'] = undefined;

/**
 * Date and time expressed in UTC when the transaction was last updated in the format YYYY-MM-DDTHH:MM:SS.FFF
 * @member {String} updatedDateTime
 */
Execution.prototype['updatedDateTime'] = undefined;

/**
 * List of additional fields which can be used for dynamically populating other ofdb fields
 * @member {Array.<module:model/AdditionalField>} additionalFields
 */
Execution.prototype['additionalFields'] = undefined;





/**
 * Allowed values for the <code>transactionStatus</code> property.
 * @enum {String}
 * @readonly
 */
Execution['TransactionStatusEnum'] = {

    /**
     * value: "executed"
     * @const
     */
    "executed": "executed",

    /**
     * value: "booked"
     * @const
     */
    "booked": "booked",

    /**
     * value: "cancelled"
     * @const
     */
    "cancelled": "cancelled"
};


/**
 * Allowed values for the <code>side</code> property.
 * @enum {String}
 * @readonly
 */
Execution['SideEnum'] = {

    /**
     * value: "buy"
     * @const
     */
    "buy": "buy",

    /**
     * value: "buyCover"
     * @const
     */
    "buyCover": "buyCover",

    /**
     * value: "sell"
     * @const
     */
    "sell": "sell",

    /**
     * value: "sellShort"
     * @const
     */
    "sellShort": "sellShort"
};


/**
 * Allowed values for the <code>unitType</code> property.
 * @enum {String}
 * @readonly
 */
Execution['UnitTypeEnum'] = {

    /**
     * value: "quantity"
     * @const
     */
    "quantity": "quantity",

    /**
     * value: "value"
     * @const
     */
    "value": "value"
};


/**
 * Allowed values for the <code>complianceStatus</code> property.
 * @enum {String}
 * @readonly
 */
Execution['ComplianceStatusEnum'] = {

    /**
     * value: "unchecked"
     * @const
     */
    "unchecked": "unchecked",

    /**
     * value: "pass"
     * @const
     */
    "pass": "pass",

    /**
     * value: "fail"
     * @const
     */
    "fail": "fail"
};



export default Execution;

